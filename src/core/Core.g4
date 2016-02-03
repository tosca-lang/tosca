/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the Crsx Core grammar specification.
 *
 * To avoid conflicts with the Crsx grammar,
 * every production starts with a 'c' for 'c'ore
 */

/* 
%MS: Comments are directly above the respective line and 
              start with %MS or %LV
              and ANTLR code is distinguished by: 'antlr'.
*/


/* Open:
   Map <- depends on plank to stabilize
   cform <-  MS: think through, comment
   properties for (term) variables
   As Sort, inline sort annotation for easier Code Generation
*/

grammar Core;

// -- Top-level declarations

ccrsx
    : cdecl+
    ;

/*
   note: allow only Z() to be easier machine readable and for plank compatibility
   %LV: I found a way for easy human-readable and easy machine readable. Plan compatibility is lost but only on a detail 
        Z() is not allowed. Z is allowed. ⟦ ... ##cforms*  ... ⟧ is allowed.
 */
cdecl
    : DATA  csortvars? CONSTRUCTOR cforms                   /* Data sort declaration */
    | FN    csortvars? csort CONSTRUCTOR csorts?            /* Function sort declaration */
    | RULE  cterm ARROW cterm                               /* Rule declaration */
    | IMPORT MODULE CONSTRUCTOR                             /* Import module declaration */
    | IMPORT GRAMMAR CONSTRUCTOR                            /* Import grammar declaration */
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

/*
TODO:  make change to meta parser to directly support $List(cform) with either
       - (cform (COMMA cform)*)?
       - (cform (COMMA cform)* | ) 
*/
cforms
    :  LPAR cform (COMMA cform)* RPAR                  /* List of forms */
    ;

/*
%MS: Why is there a separation between form and sort?
     Theory 1: 'LCURLY csortkv+ RCURLY' should not be allowed at root. 
               However, this is already guaranteed by the data sort declaration.
               So currently, for data declaration is
                 allowed:     DATA C1(C2({C3 : #X}))
                 not allowed: DATA C1({C3 : #X})
               Is this intended?

%MS: would 'allows-variable' indicate that at this argument position a variable could occur? So it is not actually a 'cvariable' here?
     
     But this would be a valid data declaration: 
       ∀ n l . Tree[n, l] ::= ( Branch[ n, $List [ Pair[ l, Tree[n, l]]]]; );
     so we need 'VARIABLE', no?
*/
cform
    : CONSTRUCTOR csorts?                           /* Construction form */
    | ALLOWS_VARIABLE                               /* Allow variable form */
    ;

csorts
    : LPAR csort (COMMA csort)* RPAR                /* List of sort references */
    ;

csort
    : CONSTRUCTOR csorts?                           /* Construction sort */
    | VARIABLE                                      /* Sort variable  */ 
    | LSQUARE csort RSQUARE csort                   /* Bound variable sort */ 
    | LCURLY cmapsort (COMMA cmapsort)* RCURLY      /* Association map sorts */ 
    ;
    
cmapsort
    /*
    %MS: What about the other cases in 'cmapentry'? 
         Could you give me an example sort for the cterm 'S({x})' or 'S({#X})'?
    %LV: example of sorts: 
             data SSort1 ( S({$String:$String}) )  // any string to any string
             data SSort2 ( S({Field:String}); data Field ( Field );  // Construction Field to any string
             data SSort3 ( S({Var:String}); data Var ( x );  // Variable to any string    
    %MS: I probably miss something, but in mapentry we have also cases where we there is no ':'.
         How would those get a sort? Or does this not occur?
    %LV: {#} means match, or contract using the entire map. It's not the same as the sort.
    */
    : csort COLON csort                            /* Association map sort */
    ;
    
// -- Term

cterm
    : CONSTRUCTOR cterms?                                               /* Constant/Construction */
    | cliteral                                                          /* Literal construction */
    | cvariable                                                         /* Variable */
    | LCURLY cmapentries? RCURLY                                        /* Association map */
    | METAVAR cterms?                                                   /* Meta variable/substitution */
    | LSQUARE VARIABLE<boundvar=x> RSQUARE cterm<bound=x>               /* Bound term. 
                                                                            VARIABLE<boundvar=x> means VARIABLE is a bound variable we call x
                                                                            cterm<bound=x>       means x is bound in the context of the cterm */
    ;

cliteral
    : STRING                                                    /* String literal */
    | NUMBER                                                    /* Number literal */
    ; 

cvariable
    : VARIABLE<variable>                                        /* Variable occurrence. VARIABLE<variable> means look for a bound variable that matches VARIABLE 
                                                                           in the current tracked bound variables (innermost scope first). VARIABLE is free if not found in scope.  */
    ;

cmapentries
    : cmapentry (COMMA cmapentry)*
    ;

/*
%MS: Maybe it is possible to create an example for each of these cases? 
     For intutition and to demonstrate the practical need?
*/
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

/* TODO: inline when antlr-based meta parser generator support (()*)? */
cterms
    : LPAR cterm (COMMA cterm)* RPAR                    /* Term list */
    ;

// Lexer rules

DATA            : 'data';
FN              : 'func';
RULE            : 'rule';
ALLOWS_VARIABLE : 'allows-variable';
MODULE          : 'module';
IMPORT          : 'import';
GRAMMAR         : 'grammar';
COLON           : ':';
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
fragment Other    : '-' | [$]; // not in the core: _+/|`~!@^&*=?/>.:
fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);