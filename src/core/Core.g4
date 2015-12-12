/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the Crsx Core grammar specification.
 */
grammar Core;

// -- Top-level declarations

ccrsx
    : cdecl (SEMI cdecl)*
    ;

cdecl
    : DATA  csortparams? cconstructor LPAR cforms RPAR   /* Data sort declaration */
    | FN    csortparams? cconstructor LPAR csorts RPAR   /* Function sort declaration */
    | RULE  cterm ARROW cterm                            /* Rule declaration */
    ;

// -- Sorts

csortparams
    : FORALL cvariable+ DOT                              /* Sort parameters. */
    ;

cforms
    : cform (COMMA cform)*                               /* List of forms */
    ;

cform
    : cconstructor csortargs?                            /* Construction form */
    | cvariable                                          /* Allow variable form */
    ;
   
csortargs
    : LPAR csorts RPAR                                   /* Construction sort arguments */
    ;
    
csorts
    : csort (COMMA csort)*                               /* List of sort references */
    ;

csort
    : cconstructor csortargs?                            /* Construction sort */
    | cvariable                                          /* Parameterized sort  */
    | LCURLY csortkv+ RCURLY                             /* Association map sort */
    ;
        
csortkv
    : cconstructor COLON cterm                          /* Key-value sort */
    ;
    
// -- Term

cterm
    : cconstructor                                       /* Constant */
    | cconstructor LPAR cbounds RPAR                     /* Construction */
    | cliteral                                           /* Literal construction */
    | cvariable                                          /* Variable */
    | LCURLY ckv* RCURLY                                 /* association map */
    | METAVAR                                            /* Meta variable */
    | METAVAR LPAR cterms RPAR                           /* Substitution */
    ;

cbounds
    : cbound (COMMA cbound)*                             /* Bound term list */
    ;
    
cbound
    : cbinder                                            /* Bound term  */
    | cterm                                              /* Free term */
    ;

cbinder
    : VARIABLE<binder=x> csort? cbinders<binds=x>
    | DOT cterm
    ;

cliteral
    : STRING                                             /* String literal */
    | NUMBER                                             /* Number literal */
    ;

cvariable
    : VARIABLE<symbol> FUNCTIONAL? csortas?              /* Variable occurrence */
    ;

csortas
    : AS csort                                           /* Sort annotation */
    ;

ckv
    : METAVAR                                            /* property reference (match/construct)      */
    | NOT METAVAR                                        /* no property references (match only)       */
    | METAVAR COLON cterm                                /* match property value / construct          */
    | VARIABLE                                           /* match / construct variable property       */
    | NOT VARIABLE                                       /* no variable (match only)                  */
    | VARIABLE COLON cterm                               /* match variable property value / construct */
    | STRING                                             /* match / construct named property          */
    | NOT STRING                                         /* no named property (match only)            */
    | STRING COLON cterm                                 /* match named property value / construct    */
    ;

cterms
    : cterm (COMMA cterm)*                               /* Term list */
    ;
    
cconstructor
    : CONSTRUCTOR
    | COLON
    ;

// Lexer rules

DATA            : 'data';
FN              : 'fn';
RULE            : 'rule';
AS              : 'as';
COLON           : ':';
ARROW           : '→';
FORALL          : '∀';
LPAR            : '(';
RPAR            : ')';
LCURLY          : '}';
RCURLY          : '}';
SEMI            : ';';
COMMA           : ',';  
DOT             : '.';
NOT             : '¬'; 
FUNCTIONAL      : 'ˢ';    

// -- Common lexing rules with Crsx.g4.
//    Cannot extract these rules yet as the antlr meta parser generator does not support modular grammars yet 

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
fragment Other    : '-' | [$_+/|`~!@^&*=?/>.:];
fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);