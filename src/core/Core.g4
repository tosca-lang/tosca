/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the TranScript Core grammar specification.
 *
 * To avoid conflicts with the TransScript grammar,
 * every production starts with a 'c' for 'c'ore
 */

grammar Core;

// -- Top-level declarations

ccrsx
    : cdecl+
    ;

cdecl
    : RULE cterm ARROW cterm                               /* Rule declaration */
    | DATA  csortvars? CONSTRUCTOR cforms                   /* Data sort declaration */
    | EXTERN? FN csortvars? csort CONSTRUCTOR csorts?       /* Function sort declaration */
    | IMPORT MODULE CONSTRUCTOR                             /* Import module declaration */
    | IMPORT GRAMMAR CONSTRUCTOR                            /* Import grammar declaration */
    ;


// -- Term

cterm
    : csortqualifier* CONSTRUCTOR cterms?                                /* Constant/Construction */
    | METAVAR cterms? csubst? csortanno?                                /* Meta variable/call/substitution */
    | cliteral                                                          /* Literal construction */
    | cvariable                                                         /* Variable */
    | LCURLY cmapentries? RCURLY                                        /* Association map */

    // KEEP AT THE 6TH ALTERNATIVE UNTIL METAPARSER GENERATOR PROPERLY HANDLE BOUNDVAR
    | LSQUARE VARIABLE<boundvar=x> csortanno? RSQUARE cterm<bound=x>    /* Bound term.
                                                                           VARIABLE<boundvar=x> means VARIABLE is a bound variable we call x
                                                                           cterm<bound=x>       means x is bound in the context of the cterm */
    | LPAR VARIABLE<boundvar=x> csortanno? RPAR cterm<bound=x>          /* Formal parameter */
    ;

/* TODO: inline when antlr-based meta parser generator support (()*)? */
cterms
    : LPAR ccommaterms  RPAR                    /* Term list */
    ;

csubst
    : LSQUARE ccommaterms RSQUARE
    ;

ccommaterms
    : cterm (COMMA cterm)*
    ;

cliteral
    : STRING                                                    /* String literal */
    | NUMBER                                                    /* Number literal */
    ;

cvariable
    : VARIABLE<variable>                 /* Variable occurrence */
                                        /* <variable> means 1. maps VARIABLE to a syntactic variable
                                              2. look for a bound variable that matches VARIABLE
                                                 in the current tracked bound variables (innermost scope first).
                                                 VARIABLE is free if not found in scope.  */
    ;

cmapentries
    : cmapentry (COMMA cmapentry)*
    ;

cmapentry
    : COLON METAVAR                                      /* property reference (match/construct)      */
    | NOT METAVAR                                        /* no property references (match only)       */
    | METAVAR COLON cterm                                /* match property value / construct          */
    | VARIABLE                                           /* match / construct variable property       */
    | NOT VARIABLE                                       /* no variable (match only)                  */
    | VARIABLE COLON cterm                               /* match variable property value / construct */
    | STRING                                             /* match / construct named property          */
    | NOT STRING                                         /* no named property (match only)            */
    | STRING COLON cterm                                 /* match named property value / construct    */
    ;


// -- Sorts

/* 'csortvars' is not inlined because
   1. to allow "##csortvars?" in direct syntax,
      i.e. %cdecl⟦ data ##csortvars? ... ⟧ is more convenient to write then
       vs. %cdecl⟦ data ∀ ##VARIABLE . ... ⟧, which is still possible
   2. to have an explicit and descriptive sort and parser category name
      e.g. 'cdecl : DATA (FORALL VARIABLE+ DOT)?'
           where '(FORALL VARIABLE+ DOT)?' as an optional group,
           is automatically transformed into an optional element: "cdecl_S1?".
*/
csortvars
    : FORALL VARIABLE+ DOT                             /* Sort variables. */
    ;

/* TODO:
   not derivable: data "∀ a . List(a) Cons(a, List(a)) | Nil"

   cdecl  →* DATA FORALL VARIABLE DOT List cforms
       i) →* DATA FORALL VARIABLE DOT List (a)
      ii) →* DATA FORALL VARIABLE DOT List (Cons(a,List(a)), Nil)
*/

/*
TODO:  make change to meta parser to directly support $List(cform) with either
       - (cform (COMMA cform)*)?
       - (cform (COMMA cform)* | )
*/
cform
    : CONSTRUCTOR csorts?                           /* Construction form */
    | ALLOWS_VARIABLE                               /* Allow variable form */
    ;

cforms
    :  LPAR cform (COMMA cform)* RPAR                  /* List of forms */
    ;

csort
    : CONSTRUCTOR csorts?                           /* Construction sort */
    | VARIABLE                                      /* Sort variable  */
    | LSQUARE csort RSQUARE csort                   /* Bound variable sort */
    | LPAR csort RPAR csort                         /* Formal parameter sort */
    | LCURLY cmapsort (COMMA cmapsort)* RCURLY      /* Association map sorts */
    | DATA csort                                    /* Data sort annotation. Indicate value is normalized */
    ;

csorts
    : LPAR csort (COMMA csort)* RPAR                /* List of sort references */
    ;

cmapsort
    : csort COLON csort                            /* Association map sort */
    ;

csortanno
    : COLON csort                                  /* Sort annotation */
    ;

csortqualifier
    : csort COLONCOLON                             /* Sort qualifier */
    ;

// Lexer rules

DATA            : 'data';
FN              : 'func';
RULE            : 'rule';
ALLOWS_VARIABLE : 'allows-variable';
MODULE          : 'module';
IMPORT          : 'import';
GRAMMAR         : 'grammar';
EXTERN          : 'extern';
COLON           : ':';
COLONCOLON      : '::';
ARROW           : '→';
FORALL          : '∀';
LPAR            : '(';
RPAR            : ')';
LCURLY          : '{';
RCURLY          : '}';
LSQUARE         : '[';
RSQUARE         : ']';
COMMA           : ',';
DOT             : '.';
NOT             : '¬';

// -- Common lexing rules with TransScript.g4.
//    Cannot extract these rules yet as the antlr meta parser generator does not support modular grammars yet

CONSTRUCTOR     : StartConstructorChar ConstructorChar* // '$' is for internal use only.
                | '<' [Other] ConstructorChar*;
VARIABLE        : Lower (Alpha | Digit | '-' | '_')*;

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
fragment Other    : '-' | [$_]; // not in the core: _+/|`~!@^&*=?/>.:
fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);
