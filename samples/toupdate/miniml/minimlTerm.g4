    grammar  MiniMLTerm ;   @   header {
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
}   @   parser ::  members {
protected String _prefix() { return "MiniML_"; }
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
}  
   toplevel      :      {_enterAlt("1");}  {_hide();}    LET    {_enterBinder("x");}    VAR  <   boundvar =   x  >   {_exitBinder();}  {_hide();}    EQUAL      expr     {_hide();}    SEMISEMI    {_enterBinds(" x");}    toplevel   <   bound =   x  >   {_exitBinds();}  {_hide();}    SEMISEMI    {_exitAlt();}  
|     {_enterAlt("2");}    expr     {_hide();}    SEMISEMI    {_exitAlt();}  ;    
   expr      :      {_enterAlt("1");}    timesExpr     {_hide();}    PLUS      expr     {_exitAlt();}  
|     {_enterAlt("2");}    timesExpr     {_hide();}    MINUS      expr     {_exitAlt();}   |     {_enterAlt("3");}    timesExpr     {_exitAlt();}  ;    
   timesExpr      :      {_enterAlt("1");}    compExpr     {_hide();}    TIMES      timesExpr     {_exitAlt();}   |     {_enterAlt("2");}    compExpr     {_exitAlt();}  ;    
   compExpr      :      {_enterAlt("1");}    primaryExpr     {_hide();}    LESS      compExpr     {_exitAlt();}  
|     {_enterAlt("2");}    primaryExpr     {_hide();}    EQUAL      compExpr     {_exitAlt();}   |     {_enterAlt("3");}    primaryExpr     {_exitAlt();}  ;    
   primaryExpr      :      {_enterAlt("1");}    app_expr     {_exitAlt();}  
|     {_enterAlt("2");}  {_hide();}    MINUS      INT    {_exitAlt();}  
|     {_enterAlt("3");}  {_hide();}    IF      expr     {_hide();}    THEN      expr     {_hide();}    ELSE      expr     {_exitAlt();}  
|     {_enterAlt("4");}  {_hide();}    FUN      VAR    {_hide();}    LPAREN    {_enterBinder("x");}    VAR  <   boundvar =   x  >   {_exitBinder();}  {_hide();}    COLON      ty     {_hide();}    RPAREN    {_hide();}    COLON      ty     {_hide();}    IS    {_enterBinds(" x");}    expr   <   bound =   x  >   {_exitBinds();}  {_exitAlt();}  ;    
   app_expr      :      {_enterAlt("1");}    simple_expr     {_exitAlt();}  
|     {_enterAlt("2");}    simple_expr       app_expr     {_exitAlt();}  ;    
   simple_expr      :      {_enterAlt("1");}    VAR  <   symbol  >   {_exitAlt();}   |     {_enterAlt("2");}  {_hide();}    TRUE    {_exitAlt();}   |     {_enterAlt("3");}  {_hide();}    FALSE    {_exitAlt();}   |     {_enterAlt("4");}    INT    {_exitAlt();}  
|     {_enterAlt("5");}  {_hide();}    LPAREN      expr     {_hide();}    RPAREN    {_exitAlt();}  ;    
   ty      :      {_enterAlt("1");}    tyPrimary     {_exitAlt();}  
|     {_enterAlt("2");}    tyPrimary     {_hide();}    TARROW      ty     {_exitAlt();}  ;    
   tyPrimary      :      {_enterAlt("1");}  {_hide();}    TBOOL    {_exitAlt();}   |     {_enterAlt("2");}  {_hide();}    TINT    {_exitAlt();}  
|     {_enterAlt("3");}  {_hide();}    LPAREN      ty     {_hide();}    RPAREN    {_exitAlt();}  ;        VAR :       ['a'-'z''A'-'Z']  +    ;     INT :       ['0'-'9']  +    ;     TINT :        'int'     ;     TBOOL :        'bool'     ;     TRUE :        'true'     ;     FALSE :        'false'     ;     FUN :        'fun'     ;     IS :        'is'     ;     IF :        'if'     ;     THEN :        'then'     ;     ELSE :        'else'     ;     LET :        'let'     ;     SEMISEMI :        ';;'     ;     EQUAL :        '='     ;     LESS :        '<'     ;     TARROW :        '->'     ;     COLON :        ':'     ;     LPAREN :        '('     ;     RPAREN :        ')'     ;     PLUS :        '+'     ;     MINUS :        '-'     ;     TIMES :        '*'     ;     WS :       [ \t\r\n\f]  +   ->    channel (   HIDDEN )   ; 