// Generated from /Users/villardl/Projects/crsx/crsx4/src/text/TextMetaParser.g4 by ANTLR 4.5
package org.crsx.text;

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
 * {@link TextMetaParser}.
 */
public interface TextMetaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(TextMetaParser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(TextMetaParser.NContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#n_EOF}.
	 * @param ctx the parse tree
	 */
	void enterN_EOF(TextMetaParser.N_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#n_EOF}.
	 * @param ctx the parse tree
	 */
	void exitN_EOF(TextMetaParser.N_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(TextMetaParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(TextMetaParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#part_EOF}.
	 * @param ctx the parse tree
	 */
	void enterPart_EOF(TextMetaParser.Part_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#part_EOF}.
	 * @param ctx the parse tree
	 */
	void exitPart_EOF(TextMetaParser.Part_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#chars_TOK}.
	 * @param ctx the parse tree
	 */
	void enterChars_TOK(TextMetaParser.Chars_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#chars_TOK}.
	 * @param ctx the parse tree
	 */
	void exitChars_TOK(TextMetaParser.Chars_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#chars_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterChars_TOK_EOF(TextMetaParser.Chars_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#chars_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitChars_TOK_EOF(TextMetaParser.Chars_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#break_TOK}.
	 * @param ctx the parse tree
	 */
	void enterBreak_TOK(TextMetaParser.Break_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#break_TOK}.
	 * @param ctx the parse tree
	 */
	void exitBreak_TOK(TextMetaParser.Break_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#break_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterBreak_TOK_EOF(TextMetaParser.Break_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#break_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitBreak_TOK_EOF(TextMetaParser.Break_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#openindent_TOK}.
	 * @param ctx the parse tree
	 */
	void enterOpenindent_TOK(TextMetaParser.Openindent_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#openindent_TOK}.
	 * @param ctx the parse tree
	 */
	void exitOpenindent_TOK(TextMetaParser.Openindent_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#openindent_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterOpenindent_TOK_EOF(TextMetaParser.Openindent_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#openindent_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitOpenindent_TOK_EOF(TextMetaParser.Openindent_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#closeindent_TOK}.
	 * @param ctx the parse tree
	 */
	void enterCloseindent_TOK(TextMetaParser.Closeindent_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#closeindent_TOK}.
	 * @param ctx the parse tree
	 */
	void exitCloseindent_TOK(TextMetaParser.Closeindent_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#closeindent_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterCloseindent_TOK_EOF(TextMetaParser.Closeindent_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#closeindent_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitCloseindent_TOK_EOF(TextMetaParser.Closeindent_TOK_EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#caststring_TOK}.
	 * @param ctx the parse tree
	 */
	void enterCaststring_TOK(TextMetaParser.Caststring_TOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#caststring_TOK}.
	 * @param ctx the parse tree
	 */
	void exitCaststring_TOK(TextMetaParser.Caststring_TOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextMetaParser#caststring_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void enterCaststring_TOK_EOF(TextMetaParser.Caststring_TOK_EOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextMetaParser#caststring_TOK_EOF}.
	 * @param ctx the parse tree
	 */
	void exitCaststring_TOK_EOF(TextMetaParser.Caststring_TOK_EOFContext ctx);
}