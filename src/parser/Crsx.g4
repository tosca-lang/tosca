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
    : decls                                          /* [CORE] */
    ;   
    
decls
    : decl (SEMI decl)*
    ;
        
decl
    : moduleDecl                                     
    | importDecl
    | sortDecl    
    | termDecl                                      
    |                                                /* [SUGAR] empty declarations */
    ;
    
moduleDecl
    :  MODULE CONSTRUCTOR LBRACE decls RBRACE        /* [SUGAR]  nested modules */  
    ;
    
importDecl
    : IMPORT constructor                             /* [SUGAR: same as IMPORT MODULE] */
    | IMPORT MODULE constructor                      /* [CORE] */    
    | IMPORT GRAMMAR constructor                     /* [CORE] */
    ;
  
sortDecl
    : sortparams? sortset sortname DATASORT LPAR forms RPAR  /* [CORE] Data sort declaration */ 
    | sortparams? sortset form COLONCOLON sortname           /* [CORE] Function sort declaration */ 
    ;
  
termDecl
    : option? term contractum?                       /* [CORE]  term expression  */ 
    ;
    
option
    : constructor args? COLON                        /* [BC3]  Annotation using term-syntax */
    ;
        
annotation
    : AT constructor args?                           /* [CORE] Annotation */
    ;
        
contractum
    : ARROW term                                     /* [CORE] Rewrite rule */
    ;
       
term
    : constructor sargs?                             /* [CORE]  Construction with zero or more args */    
    | literal                                        /* [CORE]  Literal construction */
    | list                                           /* [SUGAR] List construction */ 
    | variable                                       /* [CORE]  Variable */
    | properties term                                /* [BC3]   Properties */
 //   | properties                                     /* [CORE]  Named data structure */
    | concrete                                       /* [SUGAR] Concrete syntax */
    | annotation+ term                               /* [CORE]  Annotated term */
    | METAVAR args?                                  /* [CORE]  Meta variable. */ 
    | dispatch                                       /* [CORE]  dispatch expression */ 
    ;

scope
    : binders                                        /* [CORE]  Scoped term  */ 
    | term                                           /* [CORE]  No-scoped term */
    ;
       
binders
    : annotation* VARIABLE<binder=x> LINEAR? FUNCTIONAL? varsort? binders<binds=x>
    | DOT term
    ;
               
args 
    : LSQUARE terms? RSQUARE                         /* [BC3] */  
    | LPAR terms? RPAR                               /* [CORE] */  
    ;
    
terms
    : term (COMMA term)*                             /* [CORE] */
    ;
    
sargs 
    : LSQUARE scopes? RSQUARE                        /* [BC3] */  
    | LPAR scopes? RPAR                              /* [CORE] */  
    ;
    
scopes
    : scope (COMMA scope)*                           /* [CORE] */
    ;

list                                                          
    : LPAR decls /* [BC3] should be term */ RPAR    /* [SUGAR] */
    ; 
    
variable                                            /* [CORE] */
    : VARIABLE<symbol> LINEAR? FUNCTIONAL? varsort?
    ;
    
literal
    : STRING                                        /* [CORE] */        
    | NUMBER                                        /* [CORE] */
    ;
varsort
    : COLONCOLON sortname;   
    
concrete
    : CATEGORY CONCRETE                             /* [CORE]   */
    | CATEGORY CONCRETE2                            /* [BC3]   */
    | CATEGORY CONCRETE3                            /* [BC3]   */
    | CATEGORY CONCRETE4                            /* [BC3]   */
    ;    
    
dispatch
    : DISPATCH term dispatchCases DELAY?                   /* [CORE: must be top-level expression when last case is DELAY]  */ 
    ;
    
dispatchCases
    : term (SEMI term)*                                    /* [CORE] */
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
    | METAVAR COLON term                                    /* [CORE]  match property value / construct          */
    | VARIABLE                                              /* [CORE]  match / construct variable property       */
    | NOT VARIABLE                                          /* [CORE]  no variable (match only)                  */
    | VARIABLE COLON term                                   /* [CORE]  match variable property value / construct */
    | STRING                                                /* [CORE]  match / construct named property          */
    | NOT STRING                                            /* [CORE]  no named property (match only)            */
    | STRING COLON term                                     /* [CORE]  match named property value / construct    */
    | constructor COLON term                                /* [CORE]  property sort declaration                 */
    ;
    
/*  Sort declaration */    
    
sortparams
    : FORALL variable+ DOT                                  /* [CORE] Sort parameters. */  
    ;
    
sortset
    : properties? // TODO: specialize...
    ;
    
sortnames
    : sortname (COMMA sortname)*
    ;    
    
sortname
    : constructor sortargs?                                 /* [CORE] Concrete sort reference */
    | variable                                              /* [BC3]  Sort variable */
    ;

sortargs 
    : LSQUARE sortnames? RSQUARE                            /* [CORE] */  
    ;
        
forms
    : (form SEMI)*
    ;
    
form 
    : constructor sargs?
    | variable                                              
    ;
    
constructor
    : qualifier CONSTRUCTOR
    | reserved                                              /* [BC3] */
    ;
    
qualifier
    : CONSTRUCTOR DOTDOT qualifier
    |
    ;
    
reserved                                                    /* [BC3] */
    : COLON                                             
    | AT 
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
DOTDOT          : '..'; 
NOT             : '¬';
LINEAR          : '¹';                                  /* [BC3]  Linear marker */
FUNCTIONAL      : 'ᵇ';                                  /* [CORE] Functional binder marker */ 
AND             : '&';
AT              : '@';

CATEGORY        : '%' (Alpha | Digit | '_')+ Ebnf?;

CONCRETE        : '\u27e6' (CONCRETE|.)*? '\u27e7';   // ⟦ ⟧
CONCRETE2       : '⟨' (CONCRETE2|.)*?'⟩';
CONCRETE3       : '\u27EA' (CONCRETE3|.)*? '\u27EB';  // ⟪ ⟫
CONCRETE4       : '\u2983' (CONCRETE4|.)*? '\u2984';  // ⦃ ⦄

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
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);
XML_COMMENT      : '<!--' .*? ('-->' | EOF) -> channel(HIDDEN);               /* [BC3] */