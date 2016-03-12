    parser grammar  MiniMLMetaParser ;   options {    tokenVocab =  MiniMLMetaLexer ; }   @   header {
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
}   @   parser ::  members {
public MiniMLMetaParser() {}
protected Lexer newLexer(CharStream stream)
{

return new MiniMLMetaLexer(stream);
}

protected void initATN()
{    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
}protected String _prefix() { return "MiniML_"; }
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
protected void _enterSymbol()  { fireEnterSymbol(_parseListeners, _ctx); }
protected void _exitSymbol()     { fireExitSymbol(_parseListeners, _ctx); }
protected void _enterBinder(String name)     { fireEnterBinder(_parseListeners, _ctx, name); }
protected void _exitBinder()     { fireExitBinder(_parseListeners, _ctx); }
protected void _enterBinds(String names) { fireEnterBinds(_parseListeners, _ctx, names); }
protected void _exitBinds()  { fireExitBinds(_parseListeners, _ctx); }
protected void _embed()    { fireEmbed(_parseListeners, _ctx); }
protected void _tail()     { fireTail(_parseListeners, _ctx); }
protected void _term()     { fireTerm(_parseListeners, _ctx); }
protected String _metachar() { return "#";}
}  
   toplevel      :      {_enterAlt("1");}  {_hide();}    LET    {_enterBinder("x");}    var_TOK   <   boundvar =   x  >   {_exitBinder();}  {_hide();}    EQUAL      expr     {_hide();}    SEMISEMI    {_enterBinds(" x");}    toplevel   <   bound =   x  >   {_exitBinds();}  {_hide();}    SEMISEMI    {_exitAlt();}  
|     {_enterAlt("2");}    expr     {_hide();}    SEMISEMI    {_exitAlt();}   |     {_term();}    MT_toplevel     |     {_embed();}    ET_toplevel      CRSX_EMBED_END    ;        toplevel_EOF      :        toplevel       EOF     ;    
   var_TOK      :      {}  {_enterBinder("x");}    VAR  <   boundvar =   x  >   {_exitBinder();}  {}   |     {_term();}    MT_var_TOK     |     {_embed();}    ET_var_TOK      CRSX_EMBED_END    ;        var_TOK_EOF      :        var_TOK       EOF     ;    
   expr      :      {_enterAlt("1");}    timesExpr     {_hide();}    PLUS      expr     {_exitAlt();}  
|     {_enterAlt("2");}    timesExpr     {_hide();}    MINUS      expr     {_exitAlt();}   |     {_enterAlt("3");}    timesExpr     {_exitAlt();}   |     {_term();}    MT_expr     |     {_embed();}    ET_expr      CRSX_EMBED_END    ;        expr_EOF      :        expr       EOF     ;    
   timesExpr      :      {_enterAlt("1");}    compExpr     {_hide();}    TIMES      timesExpr     {_exitAlt();}   |     {_enterAlt("2");}    compExpr     {_exitAlt();}   |     {_term();}    MT_timesExpr     |     {_embed();}    ET_timesExpr      CRSX_EMBED_END    ;        timesExpr_EOF      :        timesExpr       EOF     ;    
   compExpr      :      {_enterAlt("1");}    primaryExpr     {_hide();}    LESS      compExpr     {_exitAlt();}  
|     {_enterAlt("2");}    primaryExpr     {_hide();}    EQUAL      compExpr     {_exitAlt();}   |     {_enterAlt("3");}    primaryExpr     {_exitAlt();}   |     {_term();}    MT_compExpr     |     {_embed();}    ET_compExpr      CRSX_EMBED_END    ;        compExpr_EOF      :        compExpr       EOF     ;    
   primaryExpr      :      {_enterAlt("1");}    app_expr     {_exitAlt();}  
|     {_enterAlt("2");}  {_hide();}    MINUS      int_TOK     {_exitAlt();}  
|     {_enterAlt("3");}  {_hide();}    IF      expr     {_hide();}    THEN      expr     {_hide();}    ELSE      expr     {_exitAlt();}  
|     {_enterAlt("4");}  {_hide();}    FUN      var_TOK     {_hide();}    LPAREN    {_enterBinder("x");}    var_TOK   <   boundvar =   x  >   {_exitBinder();}  {_hide();}    COLON      ty     {_hide();}    RPAREN    {_hide();}    COLON      ty     {_hide();}    IS    {_enterBinds(" x");}    expr   <   bound =   x  >   {_exitBinds();}  {_exitAlt();}   |     {_term();}    MT_primaryExpr     |     {_embed();}    ET_primaryExpr      CRSX_EMBED_END    ;        primaryExpr_EOF      :        primaryExpr       EOF     ;    
   int_TOK      :      {}    INT    {}   |     {_term();}    MT_int_TOK     |     {_embed();}    ET_int_TOK      CRSX_EMBED_END    ;        int_TOK_EOF      :        int_TOK       EOF     ;    
   app_expr      :      {_enterAlt("1");}    simple_expr     {_exitAlt();}  
|     {_enterAlt("2");}    simple_expr       app_expr     {_exitAlt();}   |     {_term();}    MT_app_expr     |     {_embed();}    ET_app_expr      CRSX_EMBED_END    ;        app_expr_EOF      :        app_expr       EOF     ;    
   simple_expr      :      {_enterAlt("1");}    var_TOK   <   symbol  >   {_exitAlt();}   |     {_enterAlt("2");}  {_hide();}    TRUE    {_exitAlt();}   |     {_enterAlt("3");}  {_hide();}    FALSE    {_exitAlt();}   |     {_enterAlt("4");}    int_TOK     {_exitAlt();}  
|     {_enterAlt("5");}  {_hide();}    LPAREN      expr     {_hide();}    RPAREN    {_exitAlt();}   |     {_term();}    MT_simple_expr     |     {_embed();}    ET_simple_expr      CRSX_EMBED_END    ;        simple_expr_EOF      :        simple_expr       EOF     ;    
   ty      :      {_enterAlt("1");}    tyPrimary     {_exitAlt();}  
|     {_enterAlt("2");}    tyPrimary     {_hide();}    TARROW      ty     {_exitAlt();}   |     {_term();}    MT_ty     |     {_embed();}    ET_ty      CRSX_EMBED_END    ;        ty_EOF      :        ty       EOF     ;    
   tyPrimary      :      {_enterAlt("1");}  {_hide();}    TBOOL    {_exitAlt();}   |     {_enterAlt("2");}  {_hide();}    TINT    {_exitAlt();}  
|     {_enterAlt("3");}  {_hide();}    LPAREN      ty     {_hide();}    RPAREN    {_exitAlt();}   |     {_term();}    MT_tyPrimary     |     {_embed();}    ET_tyPrimary      CRSX_EMBED_END    ;        tyPrimary_EOF      :        tyPrimary       EOF     ;    