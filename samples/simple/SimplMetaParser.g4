parser grammar SimplMetaParser;

options {
	tokenVocab = SimplMetaLexer;
}

@header {
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
}

@parser::members {
public SimplMetaParser() {}
protected Lexer newLexer(CharStream stream)
{

return new SimplMetaLexer(stream);
}

protected void initATN()
{    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
}protected String _prefix() { return "Simpl_"; }
protected void _enterZOM() { fireEnterZOM(_parseListeners, _ctx); }
protected void _exitZOM()  { fireExitZOM(_parseListeners, _ctx); }
protected void _enterOOM() { _enterZOM(); }
protected void _exitOOM()  { _exitZOM(); }
protected void _enterOPT() { fireEnterOPT(_parseListeners, _ctx); }
protected void _exitOPT()  { fireExitOPT(_parseListeners, _ctx); }
protected void _enterAlt(String name) { fireEnterAlt(_parseListeners, _ctx, name); }
protected void _enterAlt() { fireEnterAlt(_parseListeners, _ctx); }
protected void _exitAlt()  { fireExitAlt(_parseListeners, _ctx); }
protected void _hide()     { fireHide(_parseListeners, _ctx); }
protected void _embed()    { fireEmbed(_parseListeners, _ctx); }
protected void _tail()     { fireTail(_parseListeners, _ctx); }
protected void _term()     { fireTerm(_parseListeners, _ctx); }
protected String _metachar() { return "#";}
}

simpl
:
	{_enterAlt();}

	assign exp
	{_exitAlt();}

	|
	{_term();}

	MT_simpl
	|
	{_embed();}

	ET_simpl CRSX_EMBED_END
;

simpl_EOF
:
	simpl EOF
;

assign
:
	{_enterAlt();}

	var_TOK assign_S1
	{_exitAlt();}

	|
	{_term();}

	MT_assign
	|
	{_embed();}

	ET_assign CRSX_EMBED_END
;

assign_EOF
:
	assign EOF
;

var_TOK
:
	{}

	VAR
	{}

	|
	{_term();}

	MT_var_TOK
	|
	{_embed();}

	ET_var_TOK CRSX_EMBED_END
;

var_TOK_EOF
:
	var_TOK EOF
;

assign_S1
:
	{_enterAlt();}

	ass_TOK number
	{_exitAlt();}

	|
	{_term();}

	MT_assign_S1
	|
	{_embed();}

	ET_assign_S1 CRSX_EMBED_END
;

assign_S1_EOF
:
	assign_S1 EOF
;

ass_TOK
:
	{}

	ASS
	{}

	|
	{_term();}

	MT_ass_TOK
	|
	{_embed();}

	ET_ass_TOK CRSX_EMBED_END
;

ass_TOK_EOF
:
	ass_TOK EOF
;

exp
:
	{_enterAlt("1");}

	number plus_TOK exp
	{_exitAlt();}

	|
	{_enterAlt("2");}

	var_TOK plus_TOK exp
	{_exitAlt();}

	|
	{_enterAlt("3");}

	var_TOK
	{_exitAlt();}

	|
	{_enterAlt("4");}

	number
	{_exitAlt();}

	|
	{_term();}

	MT_exp
	|
	{_embed();}

	ET_exp CRSX_EMBED_END
;

exp_EOF
:
	exp EOF
;

plus_TOK
:
	{}

	PLUS
	{}

	|
	{_term();}

	MT_plus_TOK
	|
	{_embed();}

	ET_plus_TOK CRSX_EMBED_END
;

plus_TOK_EOF
:
	plus_TOK EOF
;

number
:
	{_enterAlt("1");}

	one_TOK
	{_exitAlt();}

	|
	{_enterAlt("2");}

	zero_TOK
	{_exitAlt();}

	|
	{_term();}

	MT_number
	|
	{_embed();}

	ET_number CRSX_EMBED_END
;

number_EOF
:
	number EOF
;

one_TOK
:
	{}

	ONE
	{}

	|
	{_term();}

	MT_one_TOK
	|
	{_embed();}

	ET_one_TOK CRSX_EMBED_END
;

one_TOK_EOF
:
	one_TOK EOF
;

zero_TOK
:
	{}

	ZERO
	{}

	|
	{_term();}

	MT_zero_TOK
	|
	{_embed();}

	ET_zero_TOK CRSX_EMBED_END
;

zero_TOK_EOF
:
	zero_TOK EOF
;    