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
import static org.crsx.pg.SinkAntlrListener.fireEnterSymbol;
import static org.crsx.pg.SinkAntlrListener.fireExitSymbol;
import static org.crsx.pg.SinkAntlrListener.fireEnterBinder;
import static org.crsx.pg.SinkAntlrListener.fireExitBinder;
import static org.crsx.pg.SinkAntlrListener.fireEnterBinds;
import static org.crsx.pg.SinkAntlrListener.fireExitBinds;
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(CrsxMetaParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(CrsxMetaParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#decls_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDecls_EOF(CrsxMetaParser.Decls_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decls_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDecls_EOF(CrsxMetaParser.Decls_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#decl_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDecl_ZOM(CrsxMetaParser.Decl_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decl_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDecl_ZOM(CrsxMetaParser.Decl_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#decl_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDecl_ZOM_EOF(CrsxMetaParser.Decl_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decl_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDecl_ZOM_EOF(CrsxMetaParser.Decl_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CrsxMetaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CrsxMetaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#decl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDecl_EOF(CrsxMetaParser.Decl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#decl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDecl_EOF(CrsxMetaParser.Decl_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void enterModuleDecl(CrsxMetaParser.ModuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void exitModuleDecl(CrsxMetaParser.ModuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#moduleDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterModuleDecl_EOF(CrsxMetaParser.ModuleDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#moduleDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitModuleDecl_EOF(CrsxMetaParser.ModuleDecl_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(CrsxMetaParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(CrsxMetaParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#importDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl_EOF(CrsxMetaParser.ImportDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#importDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl_EOF(CrsxMetaParser.ImportDecl_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void enterSortDecl(CrsxMetaParser.SortDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void exitSortDecl(CrsxMetaParser.SortDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortDecl_EOF(CrsxMetaParser.SortDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortDecl_EOF(CrsxMetaParser.SortDecl_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#termDecl}.
	 * @param ctx the parse tree
	 */
	void enterTermDecl(CrsxMetaParser.TermDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termDecl}.
	 * @param ctx the parse tree
	 */
	void exitTermDecl(CrsxMetaParser.TermDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#termDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTermDecl_EOF(CrsxMetaParser.TermDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#termDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTermDecl_EOF(CrsxMetaParser.TermDecl_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#contractum_OPT}.
	 * @param ctx the parse tree
	 */
	void enterContractum_OPT(CrsxMetaParser.Contractum_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#contractum_OPT}.
	 * @param ctx the parse tree
	 */
	void exitContractum_OPT(CrsxMetaParser.Contractum_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#contractum_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterContractum_OPT_EOF(CrsxMetaParser.Contractum_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#contractum_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitContractum_OPT_EOF(CrsxMetaParser.Contractum_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#args_OPT}.
	 * @param ctx the parse tree
	 */
	void enterArgs_OPT(CrsxMetaParser.Args_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#args_OPT}.
	 * @param ctx the parse tree
	 */
	void exitArgs_OPT(CrsxMetaParser.Args_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#args_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterArgs_OPT_EOF(CrsxMetaParser.Args_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#args_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitArgs_OPT_EOF(CrsxMetaParser.Args_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sargs_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSargs_OPT(CrsxMetaParser.Sargs_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sargs_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSargs_OPT(CrsxMetaParser.Sargs_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sargs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSargs_OPT_EOF(CrsxMetaParser.Sargs_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sargs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSargs_OPT_EOF(CrsxMetaParser.Sargs_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(CrsxMetaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(CrsxMetaParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scope_EOF}.
	 * @param ctx the parse tree
	 */
	void enterScope_EOF(CrsxMetaParser.Scope_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scope_EOF}.
	 * @param ctx the parse tree
	 */
	void exitScope_EOF(CrsxMetaParser.Scope_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#binders}.
	 * @param ctx the parse tree
	 */
	void enterBinders(CrsxMetaParser.BindersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#binders}.
	 * @param ctx the parse tree
	 */
	void exitBinders(CrsxMetaParser.BindersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#binders_EOF}.
	 * @param ctx the parse tree
	 */
	void enterBinders_EOF(CrsxMetaParser.Binders_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#binders_EOF}.
	 * @param ctx the parse tree
	 */
	void exitBinders_EOF(CrsxMetaParser.Binders_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_ZOM(CrsxMetaParser.Annotation_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_ZOM(CrsxMetaParser.Annotation_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#annotation_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_ZOM_EOF(CrsxMetaParser.Annotation_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#annotation_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_ZOM_EOF(CrsxMetaParser.Annotation_ZOM_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void enterLinear_TOK_OPT(CrsxMetaParser.Linear_TOK_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void exitLinear_TOK_OPT(CrsxMetaParser.Linear_TOK_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#linear_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterLinear_TOK_OPT_EOF(CrsxMetaParser.Linear_TOK_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#linear_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitLinear_TOK_OPT_EOF(CrsxMetaParser.Linear_TOK_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_TOK_OPT(CrsxMetaParser.Functional_TOK_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_TOK_OPT(CrsxMetaParser.Functional_TOK_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#functional_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_TOK_OPT_EOF(CrsxMetaParser.Functional_TOK_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#functional_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_TOK_OPT_EOF(CrsxMetaParser.Functional_TOK_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CrsxMetaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CrsxMetaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#args_EOF}.
	 * @param ctx the parse tree
	 */
	void enterArgs_EOF(CrsxMetaParser.Args_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#args_EOF}.
	 * @param ctx the parse tree
	 */
	void exitArgs_EOF(CrsxMetaParser.Args_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sargs}.
	 * @param ctx the parse tree
	 */
	void enterSargs(CrsxMetaParser.SargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sargs}.
	 * @param ctx the parse tree
	 */
	void exitSargs(CrsxMetaParser.SargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sargs_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSargs_EOF(CrsxMetaParser.Sargs_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sargs_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSargs_EOF(CrsxMetaParser.Sargs_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scopes_OPT}.
	 * @param ctx the parse tree
	 */
	void enterScopes_OPT(CrsxMetaParser.Scopes_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scopes_OPT}.
	 * @param ctx the parse tree
	 */
	void exitScopes_OPT(CrsxMetaParser.Scopes_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scopes_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterScopes_OPT_EOF(CrsxMetaParser.Scopes_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scopes_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitScopes_OPT_EOF(CrsxMetaParser.Scopes_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scopes}.
	 * @param ctx the parse tree
	 */
	void enterScopes(CrsxMetaParser.ScopesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scopes}.
	 * @param ctx the parse tree
	 */
	void exitScopes(CrsxMetaParser.ScopesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scopes_EOF}.
	 * @param ctx the parse tree
	 */
	void enterScopes_EOF(CrsxMetaParser.Scopes_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scopes_EOF}.
	 * @param ctx the parse tree
	 */
	void exitScopes_EOF(CrsxMetaParser.Scopes_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scope_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterScope_ZOM(CrsxMetaParser.Scope_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scope_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitScope_ZOM(CrsxMetaParser.Scope_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#scope_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterScope_ZOM_EOF(CrsxMetaParser.Scope_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#scope_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitScope_ZOM_EOF(CrsxMetaParser.Scope_ZOM_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#delay_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void enterDelay_TOK_OPT(CrsxMetaParser.Delay_TOK_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delay_TOK_OPT}.
	 * @param ctx the parse tree
	 */
	void exitDelay_TOK_OPT(CrsxMetaParser.Delay_TOK_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#delay_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDelay_TOK_OPT_EOF(CrsxMetaParser.Delay_TOK_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#delay_TOK_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDelay_TOK_OPT_EOF(CrsxMetaParser.Delay_TOK_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortargs_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortargs_OPT(CrsxMetaParser.Sortargs_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortargs_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortargs_OPT(CrsxMetaParser.Sortargs_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortargs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortargs_OPT_EOF(CrsxMetaParser.Sortargs_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortargs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortargs_OPT_EOF(CrsxMetaParser.Sortargs_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortargs}.
	 * @param ctx the parse tree
	 */
	void enterSortargs(CrsxMetaParser.SortargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortargs}.
	 * @param ctx the parse tree
	 */
	void exitSortargs(CrsxMetaParser.SortargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortargs_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortargs_EOF(CrsxMetaParser.Sortargs_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortargs_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortargs_EOF(CrsxMetaParser.Sortargs_EOFContext ctx);
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
}