// Generated from /Users/villardl/Projects/crsx/crsx4/samples/miniml/MiniMLMetaParser.g4 by ANTLR 4.5
package org.transscript.miniml;

import org.transscript.antlr.SinkAntlrListener;
import static org.transscript.antlr.SinkAntlrListener.fireEnterZOM;
import static org.transscript.antlr.SinkAntlrListener.fireExitZOM;
import static org.transscript.antlr.SinkAntlrListener.fireEnterOPT;
import static org.transscript.antlr.SinkAntlrListener.fireExitOPT;
import static org.transscript.antlr.SinkAntlrListener.fireEnterAlt;
import static org.transscript.antlr.SinkAntlrListener.fireExitAlt;
import static org.transscript.antlr.SinkAntlrListener.fireHide;
import static org.transscript.antlr.SinkAntlrListener.fireEnterSymbol;
import static org.transscript.antlr.SinkAntlrListener.fireExitSymbol;
import static org.transscript.antlr.SinkAntlrListener.fireEnterBinder;
import static org.transscript.antlr.SinkAntlrListener.fireExitBinder;
import static org.transscript.antlr.SinkAntlrListener.fireEnterBinds;
import static org.transscript.antlr.SinkAntlrListener.fireExitBinds;
import static org.transscript.antlr.SinkAntlrListener.fireTail;
import static org.transscript.antlr.SinkAntlrListener.fireTerm;
import static org.transscript.antlr.SinkAntlrListener.fireEmbed;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniMLMetaParser}.
 */
public interface MiniMLMetaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#toplevel}.
	 * @param ctx the parse tree
	 */
	void enterToplevel(MiniMLMetaParser.ToplevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#toplevel}.
	 * @param ctx the parse tree
	 */
	void exitToplevel(MiniMLMetaParser.ToplevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#toplevel_EOF}.
	 * @param ctx the parse tree
	 */
	void enterToplevel_EOF(MiniMLMetaParser.Toplevel_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#toplevel_EOF}.
	 * @param ctx the parse tree
	 */
	void exitToplevel_EOF(MiniMLMetaParser.Toplevel_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#var_TOK}.
	 * @param ctx the parse tree
	 */
	void enterVar_TOK(MiniMLMetaParser.Var_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#var_TOK}.
	 * @param ctx the parse tree
	 */
	void exitVar_TOK(MiniMLMetaParser.Var_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#var_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterVar_TOK_EOF(MiniMLMetaParser.Var_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#var_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitVar_TOK_EOF(MiniMLMetaParser.Var_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniMLMetaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniMLMetaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#expr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterExpr_EOF(MiniMLMetaParser.Expr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#expr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitExpr_EOF(MiniMLMetaParser.Expr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#timesExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(MiniMLMetaParser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#timesExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(MiniMLMetaParser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#timesExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr_EOF(MiniMLMetaParser.TimesExpr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#timesExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr_EOF(MiniMLMetaParser.TimesExpr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(MiniMLMetaParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(MiniMLMetaParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#compExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr_EOF(MiniMLMetaParser.CompExpr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#compExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr_EOF(MiniMLMetaParser.CompExpr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(MiniMLMetaParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(MiniMLMetaParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#primaryExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr_EOF(MiniMLMetaParser.PrimaryExpr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#primaryExpr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr_EOF(MiniMLMetaParser.PrimaryExpr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#int_TOK}.
	 * @param ctx the parse tree
	 */
	void enterInt_TOK(MiniMLMetaParser.Int_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#int_TOK}.
	 * @param ctx the parse tree
	 */
	void exitInt_TOK(MiniMLMetaParser.Int_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#int_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterInt_TOK_EOF(MiniMLMetaParser.Int_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#int_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitInt_TOK_EOF(MiniMLMetaParser.Int_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#app_expr}.
	 * @param ctx the parse tree
	 */
	void enterApp_expr(MiniMLMetaParser.App_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#app_expr}.
	 * @param ctx the parse tree
	 */
	void exitApp_expr(MiniMLMetaParser.App_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#app_expr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterApp_expr_EOF(MiniMLMetaParser.App_expr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#app_expr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitApp_expr_EOF(MiniMLMetaParser.App_expr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(MiniMLMetaParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(MiniMLMetaParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#simple_expr_EOF}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr_EOF(MiniMLMetaParser.Simple_expr_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#simple_expr_EOF}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr_EOF(MiniMLMetaParser.Simple_expr_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(MiniMLMetaParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(MiniMLMetaParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#ty_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTy_EOF(MiniMLMetaParser.Ty_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#ty_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTy_EOF(MiniMLMetaParser.Ty_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#tyPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTyPrimary(MiniMLMetaParser.TyPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#tyPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTyPrimary(MiniMLMetaParser.TyPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniMLMetaParser#tyPrimary_EOF}.
	 * @param ctx the parse tree
	 */
	void enterTyPrimary_EOF(MiniMLMetaParser.TyPrimary_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMLMetaParser#tyPrimary_EOF}.
	 * @param ctx the parse tree
	 */
	void exitTyPrimary_EOF(MiniMLMetaParser.TyPrimary_EOFContext ctx);
}