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
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CrsxTermParser}.
 */
public interface CrsxTermListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#crsx}.
	 * @param ctx the parse tree
	 */
	void enterCrsx(CrsxTermParser.CrsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#crsx}.
	 * @param ctx the parse tree
	 */
	void exitCrsx(CrsxTermParser.CrsxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(CrsxTermParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(CrsxTermParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CrsxTermParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CrsxTermParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void enterModuleDecl(CrsxTermParser.ModuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void exitModuleDecl(CrsxTermParser.ModuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(CrsxTermParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(CrsxTermParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void enterSortDecl(CrsxTermParser.SortDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void exitSortDecl(CrsxTermParser.SortDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortVars}.
	 * @param ctx the parse tree
	 */
	void enterSortVars(CrsxTermParser.SortVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortVars}.
	 * @param ctx the parse tree
	 */
	void exitSortVars(CrsxTermParser.SortVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortDef}.
	 * @param ctx the parse tree
	 */
	void enterSortDef(CrsxTermParser.SortDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortDef}.
	 * @param ctx the parse tree
	 */
	void exitSortDef(CrsxTermParser.SortDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fixity}.
	 * @param ctx the parse tree
	 */
	void enterFixity(CrsxTermParser.FixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fixity}.
	 * @param ctx the parse tree
	 */
	void exitFixity(CrsxTermParser.FixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(CrsxTermParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(CrsxTermParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#variantArgs}.
	 * @param ctx the parse tree
	 */
	void enterVariantArgs(CrsxTermParser.VariantArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#variantArgs}.
	 * @param ctx the parse tree
	 */
	void exitVariantArgs(CrsxTermParser.VariantArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortMap}.
	 * @param ctx the parse tree
	 */
	void enterSortMap(CrsxTermParser.SortMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortMap}.
	 * @param ctx the parse tree
	 */
	void exitSortMap(CrsxTermParser.SortMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnSortParams}.
	 * @param ctx the parse tree
	 */
	void enterFnSortParams(CrsxTermParser.FnSortParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnSortParams}.
	 * @param ctx the parse tree
	 */
	void exitFnSortParams(CrsxTermParser.FnSortParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(CrsxTermParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(CrsxTermParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortScope}.
	 * @param ctx the parse tree
	 */
	void enterSortScope(CrsxTermParser.SortScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortScope}.
	 * @param ctx the parse tree
	 */
	void exitSortScope(CrsxTermParser.SortScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#paramSort}.
	 * @param ctx the parse tree
	 */
	void enterParamSort(CrsxTermParser.ParamSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#paramSort}.
	 * @param ctx the parse tree
	 */
	void exitParamSort(CrsxTermParser.ParamSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortParams}.
	 * @param ctx the parse tree
	 */
	void enterSortParams(CrsxTermParser.SortParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortParams}.
	 * @param ctx the parse tree
	 */
	void exitSortParams(CrsxTermParser.SortParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sorts}.
	 * @param ctx the parse tree
	 */
	void enterSorts(CrsxTermParser.SortsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sorts}.
	 * @param ctx the parse tree
	 */
	void exitSorts(CrsxTermParser.SortsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#ruleDecl}.
	 * @param ctx the parse tree
	 */
	void enterRuleDecl(CrsxTermParser.RuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#ruleDecl}.
	 * @param ctx the parse tree
	 */
	void exitRuleDecl(CrsxTermParser.RuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnDecl}.
	 * @param ctx the parse tree
	 */
	void enterFnDecl(CrsxTermParser.FnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnDecl}.
	 * @param ctx the parse tree
	 */
	void exitFnDecl(CrsxTermParser.FnDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnFixity}.
	 * @param ctx the parse tree
	 */
	void enterFnFixity(CrsxTermParser.FnFixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnFixity}.
	 * @param ctx the parse tree
	 */
	void exitFnFixity(CrsxTermParser.FnFixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnParamsDecl}.
	 * @param ctx the parse tree
	 */
	void enterFnParamsDecl(CrsxTermParser.FnParamsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnParamsDecl}.
	 * @param ctx the parse tree
	 */
	void exitFnParamsDecl(CrsxTermParser.FnParamsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnParams}.
	 * @param ctx the parse tree
	 */
	void enterFnParams(CrsxTermParser.FnParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnParams}.
	 * @param ctx the parse tree
	 */
	void exitFnParams(CrsxTermParser.FnParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnParam}.
	 * @param ctx the parse tree
	 */
	void enterFnParam(CrsxTermParser.FnParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnParam}.
	 * @param ctx the parse tree
	 */
	void exitFnParam(CrsxTermParser.FnParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#fnParamSort}.
	 * @param ctx the parse tree
	 */
	void enterFnParamSort(CrsxTermParser.FnParamSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#fnParamSort}.
	 * @param ctx the parse tree
	 */
	void exitFnParamSort(CrsxTermParser.FnParamSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(CrsxTermParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(CrsxTermParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CrsxTermParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CrsxTermParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#nterm}.
	 * @param ctx the parse tree
	 */
	void enterNterm(CrsxTermParser.NtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#nterm}.
	 * @param ctx the parse tree
	 */
	void exitNterm(CrsxTermParser.NtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#aterm}.
	 * @param ctx the parse tree
	 */
	void enterAterm(CrsxTermParser.AtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#aterm}.
	 * @param ctx the parse tree
	 */
	void exitAterm(CrsxTermParser.AtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CrsxTermParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CrsxTermParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#scopes}.
	 * @param ctx the parse tree
	 */
	void enterScopes(CrsxTermParser.ScopesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#scopes}.
	 * @param ctx the parse tree
	 */
	void exitScopes(CrsxTermParser.ScopesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(CrsxTermParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(CrsxTermParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#binders}.
	 * @param ctx the parse tree
	 */
	void enterBinders(CrsxTermParser.BindersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#binders}.
	 * @param ctx the parse tree
	 */
	void exitBinders(CrsxTermParser.BindersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#apply}.
	 * @param ctx the parse tree
	 */
	void enterApply(CrsxTermParser.ApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#apply}.
	 * @param ctx the parse tree
	 */
	void exitApply(CrsxTermParser.ApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#groupOrList}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrList(CrsxTermParser.GroupOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#groupOrList}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrList(CrsxTermParser.GroupOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CrsxTermParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CrsxTermParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CrsxTermParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CrsxTermParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#concrete}.
	 * @param ctx the parse tree
	 */
	void enterConcrete(CrsxTermParser.ConcreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#concrete}.
	 * @param ctx the parse tree
	 */
	void exitConcrete(CrsxTermParser.ConcreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(CrsxTermParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(CrsxTermParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#dispatchCases}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases(CrsxTermParser.DispatchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#dispatchCases}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases(CrsxTermParser.DispatchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(CrsxTermParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(CrsxTermParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#kvs}.
	 * @param ctx the parse tree
	 */
	void enterKvs(CrsxTermParser.KvsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#kvs}.
	 * @param ctx the parse tree
	 */
	void exitKvs(CrsxTermParser.KvsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#kv}.
	 * @param ctx the parse tree
	 */
	void enterKv(CrsxTermParser.KvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#kv}.
	 * @param ctx the parse tree
	 */
	void exitKv(CrsxTermParser.KvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(CrsxTermParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(CrsxTermParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(CrsxTermParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(CrsxTermParser.SymbolsContext ctx);
}