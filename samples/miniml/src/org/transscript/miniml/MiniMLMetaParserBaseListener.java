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


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link MiniMLMetaParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MiniMLMetaParserBaseListener implements MiniMLMetaParserListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterToplevel(MiniMLMetaParser.ToplevelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitToplevel(MiniMLMetaParser.ToplevelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterToplevel_EOF(MiniMLMetaParser.Toplevel_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitToplevel_EOF(MiniMLMetaParser.Toplevel_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_TOK(MiniMLMetaParser.Var_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_TOK(MiniMLMetaParser.Var_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_TOK_EOF(MiniMLMetaParser.Var_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_TOK_EOF(MiniMLMetaParser.Var_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(MiniMLMetaParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(MiniMLMetaParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr_EOF(MiniMLMetaParser.Expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr_EOF(MiniMLMetaParser.Expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTimesExpr(MiniMLMetaParser.TimesExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTimesExpr(MiniMLMetaParser.TimesExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTimesExpr_EOF(MiniMLMetaParser.TimesExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTimesExpr_EOF(MiniMLMetaParser.TimesExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompExpr(MiniMLMetaParser.CompExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompExpr(MiniMLMetaParser.CompExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompExpr_EOF(MiniMLMetaParser.CompExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompExpr_EOF(MiniMLMetaParser.CompExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryExpr(MiniMLMetaParser.PrimaryExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryExpr(MiniMLMetaParser.PrimaryExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryExpr_EOF(MiniMLMetaParser.PrimaryExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryExpr_EOF(MiniMLMetaParser.PrimaryExpr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInt_TOK(MiniMLMetaParser.Int_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInt_TOK(MiniMLMetaParser.Int_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInt_TOK_EOF(MiniMLMetaParser.Int_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInt_TOK_EOF(MiniMLMetaParser.Int_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApp_expr(MiniMLMetaParser.App_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApp_expr(MiniMLMetaParser.App_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApp_expr_EOF(MiniMLMetaParser.App_expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApp_expr_EOF(MiniMLMetaParser.App_expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimple_expr(MiniMLMetaParser.Simple_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimple_expr(MiniMLMetaParser.Simple_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimple_expr_EOF(MiniMLMetaParser.Simple_expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimple_expr_EOF(MiniMLMetaParser.Simple_expr_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTy(MiniMLMetaParser.TyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTy(MiniMLMetaParser.TyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTy_EOF(MiniMLMetaParser.Ty_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTy_EOF(MiniMLMetaParser.Ty_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTyPrimary(MiniMLMetaParser.TyPrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTyPrimary(MiniMLMetaParser.TyPrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTyPrimary_EOF(MiniMLMetaParser.TyPrimary_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTyPrimary_EOF(MiniMLMetaParser.TyPrimary_EOFContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}