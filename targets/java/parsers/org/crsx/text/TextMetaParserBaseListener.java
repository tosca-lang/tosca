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


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link TextMetaParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class TextMetaParserBaseListener implements TextMetaParserListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterN(TextMetaParser.NContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitN(TextMetaParser.NContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterN_EOF(TextMetaParser.N_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitN_EOF(TextMetaParser.N_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPart(TextMetaParser.PartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPart(TextMetaParser.PartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPart_EOF(TextMetaParser.Part_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPart_EOF(TextMetaParser.Part_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterChars_TOK(TextMetaParser.Chars_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitChars_TOK(TextMetaParser.Chars_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterChars_TOK_EOF(TextMetaParser.Chars_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitChars_TOK_EOF(TextMetaParser.Chars_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBreak_TOK(TextMetaParser.Break_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBreak_TOK(TextMetaParser.Break_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBreak_TOK_EOF(TextMetaParser.Break_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBreak_TOK_EOF(TextMetaParser.Break_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOpenindent_TOK(TextMetaParser.Openindent_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOpenindent_TOK(TextMetaParser.Openindent_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOpenindent_TOK_EOF(TextMetaParser.Openindent_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOpenindent_TOK_EOF(TextMetaParser.Openindent_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCloseindent_TOK(TextMetaParser.Closeindent_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCloseindent_TOK(TextMetaParser.Closeindent_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCloseindent_TOK_EOF(TextMetaParser.Closeindent_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCloseindent_TOK_EOF(TextMetaParser.Closeindent_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCaststring_TOK(TextMetaParser.Caststring_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCaststring_TOK(TextMetaParser.Caststring_TOKContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCaststring_TOK_EOF(TextMetaParser.Caststring_TOK_EOFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCaststring_TOK_EOF(TextMetaParser.Caststring_TOK_EOFContext ctx) { }

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