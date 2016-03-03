// Copyright (c) 2016 IBM Corporation.

/*
 * MiniML grammar for ANTLR4
 *
 * :oosly ported from https://github.com/andrejbauer/plzoo/blob/master/src/miniml/parser.mly
 *
 * Slightly altered (left refactorying) due to meta parser generator current implementation limitations
 *
 */

grammar MiniML;

toplevel
  : LET VAR<boundvar=x> EQUAL expr SEMISEMI toplevel<bound=x> SEMISEMI
  | expr SEMISEMI
  ;

expr
  : timesExpr PLUS expr
  | timesExpr MINUS expr
  | timesExpr
  ;

timesExpr
  : compExpr TIMES timesExpr
  | compExpr
  ;

compExpr
  : primaryExpr LESS compExpr
  | primaryExpr EQUAL compExpr
  | primaryExpr
  ;

primaryExpr
  : app_expr
  | MINUS INT
  | IF expr THEN expr ELSE expr
  | FUN VAR LPAREN VAR<boundvar=x> COLON ty RPAREN COLON ty IS expr<bound=x>
  ;

app_expr
  : simple_expr
  | simple_expr app_expr
  ;

simple_expr
  : VAR<symbol>
  | TRUE
  | FALSE
  | INT
  | LPAREN expr RPAREN
  ;

ty
  : tyPrimary
  | tyPrimary TARROW ty
  ;

tyPrimary
  : TBOOL
  | TINT
  | LPAREN ty RPAREN
  ;

// Lexer rules

VAR      : ['a'-'z' 'A'-'Z']+;
INT      : ['0'-'9']+;
TINT     : 'int';
TBOOL    : 'bool';
TRUE     : 'true';
FALSE    : 'false';
FUN      : 'fun';
IS       : 'is';
IF       : 'if';
THEN     : 'then';
ELSE     : 'else';
LET      : 'let';
SEMISEMI : ';;';
EQUAL    : '=';
LESS     : '<';
TARROW   : '->';
COLON    : ':';
LPAREN   : '(';
RPAREN   : ')';
PLUS     : '+';
MINUS    : '-';
TIMES    : '*';

WS : [ \t\r\n\f]+ -> channel(HIDDEN);
