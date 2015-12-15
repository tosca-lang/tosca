/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the Crsx Core grammar specification.
 *
 *
 */

/* 
%MS: I commented directly above the respective line and 
     always start with '%MS'
     When I write ANTLR code in the comments I use to distinguish 'antlr'.
     From our (GM and I) perspective we have three big questions:    
     2. intutions for the 'ckv' production 
     3. to get rid of (potential) redundancies
        * inlining, when sensible 
        * distinction between 'cform' and 'csort' --- see comment of 'cform'
%LV: my comments.
*/

/*
 %MS: What does the c- in front of every left hand side stand for?
      c-ore? Maybe explain here, so that it is easier for reader.
      Or is it even possible to drop the "c"?
*/

/* To discuss:
   
  1. I see some patterns: 
    * we have several times some kind of 'args' case (currently only once explicit: 'sortargs')
    * we have some list case 't' and 'ts: t (DELIM t)*'
   
  Maybe it is a good idea to think of a general scheme, and do it the same way everywhere?
  
  That is:
  * csortargs : LPAR (csort (COMMA csort)*)?  RPAR 
  * cformargs : LPAR (cform (COMMA cform)*)?  RPAR
  * ctermargs : LPAR (cterm (COMMA cterm)*)?  RPAR
   
  And then make them optional wherever they can occur, e.g.
  cdecl : DATA csortparams? cconstructor cformargs? 
  
  -> Do ckv and ckvsorts fit in?

  2. I am not sure, I quite understand the difference between cform and csort  --- see comment of 'cform'
  
  3. In 'cterm : LCURLY ckv* RCURLY' we have no enforced argument as opposed to 
     'csort : LCURLY csortassoc+ RCURLY'
     Is this intended?                             
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

/* 'csortparams' is not inlined because
   1. to allow "##sortparams?" in direct syntax,
      i.e. %cdecl⟦ data ##sortparams? ... ⟧ is more convenient to write then
       vs. %cdecl⟦ data ∀ ##VARIABLE . ... ⟧, which is still possible
   2. to have an explicit and descriptive sort and parser category name
      e.g. 'cdecl : DATA (FORALL VARIABLE+ DOT)?' 
           where '(FORALL VARIABLE+ DOT)?' as an optional group,
           is automatically transformed into an optional element: "cdecl_S1?". 
*/
csortparams
    : FORALL VARIABLE+ DOT                              /* Sort parameters. */
    ;

/*
%MS: Could be inlined.
%LV: Yes but better not for allowing ##cforms in patterns.
%MS: Okay, but here we don't really have the same as in 'csortparams'?
     * it is not optional 
       Remark: It should be optional, no?, e.g., "Zero[]" ) 
     * ideally i would have something like $List, Collection... of 'cform' as sort here, no?
*/
cforms
    : cform (COMMA cform)*                               /* List of forms */
    ;

/*
%MS: Why is there a separation between form and sort?
     Theory 1: 'LCURLY csortkv+ RCURLY' should not be allowed at root. 
               However, this is already guaranteed by the data sort declaration.
               So currently, for data declaration is
                 allowed:     DATA C1(C2({C3 : #X}))
                 not allowed: DATA C1({C3 : #X})
               Is this intended?
     Theory 3: 'LCURLY csortkv+ RCURLY' should not be allowed at all.
               But currently it is, so there is something wrong.
     Theory 2: There is no real difference (any more) and 
               the form-productions should be dropped.  

%LV: The separation exists because they represent different things. {} cannot occur as root. cvariable should maybe be 'allows-variable'?

%MS: @{} at root: But this is already enforced by: 'cdecl: DATA  csortparams? cconstructor LPAR cforms RPAR'
         It is already enforced here that the root is a constructor.
     
     The separation between 'cforms' and 'csorts' is actually only on the first layer of arguments for
     data sort declarations (see examples in Theory 1), because of 'cform : ... csortargs?'.
     Is this intended?

%MS: would 'allows-variable' indicate that at this argument position a variable could occur? So it is not actually a 'cvariable' here?
     
     But this would be a valid data declaration: 
       ∀ n l . Tree[n, l] ::= ( Branch[ n, $List [ Pair[ l, Tree[n, l]]]]; );
     so we need 'VARIABLE', no?
*/
cform
    : cconstructor csortargs?                            /* Construction form */
    | cvariable                                          /* Allow variable form */
    ;


/*
%MS: Could be inlined. 
*/
csortargs
    : LPAR csorts RPAR                                   /* Construction sort arguments */
    ;

/*
%MS: Could be inlined.
*/
csorts
    : csort (COMMA csort)*                               /* List of sort references */
    ;

csort
    : cconstructor csortargs?                            /* Construction sort */
    /*
    %MS: Should we maybe replace 'cvariable+' by 'VARIABLE'?
         Should a variable with 'FUNCTIONAL' annotation be possible here?
         Should a variable with 'AS sort' be possible here?
         Also: Maybe it is a good idea to separate sort variables from variables?
    */
    | cvariable                                          /* Parameterized sort  */
    /*
    %MS: There is no delimiter (compare e.g., COMMA in csorts) 
         also, as opposed to 'cterm : LCURLY ckv* RCURLY'
         here we have 'csortkv+'
    */       
    | LCURLY csortassoc+ RCURLY                             /* Association map sort */
    ;

/*
%MS: About naming:
     Maybe key-value (kv) is a too specialized name? 
     Because it can also be the whole map?
     Suggestion: "association" as in hacs core?
*/
csortassoc
    /*
    %MS: What about the other cases in 'ckv'? 
         Could you give me an example sort for the cterm 'S({x})' or 'S({#X})'?
    %LV: example of sorts: 
             data SSort1 ( S({$String:$String}) )  // any string to any string
             data SSort2 ( S({Field:String}); data Field ( Field );  // Construction Field to any string
             data SSort3 ( S({Var:String}); data Var ( x );  // Variable to any string    
    %MS: I probably miss something, but in ckv we have also cases where we there is no ':'.
         How would those get a sort? Or does this not occur?
    */
    : cconstructor COLON csort                          /* Association sort */
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
               
       * 'ckv : METAVAR COLON cterm  
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
*/

cterm
    /*
    %MS: case 'cconstructor' and 'cconstructor LPAR cbounds RPAR' 
         could be combined to simpler
         'cconstructor( LPAR cbound RPAR )?'
    %LV: for reasons stated above, it could but it's preferable not to.
    %MS: I am sorry, which ones are you referring to?
    */
    :  cconstructor                                       /* Constant */
    | cconstructor LPAR cterms RPAR                      /* Construction */
    | cliteral                                           /* Literal construction */
    | cvariable                                          /* Variable */
    /*
    %MS: There is no delimiter (compare e.g., COMMA in csorts) 
         '(ckv (COMMA ckv)* )?'
    */
    | LCURLY ckv* RCURLY                                 /* association map */
    /*
    %MS: case 'METAVAR' and 'METAVAR LPAR cterms RPAR' 
         could be combined to simpler
         'METAVAR ( LPAR cterms RPAR )?'
    */
    | METAVAR                                            /* Meta variable */
    | METAVAR LPAR cterms RPAR                           /* Substitution */
    /* VARIABLE<binder=x> is an extension to ANTLR and specifies:
       "this VARIABLE is a binder we call x"
       with
       t<binds=x> specifies:
       "x is bound in the context of the t" 
    */

    /*
    %MS: The 'csort?' of variables is new? 
         Is the sort not defined in the (function) declaration? 
    %LV: We want to encode the result of the sorter in the grammar itself. Not quite finished yet though.
    */

    /* This slightly changes the grammar that it is not "x y . t" but "x . y . t" 
       either we accept that (it makes sense) or we have to do something like this

       add production
       boundvars : VARIABLE<binder=x> csort? boundvars 
                 | VARIABLE<binder=x> csort? DOT

       and change to 
       | boundvars cterm
    */
    | VARIABLE<binder=x> csort? DOT cterm<binds=x>
    ;

cliteral
    : STRING                                             /* String literal */
    | NUMBER                                             /* Number literal */
    ;

/*
%MS: Can you give me an intution for the use of 'FUNCTIONAL' and 'csortas'?
     Is it feasible everywhere, where we have a 'cvariable'?
*/
cvariable
    /* VARIABLE<symbol> is an extension to ANTLR and specifies:
      "look for a binder that matches VARIABLE 
       in the current tracked bound variables (innermost scope first)"
    */
    : VARIABLE<symbol> FUNCTIONAL? csortas?              /* Variable occurrence */
    ;

/*
%MS: Could be inlined. 
     Should it be inlined?
*/
csortas
    : AS csort                                           /* Sort annotation */
    ;

/*
%MS: Maybe it is possible to create an example for each of these cases? 
     For intutition and to demonstrate the practical need?
*/
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

/*
%MS: Could be inlined.
*/
cterms
    : cterm (COMMA cterm)*                               /* Term list */
    ;

/*
%MS: Where is the COLON case needed?
     It seems a bit strange and allow sort and function declarations such as:
     :(#X) or F(:,:) 
     Is it possible to drop it/ put it just where it is really needed?
     And then inline the 'cconstructor'?
%LV: ':' is a value constructor. See $[:, ... ]
*/
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
