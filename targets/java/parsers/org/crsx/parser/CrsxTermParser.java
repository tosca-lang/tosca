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
		MODULE=1, IMPORT=2, DISPATCH=3, DELAY=4, GRAMMAR=5, COLON=6, ARROW=7, 
		FORALL=8, LPAR=9, RPAR=10, LBRACE=11, RBRACE=12, LSQUARE=13, RSQUARE=14, 
		SEMI=15, COMMA=16, DATASORT=17, COLONCOLON=18, DOT=19, DOTDOT=20, NOT=21, 
		LINEAR=22, FUNCTIONAL=23, AND=24, AT=25, CATEGORY=26, CONCRETE=27, CONCRETE2=28, 
		CONCRETE3=29, CONCRETE4=30, CONSTRUCTOR=31, VARIABLE=32, METAVAR=33, STRING=34, 
		NUMBER=35, WS=36, BLOCK_COMMENT=37, LINE_COMMENT=38, XML_COMMENT=39;
	public static final int
		RULE_crsx = 0, RULE_decls = 1, RULE_decl = 2, RULE_moduleDecl = 3, RULE_importDecl = 4, 
		RULE_sortDecl = 5, RULE_termDecl = 6, RULE_option = 7, RULE_annotation = 8, 
		RULE_contractum = 9, RULE_term = 10, RULE_scope = 11, RULE_binders = 12, 
		RULE_args = 13, RULE_terms = 14, RULE_sargs = 15, RULE_scopes = 16, RULE_list = 17, 
		RULE_variable = 18, RULE_literal = 19, RULE_varsort = 20, RULE_concrete = 21, 
		RULE_dispatch = 22, RULE_dispatchCases = 23, RULE_properties = 24, RULE_propertyList = 25, 
		RULE_property = 26, RULE_sortparams = 27, RULE_sortset = 28, RULE_sortnames = 29, 
		RULE_sortname = 30, RULE_sortargs = 31, RULE_forms = 32, RULE_form = 33, 
		RULE_constructor = 34, RULE_qualifier = 35, RULE_reserved = 36;
	public static final String[] ruleNames = {
		"crsx", "decls", "decl", "moduleDecl", "importDecl", "sortDecl", "termDecl", 
		"option", "annotation", "contractum", "term", "scope", "binders", "args", 
		"terms", "sargs", "scopes", "list", "variable", "literal", "varsort", 
		"concrete", "dispatch", "dispatchCases", "properties", "propertyList", 
		"property", "sortparams", "sortset", "sortnames", "sortname", "sortargs", 
		"forms", "form", "constructor", "qualifier", "reserved"
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

	public CrsxTermParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrsxContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
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
			setState(75);
			decls();
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
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
			setState(80);
			decl();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				_hide();
				setState(82);
				match(SEMI);
				setState(83);
				decl();
				}
				}
				setState(88);
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
		public TermDeclContext termDecl() {
			return getRuleContext(TermDeclContext.class,0);
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
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(93);
				moduleDecl();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(97);
				importDecl();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(101);
				sortDecl();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(105);
				termDecl();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
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

	public static class ModuleDeclContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(CrsxTermParser.MODULE, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public TerminalNode LBRACE() { return getToken(CrsxTermParser.LBRACE, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CrsxTermParser.RBRACE, 0); }
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
			setState(114);
			match(MODULE);
			setState(115);
			match(CONSTRUCTOR);
			_hide();
			setState(117);
			match(LBRACE);
			setState(118);
			decls();
			_hide();
			setState(120);
			match(RBRACE);
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
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(125);
				match(IMPORT);
				setState(126);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(131);
				match(IMPORT);
				_hide();
				setState(133);
				match(MODULE);
				setState(134);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(139);
				match(IMPORT);
				_hide();
				setState(141);
				match(GRAMMAR);
				setState(142);
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
		public SortsetContext sortset() {
			return getRuleContext(SortsetContext.class,0);
		}
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public TerminalNode DATASORT() { return getToken(CrsxTermParser.DATASORT, 0); }
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public SortparamsContext sortparams() {
			return getRuleContext(SortparamsContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(CrsxTermParser.COLONCOLON, 0); }
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
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(150);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(149);
					sortparams();
					}
				}

				_exitOPT();
				setState(153);
				sortset();
				setState(154);
				sortname();
				_hide();
				setState(156);
				match(DATASORT);
				_hide();
				setState(158);
				match(LPAR);
				setState(159);
				forms();
				_hide();
				setState(161);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(167);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(166);
					sortparams();
					}
				}

				_exitOPT();
				setState(170);
				sortset();
				setState(171);
				form();
				_hide();
				setState(173);
				match(COLONCOLON);
				setState(174);
				sortname();
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

	public static class TermDeclContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public ContractumContext contractum() {
			return getRuleContext(ContractumContext.class,0);
		}
		public TermDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTermDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTermDecl(this);
		}
	}

	public final TermDeclContext termDecl() throws RecognitionException {
		TermDeclContext _localctx = new TermDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(181);
				option();
				}
				break;
			}
			_exitOPT();
			setState(185);
			term();
			_enterOPT();
			setState(188);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(187);
				contractum();
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

	public static class OptionContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(194);
			constructor();
			_enterOPT();
			setState(197);
			_la = _input.LA(1);
			if (_la==LPAR || _la==LSQUARE) {
				{
				setState(196);
				args();
				}
			}

			_exitOPT();
			_hide();
			setState(201);
			match(COLON);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CrsxTermParser.AT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(206);
			match(AT);
			setState(207);
			constructor();
			_enterOPT();
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(209);
				args();
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

	public static class ContractumContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ContractumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterContractum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitContractum(this);
		}
	}

	public final ContractumContext contractum() throws RecognitionException {
		ContractumContext _localctx = new ContractumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(217);
			match(ARROW);
			setState(218);
			term();
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
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SargsContext sargs() {
			return getRuleContext(SargsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			int _alt;
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(222);
				constructor();
				_enterOPT();
				setState(225);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(224);
					sargs();
					}
					break;
				}
				_exitOPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(231);
				literal();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(235);
				list();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(239);
				variable();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(243);
				properties();
				setState(244);
				term();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(248);
				concrete();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				_enterOOM();
				setState(254); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(253);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(256); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_exitOOM();
				setState(259);
				term();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(263);
				match(METAVAR);
				_enterOPT();
				setState(266);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(265);
					args();
					}
					break;
				}
				_exitOPT();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(271);
				dispatch();
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

	public static class ScopeContext extends ParserRuleContext {
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
		enterRule(_localctx, 22, RULE_scope);
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(277);
				binders();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(281);
				term();
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode LINEAR() { return getToken(CrsxTermParser.LINEAR, 0); }
		public TerminalNode FUNCTIONAL() { return getToken(CrsxTermParser.FUNCTIONAL, 0); }
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
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
		enterRule(_localctx, 24, RULE_binders);
		int _la;
		try {
			setState(324);
			switch (_input.LA(1)) {
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterZOM();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(288);
					annotation();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_exitZOM();
				_enterBinder("x");
				setState(296);
				match(VARIABLE);
				_exitBinder();
				_enterOPT();
				setState(300);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(299);
					match(LINEAR);
					}
				}

				_exitOPT();
				_enterOPT();
				setState(305);
				_la = _input.LA(1);
				if (_la==FUNCTIONAL) {
					{
					setState(304);
					match(FUNCTIONAL);
					}
				}

				_exitOPT();
				_enterOPT();
				setState(310);
				_la = _input.LA(1);
				if (_la==COLONCOLON) {
					{
					setState(309);
					varsort();
					}
				}

				_exitOPT();
				_enterBinds(" x");
				setState(314);
				binders();
				_exitBinds();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(320);
				match(DOT);
				setState(321);
				term();
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
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
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			setState(348);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(328);
				match(LSQUARE);
				_enterOPT();
				setState(331);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(330);
					terms();
					}
				}

				_exitOPT();
				_hide();
				setState(335);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(339);
				match(LPAR);
				_enterOPT();
				setState(342);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(341);
					terms();
					}
				}

				_exitOPT();
				_hide();
				setState(346);
				match(RPAR);
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
		enterRule(_localctx, 28, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(352);
			term();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(354);
				match(COMMA);
				setState(355);
				term();
				}
				}
				setState(360);
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

	public static class SargsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public ScopesContext scopes() {
			return getRuleContext(ScopesContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public SargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSargs(this);
		}
	}

	public final SargsContext sargs() throws RecognitionException {
		SargsContext _localctx = new SargsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sargs);
		int _la;
		try {
			setState(386);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(366);
				match(LSQUARE);
				_enterOPT();
				setState(369);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(368);
					scopes();
					}
				}

				_exitOPT();
				_hide();
				setState(373);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(377);
				match(LPAR);
				_enterOPT();
				setState(380);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(379);
					scopes();
					}
				}

				_exitOPT();
				_hide();
				setState(384);
				match(RPAR);
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
		enterRule(_localctx, 32, RULE_scopes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(390);
			scope();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(392);
				match(COMMA);
				setState(393);
				scope();
				}
				}
				setState(398);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(404);
			match(LPAR);
			setState(405);
			decls();
			_hide();
			setState(407);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public TerminalNode LINEAR() { return getToken(CrsxTermParser.LINEAR, 0); }
		public TerminalNode FUNCTIONAL() { return getToken(CrsxTermParser.FUNCTIONAL, 0); }
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterSymbol();
			setState(412);
			match(VARIABLE);
			_exitSymbol();
			_enterOPT();
			setState(416);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(415);
				match(LINEAR);
				}
			}

			_exitOPT();
			_enterOPT();
			setState(421);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(420);
				match(FUNCTIONAL);
				}
			}

			_exitOPT();
			_enterOPT();
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(425);
				varsort();
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(432);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(435);
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

	public static class VarsortContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(CrsxTermParser.COLONCOLON, 0); }
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public VarsortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVarsort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVarsort(this);
		}
	}

	public final VarsortContext varsort() throws RecognitionException {
		VarsortContext _localctx = new VarsortContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varsort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(441);
			match(COLONCOLON);
			setState(442);
			sortname();
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

	public static class ConcreteContext extends ParserRuleContext {
		public TerminalNode CATEGORY() { return getToken(CrsxTermParser.CATEGORY, 0); }
		public TerminalNode CONCRETE() { return getToken(CrsxTermParser.CONCRETE, 0); }
		public TerminalNode CONCRETE2() { return getToken(CrsxTermParser.CONCRETE2, 0); }
		public TerminalNode CONCRETE3() { return getToken(CrsxTermParser.CONCRETE3, 0); }
		public TerminalNode CONCRETE4() { return getToken(CrsxTermParser.CONCRETE4, 0); }
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
		enterRule(_localctx, 42, RULE_concrete);
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(446);
				match(CATEGORY);
				setState(447);
				match(CONCRETE);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(450);
				match(CATEGORY);
				setState(451);
				match(CONCRETE2);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(454);
				match(CATEGORY);
				setState(455);
				match(CONCRETE3);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(458);
				match(CATEGORY);
				setState(459);
				match(CONCRETE4);
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

	public static class DispatchContext extends ParserRuleContext {
		public TerminalNode DISPATCH() { return getToken(CrsxTermParser.DISPATCH, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public TerminalNode DELAY() { return getToken(CrsxTermParser.DELAY, 0); }
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
		enterRule(_localctx, 44, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(465);
			match(DISPATCH);
			setState(466);
			term();
			setState(467);
			dispatchCases();
			_enterOPT();
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(469);
				match(DELAY);
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

	public static class DispatchCasesContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
		enterRule(_localctx, 46, RULE_dispatchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(477);
			term();
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_hide();
					setState(479);
					match(SEMI);
					setState(480);
					term();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CrsxTermParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CrsxTermParser.RBRACE, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(491);
			match(LBRACE);
			_enterOPT();
			setState(494);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(493);
				propertyList();
				}
			}

			_exitOPT();
			_hide();
			setState(498);
			match(RBRACE);
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

	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPropertyList(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(503);
			property();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				_hide();
				setState(505);
				match(SEMI);
				setState(507);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
					{
					setState(506);
					property();
					}
				}

				}
				}
				setState(513);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public TerminalNode NOT() { return getToken(CrsxTermParser.NOT, 0); }
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_property);
		try {
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(518);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(522);
				match(NOT);
				setState(523);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(526);
				match(METAVAR);
				_hide();
				setState(528);
				match(COLON);
				setState(529);
				term();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(533);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(537);
				match(NOT);
				setState(538);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(541);
				match(VARIABLE);
				_hide();
				setState(543);
				match(COLON);
				setState(544);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(548);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(552);
				match(NOT);
				setState(553);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(556);
				match(STRING);
				_hide();
				setState(558);
				match(COLON);
				setState(559);
				term();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(563);
				constructor();
				_hide();
				setState(565);
				match(COLON);
				setState(566);
				term();
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

	public static class SortparamsContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(CrsxTermParser.FORALL, 0); }
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SortparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortparams(this);
		}
	}

	public final SortparamsContext sortparams() throws RecognitionException {
		SortparamsContext _localctx = new SortparamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sortparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(573);
			match(FORALL);
			_enterOOM();
			setState(576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(575);
				variable();
				}
				}
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			_exitOOM();
			_hide();
			setState(582);
			match(DOT);
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

	public static class SortsetContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public SortsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortset(this);
		}
	}

	public final SortsetContext sortset() throws RecognitionException {
		SortsetContext _localctx = new SortsetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sortset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(588);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(587);
				properties();
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

	public static class SortnamesContext extends ParserRuleContext {
		public List<SortnameContext> sortname() {
			return getRuleContexts(SortnameContext.class);
		}
		public SortnameContext sortname(int i) {
			return getRuleContext(SortnameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public SortnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortnames(this);
		}
	}

	public final SortnamesContext sortnames() throws RecognitionException {
		SortnamesContext _localctx = new SortnamesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sortnames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(595);
			sortname();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(597);
				match(COMMA);
				setState(598);
				sortname();
				}
				}
				setState(603);
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

	public static class SortnameContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SortargsContext sortargs() {
			return getRuleContext(SortargsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SortnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortname(this);
		}
	}

	public final SortnameContext sortname() throws RecognitionException {
		SortnameContext _localctx = new SortnameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sortname);
		int _la;
		try {
			setState(620);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(608);
				constructor();
				_enterOPT();
				setState(611);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(610);
					sortargs();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(617);
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

	public static class SortargsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public SortnamesContext sortnames() {
			return getRuleContext(SortnamesContext.class,0);
		}
		public SortargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortargs(this);
		}
	}

	public final SortargsContext sortargs() throws RecognitionException {
		SortargsContext _localctx = new SortargsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sortargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(624);
			match(LSQUARE);
			_enterOPT();
			setState(627);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(626);
				sortnames();
				}
			}

			_exitOPT();
			_hide();
			setState(631);
			match(RSQUARE);
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

	public static class FormsContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitForms(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(636);
				form();
				_hide();
				setState(638);
				match(SEMI);
				}
				}
				setState(644);
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

	public static class FormContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SargsContext sargs() {
			return getRuleContext(SargsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_form);
		int _la;
		try {
			setState(661);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(649);
				constructor();
				_enterOPT();
				setState(652);
				_la = _input.LA(1);
				if (_la==LPAR || _la==LSQUARE) {
					{
					setState(651);
					sargs();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(658);
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

	public static class ConstructorContext extends ParserRuleContext {
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
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
		enterRule(_localctx, 68, RULE_constructor);
		try {
			setState(672);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(664);
				qualifier();
				setState(665);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(669);
				reserved();
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

	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public TerminalNode DOTDOT() { return getToken(CrsxTermParser.DOTDOT, 0); }
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_qualifier);
		try {
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(675);
				match(CONSTRUCTOR);
				_hide();
				setState(677);
				match(DOTDOT);
				setState(678);
				qualifier();
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

	public static class ReservedContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public TerminalNode AT() { return getToken(CrsxTermParser.AT, 0); }
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_reserved);
		try {
			setState(693);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(687);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(691);
				match(AT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u02ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3"+
		"\7\5\7\u0099\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b4\n\7\3\b"+
		"\3\b\3\b\5\b\u00b9\n\b\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\5\t\u00c8\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00d5\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00e4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0101\n\f\r\f"+
		"\16\f\u0102\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0115\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011f\n"+
		"\r\3\16\3\16\3\16\7\16\u0124\n\16\f\16\16\16\u0127\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u012f\n\16\3\16\3\16\3\16\5\16\u0134\n\16\3\16\3"+
		"\16\3\16\5\16\u0139\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0147\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u014e\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0159\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u015f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0167"+
		"\n\20\f\20\16\20\u016a\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0174\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u017f"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u0185\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u018d\n\22\f\22\16\22\u0190\13\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a3\n\24"+
		"\3\24\3\24\3\24\5\24\u01a8\n\24\3\24\3\24\3\24\5\24\u01ad\n\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b8\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01d0\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01d9\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u01e4\n\31\f\31\16\31\u01e7\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01f1\n\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u01fe\n\33\7\33\u0200\n\33\f\33\16\33\u0203\13\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u023c\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\6\35\u0243\n\35\r\35\16\35\u0244\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\5\36\u024f\n\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u025a\n\37\f\37\16\37\u025d\13\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \5 \u0266\n \3 \3 \3 \3 \3 \3 \3 \5 \u026f\n \3!\3!\3"+
		"!\3!\3!\5!\u0276\n!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0283\n"+
		"\"\f\"\16\"\u0286\13\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u028f\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u0298\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02a3\n$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u02ae\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02b8\n&\3"+
		"&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJ\2\2\u02dc\2L\3\2\2\2\4P\3\2\2\2\6p\3\2\2\2\br\3\2\2\2\n\u0093"+
		"\3\2\2\2\f\u00b3\3\2\2\2\16\u00b5\3\2\2\2\20\u00c3\3\2\2\2\22\u00ce\3"+
		"\2\2\2\24\u00d9\3\2\2\2\26\u0114\3\2\2\2\30\u011e\3\2\2\2\32\u0146\3\2"+
		"\2\2\34\u015e\3\2\2\2\36\u0160\3\2\2\2 \u0184\3\2\2\2\"\u0186\3\2\2\2"+
		"$\u0194\3\2\2\2&\u019c\3\2\2\2(\u01b7\3\2\2\2*\u01b9\3\2\2\2,\u01cf\3"+
		"\2\2\2.\u01d1\3\2\2\2\60\u01dd\3\2\2\2\62\u01eb\3\2\2\2\64\u01f7\3\2\2"+
		"\2\66\u023b\3\2\2\28\u023d\3\2\2\2:\u024b\3\2\2\2<\u0253\3\2\2\2>\u026e"+
		"\3\2\2\2@\u0270\3\2\2\2B\u027c\3\2\2\2D\u0297\3\2\2\2F\u02a2\3\2\2\2H"+
		"\u02ad\3\2\2\2J\u02b7\3\2\2\2LM\b\2\1\2MN\5\4\3\2NO\b\2\1\2O\3\3\2\2\2"+
		"PQ\b\3\1\2QR\b\3\1\2RX\5\6\4\2ST\b\3\1\2TU\7\21\2\2UW\5\6\4\2VS\3\2\2"+
		"\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\b\3\1\2\\]\b\3"+
		"\1\2]\5\3\2\2\2^_\b\4\1\2_`\5\b\5\2`a\b\4\1\2aq\3\2\2\2bc\b\4\1\2cd\5"+
		"\n\6\2de\b\4\1\2eq\3\2\2\2fg\b\4\1\2gh\5\f\7\2hi\b\4\1\2iq\3\2\2\2jk\b"+
		"\4\1\2kl\5\16\b\2lm\b\4\1\2mq\3\2\2\2no\b\4\1\2oq\b\4\1\2p^\3\2\2\2pb"+
		"\3\2\2\2pf\3\2\2\2pj\3\2\2\2pn\3\2\2\2q\7\3\2\2\2rs\b\5\1\2st\b\5\1\2"+
		"tu\7\3\2\2uv\7!\2\2vw\b\5\1\2wx\7\r\2\2xy\5\4\3\2yz\b\5\1\2z{\7\16\2\2"+
		"{|\b\5\1\2|\t\3\2\2\2}~\b\6\1\2~\177\b\6\1\2\177\u0080\7\4\2\2\u0080\u0081"+
		"\5F$\2\u0081\u0082\b\6\1\2\u0082\u0094\3\2\2\2\u0083\u0084\b\6\1\2\u0084"+
		"\u0085\b\6\1\2\u0085\u0086\7\4\2\2\u0086\u0087\b\6\1\2\u0087\u0088\7\3"+
		"\2\2\u0088\u0089\5F$\2\u0089\u008a\b\6\1\2\u008a\u0094\3\2\2\2\u008b\u008c"+
		"\b\6\1\2\u008c\u008d\b\6\1\2\u008d\u008e\7\4\2\2\u008e\u008f\b\6\1\2\u008f"+
		"\u0090\7\7\2\2\u0090\u0091\5F$\2\u0091\u0092\b\6\1\2\u0092\u0094\3\2\2"+
		"\2\u0093}\3\2\2\2\u0093\u0083\3\2\2\2\u0093\u008b\3\2\2\2\u0094\13\3\2"+
		"\2\2\u0095\u0096\b\7\1\2\u0096\u0098\b\7\1\2\u0097\u0099\58\35\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\7"+
		"\1\2\u009b\u009c\5:\36\2\u009c\u009d\5> \2\u009d\u009e\b\7\1\2\u009e\u009f"+
		"\7\23\2\2\u009f\u00a0\b\7\1\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5B\"\2"+
		"\u00a2\u00a3\b\7\1\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\b\7\1\2\u00a5\u00b4"+
		"\3\2\2\2\u00a6\u00a7\b\7\1\2\u00a7\u00a9\b\7\1\2\u00a8\u00aa\58\35\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\7"+
		"\1\2\u00ac\u00ad\5:\36\2\u00ad\u00ae\5D#\2\u00ae\u00af\b\7\1\2\u00af\u00b0"+
		"\7\24\2\2\u00b0\u00b1\5> \2\u00b1\u00b2\b\7\1\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u0095\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b6\b\b\1\2"+
		"\u00b6\u00b8\b\b\1\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\b\1\2\u00bb\u00bc\5\26\f\2"+
		"\u00bc\u00be\b\b\1\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\b\1\2\u00c1\u00c2\b\b\1\2\u00c2"+
		"\17\3\2\2\2\u00c3\u00c4\b\t\1\2\u00c4\u00c5\5F$\2\u00c5\u00c7\b\t\1\2"+
		"\u00c6\u00c8\5\34\17\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\b\t\1\2\u00ca\u00cb\b\t\1\2\u00cb\u00cc\7\b\2\2\u00cc"+
		"\u00cd\b\t\1\2\u00cd\21\3\2\2\2\u00ce\u00cf\b\n\1\2\u00cf\u00d0\b\n\1"+
		"\2\u00d0\u00d1\7\33\2\2\u00d1\u00d2\5F$\2\u00d2\u00d4\b\n\1\2\u00d3\u00d5"+
		"\5\34\17\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d7\b\n\1\2\u00d7\u00d8\b\n\1\2\u00d8\23\3\2\2\2\u00d9\u00da"+
		"\b\13\1\2\u00da\u00db\b\13\1\2\u00db\u00dc\7\t\2\2\u00dc\u00dd\5\26\f"+
		"\2\u00dd\u00de\b\13\1\2\u00de\25\3\2\2\2\u00df\u00e0\b\f\1\2\u00e0\u00e1"+
		"\5F$\2\u00e1\u00e3\b\f\1\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\f\1\2\u00e6\u00e7\b\f"+
		"\1\2\u00e7\u0115\3\2\2\2\u00e8\u00e9\b\f\1\2\u00e9\u00ea\5(\25\2\u00ea"+
		"\u00eb\b\f\1\2\u00eb\u0115\3\2\2\2\u00ec\u00ed\b\f\1\2\u00ed\u00ee\5$"+
		"\23\2\u00ee\u00ef\b\f\1\2\u00ef\u0115\3\2\2\2\u00f0\u00f1\b\f\1\2\u00f1"+
		"\u00f2\5&\24\2\u00f2\u00f3\b\f\1\2\u00f3\u0115\3\2\2\2\u00f4\u00f5\b\f"+
		"\1\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\b\f\1\2\u00f8"+
		"\u0115\3\2\2\2\u00f9\u00fa\b\f\1\2\u00fa\u00fb\5,\27\2\u00fb\u00fc\b\f"+
		"\1\2\u00fc\u0115\3\2\2\2\u00fd\u00fe\b\f\1\2\u00fe\u0100\b\f\1\2\u00ff"+
		"\u0101\5\22\n\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\f\1\2\u0105"+
		"\u0106\5\26\f\2\u0106\u0107\b\f\1\2\u0107\u0115\3\2\2\2\u0108\u0109\b"+
		"\f\1\2\u0109\u010a\7#\2\2\u010a\u010c\b\f\1\2\u010b\u010d\5\34\17\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\f"+
		"\1\2\u010f\u0115\b\f\1\2\u0110\u0111\b\f\1\2\u0111\u0112\5.\30\2\u0112"+
		"\u0113\b\f\1\2\u0113\u0115\3\2\2\2\u0114\u00df\3\2\2\2\u0114\u00e8\3\2"+
		"\2\2\u0114\u00ec\3\2\2\2\u0114\u00f0\3\2\2\2\u0114\u00f4\3\2\2\2\u0114"+
		"\u00f9\3\2\2\2\u0114\u00fd\3\2\2\2\u0114\u0108\3\2\2\2\u0114\u0110\3\2"+
		"\2\2\u0115\27\3\2\2\2\u0116\u0117\b\r\1\2\u0117\u0118\5\32\16\2\u0118"+
		"\u0119\b\r\1\2\u0119\u011f\3\2\2\2\u011a\u011b\b\r\1\2\u011b\u011c\5\26"+
		"\f\2\u011c\u011d\b\r\1\2\u011d\u011f\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u011a\3\2\2\2\u011f\31\3\2\2\2\u0120\u0121\b\16\1\2\u0121\u0125\b\16"+
		"\1\2\u0122\u0124\5\22\n\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\b\16\1\2\u0129\u012a\b\16\1\2\u012a\u012b\7\"\2\2\u012b"+
		"\u012c\b\16\1\2\u012c\u012e\b\16\1\2\u012d\u012f\7\30\2\2\u012e\u012d"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\16\1\2"+
		"\u0131\u0133\b\16\1\2\u0132\u0134\7\31\2\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b\16\1\2\u0136\u0138\b\16\1\2"+
		"\u0137\u0139\5*\26\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\b\16\1\2\u013b\u013c\b\16\1\2\u013c\u013d\5\32\16"+
		"\2\u013d\u013e\b\16\1\2\u013e\u013f\b\16\1\2\u013f\u0147\3\2\2\2\u0140"+
		"\u0141\b\16\1\2\u0141\u0142\b\16\1\2\u0142\u0143\7\25\2\2\u0143\u0144"+
		"\5\26\f\2\u0144\u0145\b\16\1\2\u0145\u0147\3\2\2\2\u0146\u0120\3\2\2\2"+
		"\u0146\u0140\3\2\2\2\u0147\33\3\2\2\2\u0148\u0149\b\17\1\2\u0149\u014a"+
		"\b\17\1\2\u014a\u014b\7\17\2\2\u014b\u014d\b\17\1\2\u014c\u014e\5\36\20"+
		"\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\b\17\1\2\u0150\u0151\b\17\1\2\u0151\u0152\7\20\2\2\u0152\u015f\b\17\1"+
		"\2\u0153\u0154\b\17\1\2\u0154\u0155\b\17\1\2\u0155\u0156\7\13\2\2\u0156"+
		"\u0158\b\17\1\2\u0157\u0159\5\36\20\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\17\1\2\u015b\u015c\b\17\1\2"+
		"\u015c\u015d\7\f\2\2\u015d\u015f\b\17\1\2\u015e\u0148\3\2\2\2\u015e\u0153"+
		"\3\2\2\2\u015f\35\3\2\2\2\u0160\u0161\b\20\1\2\u0161\u0162\b\20\1\2\u0162"+
		"\u0168\5\26\f\2\u0163\u0164\b\20\1\2\u0164\u0165\7\22\2\2\u0165\u0167"+
		"\5\26\f\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c"+
		"\b\20\1\2\u016c\u016d\b\20\1\2\u016d\37\3\2\2\2\u016e\u016f\b\21\1\2\u016f"+
		"\u0170\b\21\1\2\u0170\u0171\7\17\2\2\u0171\u0173\b\21\1\2\u0172\u0174"+
		"\5\"\22\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2"+
		"\u0175\u0176\b\21\1\2\u0176\u0177\b\21\1\2\u0177\u0178\7\20\2\2\u0178"+
		"\u0185\b\21\1\2\u0179\u017a\b\21\1\2\u017a\u017b\b\21\1\2\u017b\u017c"+
		"\7\13\2\2\u017c\u017e\b\21\1\2\u017d\u017f\5\"\22\2\u017e\u017d\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\21\1\2\u0181"+
		"\u0182\b\21\1\2\u0182\u0183\7\f\2\2\u0183\u0185\b\21\1\2\u0184\u016e\3"+
		"\2\2\2\u0184\u0179\3\2\2\2\u0185!\3\2\2\2\u0186\u0187\b\22\1\2\u0187\u0188"+
		"\b\22\1\2\u0188\u018e\5\30\r\2\u0189\u018a\b\22\1\2\u018a\u018b\7\22\2"+
		"\2\u018b\u018d\5\30\r\2\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0192\b\22\1\2\u0192\u0193\b\22\1\2\u0193#\3\2\2\2\u0194\u0195"+
		"\b\23\1\2\u0195\u0196\b\23\1\2\u0196\u0197\7\13\2\2\u0197\u0198\5\4\3"+
		"\2\u0198\u0199\b\23\1\2\u0199\u019a\7\f\2\2\u019a\u019b\b\23\1\2\u019b"+
		"%\3\2\2\2\u019c\u019d\b\24\1\2\u019d\u019e\b\24\1\2\u019e\u019f\7\"\2"+
		"\2\u019f\u01a0\b\24\1\2\u01a0\u01a2\b\24\1\2\u01a1\u01a3\7\30\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\24"+
		"\1\2\u01a5\u01a7\b\24\1\2\u01a6\u01a8\7\31\2\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b\24\1\2\u01aa\u01ac\b"+
		"\24\1\2\u01ab\u01ad\5*\26\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\b\24\1\2\u01af\u01b0\b\24\1\2\u01b0\'\3\2\2"+
		"\2\u01b1\u01b2\b\25\1\2\u01b2\u01b3\7$\2\2\u01b3\u01b8\b\25\1\2\u01b4"+
		"\u01b5\b\25\1\2\u01b5\u01b6\7%\2\2\u01b6\u01b8\b\25\1\2\u01b7\u01b1\3"+
		"\2\2\2\u01b7\u01b4\3\2\2\2\u01b8)\3\2\2\2\u01b9\u01ba\b\26\1\2\u01ba\u01bb"+
		"\b\26\1\2\u01bb\u01bc\7\24\2\2\u01bc\u01bd\5> \2\u01bd\u01be\b\26\1\2"+
		"\u01be+\3\2\2\2\u01bf\u01c0\b\27\1\2\u01c0\u01c1\7\34\2\2\u01c1\u01c2"+
		"\7\35\2\2\u01c2\u01d0\b\27\1\2\u01c3\u01c4\b\27\1\2\u01c4\u01c5\7\34\2"+
		"\2\u01c5\u01c6\7\36\2\2\u01c6\u01d0\b\27\1\2\u01c7\u01c8\b\27\1\2\u01c8"+
		"\u01c9\7\34\2\2\u01c9\u01ca\7\37\2\2\u01ca\u01d0\b\27\1\2\u01cb\u01cc"+
		"\b\27\1\2\u01cc\u01cd\7\34\2\2\u01cd\u01ce\7 \2\2\u01ce\u01d0\b\27\1\2"+
		"\u01cf\u01bf\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01cb"+
		"\3\2\2\2\u01d0-\3\2\2\2\u01d1\u01d2\b\30\1\2\u01d2\u01d3\b\30\1\2\u01d3"+
		"\u01d4\7\5\2\2\u01d4\u01d5\5\26\f\2\u01d5\u01d6\5\60\31\2\u01d6\u01d8"+
		"\b\30\1\2\u01d7\u01d9\7\6\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u01db\b\30\1\2\u01db\u01dc\b\30\1\2\u01dc/"+
		"\3\2\2\2\u01dd\u01de\b\31\1\2\u01de\u01df\b\31\1\2\u01df\u01e5\5\26\f"+
		"\2\u01e0\u01e1\b\31\1\2\u01e1\u01e2\7\21\2\2\u01e2\u01e4\5\26\f\2\u01e3"+
		"\u01e0\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\b\31\1\2\u01e9"+
		"\u01ea\b\31\1\2\u01ea\61\3\2\2\2\u01eb\u01ec\b\32\1\2\u01ec\u01ed\b\32"+
		"\1\2\u01ed\u01ee\7\r\2\2\u01ee\u01f0\b\32\1\2\u01ef\u01f1\5\64\33\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\b\32"+
		"\1\2\u01f3\u01f4\b\32\1\2\u01f4\u01f5\7\16\2\2\u01f5\u01f6\b\32\1\2\u01f6"+
		"\63\3\2\2\2\u01f7\u01f8\b\33\1\2\u01f8\u01f9\b\33\1\2\u01f9\u0201\5\66"+
		"\34\2\u01fa\u01fb\b\33\1\2\u01fb\u01fd\7\21\2\2\u01fc\u01fe\5\66\34\2"+
		"\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fa"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\b\33\1\2\u0205\u0206\b"+
		"\33\1\2\u0206\65\3\2\2\2\u0207\u0208\b\34\1\2\u0208\u0209\7#\2\2\u0209"+
		"\u023c\b\34\1\2\u020a\u020b\b\34\1\2\u020b\u020c\b\34\1\2\u020c\u020d"+
		"\7\27\2\2\u020d\u020e\7#\2\2\u020e\u023c\b\34\1\2\u020f\u0210\b\34\1\2"+
		"\u0210\u0211\7#\2\2\u0211\u0212\b\34\1\2\u0212\u0213\7\b\2\2\u0213\u0214"+
		"\5\26\f\2\u0214\u0215\b\34\1\2\u0215\u023c\3\2\2\2\u0216\u0217\b\34\1"+
		"\2\u0217\u0218\7\"\2\2\u0218\u023c\b\34\1\2\u0219\u021a\b\34\1\2\u021a"+
		"\u021b\b\34\1\2\u021b\u021c\7\27\2\2\u021c\u021d\7\"\2\2\u021d\u023c\b"+
		"\34\1\2\u021e\u021f\b\34\1\2\u021f\u0220\7\"\2\2\u0220\u0221\b\34\1\2"+
		"\u0221\u0222\7\b\2\2\u0222\u0223\5\26\f\2\u0223\u0224\b\34\1\2\u0224\u023c"+
		"\3\2\2\2\u0225\u0226\b\34\1\2\u0226\u0227\7$\2\2\u0227\u023c\b\34\1\2"+
		"\u0228\u0229\b\34\1\2\u0229\u022a\b\34\1\2\u022a\u022b\7\27\2\2\u022b"+
		"\u022c\7$\2\2\u022c\u023c\b\34\1\2\u022d\u022e\b\34\1\2\u022e\u022f\7"+
		"$\2\2\u022f\u0230\b\34\1\2\u0230\u0231\7\b\2\2\u0231\u0232\5\26\f\2\u0232"+
		"\u0233\b\34\1\2\u0233\u023c\3\2\2\2\u0234\u0235\b\34\1\2\u0235\u0236\5"+
		"F$\2\u0236\u0237\b\34\1\2\u0237\u0238\7\b\2\2\u0238\u0239\5\26\f\2\u0239"+
		"\u023a\b\34\1\2\u023a\u023c\3\2\2\2\u023b\u0207\3\2\2\2\u023b\u020a\3"+
		"\2\2\2\u023b\u020f\3\2\2\2\u023b\u0216\3\2\2\2\u023b\u0219\3\2\2\2\u023b"+
		"\u021e\3\2\2\2\u023b\u0225\3\2\2\2\u023b\u0228\3\2\2\2\u023b\u022d\3\2"+
		"\2\2\u023b\u0234\3\2\2\2\u023c\67\3\2\2\2\u023d\u023e\b\35\1\2\u023e\u023f"+
		"\b\35\1\2\u023f\u0240\7\n\2\2\u0240\u0242\b\35\1\2\u0241\u0243\5&\24\2"+
		"\u0242\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\b\35\1\2\u0247\u0248\b\35\1\2"+
		"\u0248\u0249\7\25\2\2\u0249\u024a\b\35\1\2\u024a9\3\2\2\2\u024b\u024c"+
		"\b\36\1\2\u024c\u024e\b\36\1\2\u024d\u024f\5\62\32\2\u024e\u024d\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\b\36\1\2\u0251"+
		"\u0252\b\36\1\2\u0252;\3\2\2\2\u0253\u0254\b\37\1\2\u0254\u0255\b\37\1"+
		"\2\u0255\u025b\5> \2\u0256\u0257\b\37\1\2\u0257\u0258\7\22\2\2\u0258\u025a"+
		"\5> \2\u0259\u0256\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\b\37"+
		"\1\2\u025f\u0260\b\37\1\2\u0260=\3\2\2\2\u0261\u0262\b \1\2\u0262\u0263"+
		"\5F$\2\u0263\u0265\b \1\2\u0264\u0266\5@!\2\u0265\u0264\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\b \1\2\u0268\u0269\b \1"+
		"\2\u0269\u026f\3\2\2\2\u026a\u026b\b \1\2\u026b\u026c\5&\24\2\u026c\u026d"+
		"\b \1\2\u026d\u026f\3\2\2\2\u026e\u0261\3\2\2\2\u026e\u026a\3\2\2\2\u026f"+
		"?\3\2\2\2\u0270\u0271\b!\1\2\u0271\u0272\b!\1\2\u0272\u0273\7\17\2\2\u0273"+
		"\u0275\b!\1\2\u0274\u0276\5<\37\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277\u0278\b!\1\2\u0278\u0279\b!\1\2\u0279\u027a"+
		"\7\20\2\2\u027a\u027b\b!\1\2\u027bA\3\2\2\2\u027c\u027d\b\"\1\2\u027d"+
		"\u0284\b\"\1\2\u027e\u027f\5D#\2\u027f\u0280\b\"\1\2\u0280\u0281\7\21"+
		"\2\2\u0281\u0283\3\2\2\2\u0282\u027e\3\2\2\2\u0283\u0286\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0287\u0288\b\"\1\2\u0288\u0289\b\"\1\2\u0289C\3\2\2\2\u028a\u028b"+
		"\b#\1\2\u028b\u028c\5F$\2\u028c\u028e\b#\1\2\u028d\u028f\5 \21\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\b#"+
		"\1\2\u0291\u0292\b#\1\2\u0292\u0298\3\2\2\2\u0293\u0294\b#\1\2\u0294\u0295"+
		"\5&\24\2\u0295\u0296\b#\1\2\u0296\u0298\3\2\2\2\u0297\u028a\3\2\2\2\u0297"+
		"\u0293\3\2\2\2\u0298E\3\2\2\2\u0299\u029a\b$\1\2\u029a\u029b\5H%\2\u029b"+
		"\u029c\7!\2\2\u029c\u029d\b$\1\2\u029d\u02a3\3\2\2\2\u029e\u029f\b$\1"+
		"\2\u029f\u02a0\5J&\2\u02a0\u02a1\b$\1\2\u02a1\u02a3\3\2\2\2\u02a2\u0299"+
		"\3\2\2\2\u02a2\u029e\3\2\2\2\u02a3G\3\2\2\2\u02a4\u02a5\b%\1\2\u02a5\u02a6"+
		"\7!\2\2\u02a6\u02a7\b%\1\2\u02a7\u02a8\7\26\2\2\u02a8\u02a9\5H%\2\u02a9"+
		"\u02aa\b%\1\2\u02aa\u02ae\3\2\2\2\u02ab\u02ac\b%\1\2\u02ac\u02ae\b%\1"+
		"\2\u02ad\u02a4\3\2\2\2\u02ad\u02ab\3\2\2\2\u02aeI\3\2\2\2\u02af\u02b0"+
		"\b&\1\2\u02b0\u02b1\b&\1\2\u02b1\u02b2\7\b\2\2\u02b2\u02b8\b&\1\2\u02b3"+
		"\u02b4\b&\1\2\u02b4\u02b5\b&\1\2\u02b5\u02b6\7\33\2\2\u02b6\u02b8\b&\1"+
		"\2\u02b7\u02af\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b8K\3\2\2\2\65Xp\u0093\u0098"+
		"\u00a9\u00b3\u00b8\u00be\u00c7\u00d4\u00e3\u0102\u010c\u0114\u011e\u0125"+
		"\u012e\u0133\u0138\u0146\u014d\u0158\u015e\u0168\u0173\u017e\u0184\u018e"+
		"\u01a2\u01a7\u01ac\u01b7\u01cf\u01d8\u01e5\u01f0\u01fd\u0201\u023b\u0244"+
		"\u024e\u025b\u0265\u026e\u0275\u0284\u028e\u0297\u02a2\u02ad\u02b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}