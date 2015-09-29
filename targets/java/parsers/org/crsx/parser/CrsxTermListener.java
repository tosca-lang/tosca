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
	 * Enter a parse tree produced by {@link CrsxTermParser#termDecl}.
	 * @param ctx the parse tree
	 */
	void enterTermDecl(CrsxTermParser.TermDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#termDecl}.
	 * @param ctx the parse tree
	 */
	void exitTermDecl(CrsxTermParser.TermDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(CrsxTermParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(CrsxTermParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CrsxTermParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CrsxTermParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#contractum}.
	 * @param ctx the parse tree
	 */
	void enterContractum(CrsxTermParser.ContractumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#contractum}.
	 * @param ctx the parse tree
	 */
	void exitContractum(CrsxTermParser.ContractumContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#sargs}.
	 * @param ctx the parse tree
	 */
	void enterSargs(CrsxTermParser.SargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sargs}.
	 * @param ctx the parse tree
	 */
	void exitSargs(CrsxTermParser.SargsContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CrsxTermParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CrsxTermParser.ListContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#varsort}.
	 * @param ctx the parse tree
	 */
	void enterVarsort(CrsxTermParser.VarsortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#varsort}.
	 * @param ctx the parse tree
	 */
	void exitVarsort(CrsxTermParser.VarsortContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(CrsxTermParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(CrsxTermParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(CrsxTermParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(CrsxTermParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CrsxTermParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CrsxTermParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortparams}.
	 * @param ctx the parse tree
	 */
	void enterSortparams(CrsxTermParser.SortparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortparams}.
	 * @param ctx the parse tree
	 */
	void exitSortparams(CrsxTermParser.SortparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortset}.
	 * @param ctx the parse tree
	 */
	void enterSortset(CrsxTermParser.SortsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortset}.
	 * @param ctx the parse tree
	 */
	void exitSortset(CrsxTermParser.SortsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortnames}.
	 * @param ctx the parse tree
	 */
	void enterSortnames(CrsxTermParser.SortnamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortnames}.
	 * @param ctx the parse tree
	 */
	void exitSortnames(CrsxTermParser.SortnamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortname}.
	 * @param ctx the parse tree
	 */
	void enterSortname(CrsxTermParser.SortnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortname}.
	 * @param ctx the parse tree
	 */
	void exitSortname(CrsxTermParser.SortnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortargs}.
	 * @param ctx the parse tree
	 */
	void enterSortargs(CrsxTermParser.SortargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortargs}.
	 * @param ctx the parse tree
	 */
	void exitSortargs(CrsxTermParser.SortargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(CrsxTermParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(CrsxTermParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(CrsxTermParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(CrsxTermParser.FormContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(CrsxTermParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(CrsxTermParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(CrsxTermParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(CrsxTermParser.ReservedContext ctx);
}