/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the Crsx Core grammar specification.
 *
 * Only one grammar is used throughout the compilation pipeline. However
 * restrictions apply as lowering occurs.
 *
 */
grammar Core;

ccrsx
    : cdecl (SEMI cdecl)*
    ;

cdecl
    : DATA     csortparams? csortname LPAR cforms RPAR  /* Data sort declaration */
    | FUNCTION csortparams? cform csortname             /* Function sort declaration */
    | RULE     cterm ARROW cterm                        /* Rule declaration */
    ;


cterm
    : cconstructor csargs                                /* Construction with zero or more args */
    | cliteral                                           /* Literal construction */
    | cvariable                                          /* Variable */
    | clist                                              /* association list */
    | DISPATCH cterm cdispatchCases                      /* dispatch expression */
    ;

cscope
    : cbinders                                           /* Scoped term  */
    | cterm                                              /* No-scoped term */
    ;

cbinders
    : VARIABLE<binder=x> LINEAR? FUNCTIONAL? csort? cbinders<binds=x>
    | DOT cterm
    ;

cargs
    : LSQUARE cterms? RSQUARE                             /* No scoped argument list */
    ;

csargs
    : LSQUARE cscopes? RSQUARE                            /* Scoped argument list */
    ;

cterms
    : cterm (COMMA cterm)*                                /* No Scoped term list */
    ;

cscopes
    : cscope (COMMA cscope)*                             /* Scoped term list */
    ;

cvariable
    : VARIABLE<symbol> DATAVAR LINEAR? csort?           /* Scoped variable */
    | VARIABLE<symbol> FUNCTIONVAR csort?               /* Formal parameter */
    ;

cliteral
    : STRING                                             /* String literal */
    | NUMBER                                             /* Number literal */
    ;

csort
    : COLONCOLON csortname;                              /* Sort annotation */

cdispatchCases
    : cterm (SEMI cterm)*                                /* Dispatch cases */
    ;

clist
    : LPAR term* RPAR                                    /* List of term */
    | LPAR ckv* RPAR                                     /* List of key-value pair */
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

/*  Sort declaration */

csortparams
    : FORALL cvariable+ DOT                              /* Sort parameters. */
    ;

csortset
    : LPAR csortkv* RPAR
    ;

csortkv
    : constructor COLON cterm
    ;

csortnames
    : csortname (COMMA csortname)*
    ;

csortname
    : cconstructor csortargs?                            /* Concrete sort reference */
    | cvariable                                          /* Sort variable */
    ;

csortargs
    : LSQUARE csortnames RSQUARE                         /*  */
    ;

cforms
    : (cform SEMI)*
    ;

cform
    : cconstructor csargs?
    | cvariable
    ;

cconstructor
    : CONSTRUCTOR
    | COLON
    ;

// Lexer rules

DATA            : 'data';
FUNCTION        : 'fn';
RULE            : 'rule';
DISPATCH        : 'dispatch';

COLON           : ':';
ARROW           : '→';
FORALL          : '∀';
LPAR            : '(';
RPAR            : ')';
LSQUARE         : '[';
RSQUARE         : ']';
SEMI            : ';';
COMMA           : ',';
DATASORT        : '::=';
COLONCOLON      : '::';
DOT             : '.';
NOT             : '¬';
LINEAR          : '¹';
FUNCTIONVAR     : 'ᵇ';
DATAVAR         : 'ᵇ';

CONSTRUCTOR     : StartConstructorChar ConstructorChar* Ebnf?; // '$' is for internal use only.

VARIABLE        : Lower (Lower | Digit | '-' | '_')*;

METAVAR         : '#' (Alpha | Digit | Other | Unicode)* Ebnf? Digit*; // '$' is for internal use only

STRING          :  '"' ('\\"'|~'"')* '"';

NUMBER          : Decimal;

fragment StartConstructorChar : Upper | Other | [\u00C0-\u00DE] | '\u0100' | '\u0102' | '\u0104' | '\u0106'; // TODO: all upper cases
fragment ConstructorChar      : Alpha | Digit | Other | Unicode;

fragment Digit   : [0-9];
fragment Upper   : [A-Z];
fragment Lower   : [a-z];
fragment Alpha   : [a-zA-Z];
fragment Decimal : '-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
fragment Other   : '-' | '$' | '_'; // TODO: remove '-'
fragment Unicode : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf    : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
