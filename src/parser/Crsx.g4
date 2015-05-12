/*
 * Copyright (c) 2015 IBM Corporation.
 *
 * This is the complete CRSX 4 grammar specification.
 * 
 * Loosely compatible with CRSX 3. Does not support all features.
 * 
 * This grammar is annotated as follows:
 * - [BC3]             : for backward compatibility with CRSX 3
 * - [CORE constraint] : part of Core CRSX (input of code generator), with optionally a comment expressing additional constraint.
 * - [INT]             : internal use only. 
 * - [SUGAR]           : pure syntactic sugar, completely eliminating early during compilation.
 */
grammar Crsx;
 
// A CRSX file is just a list of declarations
crsx      
    : declarations                                          /* [CORE] */
    ;   
    
declarations
    : declaration (SEMI declaration?)*
    ;
        
declaration 
    : moduleDeclaration                                     /* [SUGAR]  nested modules */
    | ruleDeclaration                                       /* [CORE]   rewrite rule */
    | sortDeclaration                                       /* [CORE]   type definitions */
    | directive                                             /* [BC3]    directive : meta, data term, anonymous nested modules */
    ;

/*  Module declaration */    

// Inner module */
moduleDeclaration    
    : MODULE STRING LBRACE declarations RBRACE              /* [SUGAR] */
    ;
 
/*  Rule declaration */    
    
ruleDeclaration    
    : option? pattern ARROW contractum                      /* [CORE only one rule per constructor] */
    ;
    
option
    : constructor arguments? COLON                          /* [BC3]  */
    | annotations                                           /* [CORE] */
    ;
        
pattern
    : properties? constructor arguments?                    /* [CORE pattern arguments must be all meta] */
    ;

contractum
    : freeTerm                                              /* [CORE] */
    ;
    
annotations
    : annotation+
    ;
     
annotation
    : AT constructor arguments?
    ;
    
term
    : freeTerm                                              /* [CORE]  Term without binders */
    | boundTerm                                             /* [CORE]  Term with binders */
    ;    
        
freeTerm 
    : annotations? constructor arguments?                   /* [CORE]  Construction with zero or more arguments */  
    | annotations? constructor term                         /* [SUGAR] One argument construction (suffix operator)*/  
    | annotations? literal                                  /* [CORE]  Literal construction */
    | annotations? list                                     /* [SUGAR] List construction */ 
    | annotations? variable                                 /* [CORE]  Variable construction */
    | annotations? properties term                          /* [BC3]   Properties */
    | annotations? properties                               /* [CORE]  Named data structure */
    | annotations? METAVAR freeArguments?                   /* [CORE]  Meta variable. */
    | annotations? expression                               /* [CORE]  Expression reducing to a term */
    ;
    
boundTerm
    : binder nextBinder                                     /* [CORE]  Binder */       /* TODO: binder should really be a CRSX binder when PG4 supports it. */
    ;
    
nextBinder
    : binder nextBinder                                     /* [CORE] */
    | DOT freeTerm
    ;                                               
    
arguments 
    : LSQUARE terms? RSQUARE                                /* [CORE] */  
    ;
    
terms
    : term (COMMA term)*                                    /* [CORE] */
    ;

freeArguments 
    : LSQUARE freeTerms? RSQUARE                            /* [CORE] */  
    ;
    
freeTerms
    : freeTerm (COMMA freeTerm)*                            /* [CORE] */
    ;

list   
    : LPAR termList? RPAR
    ; 
    
termList
    : term (SEMI term?)*
    ;
    
variable
    : VARIABLE linear? functional? varsort?
    ;
    
linear 
    : LINEAR
    ;
    
functional
    : FUNCTIONAL
    ;
    
literal
    : STRING                                                /* [CORE] */        
    | NUMBER                                                /* [CORE] */
    ;
    
binder
    : annotations? variable
    ;
    
varsort
    : COLONCOLON sortname;   
    
dispatch
    : DISPATCH dispatchTerm dispatchCases delayCase?        /* [CORE: must be top-level expression when last case is DELAY]  */ 
    ;
    
dispatchTerm
    : term (AND term)*                                      /* [CORE:  no conjunctive pattern. Rewritten as a single term pattern.] */
    ;
    
dispatchCases
    : dispatchCase (SEMI dispatchCase)*                     /* [CORE] */
    ;
    
dispatchCase
    : ruleDeclaration                                       /* [CORE] */
    ;
    
delayCase
    : DELAY                                                 /* [CORE] */
    ; 
    
properties
    : LBRACE propertylist? RBRACE
    ;
    
propertylist
    : property (SEMI property?)*
    ;
    
// TODO: should split this up as not all properties are allowed everywhere.
property
    : METAVAR                                               /* [CORE]  property reference (match/construct)      */
    | NOT METAVAR                                           /* [CORE]  no property references (match only)       */
    | METAVAR COLON term                                    /* [CORE]  match property value / construct          */
    | VARIABLE                                              /* [CORE]  match / construct variable property       */
    | NOT VARIABLE                                          /* [CORE]  no variable (match only)                  */
    | VARIABLE COLON term                                   /* [CORE]  match variable property value / construct */
    | STRING                                                /* [CORE]  match / construct named property          */
    | NOT STRING                                            /* [CORE]  no named property (match only)            */
    | STRING COLON term                                     /* [CORE]  match named property value / construct    */
    | constructor COLON term                                /* [CORE]  property sort declaration                 */
    ;
 
expression
    : dispatch                                              /* [CORE]  dispatch expression */
    ;
    
/*  Sort declaration */    
    
sortDeclaration
    : sortparams? sortset sortname DATASORT LPAR forms RPAR /* [CORE] Data sort declaration */ 
    | sortparams? sortset form COLONCOLON sortname          /* [CORE] Function sort declaration */ 
    ;
    
sortparams
    : FORALL variable+ DOT                                  /* [BC3] Sort parameters. Initially, CRSX 4 supports only inclusion polymorphism */  
    ;
    
sortset
    : properties?
    ;
    
sortnames
    : sortname (COMMA sortname)*
    ;    
    
sortname
    : constructor sortarguments?                            /* [CORE] Concrete sort reference */
    | variable                                              /* [BC3]  Sort variable */
    ;

sortarguments 
    : LSQUARE sortnames? RSQUARE                            /* [CORE] */  
    ;
        
forms
    : (form SEMI)*
    ;
    
form 
    : constructor arguments?
    ;
    
constructor
    : qualifier CONSTRUCTOR
    | COLON
    ;
    
qualifier
    : CONSTRUCTOR DOT qualifier
    |
    ;
    
/* Directive */

directive
    : constructor directiveArguments?
    | directiveList
    | literal
    ;
       
directiveArguments 
    : LSQUARE directives? RSQUARE                       /* [CORE] */  
    ;
    
directives
    : directive (COMMA directive)*                      /* [CORE] */
    ;
    
directiveList 
    : LPAR declarations? RPAR
    ; 
    
    
// Lexer rules

MODULE          : 'module';
DISPATCH        : 'dispatch';
DELAY           : 'delay';

COLON           : ':';
ARROW           : '→';
FORALL          : '∀';
LPAR            : '(';
RPAR            : ')';
LBRACE          : '{';
RBRACE          : '}';
LSQUARE         : '[';
RSQUARE         : ']';
SEMI            : ';';
COMMA           : ',';
DATASORT        : '::=';
COLONCOLON      : '::';
DOT             : '.';
NOT             : '¬';
LINEAR          : '¹';                                  /* [BC3]  Linear marker */
FUNCTIONAL      : 'ᵇ';                                  /* [CORE] Functional binder marker */ 
AND             : '&';
AT              : '@';


CONSTRUCTOR     : StartConstructorChar ConstructorChar*;

VARIABLE        : Lower (Lower|Digit|'-')*;

METAVAR         : '#' (Alpha | [$_] | Infix | Unicode)*;

STRING          :  '\"' ('""'|~'"')* '\"';

NUMBER          : Decimal;

fragment StartConstructorChar : Upper | [$_] | Infix | Unicode; /* [INTERNAL '$'] */
fragment ConstructorChar      : Alpha | Infix | Unicode;

fragment Digit   : [0-9];
fragment Upper   : [A-Z];                                                /* [INTERNAL '$'] */
fragment Lower   : [a-z];       
fragment Alpha   : [a-zA-Z0-9$_];
fragment Decimal : [0-9]+ ('.' [0-9]+)? | '.' [0-9]+; 
fragment Infix   : [+\-~`!*\%^|?];
fragment Unicode : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);
XML_COMMENT      : '<!--' .*? ('-->' | EOF) -> channel(HIDDEN);               /* [BC3] */
