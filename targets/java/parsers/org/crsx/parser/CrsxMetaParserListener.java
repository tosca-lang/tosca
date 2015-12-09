// Generated from CrsxMetaParser.g4 by ANTLR 4.5
package org.crsx.parser;

import static org.crsx.antlr.SinkAntlrListener.fireEmbed;
import static org.crsx.antlr.SinkAntlrListener.fireEnterAlt;
import static org.crsx.antlr.SinkAntlrListener.fireEnterBinder;
import static org.crsx.antlr.SinkAntlrListener.fireEnterBinds;
import static org.crsx.antlr.SinkAntlrListener.fireEnterOPT;
import static org.crsx.antlr.SinkAntlrListener.fireEnterSymbol;
import static org.crsx.antlr.SinkAntlrListener.fireEnterZOM;
import static org.crsx.antlr.SinkAntlrListener.fireExitAlt;
import static org.crsx.antlr.SinkAntlrListener.fireExitBinder;
import static org.crsx.antlr.SinkAntlrListener.fireExitBinds;
import static org.crsx.antlr.SinkAntlrListener.fireExitOPT;
import static org.crsx.antlr.SinkAntlrListener.fireExitSymbol;
import static org.crsx.antlr.SinkAntlrListener.fireExitZOM;
import static org.crsx.antlr.SinkAntlrListener.fireHide;
import static org.crsx.antlr.SinkAntlrListener.fireTail;
import static org.crsx.antlr.SinkAntlrListener.fireTerm;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.crsx.antlr.SinkAntlrListener;

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
	 * Enter a parse tree produced by {@link CrsxMetaParser#eof_TOK}.
	 * @param ctx the parse tree
	 */
	void enterEof_TOK(CrsxMetaParser.Eof_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#eof_TOK}.
	 * @param ctx the parse tree
	 */
	void exitEof_TOK(CrsxMetaParser.Eof_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#eof_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterEof_TOK_EOF(CrsxMetaParser.Eof_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#eof_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitEof_TOK_EOF(CrsxMetaParser.Eof_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortVars_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortVars_OPT(CrsxMetaParser.SortVars_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortVars_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortVars_OPT(CrsxMetaParser.SortVars_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortVars_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortVars_OPT_EOF(CrsxMetaParser.SortVars_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortVars_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortVars_OPT_EOF(CrsxMetaParser.SortVars_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortVars}.
	 * @param ctx the parse tree
	 */
	void enterSortVars(CrsxMetaParser.SortVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortVars}.
	 * @param ctx the parse tree
	 */
	void exitSortVars(CrsxMetaParser.SortVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortVars_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortVars_EOF(CrsxMetaParser.SortVars_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortVars_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortVars_EOF(CrsxMetaParser.SortVars_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDef}.
	 * @param ctx the parse tree
	 */
	void enterSortDef(CrsxMetaParser.SortDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDef}.
	 * @param ctx the parse tree
	 */
	void exitSortDef(CrsxMetaParser.SortDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortDef_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortDef_EOF(CrsxMetaParser.SortDef_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortDef_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortDef_EOF(CrsxMetaParser.SortDef_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variant_OOM}.
	 * @param ctx the parse tree
	 */
	void enterVariant_OOM(CrsxMetaParser.Variant_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variant_OOM}.
	 * @param ctx the parse tree
	 */
	void exitVariant_OOM(CrsxMetaParser.Variant_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variant_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariant_OOM_EOF(CrsxMetaParser.Variant_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variant_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariant_OOM_EOF(CrsxMetaParser.Variant_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortMap_OOM}.
	 * @param ctx the parse tree
	 */
	void enterSortMap_OOM(CrsxMetaParser.SortMap_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortMap_OOM}.
	 * @param ctx the parse tree
	 */
	void exitSortMap_OOM(CrsxMetaParser.SortMap_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortMap_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortMap_OOM_EOF(CrsxMetaParser.SortMap_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortMap_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortMap_OOM_EOF(CrsxMetaParser.SortMap_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFixity_OPT(CrsxMetaParser.Fixity_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFixity_OPT(CrsxMetaParser.Fixity_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFixity_OPT_EOF(CrsxMetaParser.Fixity_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFixity_OPT_EOF(CrsxMetaParser.Fixity_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnSortParams_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFnSortParams_OPT(CrsxMetaParser.FnSortParams_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnSortParams_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFnSortParams_OPT(CrsxMetaParser.FnSortParams_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnSortParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnSortParams_OPT_EOF(CrsxMetaParser.FnSortParams_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnSortParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnSortParams_OPT_EOF(CrsxMetaParser.FnSortParams_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity}.
	 * @param ctx the parse tree
	 */
	void enterFixity(CrsxMetaParser.FixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity}.
	 * @param ctx the parse tree
	 */
	void exitFixity(CrsxMetaParser.FixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFixity_EOF(CrsxMetaParser.Fixity_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFixity_EOF(CrsxMetaParser.Fixity_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity_TOK}.
	 * @param ctx the parse tree
	 */
	void enterFixity_TOK(CrsxMetaParser.Fixity_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity_TOK}.
	 * @param ctx the parse tree
	 */
	void exitFixity_TOK(CrsxMetaParser.Fixity_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fixity_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFixity_TOK_EOF(CrsxMetaParser.Fixity_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fixity_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFixity_TOK_EOF(CrsxMetaParser.Fixity_TOK_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(CrsxMetaParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(CrsxMetaParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variant_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariant_EOF(CrsxMetaParser.Variant_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variant_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariant_EOF(CrsxMetaParser.Variant_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variantArgs_OPT}.
	 * @param ctx the parse tree
	 */
	void enterVariantArgs_OPT(CrsxMetaParser.VariantArgs_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variantArgs_OPT}.
	 * @param ctx the parse tree
	 */
	void exitVariantArgs_OPT(CrsxMetaParser.VariantArgs_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variantArgs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariantArgs_OPT_EOF(CrsxMetaParser.VariantArgs_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variantArgs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariantArgs_OPT_EOF(CrsxMetaParser.VariantArgs_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variantArgs}.
	 * @param ctx the parse tree
	 */
	void enterVariantArgs(CrsxMetaParser.VariantArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variantArgs}.
	 * @param ctx the parse tree
	 */
	void exitVariantArgs(CrsxMetaParser.VariantArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#variantArgs_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVariantArgs_EOF(CrsxMetaParser.VariantArgs_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#variantArgs_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVariantArgs_EOF(CrsxMetaParser.VariantArgs_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortMap}.
	 * @param ctx the parse tree
	 */
	void enterSortMap(CrsxMetaParser.SortMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortMap}.
	 * @param ctx the parse tree
	 */
	void exitSortMap(CrsxMetaParser.SortMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortMap_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortMap_EOF(CrsxMetaParser.SortMap_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortMap_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortMap_EOF(CrsxMetaParser.SortMap_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnSortParams}.
	 * @param ctx the parse tree
	 */
	void enterFnSortParams(CrsxMetaParser.FnSortParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnSortParams}.
	 * @param ctx the parse tree
	 */
	void exitFnSortParams(CrsxMetaParser.FnSortParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnSortParams_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnSortParams_EOF(CrsxMetaParser.FnSortParams_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnSortParams_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnSortParams_EOF(CrsxMetaParser.FnSortParams_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterSort_ZOM(CrsxMetaParser.Sort_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitSort_ZOM(CrsxMetaParser.Sort_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSort_ZOM_EOF(CrsxMetaParser.Sort_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSort_ZOM_EOF(CrsxMetaParser.Sort_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(CrsxMetaParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(CrsxMetaParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSort_EOF(CrsxMetaParser.Sort_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSort_EOF(CrsxMetaParser.Sort_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortScope_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortScope_OPT(CrsxMetaParser.SortScope_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortScope_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortScope_OPT(CrsxMetaParser.SortScope_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortScope_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortScope_OPT_EOF(CrsxMetaParser.SortScope_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortScope_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortScope_OPT_EOF(CrsxMetaParser.SortScope_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortScope}.
	 * @param ctx the parse tree
	 */
	void enterSortScope(CrsxMetaParser.SortScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortScope}.
	 * @param ctx the parse tree
	 */
	void exitSortScope(CrsxMetaParser.SortScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortScope_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortScope_EOF(CrsxMetaParser.SortScope_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortScope_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortScope_EOF(CrsxMetaParser.SortScope_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort_OOM}.
	 * @param ctx the parse tree
	 */
	void enterSort_OOM(CrsxMetaParser.Sort_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort_OOM}.
	 * @param ctx the parse tree
	 */
	void exitSort_OOM(CrsxMetaParser.Sort_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sort_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSort_OOM_EOF(CrsxMetaParser.Sort_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sort_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSort_OOM_EOF(CrsxMetaParser.Sort_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#paramSort}.
	 * @param ctx the parse tree
	 */
	void enterParamSort(CrsxMetaParser.ParamSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#paramSort}.
	 * @param ctx the parse tree
	 */
	void exitParamSort(CrsxMetaParser.ParamSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#paramSort_EOF}.
	 * @param ctx the parse tree
	 */
	void enterParamSort_EOF(CrsxMetaParser.ParamSort_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#paramSort_EOF}.
	 * @param ctx the parse tree
	 */
	void exitParamSort_EOF(CrsxMetaParser.ParamSort_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortParams_OPT}.
	 * @param ctx the parse tree
	 */
	void enterSortParams_OPT(CrsxMetaParser.SortParams_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortParams_OPT}.
	 * @param ctx the parse tree
	 */
	void exitSortParams_OPT(CrsxMetaParser.SortParams_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortParams_OPT_EOF(CrsxMetaParser.SortParams_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortParams_OPT_EOF(CrsxMetaParser.SortParams_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortParams}.
	 * @param ctx the parse tree
	 */
	void enterSortParams(CrsxMetaParser.SortParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortParams}.
	 * @param ctx the parse tree
	 */
	void exitSortParams(CrsxMetaParser.SortParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sortParams_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSortParams_EOF(CrsxMetaParser.SortParams_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sortParams_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSortParams_EOF(CrsxMetaParser.SortParams_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#paramSort_OOM}.
	 * @param ctx the parse tree
	 */
	void enterParamSort_OOM(CrsxMetaParser.ParamSort_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#paramSort_OOM}.
	 * @param ctx the parse tree
	 */
	void exitParamSort_OOM(CrsxMetaParser.ParamSort_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#paramSort_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterParamSort_OOM_EOF(CrsxMetaParser.ParamSort_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#paramSort_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitParamSort_OOM_EOF(CrsxMetaParser.ParamSort_OOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sorts}.
	 * @param ctx the parse tree
	 */
	void enterSorts(CrsxMetaParser.SortsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sorts}.
	 * @param ctx the parse tree
	 */
	void exitSorts(CrsxMetaParser.SortsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sorts_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSorts_EOF(CrsxMetaParser.Sorts_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sorts_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSorts_EOF(CrsxMetaParser.Sorts_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sorts_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterSorts_ZOM(CrsxMetaParser.Sorts_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sorts_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitSorts_ZOM(CrsxMetaParser.Sorts_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#sorts_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSorts_ZOM_EOF(CrsxMetaParser.Sorts_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#sorts_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSorts_ZOM_EOF(CrsxMetaParser.Sorts_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#ruleDecl}.
	 * @param ctx the parse tree
	 */
	void enterRuleDecl(CrsxMetaParser.RuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#ruleDecl}.
	 * @param ctx the parse tree
	 */
	void exitRuleDecl(CrsxMetaParser.RuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#ruleDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterRuleDecl_EOF(CrsxMetaParser.RuleDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#ruleDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitRuleDecl_EOF(CrsxMetaParser.RuleDecl_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnDecl}.
	 * @param ctx the parse tree
	 */
	void enterFnDecl(CrsxMetaParser.FnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnDecl}.
	 * @param ctx the parse tree
	 */
	void exitFnDecl(CrsxMetaParser.FnDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnDecl_EOF(CrsxMetaParser.FnDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnDecl_EOF(CrsxMetaParser.FnDecl_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFnParamsDecl_OPT(CrsxMetaParser.FnParamsDecl_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFnParamsDecl_OPT(CrsxMetaParser.FnParamsDecl_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParamsDecl_OPT_EOF(CrsxMetaParser.FnParamsDecl_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParamsDecl_OPT_EOF(CrsxMetaParser.FnParamsDecl_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnFixity}.
	 * @param ctx the parse tree
	 */
	void enterFnFixity(CrsxMetaParser.FnFixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnFixity}.
	 * @param ctx the parse tree
	 */
	void exitFnFixity(CrsxMetaParser.FnFixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnFixity_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnFixity_EOF(CrsxMetaParser.FnFixity_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnFixity_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnFixity_EOF(CrsxMetaParser.FnFixity_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamsDecl}.
	 * @param ctx the parse tree
	 */
	void enterFnParamsDecl(CrsxMetaParser.FnParamsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamsDecl}.
	 * @param ctx the parse tree
	 */
	void exitFnParamsDecl(CrsxMetaParser.FnParamsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParamsDecl_EOF(CrsxMetaParser.FnParamsDecl_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamsDecl_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParamsDecl_EOF(CrsxMetaParser.FnParamsDecl_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParams_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFnParams_OPT(CrsxMetaParser.FnParams_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParams_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFnParams_OPT(CrsxMetaParser.FnParams_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParams_OPT_EOF(CrsxMetaParser.FnParams_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParams_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParams_OPT_EOF(CrsxMetaParser.FnParams_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParams}.
	 * @param ctx the parse tree
	 */
	void enterFnParams(CrsxMetaParser.FnParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParams}.
	 * @param ctx the parse tree
	 */
	void exitFnParams(CrsxMetaParser.FnParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParams_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParams_EOF(CrsxMetaParser.FnParams_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParams_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParams_EOF(CrsxMetaParser.FnParams_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParam_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterFnParam_ZOM(CrsxMetaParser.FnParam_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParam_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitFnParam_ZOM(CrsxMetaParser.FnParam_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParam_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParam_ZOM_EOF(CrsxMetaParser.FnParam_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParam_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParam_ZOM_EOF(CrsxMetaParser.FnParam_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParam}.
	 * @param ctx the parse tree
	 */
	void enterFnParam(CrsxMetaParser.FnParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParam}.
	 * @param ctx the parse tree
	 */
	void exitFnParam(CrsxMetaParser.FnParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParam_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParam_EOF(CrsxMetaParser.FnParam_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParam_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParam_EOF(CrsxMetaParser.FnParam_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamSort_OPT}.
	 * @param ctx the parse tree
	 */
	void enterFnParamSort_OPT(CrsxMetaParser.FnParamSort_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamSort_OPT}.
	 * @param ctx the parse tree
	 */
	void exitFnParamSort_OPT(CrsxMetaParser.FnParamSort_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamSort_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParamSort_OPT_EOF(CrsxMetaParser.FnParamSort_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamSort_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParamSort_OPT_EOF(CrsxMetaParser.FnParamSort_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamSort}.
	 * @param ctx the parse tree
	 */
	void enterFnParamSort(CrsxMetaParser.FnParamSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamSort}.
	 * @param ctx the parse tree
	 */
	void exitFnParamSort(CrsxMetaParser.FnParamSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#fnParamSort_EOF}.
	 * @param ctx the parse tree
	 */
	void enterFnParamSort_EOF(CrsxMetaParser.FnParamSort_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#fnParamSort_EOF}.
	 * @param ctx the parse tree
	 */
	void exitFnParamSort_EOF(CrsxMetaParser.FnParamSort_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#nterm_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterNterm_ZOM(CrsxMetaParser.Nterm_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nterm_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitNterm_ZOM(CrsxMetaParser.Nterm_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#nterm_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterNterm_ZOM_EOF(CrsxMetaParser.Nterm_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nterm_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitNterm_ZOM_EOF(CrsxMetaParser.Nterm_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#nterm}.
	 * @param ctx the parse tree
	 */
	void enterNterm(CrsxMetaParser.NtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nterm}.
	 * @param ctx the parse tree
	 */
	void exitNterm(CrsxMetaParser.NtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#nterm_EOF}.
	 * @param ctx the parse tree
	 */
	void enterNterm_EOF(CrsxMetaParser.Nterm_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#nterm_EOF}.
	 * @param ctx the parse tree
	 */
	void exitNterm_EOF(CrsxMetaParser.Nterm_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#aterm}.
	 * @param ctx the parse tree
	 */
	void enterAterm(CrsxMetaParser.AtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#aterm}.
	 * @param ctx the parse tree
	 */
	void exitAterm(CrsxMetaParser.AtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#aterm_EOF}.
	 * @param ctx the parse tree
	 */
	void enterAterm_EOF(CrsxMetaParser.Aterm_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#aterm_EOF}.
	 * @param ctx the parse tree
	 */
	void exitAterm_EOF(CrsxMetaParser.Aterm_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#apply_OPT}.
	 * @param ctx the parse tree
	 */
	void enterApply_OPT(CrsxMetaParser.Apply_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#apply_OPT}.
	 * @param ctx the parse tree
	 */
	void exitApply_OPT(CrsxMetaParser.Apply_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#apply_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterApply_OPT_EOF(CrsxMetaParser.Apply_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#apply_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitApply_OPT_EOF(CrsxMetaParser.Apply_OPT_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#apply}.
	 * @param ctx the parse tree
	 */
	void enterApply(CrsxMetaParser.ApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#apply}.
	 * @param ctx the parse tree
	 */
	void exitApply(CrsxMetaParser.ApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#apply_EOF}.
	 * @param ctx the parse tree
	 */
	void enterApply_EOF(CrsxMetaParser.Apply_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#apply_EOF}.
	 * @param ctx the parse tree
	 */
	void exitApply_EOF(CrsxMetaParser.Apply_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#groupOrList}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrList(CrsxMetaParser.GroupOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#groupOrList}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrList(CrsxMetaParser.GroupOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#groupOrList_EOF}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrList_EOF(CrsxMetaParser.GroupOrList_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#groupOrList_EOF}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrList_EOF(CrsxMetaParser.GroupOrList_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_OOM}.
	 * @param ctx the parse tree
	 */
	void enterTerm_OOM(CrsxMetaParser.Term_OOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_OOM}.
	 * @param ctx the parse tree
	 */
	void exitTerm_OOM(CrsxMetaParser.Term_OOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#term_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTerm_OOM_EOF(CrsxMetaParser.Term_OOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#term_OOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTerm_OOM_EOF(CrsxMetaParser.Term_OOM_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_ZOM(CrsxMetaParser.DispatchCases_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_ZOM(CrsxMetaParser.DispatchCases_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#dispatchCases_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterDispatchCases_ZOM_EOF(CrsxMetaParser.DispatchCases_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#dispatchCases_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitDispatchCases_ZOM_EOF(CrsxMetaParser.DispatchCases_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(CrsxMetaParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(CrsxMetaParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#map_EOF}.
	 * @param ctx the parse tree
	 */
	void enterMap_EOF(CrsxMetaParser.Map_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#map_EOF}.
	 * @param ctx the parse tree
	 */
	void exitMap_EOF(CrsxMetaParser.Map_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kvs_OPT}.
	 * @param ctx the parse tree
	 */
	void enterKvs_OPT(CrsxMetaParser.Kvs_OPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kvs_OPT}.
	 * @param ctx the parse tree
	 */
	void exitKvs_OPT(CrsxMetaParser.Kvs_OPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kvs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void enterKvs_OPT_EOF(CrsxMetaParser.Kvs_OPT_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kvs_OPT_EOF}.
	 * @param ctx the parse tree
	 */
	void exitKvs_OPT_EOF(CrsxMetaParser.Kvs_OPT_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kvs}.
	 * @param ctx the parse tree
	 */
	void enterKvs(CrsxMetaParser.KvsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kvs}.
	 * @param ctx the parse tree
	 */
	void exitKvs(CrsxMetaParser.KvsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kvs_EOF}.
	 * @param ctx the parse tree
	 */
	void enterKvs_EOF(CrsxMetaParser.Kvs_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kvs_EOF}.
	 * @param ctx the parse tree
	 */
	void exitKvs_EOF(CrsxMetaParser.Kvs_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kv_ZOM}.
	 * @param ctx the parse tree
	 */
	void enterKv_ZOM(CrsxMetaParser.Kv_ZOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kv_ZOM}.
	 * @param ctx the parse tree
	 */
	void exitKv_ZOM(CrsxMetaParser.Kv_ZOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kv_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void enterKv_ZOM_EOF(CrsxMetaParser.Kv_ZOM_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kv_ZOM_EOF}.
	 * @param ctx the parse tree
	 */
	void exitKv_ZOM_EOF(CrsxMetaParser.Kv_ZOM_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kv}.
	 * @param ctx the parse tree
	 */
	void enterKv(CrsxMetaParser.KvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kv}.
	 * @param ctx the parse tree
	 */
	void exitKv(CrsxMetaParser.KvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#kv_EOF}.
	 * @param ctx the parse tree
	 */
	void enterKv_EOF(CrsxMetaParser.Kv_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#kv_EOF}.
	 * @param ctx the parse tree
	 */
	void exitKv_EOF(CrsxMetaParser.Kv_EOFContext ctx);
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
	 * Enter a parse tree produced by {@link CrsxMetaParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(CrsxMetaParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(CrsxMetaParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CrsxMetaParser#symbols_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSymbols_EOF(CrsxMetaParser.Symbols_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CrsxMetaParser#symbols_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSymbols_EOF(CrsxMetaParser.Symbols_EOFContext ctx);
}