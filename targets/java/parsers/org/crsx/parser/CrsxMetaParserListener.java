// Generated from CrsxMetaParser.g4 by ANTLR 4.5
package org.crsx.parser;

import org.crsx.pg.SinkAntlrListener;
import static org.crsx.pg.SinkAntlrListener.fireEnterZOM;
import static org.crsx.pg.SinkAntlrListener.fireExitZOM;
import static org.crsx.pg.SinkAntlrListener.fireEnterOPT;
import static org.crsx.pg.SinkAntlrListener.fireExitOPT;
import static org.crsx.pg.SinkAntlrListener.fireEnterAlt;
import static org.crsx.pg.SinkAntlrListener.fireExitAlt;
import static org.crsx.pg.SinkAntlrListener.fireHide;
import static org.crsx.pg.SinkAntlrListener.fireTail;
import static org.crsx.pg.SinkAntlrListener.fireTerm;
import static org.crsx.pg.SinkAntlrListener.fireEmbed;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CrsxMetaParser}.
 */
public interface CrsxMetaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#crsx}.
	 * @param ctx the parse tree
	 */
	void enterCrsx(CrsxMetaParser.CrsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#crsx}.
	 * @param ctx the parse tree
	 */
	void exitCrsx(CrsxMetaParser.CrsxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#crsx_EOF}.
	 * @param ctx the parse tree
	 */
	void enterCrsx_EOF(CrsxMetaParser.Crsx_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#crsx_EOF}.
	 * @param ctx the parse tree
	 */
	void exitCrsx_EOF(CrsxMetaParser.Crsx_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CrsxMetaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CrsxMetaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_EOF(CrsxMetaParser.Declarations_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_EOF(CrsxMetaParser.Declarations_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_ZOM(CrsxMetaParser.Declaration_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_ZOM(CrsxMetaParser.Declaration_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_ZOM_EOF(CrsxMetaParser.Declaration_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_ZOM_EOF(CrsxMetaParser.Declaration_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CrsxMetaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CrsxMetaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_EOF(CrsxMetaParser.Declaration_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_EOF(CrsxMetaParser.Declaration_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(CrsxMetaParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(CrsxMetaParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#moduleDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration_EOF(CrsxMetaParser.ModuleDeclaration_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#moduleDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration_EOF(CrsxMetaParser.ModuleDeclaration_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#constructor_TOK}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_TOK(CrsxMetaParser.Constructor_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#constructor_TOK}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_TOK(CrsxMetaParser.Constructor_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#constructor_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_TOK_EOF(CrsxMetaParser.Constructor_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#constructor_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_TOK_EOF(CrsxMetaParser.Constructor_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CrsxMetaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CrsxMetaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#importDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration_EOF(CrsxMetaParser.ImportDeclaration_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#importDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration_EOF(CrsxMetaParser.ImportDeclaration_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration(CrsxMetaParser.RuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration(CrsxMetaParser.RuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#ruleDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration_EOF(CrsxMetaParser.RuleDeclaration_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#ruleDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration_EOF(CrsxMetaParser.RuleDeclaration_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#option_OPT}.
	 * @param ctx the parse tree
	 */
	void enterOption_OPT(CrsxMetaParser.Option_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#option_OPT}.
	 * @param ctx the parse tree
	 */
	void exitOption_OPT(CrsxMetaParser.Option_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#option_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterOption_OPT_EOF(CrsxMetaParser.Option_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#option_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitOption_OPT_EOF(CrsxMetaParser.Option_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(CrsxMetaParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(CrsxMetaParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#option_EOF}.
	 * @param ctx the parse tree
	 */
	void enterOption_EOF(CrsxMetaParser.Option_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#option_EOF}.
	 * @param ctx the parse tree
	 */
	void exitOption_EOF(CrsxMetaParser.Option_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#arguments_OPT}.
	 * @param ctx the parse tree
	 */
	void enterArguments_OPT(CrsxMetaParser.Arguments_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arguments_OPT}.
	 * @param ctx the parse tree
	 */
	void exitArguments_OPT(CrsxMetaParser.Arguments_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#arguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterArguments_OPT_EOF(CrsxMetaParser.Arguments_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitArguments_OPT_EOF(CrsxMetaParser.Arguments_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(CrsxMetaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(CrsxMetaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#pattern_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPattern_EOF(CrsxMetaParser.Pattern_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#pattern_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPattern_EOF(CrsxMetaParser.Pattern_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#properties_OPT}.
	 * @param ctx the parse tree
	 */
	void enterProperties_OPT(CrsxMetaParser.Properties_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#properties_OPT}.
	 * @param ctx the parse tree
	 */
	void exitProperties_OPT(CrsxMetaParser.Properties_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#properties_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterProperties_OPT_EOF(CrsxMetaParser.Properties_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#properties_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitProperties_OPT_EOF(CrsxMetaParser.Properties_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#contractum}.
	 * @param ctx the parse tree
	 */
	void enterContractum(CrsxMetaParser.ContractumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#contractum}.
	 * @param ctx the parse tree
	 */
	void exitContractum(CrsxMetaParser.ContractumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#contractum_EOF}.
	 * @param ctx the parse tree
	 */
	void enterContractum_EOF(CrsxMetaParser.Contractum_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#contractum_EOF}.
	 * @param ctx the parse tree
	 */
	void exitContractum_EOF(CrsxMetaParser.Contractum_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(CrsxMetaParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(CrsxMetaParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotations_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations_EOF(CrsxMetaParser.Annotations_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotations_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations_EOF(CrsxMetaParser.Annotations_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation_OOM}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_OOM(CrsxMetaParser.Annotation_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation_OOM}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_OOM(CrsxMetaParser.Annotation_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_OOM_EOF(CrsxMetaParser.Annotation_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_OOM_EOF(CrsxMetaParser.Annotation_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CrsxMetaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CrsxMetaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_EOF(CrsxMetaParser.Annotation_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_EOF(CrsxMetaParser.Annotation_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CrsxMetaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CrsxMetaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerm_EOF(CrsxMetaParser.Term_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerm_EOF(CrsxMetaParser.Term_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerm}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerm(CrsxMetaParser.FreeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerm}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerm(CrsxMetaParser.FreeTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerm_EOF(CrsxMetaParser.FreeTerm_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerm_EOF(CrsxMetaParser.FreeTerm_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotations_OPT}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations_OPT(CrsxMetaParser.Annotations_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotations_OPT}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations_OPT(CrsxMetaParser.Annotations_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotations_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations_OPT_EOF(CrsxMetaParser.Annotations_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotations_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations_OPT_EOF(CrsxMetaParser.Annotations_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#metavar_TOK}.
	 * @param ctx the parse tree
	 */
	void enterMetavar_TOK(CrsxMetaParser.Metavar_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#metavar_TOK}.
	 * @param ctx the parse tree
	 */
	void exitMetavar_TOK(CrsxMetaParser.Metavar_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#metavar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterMetavar_TOK_EOF(CrsxMetaParser.Metavar_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#metavar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitMetavar_TOK_EOF(CrsxMetaParser.Metavar_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeArguments_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFreeArguments_OPT(CrsxMetaParser.FreeArguments_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeArguments_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFreeArguments_OPT(CrsxMetaParser.FreeArguments_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeArguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeArguments_OPT_EOF(CrsxMetaParser.FreeArguments_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeArguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeArguments_OPT_EOF(CrsxMetaParser.FreeArguments_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#boundTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoundTerm(CrsxMetaParser.BoundTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#boundTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoundTerm(CrsxMetaParser.BoundTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#boundTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void enterBoundTerm_EOF(CrsxMetaParser.BoundTerm_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#boundTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void exitBoundTerm_EOF(CrsxMetaParser.BoundTerm_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#nextBinder}.
	 * @param ctx the parse tree
	 */
	void enterNextBinder(CrsxMetaParser.NextBinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nextBinder}.
	 * @param ctx the parse tree
	 */
	void exitNextBinder(CrsxMetaParser.NextBinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#nextBinder_EOF}.
	 * @param ctx the parse tree
	 */
	void enterNextBinder_EOF(CrsxMetaParser.NextBinder_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nextBinder_EOF}.
	 * @param ctx the parse tree
	 */
	void exitNextBinder_EOF(CrsxMetaParser.NextBinder_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CrsxMetaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CrsxMetaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#arguments_EOF}.
	 * @param ctx the parse tree
	 */
	void enterArguments_EOF(CrsxMetaParser.Arguments_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arguments_EOF}.
	 * @param ctx the parse tree
	 */
	void exitArguments_EOF(CrsxMetaParser.Arguments_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_OPT}.
	 * @param ctx the parse tree
	 */
	void enterTerms_OPT(CrsxMetaParser.Terms_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_OPT}.
	 * @param ctx the parse tree
	 */
	void exitTerms_OPT(CrsxMetaParser.Terms_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerms_OPT_EOF(CrsxMetaParser.Terms_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerms_OPT_EOF(CrsxMetaParser.Terms_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(CrsxMetaParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(CrsxMetaParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerms_EOF(CrsxMetaParser.Terms_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerms_EOF(CrsxMetaParser.Terms_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterTerm_ZOM(CrsxMetaParser.Term_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitTerm_ZOM(CrsxMetaParser.Term_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerm_ZOM_EOF(CrsxMetaParser.Term_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerm_ZOM_EOF(CrsxMetaParser.Term_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeArguments}.
	 * @param ctx the parse tree
	 */
	void enterFreeArguments(CrsxMetaParser.FreeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeArguments}.
	 * @param ctx the parse tree
	 */
	void exitFreeArguments(CrsxMetaParser.FreeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeArguments_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeArguments_EOF(CrsxMetaParser.FreeArguments_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeArguments_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeArguments_EOF(CrsxMetaParser.FreeArguments_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_OPT(CrsxMetaParser.FreeTerms_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_OPT(CrsxMetaParser.FreeTerms_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_OPT_EOF(CrsxMetaParser.FreeTerms_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_OPT_EOF(CrsxMetaParser.FreeTerms_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms(CrsxMetaParser.FreeTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms(CrsxMetaParser.FreeTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_EOF(CrsxMetaParser.FreeTerms_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_EOF(CrsxMetaParser.FreeTerms_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerm_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerm_ZOM(CrsxMetaParser.FreeTerm_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerm_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerm_ZOM(CrsxMetaParser.FreeTerm_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerm_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerm_ZOM_EOF(CrsxMetaParser.FreeTerm_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerm_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerm_ZOM_EOF(CrsxMetaParser.FreeTerm_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CrsxMetaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CrsxMetaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#list_EOF}.
	 * @param ctx the parse tree
	 */
	void enterList_EOF(CrsxMetaParser.List_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#list_EOF}.
	 * @param ctx the parse tree
	 */
	void exitList_EOF(CrsxMetaParser.List_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_OPT}.
	 * @param ctx the parse tree
	 */
	void enterTermList_OPT(CrsxMetaParser.TermList_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_OPT}.
	 * @param ctx the parse tree
	 */
	void exitTermList_OPT(CrsxMetaParser.TermList_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTermList_OPT_EOF(CrsxMetaParser.TermList_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTermList_OPT_EOF(CrsxMetaParser.TermList_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList}.
	 * @param ctx the parse tree
	 */
	void enterTermList(CrsxMetaParser.TermListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList}.
	 * @param ctx the parse tree
	 */
	void exitTermList(CrsxMetaParser.TermListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTermList_EOF(CrsxMetaParser.TermList_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTermList_EOF(CrsxMetaParser.TermList_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#listItem_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterListItem_ZOM(CrsxMetaParser.ListItem_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#listItem_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitListItem_ZOM(CrsxMetaParser.ListItem_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#listItem_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterListItem_ZOM_EOF(CrsxMetaParser.ListItem_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#listItem_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitListItem_ZOM_EOF(CrsxMetaParser.ListItem_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#semi_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSemi_TOK_OPT(CrsxMetaParser.Semi_TOK_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#semi_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSemi_TOK_OPT(CrsxMetaParser.Semi_TOK_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#semi_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSemi_TOK_OPT_EOF(CrsxMetaParser.Semi_TOK_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#semi_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSemi_TOK_OPT_EOF(CrsxMetaParser.Semi_TOK_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(CrsxMetaParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(CrsxMetaParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#listItem_EOF}.
	 * @param ctx the parse tree
	 */
	void enterListItem_EOF(CrsxMetaParser.ListItem_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#listItem_EOF}.
	 * @param ctx the parse tree
	 */
	void exitListItem_EOF(CrsxMetaParser.ListItem_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CrsxMetaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CrsxMetaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariable_EOF(CrsxMetaParser.Variable_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariable_EOF(CrsxMetaParser.Variable_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_OPT}.
	 * @param ctx the parse tree
	 */
	void enterLinear_OPT(CrsxMetaParser.Linear_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_OPT}.
	 * @param ctx the parse tree
	 */
	void exitLinear_OPT(CrsxMetaParser.Linear_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLinear_OPT_EOF(CrsxMetaParser.Linear_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLinear_OPT_EOF(CrsxMetaParser.Linear_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable_TOK}.
	 * @param ctx the parse tree
	 */
	void enterVariable_TOK(CrsxMetaParser.Variable_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable_TOK}.
	 * @param ctx the parse tree
	 */
	void exitVariable_TOK(CrsxMetaParser.Variable_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariable_TOK_EOF(CrsxMetaParser.Variable_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariable_TOK_EOF(CrsxMetaParser.Variable_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_OPT(CrsxMetaParser.Functional_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_OPT(CrsxMetaParser.Functional_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_OPT_EOF(CrsxMetaParser.Functional_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_OPT_EOF(CrsxMetaParser.Functional_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#varsort_OPT}.
	 * @param ctx the parse tree
	 */
	void enterVarsort_OPT(CrsxMetaParser.Varsort_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#varsort_OPT}.
	 * @param ctx the parse tree
	 */
	void exitVarsort_OPT(CrsxMetaParser.Varsort_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#varsort_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVarsort_OPT_EOF(CrsxMetaParser.Varsort_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#varsort_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVarsort_OPT_EOF(CrsxMetaParser.Varsort_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear}.
	 * @param ctx the parse tree
	 */
	void enterLinear(CrsxMetaParser.LinearContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear}.
	 * @param ctx the parse tree
	 */
	void exitLinear(CrsxMetaParser.LinearContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLinear_EOF(CrsxMetaParser.Linear_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLinear_EOF(CrsxMetaParser.Linear_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional}.
	 * @param ctx the parse tree
	 */
	void enterFunctional(CrsxMetaParser.FunctionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional}.
	 * @param ctx the parse tree
	 */
	void exitFunctional(CrsxMetaParser.FunctionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_EOF(CrsxMetaParser.Functional_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_EOF(CrsxMetaParser.Functional_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CrsxMetaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CrsxMetaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#literal_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_EOF(CrsxMetaParser.Literal_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#literal_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_EOF(CrsxMetaParser.Literal_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#string_TOK}.
	 * @param ctx the parse tree
	 */
	void enterString_TOK(CrsxMetaParser.String_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#string_TOK}.
	 * @param ctx the parse tree
	 */
	void exitString_TOK(CrsxMetaParser.String_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#string_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterString_TOK_EOF(CrsxMetaParser.String_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#string_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitString_TOK_EOF(CrsxMetaParser.String_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#number_TOK}.
	 * @param ctx the parse tree
	 */
	void enterNumber_TOK(CrsxMetaParser.Number_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#number_TOK}.
	 * @param ctx the parse tree
	 */
	void exitNumber_TOK(CrsxMetaParser.Number_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#number_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterNumber_TOK_EOF(CrsxMetaParser.Number_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#number_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitNumber_TOK_EOF(CrsxMetaParser.Number_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterBinder(CrsxMetaParser.BinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitBinder(CrsxMetaParser.BinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#binder_EOF}.
	 * @param ctx the parse tree
	 */
	void enterBinder_EOF(CrsxMetaParser.Binder_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#binder_EOF}.
	 * @param ctx the parse tree
	 */
	void exitBinder_EOF(CrsxMetaParser.Binder_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#varsort}.
	 * @param ctx the parse tree
	 */
	void enterVarsort(CrsxMetaParser.VarsortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#varsort}.
	 * @param ctx the parse tree
	 */
	void exitVarsort(CrsxMetaParser.VarsortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#varsort_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVarsort_EOF(CrsxMetaParser.Varsort_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#varsort_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVarsort_EOF(CrsxMetaParser.Varsort_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete}.
	 * @param ctx the parse tree
	 */
	void enterConcrete(CrsxMetaParser.ConcreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete}.
	 * @param ctx the parse tree
	 */
	void exitConcrete(CrsxMetaParser.ConcreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_EOF(CrsxMetaParser.Concrete_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_EOF(CrsxMetaParser.Concrete_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#category_TOK}.
	 * @param ctx the parse tree
	 */
	void enterCategory_TOK(CrsxMetaParser.Category_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#category_TOK}.
	 * @param ctx the parse tree
	 */
	void exitCategory_TOK(CrsxMetaParser.Category_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#category_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterCategory_TOK_EOF(CrsxMetaParser.Category_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#category_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitCategory_TOK_EOF(CrsxMetaParser.Category_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete_TOK}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_TOK(CrsxMetaParser.Concrete_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete_TOK}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_TOK(CrsxMetaParser.Concrete_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConcrete_TOK_EOF(CrsxMetaParser.Concrete_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConcrete_TOK_EOF(CrsxMetaParser.Concrete_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete2_TOK}.
	 * @param ctx the parse tree
	 */
	void enterConcrete2_TOK(CrsxMetaParser.Concrete2_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete2_TOK}.
	 * @param ctx the parse tree
	 */
	void exitConcrete2_TOK(CrsxMetaParser.Concrete2_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete2_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConcrete2_TOK_EOF(CrsxMetaParser.Concrete2_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete2_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConcrete2_TOK_EOF(CrsxMetaParser.Concrete2_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete3_TOK}.
	 * @param ctx the parse tree
	 */
	void enterConcrete3_TOK(CrsxMetaParser.Concrete3_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete3_TOK}.
	 * @param ctx the parse tree
	 */
	void exitConcrete3_TOK(CrsxMetaParser.Concrete3_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete3_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConcrete3_TOK_EOF(CrsxMetaParser.Concrete3_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete3_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConcrete3_TOK_EOF(CrsxMetaParser.Concrete3_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete4_TOK}.
	 * @param ctx the parse tree
	 */
	void enterConcrete4_TOK(CrsxMetaParser.Concrete4_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete4_TOK}.
	 * @param ctx the parse tree
	 */
	void exitConcrete4_TOK(CrsxMetaParser.Concrete4_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#concrete4_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConcrete4_TOK_EOF(CrsxMetaParser.Concrete4_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#concrete4_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConcrete4_TOK_EOF(CrsxMetaParser.Concrete4_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(CrsxMetaParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(CrsxMetaParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatch_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatch_EOF(CrsxMetaParser.Dispatch_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatch_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatch_EOF(CrsxMetaParser.Dispatch_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delayCase_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDelayCase_OPT(CrsxMetaParser.DelayCase_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delayCase_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDelayCase_OPT(CrsxMetaParser.DelayCase_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delayCase_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDelayCase_OPT_EOF(CrsxMetaParser.DelayCase_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delayCase_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDelayCase_OPT_EOF(CrsxMetaParser.DelayCase_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm(CrsxMetaParser.DispatchTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm(CrsxMetaParser.DispatchTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm_EOF(CrsxMetaParser.DispatchTerm_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm_EOF(CrsxMetaParser.DispatchTerm_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases(CrsxMetaParser.DispatchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases(CrsxMetaParser.DispatchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_EOF(CrsxMetaParser.DispatchCases_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_EOF(CrsxMetaParser.DispatchCases_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCase_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCase_ZOM(CrsxMetaParser.DispatchCase_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCase_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCase_ZOM(CrsxMetaParser.DispatchCase_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCase_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCase_ZOM_EOF(CrsxMetaParser.DispatchCase_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCase_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCase_ZOM_EOF(CrsxMetaParser.DispatchCase_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCase}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCase(CrsxMetaParser.DispatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCase}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCase(CrsxMetaParser.DispatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCase_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCase_EOF(CrsxMetaParser.DispatchCase_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCase_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCase_EOF(CrsxMetaParser.DispatchCase_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delayCase}.
	 * @param ctx the parse tree
	 */
	void enterDelayCase(CrsxMetaParser.DelayCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delayCase}.
	 * @param ctx the parse tree
	 */
	void exitDelayCase(CrsxMetaParser.DelayCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delayCase_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDelayCase_EOF(CrsxMetaParser.DelayCase_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delayCase_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDelayCase_EOF(CrsxMetaParser.DelayCase_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(CrsxMetaParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(CrsxMetaParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#properties_EOF}.
	 * @param ctx the parse tree
	 */
	void enterProperties_EOF(CrsxMetaParser.Properties_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#properties_EOF}.
	 * @param ctx the parse tree
	 */
	void exitProperties_EOF(CrsxMetaParser.Properties_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertyList_OPT}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList_OPT(CrsxMetaParser.PropertyList_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertyList_OPT}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList_OPT(CrsxMetaParser.PropertyList_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertyList_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList_OPT_EOF(CrsxMetaParser.PropertyList_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertyList_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList_OPT_EOF(CrsxMetaParser.PropertyList_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(CrsxMetaParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(CrsxMetaParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertyList_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList_EOF(CrsxMetaParser.PropertyList_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertyList_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList_EOF(CrsxMetaParser.PropertyList_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterProperty_ZOM(CrsxMetaParser.Property_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitProperty_ZOM(CrsxMetaParser.Property_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterProperty_ZOM_EOF(CrsxMetaParser.Property_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitProperty_ZOM_EOF(CrsxMetaParser.Property_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CrsxMetaParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CrsxMetaParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property_EOF}.
	 * @param ctx the parse tree
	 */
	void enterProperty_EOF(CrsxMetaParser.Property_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property_EOF}.
	 * @param ctx the parse tree
	 */
	void exitProperty_EOF(CrsxMetaParser.Property_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CrsxMetaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CrsxMetaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#expression_EOF}.
	 * @param ctx the parse tree
	 */
	void enterExpression_EOF(CrsxMetaParser.Expression_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#expression_EOF}.
	 * @param ctx the parse tree
	 */
	void exitExpression_EOF(CrsxMetaParser.Expression_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSortDeclaration(CrsxMetaParser.SortDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSortDeclaration(CrsxMetaParser.SortDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortDeclaration_EOF(CrsxMetaParser.SortDeclaration_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDeclaration_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortDeclaration_EOF(CrsxMetaParser.SortDeclaration_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortparams_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortparams_OPT(CrsxMetaParser.Sortparams_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortparams_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortparams_OPT(CrsxMetaParser.Sortparams_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortparams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortparams_OPT_EOF(CrsxMetaParser.Sortparams_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortparams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortparams_OPT_EOF(CrsxMetaParser.Sortparams_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortparams}.
	 * @param ctx the parse tree
	 */
	void enterSortparams(CrsxMetaParser.SortparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortparams}.
	 * @param ctx the parse tree
	 */
	void exitSortparams(CrsxMetaParser.SortparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortparams_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortparams_EOF(CrsxMetaParser.Sortparams_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortparams_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortparams_EOF(CrsxMetaParser.Sortparams_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable_OOM}.
	 * @param ctx the parse tree
	 */
	void enterVariable_OOM(CrsxMetaParser.Variable_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable_OOM}.
	 * @param ctx the parse tree
	 */
	void exitVariable_OOM(CrsxMetaParser.Variable_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variable_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariable_OOM_EOF(CrsxMetaParser.Variable_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variable_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariable_OOM_EOF(CrsxMetaParser.Variable_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortset}.
	 * @param ctx the parse tree
	 */
	void enterSortset(CrsxMetaParser.SortsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortset}.
	 * @param ctx the parse tree
	 */
	void exitSortset(CrsxMetaParser.SortsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortset_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortset_EOF(CrsxMetaParser.Sortset_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortset_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortset_EOF(CrsxMetaParser.Sortset_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames}.
	 * @param ctx the parse tree
	 */
	void enterSortnames(CrsxMetaParser.SortnamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames}.
	 * @param ctx the parse tree
	 */
	void exitSortnames(CrsxMetaParser.SortnamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_EOF(CrsxMetaParser.Sortnames_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_EOF(CrsxMetaParser.Sortnames_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortname_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterSortname_ZOM(CrsxMetaParser.Sortname_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortname_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitSortname_ZOM(CrsxMetaParser.Sortname_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortname_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortname_ZOM_EOF(CrsxMetaParser.Sortname_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortname_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortname_ZOM_EOF(CrsxMetaParser.Sortname_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortname}.
	 * @param ctx the parse tree
	 */
	void enterSortname(CrsxMetaParser.SortnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortname}.
	 * @param ctx the parse tree
	 */
	void exitSortname(CrsxMetaParser.SortnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortname_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortname_EOF(CrsxMetaParser.Sortname_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortname_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortname_EOF(CrsxMetaParser.Sortname_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortarguments_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortarguments_OPT(CrsxMetaParser.Sortarguments_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortarguments_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortarguments_OPT(CrsxMetaParser.Sortarguments_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortarguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortarguments_OPT_EOF(CrsxMetaParser.Sortarguments_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortarguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortarguments_OPT_EOF(CrsxMetaParser.Sortarguments_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortarguments}.
	 * @param ctx the parse tree
	 */
	void enterSortarguments(CrsxMetaParser.SortargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortarguments}.
	 * @param ctx the parse tree
	 */
	void exitSortarguments(CrsxMetaParser.SortargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortarguments_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortarguments_EOF(CrsxMetaParser.Sortarguments_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortarguments_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortarguments_EOF(CrsxMetaParser.Sortarguments_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_OPT(CrsxMetaParser.Sortnames_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_OPT(CrsxMetaParser.Sortnames_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_OPT_EOF(CrsxMetaParser.Sortnames_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_OPT_EOF(CrsxMetaParser.Sortnames_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(CrsxMetaParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(CrsxMetaParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForms_EOF(CrsxMetaParser.Forms_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForms_EOF(CrsxMetaParser.Forms_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#form_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterForm_ZOM(CrsxMetaParser.Form_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#form_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitForm_ZOM(CrsxMetaParser.Form_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#form_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForm_ZOM_EOF(CrsxMetaParser.Form_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#form_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForm_ZOM_EOF(CrsxMetaParser.Form_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(CrsxMetaParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(CrsxMetaParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#form_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForm_EOF(CrsxMetaParser.Form_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#form_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForm_EOF(CrsxMetaParser.Form_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(CrsxMetaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(CrsxMetaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#constructor_EOF}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_EOF(CrsxMetaParser.Constructor_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#constructor_EOF}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_EOF(CrsxMetaParser.Constructor_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(CrsxMetaParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(CrsxMetaParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#qualifier_EOF}.
	 * @param ctx the parse tree
	 */
	void enterQualifier_EOF(CrsxMetaParser.Qualifier_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#qualifier_EOF}.
	 * @param ctx the parse tree
	 */
	void exitQualifier_EOF(CrsxMetaParser.Qualifier_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(CrsxMetaParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(CrsxMetaParser.ReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#reserved_EOF}.
	 * @param ctx the parse tree
	 */
	void enterReserved_EOF(CrsxMetaParser.Reserved_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#reserved_EOF}.
	 * @param ctx the parse tree
	 */
	void exitReserved_EOF(CrsxMetaParser.Reserved_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(CrsxMetaParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(CrsxMetaParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directive_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirective_EOF(CrsxMetaParser.Directive_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directive_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirective_EOF(CrsxMetaParser.Directive_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveArguments_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments_OPT(CrsxMetaParser.DirectiveArguments_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveArguments_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments_OPT(CrsxMetaParser.DirectiveArguments_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveArguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments_OPT_EOF(CrsxMetaParser.DirectiveArguments_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveArguments_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments_OPT_EOF(CrsxMetaParser.DirectiveArguments_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments(CrsxMetaParser.DirectiveArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments(CrsxMetaParser.DirectiveArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveArguments_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments_EOF(CrsxMetaParser.DirectiveArguments_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveArguments_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments_EOF(CrsxMetaParser.DirectiveArguments_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_OPT(CrsxMetaParser.Directives_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_OPT(CrsxMetaParser.Directives_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_OPT_EOF(CrsxMetaParser.Directives_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_OPT_EOF(CrsxMetaParser.Directives_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(CrsxMetaParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(CrsxMetaParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_EOF(CrsxMetaParser.Directives_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_EOF(CrsxMetaParser.Directives_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directive_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDirective_ZOM(CrsxMetaParser.Directive_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directive_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDirective_ZOM(CrsxMetaParser.Directive_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directive_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirective_ZOM_EOF(CrsxMetaParser.Directive_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directive_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirective_ZOM_EOF(CrsxMetaParser.Directive_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveList}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveList(CrsxMetaParser.DirectiveListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveList}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveList(CrsxMetaParser.DirectiveListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directiveList_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveList_EOF(CrsxMetaParser.DirectiveList_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directiveList_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveList_EOF(CrsxMetaParser.DirectiveList_EOFContext ctx);
}