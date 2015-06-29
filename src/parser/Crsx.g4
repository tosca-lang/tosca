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
    | importDeclaration                                     /* [CORE]   module import */
    | ruleDeclaration                                       /* [CORE]   rewrite rule */
    | sortDeclaration                                       /* [CORE]   type definitions */
    | directive                                             /* [BC3]    directive : meta, data term, anonymous nested modules (could be the cause of slow parsing) */
    ;

/*  Module declaration */    

// Inner module */
moduleDeclaration    
    : MODULE CONSTRUCTOR LBRACE declarations RBRACE         /* [SUGAR] */    
    ;
    
/*  Import declaration */    

importDeclaration    
    : IMPORT constructor                                   /* [SUGAR: same as IMPORT MODULE] */
    | IMPORT MODULE constructor                            /* [CORE] */    
    | IMPORT GRAMMAR constructor                           /* [CORE] */    
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
    : annotations? properties? constructor arguments?       /* [CORE]  Construction with zero or more arguments */  
    | annotations? properties? constructor term             /* [SUGAR] One argument construction (suffix operator)*/  
    | annotations? properties? literal                      /* [CORE]  Literal construction */
    | annotations? list                                     /* [SUGAR] List construction */ 
    | annotations? variable                                 /* [CORE]  Variable construction */
    | annotations? properties                               /* [CORE]  Named data structure */
    | annotations? properties? METAVAR freeArguments?       /* [CORE]  Meta variable. */
    | annotations? concrete                                 /* [SUGAR] Concrete syntax */
    | annotations? properties? expression                   /* [CORE]  Expression reducing to a term */
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
    : LPAR termList? RPAR                                   /* [SUGAR] */
    ; 
    
termList                                                    
    : term (SEMI term?)*                                    /* [CORE] */
    ;
    
variable                                                    /* [CORE] */
    : linear? VARIABLE linear? functional? varsort?
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
    
concrete
    : CATEGORY CONCRETE                                    /* [BC3]   */
    | CATEGORY CONCRETE2                                   /* [BC3]   */
    | CATEGORY CONCRETE3                                   /* [BC3]   */
    | CATEGORY CONCRETE4                                   /* [BC3]   */
    ;    
    
dispatch
    : DISPATCH dispatchTerm dispatchCases delayCase?        /* [CORE: must be top-level expression when last case is DELAY]  */ 
    ;
    
dispatchTerm
    : freeTerm                                              /* [CORE] */
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
    : LBRACE propertyList? RBRACE
    ;
    
propertyList
    : property (SEMI property?)*
    ;
    
// REVISIT: could split this up as not all properties are allowed everywhere.
// REVISIT: allow dynamic keys.
property
    : METAVAR                                               /* [CORE]  property reference (match/construct)      */
    | NOT METAVAR                                           /* [CORE]  no property references (match only)       */
    | METAVAR COLON freeTerm                                /* [CORE]  match property value / construct          */
    | VARIABLE                                              /* [CORE]  match / construct variable property       */
    | NOT VARIABLE                                          /* [CORE]  no variable (match only)                  */
    | VARIABLE COLON freeTerm                               /* [CORE]  match variable property value / construct */
    | STRING                                                /* [CORE]  match / construct named property          */
    | NOT STRING                                            /* [CORE]  no named property (match only)            */
    | STRING COLON freeTerm                                 /* [CORE]  match named property value / construct    */
    | constructor COLON freeTerm                            /* [CORE]  property sort declaration                 */
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
    : properties? // TODO: specialize...
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
    | variable                                              
    ;
    
constructor
    : qualifier CONSTRUCTOR
    | reserved                                              /* [BC3] */
    ;
    
qualifier
    : CONSTRUCTOR DOT qualifier
    |
    ;
    
reserved                                                   /* [BC3] */
    : COLON                                             
    | AT 
    ;
    
/* Directive */

directive
    : constructor directiveArguments?
    | directiveList
    | literal
    | concrete
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
IMPORT          : 'import';
DISPATCH        : 'dispatch';
DELAY           : 'delay';
GRAMMAR         : 'grammar';

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

CATEGORY        : '%' (Alpha | Digit | '_')+ ('*' | '+' | '?')?;

CONCRETE        : '\u27e6' (CONCRETE|.)*? '\u27e7';
CONCRETE2       : '⟪' (CONCRETE2|.)*?'⟫';
CONCRETE3       : '\u27EA' (CONCRETE3|.)*? '\u27EB';
CONCRETE4       : '\u2983' (CONCRETE4|.)*? '\u2984';

CONSTRUCTOR     : StartConstructorChar ConstructorChar*;

VARIABLE        : Lower (Lower | Digit | '-' | '_')*;

METAVAR         : '#' (Alpha | Digit | Other | Unicode)*;

STRING          :  '"' ('\\"'|~'"')* '"';

NUMBER          : Decimal;

fragment StartConstructorChar : Upper | Other | [\u00C0-\u00DE] | '\u0100' | '\u0102' | '\u0104' | '\u0106'; // TODO: all upper cases                 
fragment ConstructorChar      : Alpha | Digit | Other | Unicode;

fragment Digit   : [0-9];
fragment Upper   : [A-Z];                                                
fragment Lower   : [a-z];       
fragment Alpha   : [a-zA-Z];
fragment Decimal : [0-9]+ ('.' [0-9]+)? | '.' [0-9]+; 
fragment Other   : '-' | '$' | '_' | '*' | '?' | '+'; // TODO: remove '-'
fragment Unicode : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;

BLOCK_COMMENT    : '/*' .*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);
XML_COMMENT      : '<!--' .*? ('-->' | EOF) -> channel(HIDDEN);               /* [BC3] */