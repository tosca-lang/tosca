/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the complete CRSX 4 grammar specification.
 *
 * This grammar is annotated as follows:
 * - [CORE constraint] : part of Core CRSX (input of code generator), with optionally a comment expressing additional constraint.
 * - [INTERNAL]        : internal use only.
 * - [SUGAR]           : pure syntactic sugar, completely eliminating early during compilation.
 *
 * This grammar does not use any ANTLR4 literal due to current ANTLR4 meta parser generator limitation.
 */
grammar Crsx;

// Support for infix, infixr, infixl, postfix and prefix operators.
// This is based on Keith Clarke, "The top-down parsing of expressions".

// The code below is Java. It's simple enough to be ported to other languages.

@header {
import java.util.*;
}

@members {
/** Fixity for each operator operator */
Map<String, String> fixities = new HashMap<>();

/** Precedence for each operator operator */
Map<String, Integer> precedences = new HashMap<>();

/** Get the next precedence for the give operator */
public int nextp (String op) {
    String fixity = fixities.get(op);
    int p = precedences.get(op);

    if (fixity.equals("infixr"))  return p;
    if (fixity.equals("infixl"))  return p+1;
    if (fixity.equals("prefix"))  return p;
    if (fixity.equals("postfix")) return p+1;
    if (fixity.equals("infix"))   return p+1;
    return 0;
}

/** Add new symbol with given fixity and precedence */
private void addOp(String op, String fixity, Integer precedence) {
		if (fixity != null)	{
			fixities.put(op,  fixity);
			precedences.put(op, precedence);
		}
}

private boolean isPrefix(String op) {
  return "prefix".equals(fixities.get(op));
}

private boolean isAnyInfix(String op, int currentp) {
  String fixity = fixities.get(op);
  return fixity != null && fixity.startsWith("infix") && precedences.get(op) >= currentp;
}

private boolean isPostfix(String op, int currentp) {
  return "postfix".equals(fixities.get(op)) && precedences.get(op) >= currentp;
}

{
  // Builtin operator for matching list tail.
  fixities.put("...", "postfix");
  precedences.put("...", 2);
}

}

// A CRSX file is a module declaration and a list of declarations
crsx
    : decl+                     /* [CORE] */
    ;

decl
    //: moduleDecl
    : importDecl
    | sortDecl
    | ruleDecl
    | fnDecl
    ;

/*

moduleDecl
    : MODULE constructor
    ;
*/
importDecl
    : IMPORT constructor                                 /* [SUGAR: same as IMPORT MODULE] */
    | IMPORT MODULE constructor                          /* [CORE] */
    | IMPORT GRAMMAR constructor                         /* [CORE] */
    ;

sortDecl
     : ENUM constructor sortParams? (OR variant)+          /* [CORE] Variant sort declaration */
     | STRUCT constructor sortParams? (AND sortMap)+       /* [CORE] map sort definition */ 
     ;

sortParams
    : LT VARIABLE+ GT                                      /* [CORE] Formal sort parameters. */ 
    ;

/*
fixity[String c]
    : f=FIXITY p=NUMBER { addOp($c, $f.text, $p.int); }
    ;
*/

// Variant type

variant
    : constructor variantArgs?
    | VAR
    ;

variantArgs
    : LPAR sorts? RPAR
    ;

// Map type

sortMap
    : STRING COLON sort
    | sort COLON sort
    ;

/*
// Function type

fnSortParams
     : sort (COMMA sort)*                         /* [CORE] *
     ;
*/

// Sort Reference

sort
    : sortScope? paramSort
    ;

sortScope
    : LSQUARE sorts RSQUARE FNTYPE
    ;

paramSort
    : constructor sortArgs?               /* [CORE] Parameterized sort */
    | LCURLY sortMap RCURLY
    | VARIABLE
    ;

sortArgs
    : LT sorts GT                         /* [CORE] Sort arguments */
    ;
    
sorts
    : sort (COMMA sort)*                 /* [CORE] List of sort */
    ;

// Rule Declaration

ruleDecl
    : RULE constructor args? ARROW terms                            /* [CORE]  rewrite rule  */
    ;

// Function declaration, signature and optional body

fnDecl
    : FUNC fnFixity sortParams? fnParamDecls? FNTYPE sort fnBody?   /* [SUGAR]  function declaration  */
    ;

fnFixity
    : f=FIXITY p=NUMBER c=constructor { addOp($c.text, $f.text, $p.int); }
    | constructor
    ;

fnParamDecls
     : LPAR fnParams? RPAR                  /* [CORE] */
     ;

fnParams
    : fnParam (COMMA fnParam)*
    ;


fnParam
    : fnParamName? EAGER? sort
    ;

fnParamName
    : METAVAR COLON
    ;
    
fnBody
    : ARROW terms
    ;

// Term

terms
    : term[0] (COMMA term[0])*
    ;
    
term[int p]
    : aterm nterm[p]*
    ;

nterm[int p]
    : // infixl infixr infix case
      {isAnyInfix(_input.LT(1).getText(), $p)}?
      op=constructor
      term[nextp($op.text)]

      // infix case, no assoc, stop trying to match more infix operator
      {!"infix".equals(fixities.get($op.text))}?
    |
      // postfix case
      {isPostfix(_input.LT(1).getText(), $p)}?
      constructor
    ;

aterm
    // enable when crsx is capable of parsing input using the term parser, not the meta parser which does not include semantic predicates
    // : { isPrefix(_input.LT(1).getText())}? op=constructor term[nextp($op.text)]   /* [SUGAR] Prefixed term */
    : {!isPrefix(_input.LT(1).getText())}? cons                                     /* [CORE] Construction with zero or more args */
    | literal                                         /* [CORE]  Literal construction */
    | groupOrList                                     /* [SUGAR] Grouped expression */
    | variable                                        /* [CORE]  Variable */
    | map
    | metapp                                          /* [CORE]  Meta application. */
    | dispatch                                        /* [CORE]  Dispatch expression */
    | concrete                                        /* [SUGAR] Concrete syntax */
    ;

cons
    : constructor args?
    ;

metapp
    :  METAVAR apply? 
    ;

args
    : LPAR scopes? RPAR                                /* [CORE] */
    ;

scopes
    : scope (COMMA scope)*                             /* [CORE] */
    ;

scope
    : LSQUARE binders                                    /* [CORE]  Scoped term  */
    | term[0]                                        /* [CORE]  No-scoped term */
    ;

binders
    : VARIABLE<boundvar=x> binders<bound=x>
    | RSQUARE FNTYPE term[0]
    ;

apply
    : LPAR terms? RPAR
    ;

groupOrList
    : LPAR RPAR                                       /* [SUGAR] Empty list */
    | LPAR term[0] COMMA RPAR                         /* [SUGAR] Single term list */
    | LPAR term[0] (COMMA term[0])* RPAR              /* [SUGAR] Grouped term/Multiple terms list */
 // TODO: enable below when meta parser handle + properly.
 //   | LPAR term[0] RPAR                               /* [SUGAR] Grouped term */
//    | LPAR term[0] (COMMA term[0])+ RPAR              /* [SUGAR] Multiple terms list */
    ;

variable                                              /* [CORE] */
    : VARIABLE<variable>  
    ;

literal
    : STRING                                          /* [CORE] */
    | NUMBER                                          /* [CORE] */
    ;

concrete
    : CONCRETE                                        /* [CORE]   */
    ;

dispatch
    : DISPATCH LPAR terms RPAR dispatchCases                     /* [CORE]  */
    ;

dispatchCases
    : OR term[0] ARROW term[0] (COMMA dispatchCases)*            /* [CORE] */
    ;

map
    : LCURLY kvs? RCURLY
    ;

kvs
    : kv (COMMA kv)*
    ;

kv
    : METAVAR                                               /* [CORE]  property reference (match/construct)      */
    | NOT  METAVAR                                          /* [CORE]  no property references (match only)       */
    | METAVAR COLON term[0]                                 /* [CORE]  match property value / construct          */
    | VARIABLE                                              /* [CORE]  match / construct variable property       */
    | NOT VARIABLE                                          /* [CORE]  no variable (match only)                  */
    | VARIABLE COLON term[0]                                /* [CORE]  match variable property value / construct */
    | STRING                                                /* [CORE]  match / construct named property          */
    | NOT STRING                                            /* [CORE]  no named property (match only)            */
    | STRING COLON term[0]                                  /* [CORE]  match named property value / construct    */
    ;

constructor
    : CONSTRUCTOR
    | symbols                                               /* [CORE: non-reserved symbols] */
    ;

symbols                                                     /* [CORE] */
    : COLON
    | LT
    | GT
    | OR
    | AND
    ;

// Lexer rules

// Keyword as token

MODULE          : 'module';
IMPORT          : 'import';
GRAMMAR         : 'grammar';
FUNC            : 'func';
ENUM            : 'enum';
STRUCT          : 'struct';
DISPATCH        : 'dispatch';
EAGER           : 'eager';
COMMA           : ',';
LPAR            : '(';
RPAR            : ')';
LCURLY          : '{';
RCURLY          : '}';
LT              : '<';
GT              : '>';
LBRACE          : '{';
RBRACE          : '}';
LINEAR          : '¹';                                  /* [BC3]  Linear marker */
COLON           : ':';
OR              : '|';
AND             : '&';
ARROW           : '→';
VAR             : 'var';
LSQUARE         : '[';
RSQUARE         : ']';
FNTYPE          : '->';
RULE            : 'rule';
NOT             : '¬';

FIXITY          : 'infix' | 'infixr' | 'infixl' | 'postfix' | 'prefix';

CONCRETE        : Lower+ Ebnf? '\u27e6' (CONCRETE|.)*? '\u27e7';   // category⟦ ⟧

CONSTRUCTOR     : StartConstructorChar ConstructorChar* // '$' is for internal use only.
                | '<' [Other] ConstructorChar*;
VARIABLE        : Lower (Lower | Digit | '-' | '_')*;

METAVAR         : '#' (Alpha | Digit | '-' | '_' | Unicode)* Ebnf? Digit*; // '$' is for internal use only

STRING          :  '"' ('\\"'|~'"')* '"';

NUMBER          : Decimal;


fragment StartConstructorChar : Upper | Other | UnicodeS;
fragment ConstructorChar      : Alpha | Digit | Other | Unicode;

fragment Digit    : [0-9];
fragment Upper    : [A-Z];
fragment Lower    : [a-z];
fragment Alpha    : [a-zA-Z];
fragment Decimal  : '-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
fragment Other    : '-' | [$_+/|`~!@^&*=?/.:]; // TODO: >
fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);
