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
    : DATA  csortvars? CONSTRUCTOR cforms?                  /* Data sort declaration */
    | FN    csortvars? csort CONSTRUCTOR csorts?            /* Function sort declaration */
    | RULE  cterm ARROW cterm                               /* Rule declaration */
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
    | ALLOWS-VARIABLE                               /* Allow variable form */
    ;

csorts
    : LPAR csort (COMMA csort)* RPAR                /* List of sort references */
    ;

csort
    : CONSTRUCTOR csorts?                           /* Construction sort */
    | VARIABLE                                      /* Parameterized sort  */ 
    | LCURLY cmapsort (COMMA cmapsort)* RCURLY      /* Association map sort */
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
    : CONSTRUCTOR COLON csort                          /* Association map sort */
    ;
    
// -- Term

/*
 %MS: A 'cbound' is (semantically) a 'cterm'. 
     
     more convient for coding and in particular for recursive definitions
     to work with 'cterm' only.
 
     Define restrictions on cterm to be check in core semantic checker for:

     * 'RULE  cterm ARROW cterm'

       So we want to prevent rules like 
         x y . #F(x,y) → x y . #F(y,x) 

       If we want to do that, we should do it here 
        'RULE cterm ARROW cterm', so e.g., 'RULE pattern ARROW cterm'
       and not at 'cterm' level.

       There are several more conditions on the rules, which are not
       expressible with the grammar 
       (e.g., in the left hand side each meta variable 
              has only distinct bound variables as arguments) 
       and some who are 
       (e.g., the left hand side is not only a meta variable)
 
       We should discuss, which we want to encode in the grammar, if any.
               
       * 'metavarentry : METAVAR COLON cterm  
                       | VARIABLE COLON cterm
                       | STRING COLON cterm'

      * 'METAVAR LPAR cterms RPAR'
        Currently this is
          not allowed: #F(x.C(x))    
          allowed:     #F(S(x.C(x))) 
        We guess, the reason lies with second order, i.e.,
        a meta variable which takes as argument a function is not allowed.
        i.e., it is not allowed that #F is of sort '(Sort1 -> Sort2) -> Sort3' 
        
        However, this is not preventable with the grammar. If in the allowed case 
         #F(S(x.C(x))) the 'S' is actually the Idendity function, then we 
        easily rewrite to the not allowed #F(x.C(x)).   
        
        %LV: we can't rewrite, the grammar does not allow it. S cannot be the identity function. S[x.#[x]] -> x.#[x] is not a valid rule.

        %MS: but ∀ x . S[x] :: x  
                 S[#X] → #X;
        would be a perfectly fine rule, no?
        %LV: yes but the grammar will still prevent #F(x.C(x))
             anyway I think removing cbound outweight the benefit of keeping it. As you said, anyhow not all constraints can be checked by the grammar     
*/

cterm
    : CONSTRUCTOR cterms?                                       /* Constant/Construction */
    | cliteral                                                  /* Literal construction */
    | cvariable                                                 /* Variable */
    | LCURLY cmapentries RCURLY                                 /* Association map */
    | METAVAR cterms?                                           /* Meta variable/substitution */
    | VARIABLE<boundvar=x> FUNCTIONAL? DOT cterm<bound=x>       /* Bound term. 
                                                                     VARIABLE<boundvar=x> means VARIABLE is a bound variable we call x
                                                                     cterm<bound=x>       means x is bound in the context of the cterm */
    ;

cliteral
    : STRING                                                    /* String literal */
    | NUMBER                                                    /* Number literal */
    ;


cvariable
    : VARIABLE<variable> FUNCTIONAL?               /* Variable occurrence. VARIABLE<variable> means look for a bound variable that matches VARIABLE 
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

/* TODO: inline when antlr-based meta parser generator support (()*)? */
cterms
    : LPAR cterm (COMMA cterm)* RPAR                    /* Term list */
    ;

// Lexer rules

DATA            : 'data';
FN              : 'func';
RULE            : 'rule';
ALLOWS-VARIABLE : 'allows-variable';
COLON           : ':';
ARROW           : '→';
FORALL          : '∀';
LPAR            : '(';
RPAR            : ')';
LCURLY          : '}';
RCURLY          : '}';
COMMA           : ',';  
DOT             : '.';
NOT             : '¬';
/*
%MS: What does the 'ˢ' stand for? Maybe some intuition? 
%LV: semantic. Using Cynthia's terminology. FUNCTIONAL should be SEMANTIC
*/
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