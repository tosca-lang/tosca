// Generated from /Users/villardl/Projects/crsx/crsx4/src/pg/ANTLRTerm.g4 by ANTLR 4.5
package org.crsx.pg;

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.crsx.antlr.SinkAntlrListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLRTerm}.
 */
public interface ANTLRTermListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void enterGrammarSpec(ANTLRTerm.GrammarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void exitGrammarSpec(ANTLRTerm.GrammarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#grammarType}.
	 * @param ctx the parse tree
	 */
	void enterGrammarType(ANTLRTerm.GrammarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#grammarType}.
	 * @param ctx the parse tree
	 */
	void exitGrammarType(ANTLRTerm.GrammarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#grammarType_S1}.
	 * @param ctx the parse tree
	 */
	void enterGrammarType_S1(ANTLRTerm.GrammarType_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#grammarType_S1}.
	 * @param ctx the parse tree
	 */
	void exitGrammarType_S1(ANTLRTerm.GrammarType_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#prequelConstruct}.
	 * @param ctx the parse tree
	 */
	void enterPrequelConstruct(ANTLRTerm.PrequelConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#prequelConstruct}.
	 * @param ctx the parse tree
	 */
	void exitPrequelConstruct(ANTLRTerm.PrequelConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void enterOptionsSpec(ANTLRTerm.OptionsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void exitOptionsSpec(ANTLRTerm.OptionsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#optionsSpec_S1}.
	 * @param ctx the parse tree
	 */
	void enterOptionsSpec_S1(ANTLRTerm.OptionsSpec_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#optionsSpec_S1}.
	 * @param ctx the parse tree
	 */
	void exitOptionsSpec_S1(ANTLRTerm.OptionsSpec_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(ANTLRTerm.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(ANTLRTerm.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(ANTLRTerm.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(ANTLRTerm.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#optionValue1Sub1}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue1Sub1(ANTLRTerm.OptionValue1Sub1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#optionValue1Sub1}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue1Sub1(ANTLRTerm.OptionValue1Sub1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#delegateGrammars}.
	 * @param ctx the parse tree
	 */
	void enterDelegateGrammars(ANTLRTerm.DelegateGrammarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#delegateGrammars}.
	 * @param ctx the parse tree
	 */
	void exitDelegateGrammars(ANTLRTerm.DelegateGrammarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#delegateGrammarsSub1}.
	 * @param ctx the parse tree
	 */
	void enterDelegateGrammarsSub1(ANTLRTerm.DelegateGrammarsSub1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#delegateGrammarsSub1}.
	 * @param ctx the parse tree
	 */
	void exitDelegateGrammarsSub1(ANTLRTerm.DelegateGrammarsSub1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#delegateGrammar}.
	 * @param ctx the parse tree
	 */
	void enterDelegateGrammar(ANTLRTerm.DelegateGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#delegateGrammar}.
	 * @param ctx the parse tree
	 */
	void exitDelegateGrammar(ANTLRTerm.DelegateGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void enterTokensSpec(ANTLRTerm.TokensSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void exitTokensSpec(ANTLRTerm.TokensSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ANTLRTerm.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ANTLRTerm.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#action_S1}.
	 * @param ctx the parse tree
	 */
	void enterAction_S1(ANTLRTerm.Action_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#action_S1}.
	 * @param ctx the parse tree
	 */
	void exitAction_S1(ANTLRTerm.Action_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void enterActionScopeName(ANTLRTerm.ActionScopeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void exitActionScopeName(ANTLRTerm.ActionScopeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#modeSpec}.
	 * @param ctx the parse tree
	 */
	void enterModeSpec(ANTLRTerm.ModeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#modeSpec}.
	 * @param ctx the parse tree
	 */
	void exitModeSpec(ANTLRTerm.ModeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(ANTLRTerm.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(ANTLRTerm.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpec(ANTLRTerm.RuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpec(ANTLRTerm.RuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void enterParserRuleSpec(ANTLRTerm.ParserRuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void exitParserRuleSpec(ANTLRTerm.ParserRuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExceptionGroup(ANTLRTerm.ExceptionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExceptionGroup(ANTLRTerm.ExceptionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandler(ANTLRTerm.ExceptionHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandler(ANTLRTerm.ExceptionHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(ANTLRTerm.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(ANTLRTerm.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#rulePrequel}.
	 * @param ctx the parse tree
	 */
	void enterRulePrequel(ANTLRTerm.RulePrequelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#rulePrequel}.
	 * @param ctx the parse tree
	 */
	void exitRulePrequel(ANTLRTerm.RulePrequelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleReturns}.
	 * @param ctx the parse tree
	 */
	void enterRuleReturns(ANTLRTerm.RuleReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleReturns}.
	 * @param ctx the parse tree
	 */
	void exitRuleReturns(ANTLRTerm.RuleReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void enterThrowsSpec(ANTLRTerm.ThrowsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void exitThrowsSpec(ANTLRTerm.ThrowsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#localsSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocalsSpec(ANTLRTerm.LocalsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#localsSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocalsSpec(ANTLRTerm.LocalsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleAction}.
	 * @param ctx the parse tree
	 */
	void enterRuleAction(ANTLRTerm.RuleActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleAction}.
	 * @param ctx the parse tree
	 */
	void exitRuleAction(ANTLRTerm.RuleActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleModifiers}.
	 * @param ctx the parse tree
	 */
	void enterRuleModifiers(ANTLRTerm.RuleModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleModifiers}.
	 * @param ctx the parse tree
	 */
	void exitRuleModifiers(ANTLRTerm.RuleModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleModifier}.
	 * @param ctx the parse tree
	 */
	void enterRuleModifier(ANTLRTerm.RuleModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleModifier}.
	 * @param ctx the parse tree
	 */
	void exitRuleModifier(ANTLRTerm.RuleModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void enterRuleBlock(ANTLRTerm.RuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void exitRuleBlock(ANTLRTerm.RuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleAltList}.
	 * @param ctx the parse tree
	 */
	void enterRuleAltList(ANTLRTerm.RuleAltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleAltList}.
	 * @param ctx the parse tree
	 */
	void exitRuleAltList(ANTLRTerm.RuleAltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleAltList_S1}.
	 * @param ctx the parse tree
	 */
	void enterRuleAltList_S1(ANTLRTerm.RuleAltList_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleAltList_S1}.
	 * @param ctx the parse tree
	 */
	void exitRuleAltList_S1(ANTLRTerm.RuleAltList_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledAlt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledAlt(ANTLRTerm.LabeledAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledAlt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledAlt(ANTLRTerm.LabeledAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledAlt_S1}.
	 * @param ctx the parse tree
	 */
	void enterLabeledAlt_S1(ANTLRTerm.LabeledAlt_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledAlt_S1}.
	 * @param ctx the parse tree
	 */
	void exitLabeledAlt_S1(ANTLRTerm.LabeledAlt_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexerRule(ANTLRTerm.LexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexerRule(ANTLRTerm.LexerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerRuleBlock}.
	 * @param ctx the parse tree
	 */
	void enterLexerRuleBlock(ANTLRTerm.LexerRuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerRuleBlock}.
	 * @param ctx the parse tree
	 */
	void exitLexerRuleBlock(ANTLRTerm.LexerRuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerAltList}.
	 * @param ctx the parse tree
	 */
	void enterLexerAltList(ANTLRTerm.LexerAltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerAltList}.
	 * @param ctx the parse tree
	 */
	void exitLexerAltList(ANTLRTerm.LexerAltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerAltList_S1}.
	 * @param ctx the parse tree
	 */
	void enterLexerAltList_S1(ANTLRTerm.LexerAltList_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerAltList_S1}.
	 * @param ctx the parse tree
	 */
	void exitLexerAltList_S1(ANTLRTerm.LexerAltList_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerAlt}.
	 * @param ctx the parse tree
	 */
	void enterLexerAlt(ANTLRTerm.LexerAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerAlt}.
	 * @param ctx the parse tree
	 */
	void exitLexerAlt(ANTLRTerm.LexerAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerElements}.
	 * @param ctx the parse tree
	 */
	void enterLexerElements(ANTLRTerm.LexerElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerElements}.
	 * @param ctx the parse tree
	 */
	void exitLexerElements(ANTLRTerm.LexerElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerElement}.
	 * @param ctx the parse tree
	 */
	void enterLexerElement(ANTLRTerm.LexerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerElement}.
	 * @param ctx the parse tree
	 */
	void exitLexerElement(ANTLRTerm.LexerElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledLexerElement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledLexerElement(ANTLRTerm.LabeledLexerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledLexerElement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledLexerElement(ANTLRTerm.LabeledLexerElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledLexerElement_S1}.
	 * @param ctx the parse tree
	 */
	void enterLabeledLexerElement_S1(ANTLRTerm.LabeledLexerElement_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledLexerElement_S1}.
	 * @param ctx the parse tree
	 */
	void exitLabeledLexerElement_S1(ANTLRTerm.LabeledLexerElement_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledLexerElement_S2}.
	 * @param ctx the parse tree
	 */
	void enterLabeledLexerElement_S2(ANTLRTerm.LabeledLexerElement_S2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledLexerElement_S2}.
	 * @param ctx the parse tree
	 */
	void exitLabeledLexerElement_S2(ANTLRTerm.LabeledLexerElement_S2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerBlock}.
	 * @param ctx the parse tree
	 */
	void enterLexerBlock(ANTLRTerm.LexerBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerBlock}.
	 * @param ctx the parse tree
	 */
	void exitLexerBlock(ANTLRTerm.LexerBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerCommands}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommands(ANTLRTerm.LexerCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerCommands}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommands(ANTLRTerm.LexerCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerCommands_S1}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommands_S1(ANTLRTerm.LexerCommands_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerCommands_S1}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommands_S1(ANTLRTerm.LexerCommands_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerCommand}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommand(ANTLRTerm.LexerCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerCommand}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommand(ANTLRTerm.LexerCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerCommandName}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommandName(ANTLRTerm.LexerCommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerCommandName}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommandName(ANTLRTerm.LexerCommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerCommandExpr}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommandExpr(ANTLRTerm.LexerCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerCommandExpr}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommandExpr(ANTLRTerm.LexerCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#altList}.
	 * @param ctx the parse tree
	 */
	void enterAltList(ANTLRTerm.AltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#altList}.
	 * @param ctx the parse tree
	 */
	void exitAltList(ANTLRTerm.AltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#altList_S1}.
	 * @param ctx the parse tree
	 */
	void enterAltList_S1(ANTLRTerm.AltList_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#altList_S1}.
	 * @param ctx the parse tree
	 */
	void exitAltList_S1(ANTLRTerm.AltList_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ANTLRTerm.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ANTLRTerm.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ANTLRTerm.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ANTLRTerm.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#element_A1_S1}.
	 * @param ctx the parse tree
	 */
	void enterElement_A1_S1(ANTLRTerm.Element_A1_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#element_A1_S1}.
	 * @param ctx the parse tree
	 */
	void exitElement_A1_S1(ANTLRTerm.Element_A1_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#element_A2_S1}.
	 * @param ctx the parse tree
	 */
	void enterElement_A2_S1(ANTLRTerm.Element_A2_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#element_A2_S1}.
	 * @param ctx the parse tree
	 */
	void exitElement_A2_S1(ANTLRTerm.Element_A2_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledElement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledElement(ANTLRTerm.LabeledElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledElement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledElement(ANTLRTerm.LabeledElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledElement_S1}.
	 * @param ctx the parse tree
	 */
	void enterLabeledElement_S1(ANTLRTerm.LabeledElement_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledElement_S1}.
	 * @param ctx the parse tree
	 */
	void exitLabeledElement_S1(ANTLRTerm.LabeledElement_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#labeledElement_S2}.
	 * @param ctx the parse tree
	 */
	void enterLabeledElement_S2(ANTLRTerm.LabeledElement_S2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#labeledElement_S2}.
	 * @param ctx the parse tree
	 */
	void exitLabeledElement_S2(ANTLRTerm.LabeledElement_S2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ebnf}.
	 * @param ctx the parse tree
	 */
	void enterEbnf(ANTLRTerm.EbnfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ebnf}.
	 * @param ctx the parse tree
	 */
	void exitEbnf(ANTLRTerm.EbnfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#blockSuffix}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuffix(ANTLRTerm.BlockSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#blockSuffix}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuffix(ANTLRTerm.BlockSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void enterEbnfSuffix(ANTLRTerm.EbnfSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void exitEbnfSuffix(ANTLRTerm.EbnfSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#lexerAtom}.
	 * @param ctx the parse tree
	 */
	void enterLexerAtom(ANTLRTerm.LexerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#lexerAtom}.
	 * @param ctx the parse tree
	 */
	void exitLexerAtom(ANTLRTerm.LexerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ANTLRTerm.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ANTLRTerm.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#notSet}.
	 * @param ctx the parse tree
	 */
	void enterNotSet(ANTLRTerm.NotSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#notSet}.
	 * @param ctx the parse tree
	 */
	void exitNotSet(ANTLRTerm.NotSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#blockSet}.
	 * @param ctx the parse tree
	 */
	void enterBlockSet(ANTLRTerm.BlockSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#blockSet}.
	 * @param ctx the parse tree
	 */
	void exitBlockSet(ANTLRTerm.BlockSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#blockSet_S1}.
	 * @param ctx the parse tree
	 */
	void enterBlockSet_S1(ANTLRTerm.BlockSet_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#blockSet_S1}.
	 * @param ctx the parse tree
	 */
	void exitBlockSet_S1(ANTLRTerm.BlockSet_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(ANTLRTerm.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(ANTLRTerm.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ANTLRTerm.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ANTLRTerm.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#block_S1}.
	 * @param ctx the parse tree
	 */
	void enterBlock_S1(ANTLRTerm.Block_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#block_S1}.
	 * @param ctx the parse tree
	 */
	void exitBlock_S1(ANTLRTerm.Block_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#ruleref}.
	 * @param ctx the parse tree
	 */
	void enterRuleref(ANTLRTerm.RulerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#ruleref}.
	 * @param ctx the parse tree
	 */
	void exitRuleref(ANTLRTerm.RulerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ANTLRTerm.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ANTLRTerm.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(ANTLRTerm.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(ANTLRTerm.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#elementOptions}.
	 * @param ctx the parse tree
	 */
	void enterElementOptions(ANTLRTerm.ElementOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#elementOptions}.
	 * @param ctx the parse tree
	 */
	void exitElementOptions(ANTLRTerm.ElementOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#elementOptions_S1}.
	 * @param ctx the parse tree
	 */
	void enterElementOptions_S1(ANTLRTerm.ElementOptions_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#elementOptions_S1}.
	 * @param ctx the parse tree
	 */
	void exitElementOptions_S1(ANTLRTerm.ElementOptions_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#elementOption}.
	 * @param ctx the parse tree
	 */
	void enterElementOption(ANTLRTerm.ElementOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#elementOption}.
	 * @param ctx the parse tree
	 */
	void exitElementOption(ANTLRTerm.ElementOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#elementOption_S1}.
	 * @param ctx the parse tree
	 */
	void enterElementOption_S1(ANTLRTerm.ElementOption_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#elementOption_S1}.
	 * @param ctx the parse tree
	 */
	void exitElementOption_S1(ANTLRTerm.ElementOption_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRTerm#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ANTLRTerm.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRTerm#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ANTLRTerm.IdContext ctx);
}