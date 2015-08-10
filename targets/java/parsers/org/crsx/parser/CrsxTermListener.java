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
	 * Enter a parse tree produced by {@link CrsxTermParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CrsxTermParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CrsxTermParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CrsxTermParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CrsxTermParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(CrsxTermParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(CrsxTermParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CrsxTermParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CrsxTermParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration(CrsxTermParser.RuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration(CrsxTermParser.RuleDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(CrsxTermParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(CrsxTermParser.PatternContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(CrsxTermParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(CrsxTermParser.AnnotationsContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#freeTerm}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerm(CrsxTermParser.FreeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#freeTerm}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerm(CrsxTermParser.FreeTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#boundTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoundTerm(CrsxTermParser.BoundTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#boundTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoundTerm(CrsxTermParser.BoundTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#nextBinder}.
	 * @param ctx the parse tree
	 */
	void enterNextBinder(CrsxTermParser.NextBinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#nextBinder}.
	 * @param ctx the parse tree
	 */
	void exitNextBinder(CrsxTermParser.NextBinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CrsxTermParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CrsxTermParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#freeArguments}.
	 * @param ctx the parse tree
	 */
	void enterFreeArguments(CrsxTermParser.FreeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#freeArguments}.
	 * @param ctx the parse tree
	 */
	void exitFreeArguments(CrsxTermParser.FreeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#freeTerms}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms(CrsxTermParser.FreeTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#freeTerms}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms(CrsxTermParser.FreeTermsContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#termList}.
	 * @param ctx the parse tree
	 */
	void enterTermList(CrsxTermParser.TermListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#termList}.
	 * @param ctx the parse tree
	 */
	void exitTermList(CrsxTermParser.TermListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(CrsxTermParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(CrsxTermParser.ListItemContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#linear}.
	 * @param ctx the parse tree
	 */
	void enterLinear(CrsxTermParser.LinearContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#linear}.
	 * @param ctx the parse tree
	 */
	void exitLinear(CrsxTermParser.LinearContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#functional}.
	 * @param ctx the parse tree
	 */
	void enterFunctional(CrsxTermParser.FunctionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#functional}.
	 * @param ctx the parse tree
	 */
	void exitFunctional(CrsxTermParser.FunctionalContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterBinder(CrsxTermParser.BinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitBinder(CrsxTermParser.BinderContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#dispatchTerm}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm(CrsxTermParser.DispatchTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#dispatchTerm}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm(CrsxTermParser.DispatchTermContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#dispatchCase}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCase(CrsxTermParser.DispatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#dispatchCase}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCase(CrsxTermParser.DispatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#delayCase}.
	 * @param ctx the parse tree
	 */
	void enterDelayCase(CrsxTermParser.DelayCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#delayCase}.
	 * @param ctx the parse tree
	 */
	void exitDelayCase(CrsxTermParser.DelayCaseContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CrsxTermParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CrsxTermParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSortDeclaration(CrsxTermParser.SortDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSortDeclaration(CrsxTermParser.SortDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxTermParser#sortarguments}.
	 * @param ctx the parse tree
	 */
	void enterSortarguments(CrsxTermParser.SortargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#sortarguments}.
	 * @param ctx the parse tree
	 */
	void exitSortarguments(CrsxTermParser.SortargumentsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(CrsxTermParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(CrsxTermParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments(CrsxTermParser.DirectiveArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments(CrsxTermParser.DirectiveArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(CrsxTermParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(CrsxTermParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxTermParser#directiveList}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveList(CrsxTermParser.DirectiveListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxTermParser#directiveList}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveList(CrsxTermParser.DirectiveListContext ctx);
}