// Generated from /Users/villardl/Projects/crsx/crsx4/src/parser/CrsxMetaParser.g4 by ANTLR 4.5
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_S1_ZOM(CrsxMetaParser.Declarations_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_S1_ZOM(CrsxMetaParser.Declarations_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_S1_ZOM_EOF(CrsxMetaParser.Declarations_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_S1_ZOM_EOF(CrsxMetaParser.Declarations_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_S1}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_S1(CrsxMetaParser.Declarations_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_S1}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_S1(CrsxMetaParser.Declarations_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_S1_EOF(CrsxMetaParser.Declarations_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_S1_EOF(CrsxMetaParser.Declarations_S1_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#semi_TOK}.
	 * @param ctx the parse tree
	 */
	void enterSemi_TOK(CrsxMetaParser.Semi_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#semi_TOK}.
	 * @param ctx the parse tree
	 */
	void exitSemi_TOK(CrsxMetaParser.Semi_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#semi_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSemi_TOK_EOF(CrsxMetaParser.Semi_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#semi_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSemi_TOK_EOF(CrsxMetaParser.Semi_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_OPT(CrsxMetaParser.Declaration_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_OPT(CrsxMetaParser.Declaration_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declaration_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_OPT_EOF(CrsxMetaParser.Declaration_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declaration_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_OPT_EOF(CrsxMetaParser.Declaration_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#module_TOK}.
	 * @param ctx the parse tree
	 */
	void enterModule_TOK(CrsxMetaParser.Module_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#module_TOK}.
	 * @param ctx the parse tree
	 */
	void exitModule_TOK(CrsxMetaParser.Module_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#module_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterModule_TOK_EOF(CrsxMetaParser.Module_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#module_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitModule_TOK_EOF(CrsxMetaParser.Module_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#lbrace_TOK}.
	 * @param ctx the parse tree
	 */
	void enterLbrace_TOK(CrsxMetaParser.Lbrace_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lbrace_TOK}.
	 * @param ctx the parse tree
	 */
	void exitLbrace_TOK(CrsxMetaParser.Lbrace_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#lbrace_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLbrace_TOK_EOF(CrsxMetaParser.Lbrace_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lbrace_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLbrace_TOK_EOF(CrsxMetaParser.Lbrace_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#rbrace_TOK}.
	 * @param ctx the parse tree
	 */
	void enterRbrace_TOK(CrsxMetaParser.Rbrace_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rbrace_TOK}.
	 * @param ctx the parse tree
	 */
	void exitRbrace_TOK(CrsxMetaParser.Rbrace_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#rbrace_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterRbrace_TOK_EOF(CrsxMetaParser.Rbrace_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rbrace_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitRbrace_TOK_EOF(CrsxMetaParser.Rbrace_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#arrow_TOK}.
	 * @param ctx the parse tree
	 */
	void enterArrow_TOK(CrsxMetaParser.Arrow_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arrow_TOK}.
	 * @param ctx the parse tree
	 */
	void exitArrow_TOK(CrsxMetaParser.Arrow_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#arrow_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterArrow_TOK_EOF(CrsxMetaParser.Arrow_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#arrow_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitArrow_TOK_EOF(CrsxMetaParser.Arrow_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#colon_TOK}.
	 * @param ctx the parse tree
	 */
	void enterColon_TOK(CrsxMetaParser.Colon_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#colon_TOK}.
	 * @param ctx the parse tree
	 */
	void exitColon_TOK(CrsxMetaParser.Colon_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#colon_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterColon_TOK_EOF(CrsxMetaParser.Colon_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#colon_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitColon_TOK_EOF(CrsxMetaParser.Colon_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#at_TOK}.
	 * @param ctx the parse tree
	 */
	void enterAt_TOK(CrsxMetaParser.At_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#at_TOK}.
	 * @param ctx the parse tree
	 */
	void exitAt_TOK(CrsxMetaParser.At_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#at_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAt_TOK_EOF(CrsxMetaParser.At_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#at_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAt_TOK_EOF(CrsxMetaParser.At_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#dot_TOK}.
	 * @param ctx the parse tree
	 */
	void enterDot_TOK(CrsxMetaParser.Dot_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dot_TOK}.
	 * @param ctx the parse tree
	 */
	void exitDot_TOK(CrsxMetaParser.Dot_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dot_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDot_TOK_EOF(CrsxMetaParser.Dot_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dot_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDot_TOK_EOF(CrsxMetaParser.Dot_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#lsquare_TOK}.
	 * @param ctx the parse tree
	 */
	void enterLsquare_TOK(CrsxMetaParser.Lsquare_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lsquare_TOK}.
	 * @param ctx the parse tree
	 */
	void exitLsquare_TOK(CrsxMetaParser.Lsquare_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#lsquare_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLsquare_TOK_EOF(CrsxMetaParser.Lsquare_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lsquare_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLsquare_TOK_EOF(CrsxMetaParser.Lsquare_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#rsquare_TOK}.
	 * @param ctx the parse tree
	 */
	void enterRsquare_TOK(CrsxMetaParser.Rsquare_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rsquare_TOK}.
	 * @param ctx the parse tree
	 */
	void exitRsquare_TOK(CrsxMetaParser.Rsquare_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#rsquare_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterRsquare_TOK_EOF(CrsxMetaParser.Rsquare_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rsquare_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitRsquare_TOK_EOF(CrsxMetaParser.Rsquare_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterTerms_S1_ZOM(CrsxMetaParser.Terms_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitTerms_S1_ZOM(CrsxMetaParser.Terms_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerms_S1_ZOM_EOF(CrsxMetaParser.Terms_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerms_S1_ZOM_EOF(CrsxMetaParser.Terms_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_S1}.
	 * @param ctx the parse tree
	 */
	void enterTerms_S1(CrsxMetaParser.Terms_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_S1}.
	 * @param ctx the parse tree
	 */
	void exitTerms_S1(CrsxMetaParser.Terms_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#terms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerms_S1_EOF(CrsxMetaParser.Terms_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#terms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerms_S1_EOF(CrsxMetaParser.Terms_S1_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#comma_TOK}.
	 * @param ctx the parse tree
	 */
	void enterComma_TOK(CrsxMetaParser.Comma_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#comma_TOK}.
	 * @param ctx the parse tree
	 */
	void exitComma_TOK(CrsxMetaParser.Comma_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#comma_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterComma_TOK_EOF(CrsxMetaParser.Comma_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#comma_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitComma_TOK_EOF(CrsxMetaParser.Comma_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_S1_ZOM(CrsxMetaParser.FreeTerms_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_S1_ZOM(CrsxMetaParser.FreeTerms_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_S1_ZOM_EOF(CrsxMetaParser.FreeTerms_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_S1_ZOM_EOF(CrsxMetaParser.FreeTerms_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_S1}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_S1(CrsxMetaParser.FreeTerms_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_S1}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_S1(CrsxMetaParser.FreeTerms_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFreeTerms_S1_EOF(CrsxMetaParser.FreeTerms_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#freeTerms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFreeTerms_S1_EOF(CrsxMetaParser.FreeTerms_S1_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#lpar_TOK}.
	 * @param ctx the parse tree
	 */
	void enterLpar_TOK(CrsxMetaParser.Lpar_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lpar_TOK}.
	 * @param ctx the parse tree
	 */
	void exitLpar_TOK(CrsxMetaParser.Lpar_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#lpar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLpar_TOK_EOF(CrsxMetaParser.Lpar_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#lpar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLpar_TOK_EOF(CrsxMetaParser.Lpar_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#rpar_TOK}.
	 * @param ctx the parse tree
	 */
	void enterRpar_TOK(CrsxMetaParser.Rpar_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rpar_TOK}.
	 * @param ctx the parse tree
	 */
	void exitRpar_TOK(CrsxMetaParser.Rpar_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#rpar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterRpar_TOK_EOF(CrsxMetaParser.Rpar_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#rpar_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitRpar_TOK_EOF(CrsxMetaParser.Rpar_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterTermList_S1_ZOM(CrsxMetaParser.TermList_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitTermList_S1_ZOM(CrsxMetaParser.TermList_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTermList_S1_ZOM_EOF(CrsxMetaParser.TermList_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTermList_S1_ZOM_EOF(CrsxMetaParser.TermList_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_S1}.
	 * @param ctx the parse tree
	 */
	void enterTermList_S1(CrsxMetaParser.TermList_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_S1}.
	 * @param ctx the parse tree
	 */
	void exitTermList_S1(CrsxMetaParser.TermList_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termList_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTermList_S1_EOF(CrsxMetaParser.TermList_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termList_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTermList_S1_EOF(CrsxMetaParser.TermList_S1_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_OPT}.
	 * @param ctx the parse tree
	 */
	void enterTerm_OPT(CrsxMetaParser.Term_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_OPT}.
	 * @param ctx the parse tree
	 */
	void exitTerm_OPT(CrsxMetaParser.Term_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerm_OPT_EOF(CrsxMetaParser.Term_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerm_OPT_EOF(CrsxMetaParser.Term_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_TOK}.
	 * @param ctx the parse tree
	 */
	void enterLinear_TOK(CrsxMetaParser.Linear_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_TOK}.
	 * @param ctx the parse tree
	 */
	void exitLinear_TOK(CrsxMetaParser.Linear_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLinear_TOK_EOF(CrsxMetaParser.Linear_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLinear_TOK_EOF(CrsxMetaParser.Linear_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_TOK}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_TOK(CrsxMetaParser.Functional_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_TOK}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_TOK(CrsxMetaParser.Functional_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_TOK_EOF(CrsxMetaParser.Functional_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_TOK_EOF(CrsxMetaParser.Functional_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#coloncolon_TOK}.
	 * @param ctx the parse tree
	 */
	void enterColoncolon_TOK(CrsxMetaParser.Coloncolon_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#coloncolon_TOK}.
	 * @param ctx the parse tree
	 */
	void exitColoncolon_TOK(CrsxMetaParser.Coloncolon_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#coloncolon_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterColoncolon_TOK_EOF(CrsxMetaParser.Coloncolon_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#coloncolon_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitColoncolon_TOK_EOF(CrsxMetaParser.Coloncolon_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatch_TOK}.
	 * @param ctx the parse tree
	 */
	void enterDispatch_TOK(CrsxMetaParser.Dispatch_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatch_TOK}.
	 * @param ctx the parse tree
	 */
	void exitDispatch_TOK(CrsxMetaParser.Dispatch_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatch_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatch_TOK_EOF(CrsxMetaParser.Dispatch_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatch_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatch_TOK_EOF(CrsxMetaParser.Dispatch_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm_S1_ZOM(CrsxMetaParser.DispatchTerm_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm_S1_ZOM(CrsxMetaParser.DispatchTerm_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm_S1_ZOM_EOF(CrsxMetaParser.DispatchTerm_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm_S1_ZOM_EOF(CrsxMetaParser.DispatchTerm_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm_S1(CrsxMetaParser.DispatchTerm_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm_S1(CrsxMetaParser.DispatchTerm_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchTerm_S1_EOF(CrsxMetaParser.DispatchTerm_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchTerm_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchTerm_S1_EOF(CrsxMetaParser.DispatchTerm_S1_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#and_TOK}.
	 * @param ctx the parse tree
	 */
	void enterAnd_TOK(CrsxMetaParser.And_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#and_TOK}.
	 * @param ctx the parse tree
	 */
	void exitAnd_TOK(CrsxMetaParser.And_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#and_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnd_TOK_EOF(CrsxMetaParser.And_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#and_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnd_TOK_EOF(CrsxMetaParser.And_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_S1_ZOM(CrsxMetaParser.DispatchCases_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_S1_ZOM(CrsxMetaParser.DispatchCases_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_S1_ZOM_EOF(CrsxMetaParser.DispatchCases_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_S1_ZOM_EOF(CrsxMetaParser.DispatchCases_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_S1(CrsxMetaParser.DispatchCases_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_S1(CrsxMetaParser.DispatchCases_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_S1_EOF(CrsxMetaParser.DispatchCases_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_S1_EOF(CrsxMetaParser.DispatchCases_S1_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#delay_TOK}.
	 * @param ctx the parse tree
	 */
	void enterDelay_TOK(CrsxMetaParser.Delay_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delay_TOK}.
	 * @param ctx the parse tree
	 */
	void exitDelay_TOK(CrsxMetaParser.Delay_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delay_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDelay_TOK_EOF(CrsxMetaParser.Delay_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delay_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDelay_TOK_EOF(CrsxMetaParser.Delay_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_OPT}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_OPT(CrsxMetaParser.Propertylist_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_OPT}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_OPT(CrsxMetaParser.Propertylist_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_OPT_EOF(CrsxMetaParser.Propertylist_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_OPT_EOF(CrsxMetaParser.Propertylist_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist(CrsxMetaParser.PropertylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist(CrsxMetaParser.PropertylistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_EOF(CrsxMetaParser.Propertylist_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_EOF(CrsxMetaParser.Propertylist_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_S1_ZOM(CrsxMetaParser.Propertylist_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_S1_ZOM(CrsxMetaParser.Propertylist_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_S1_ZOM_EOF(CrsxMetaParser.Propertylist_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_S1_ZOM_EOF(CrsxMetaParser.Propertylist_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_S1}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_S1(CrsxMetaParser.Propertylist_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_S1}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_S1(CrsxMetaParser.Propertylist_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#propertylist_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPropertylist_S1_EOF(CrsxMetaParser.Propertylist_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#propertylist_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPropertylist_S1_EOF(CrsxMetaParser.Propertylist_S1_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property_OPT}.
	 * @param ctx the parse tree
	 */
	void enterProperty_OPT(CrsxMetaParser.Property_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property_OPT}.
	 * @param ctx the parse tree
	 */
	void exitProperty_OPT(CrsxMetaParser.Property_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#property_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterProperty_OPT_EOF(CrsxMetaParser.Property_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#property_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitProperty_OPT_EOF(CrsxMetaParser.Property_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#not_TOK}.
	 * @param ctx the parse tree
	 */
	void enterNot_TOK(CrsxMetaParser.Not_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#not_TOK}.
	 * @param ctx the parse tree
	 */
	void exitNot_TOK(CrsxMetaParser.Not_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#not_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterNot_TOK_EOF(CrsxMetaParser.Not_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#not_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitNot_TOK_EOF(CrsxMetaParser.Not_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#datasort_TOK}.
	 * @param ctx the parse tree
	 */
	void enterDatasort_TOK(CrsxMetaParser.Datasort_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#datasort_TOK}.
	 * @param ctx the parse tree
	 */
	void exitDatasort_TOK(CrsxMetaParser.Datasort_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#datasort_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDatasort_TOK_EOF(CrsxMetaParser.Datasort_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#datasort_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDatasort_TOK_EOF(CrsxMetaParser.Datasort_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#forall_TOK}.
	 * @param ctx the parse tree
	 */
	void enterForall_TOK(CrsxMetaParser.Forall_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forall_TOK}.
	 * @param ctx the parse tree
	 */
	void exitForall_TOK(CrsxMetaParser.Forall_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forall_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForall_TOK_EOF(CrsxMetaParser.Forall_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forall_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForall_TOK_EOF(CrsxMetaParser.Forall_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_S1_ZOM(CrsxMetaParser.Sortnames_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_S1_ZOM(CrsxMetaParser.Sortnames_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_S1_ZOM_EOF(CrsxMetaParser.Sortnames_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_S1_ZOM_EOF(CrsxMetaParser.Sortnames_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_S1}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_S1(CrsxMetaParser.Sortnames_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_S1}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_S1(CrsxMetaParser.Sortnames_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortnames_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortnames_S1_EOF(CrsxMetaParser.Sortnames_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortnames_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortnames_S1_EOF(CrsxMetaParser.Sortnames_S1_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterForms_S1_ZOM(CrsxMetaParser.Forms_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitForms_S1_ZOM(CrsxMetaParser.Forms_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForms_S1_ZOM_EOF(CrsxMetaParser.Forms_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForms_S1_ZOM_EOF(CrsxMetaParser.Forms_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms_S1}.
	 * @param ctx the parse tree
	 */
	void enterForms_S1(CrsxMetaParser.Forms_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms_S1}.
	 * @param ctx the parse tree
	 */
	void exitForms_S1(CrsxMetaParser.Forms_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#forms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterForms_S1_EOF(CrsxMetaParser.Forms_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#forms_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitForms_S1_EOF(CrsxMetaParser.Forms_S1_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_S1_ZOM(CrsxMetaParser.Directives_S1_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_S1_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_S1_ZOM(CrsxMetaParser.Directives_S1_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_S1_ZOM_EOF(CrsxMetaParser.Directives_S1_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_S1_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_S1_ZOM_EOF(CrsxMetaParser.Directives_S1_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_S1}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_S1(CrsxMetaParser.Directives_S1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_S1}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_S1(CrsxMetaParser.Directives_S1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#directives_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDirectives_S1_EOF(CrsxMetaParser.Directives_S1_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#directives_S1_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDirectives_S1_EOF(CrsxMetaParser.Directives_S1_EOFContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_OPT(CrsxMetaParser.Declarations_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_OPT(CrsxMetaParser.Declarations_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#declarations_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_OPT_EOF(CrsxMetaParser.Declarations_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#declarations_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_OPT_EOF(CrsxMetaParser.Declarations_OPT_EOFContext ctx);
}