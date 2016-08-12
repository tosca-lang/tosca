/*
 * Copyright (c) 2015-2016 IBM Corporation.
 *
 * This is the complete Tosca 4 grammar specification.
 *
 * WARNING: do not change this file lightly. Several Java classes depends on it.
 *
 */
grammar TransScript;

// A Tosca program is a module declaration and a list of declarations
transscript
    : decl+
    ;

decl
    : importDecl
    | sortDecl
    | ruleDecl
    | fnDecl
    ;

importDecl
    : IMPORT qidentifier                                     /* Import module - short syntax */
    | IMPORT MODULE qidentifier                              /* Import module */
    | IMPORT GRAMMAR qidentifier                             /* Import grammar */
    ;

sortDecl
     : ENUM constructor sortParams? (OR variant)+            /* Enumeration type declaration */
     ;

sortParams
    : LT VARIABLE+ GT                                        /* Sort parameter declarations. */
    ;

// Enumeration type

variant
    : constructor variantArgs?
    | VAR
    ;

variantArgs
    : LPAR variantSorts? RPAR
    ;

variantSorts
    : variantSort (COMMA variantSort)*
    ;

// TODO: variantSort is needed to avoid conflict with sort* below. Metaparser needs to be fixed.

variantSort
    : sort
    ;

// Sort Reference

sort
    : sortScope? paramSort
    ;

sortScope
    : sortVariables? sortFormalParams? FNTYPE
    ;

sortVariables
    : LSQUARE sort* RSQUARE                                          /* Syntactic variable sorts */
    ;

sortFormalParams
    : LPAR sort* RPAR                                                /* Formal parameter sorts */
    ;

/*  Parameterized type */
paramSort
    : constructor sortArgs?
    | LCURLY sortMap (AND sortMap)* RCURLY
    | VARIABLE
    ;

sortArgs
    : LT sort* GT                                                    /* Sort arguments */
    ;

// Map type

sortMap
    : sort COLON sort
    ;

sortAnno
    : COLON sort                                                     /* Sort annotation */
    ;

sortQualifier
    : sort COLONCOLON                                                /* Sort qualifier */
    ;

// Rule Declaration

ruleDecl
    : RULE constructor args? ARROW terms                             /* Rewrite rule  */
    ;

// Function declaration, signature and optional body

// TODO: deprecate EXTERN
fnDecl
    : anno* EXTERN? FUNC constructor sortParams? fnParamDecls?
            FNTYPE sort fnBody?                                      /* Function declaration  */
    ;


anno
    : AT CONSTRUCTOR                                                 /* General purpose annotation */
    ;

fnParamDecls
     : LPAR fnParams? RPAR
     ;

fnParams
    : fnParam (COMMA fnParam)*
    ;

fnParam
    : fnParamName? eager? sort
    ;

eager
    : EAGER
    ;

fnParamName
    : METAVAR COLON
    ;

fnBody
    : ARROW terms
    ;

// Term

terms
    : term (COMMA term)*
    ;

term
    : aterm nterm
    ;

// Atom term
aterm
    : cons                                                           /* Construction with zero or more args */
    | literal                                                        /* Literal construction */
    | groupOrList                                                    /* Grouped expression or List */
    | VARIABLE<variable> sortAnno?                                   /* Variable occurrence, with optional sort */                                                       /* Variable */
    | map
    | metapp                                                         /* Meta variable/Function call/Substitution */
    | dispatch                                                       /* Dispatch expression */
    | concrete                                                       /* Concrete syntax */
    | named term                                                     /* named term */
    ;

// Next term
nterm
    : TAIL                                                           /* match/construct list tail */
    |
    ;

cons
    : qconstructor sortArgs? args? sortAnno?
    ;

metapp
    : METAVAR apply? subst? sortAnno?
    ;

args
    : LPAR scopes? RPAR
    ;

scopes
    : scope (COMMA scope)*
    ;

namedScope
    : named? scope
    ;

scope
    : LSQUARE binders                                         /* Scoped term  */
    | LPAR formalParams                                       /* Formal parameters */
    | term                                                    /* Term */
    ;

named
    : METAVAR EQ
    ;

binders
    : VARIABLE<boundvar=x> sortAnno? binders<bound=x>
    | RSQUARE FNTYPE term
    | RSQUARE LPAR formalParams
    ;

formalParams
    : VARIABLE<boundvar=x> sortAnno? formalParams<bound=x>
    | RPAR FNTYPE term
    ;

subst
    : LSQUARE terms? RSQUARE
    ;

apply
    : LPAR terms? RPAR
    ;

groupOrList
    : LPAR RPAR                                                      /* Empty list */
    | LPAR term COMMA RPAR                                           /* Single term list */
    | LPAR terms RPAR                                                /* Grouped term/Multiple terms list */
    ;

literal
    : STRING                                                         /* String literal */
    | NUMBER                                                         /* Double literal */
    ;

dispatch
    : DISPATCH LPAR terms RPAR dispatchCases                     /*   */
    ;

dispatchCases
    : OR term ARROW term (COMMA dispatchCases)*            /*  */
    ;

concrete
    : CONCRETE
    ;

map
    : LCURLY optkvs (AND optkvs)* RCURLY sortAnno?    // PG bug: (kvs?)* maps to List<kvs> instead of List<List<kvs>>
    ;

optkvs
    : kvs?
    ;

kvs
    : kv (COMMA kv)*
    ;

kv
    : METAVAR                                               /* property reference (match/construct)      */ /*DEPRECATE*/
    | NOT  METAVAR                                          /* no property references (match only)       */
    | METAVAR COLON term                                    /* match property value / construct          */
    | VARIABLE<variable>                                    /* match / construct variable property       */
    | NOT VARIABLE<variable>                                /* no variable (match only)                  */
    | VARIABLE<variable> COLON term                         /* match variable property value / construct */
    | STRING                                                /* match / construct named property          */
    | NOT STRING                                            /* no named property (match only)            */
    | STRING COLON term                                     /* match named property value / construct    */
    ;

qualifiedIdentifier
    : identifier COLONCOLON qualifiedIdentifier
    | identifier
    ;


qidentifier
    : (identifier COLONCOLON)* identifier
    ;

identifier
    : CONSTRUCTOR
    | VARIABLE
    ;

qconstructor
    : sortQualifier* constructor                            /* Qualified constructor */
    ;

constructor
    : CONSTRUCTOR
    ;


operator
    : OPERATOR
    | OR
    | AND
    | NOT
    | EQ
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
LAZY            : 'lazy';
EXTERN          : 'extern';
RULE            : 'rule';
VAR             : 'allows-variable' | 'variable';
COMMA           : ',';
LPAR            : '(';
RPAR            : ')';
LCURLY          : '{';
RCURLY          : '}';
LT              : '<';
GT              : '>';
LBRACE          : '{';
RBRACE          : '}';
COLON           : ':';
COLONCOLON      : '::';
OR              : '|';
AND             : '&';
ARROW           : '→';
LSQUARE         : '[';
RSQUARE         : ']';
FNTYPE          : '->';
NOT             : '¬';
AT              : '@';
EQ              : '=';
TAIL            : '...';

FIXITY          : 'infix' | 'infixr' | 'infixl' | 'postfix' | 'prefix';

BLOCK_COMMENT    : '/*' (BLOCK_COMMENT|.)*? ('*/' | EOF)    -> channel(HIDDEN);
LINE_COMMENT     : '//' ~[\r\n]*            -> channel(HIDDEN);

// Make sure // and /* are not operators
OPERATOR          : OpHead Operator*
                  | '/'
                  | '/' (OpCommon | '$' | '_' | ':') Operator*
                  ;

CONCRETE          : Lower (Alpha | Digit | '-' | '_')* Ebnf? '\u27e6' (CONCRETE|.)*? '\u27e7';   // category⟦ ⟧

CONSTRUCTOR       : ConsHead ConsChar*  Ebnf?;     // '$' is for internal use only.

VARIABLE          : Lower (Alpha | Digit | '-' | '_')*;

METAVAR           : '#' (Alpha | Digit | '-' | '_' | Unicode)* Ebnf? Digit*; // '$' is for internal use only

STRING            :  '"' ('\\"'|'""'|~'"')*? '"';

NUMBER            : Decimal;

fragment ConsHead : Upper | UnicodeS | '_' | '$';
fragment ConsChar : Alpha | Digit | Unicode | '_' | '-' | '$';

fragment Digit    : [0-9];
fragment Upper    : [A-Z];
fragment Lower    : [a-z];
fragment Alpha    : [a-zA-Z];
fragment Decimal  : '-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;

fragment OpHead   : OpCommon;
fragment Operator : OpCommon | '$' | '_' | '/' | ':';

fragment OpCommon : '-' | [+/|`~!@^&*=?.<]; // TODO: allow > but for now conflict with sort params. One solution is to allow >>> as infix operator only with mandatory space

fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9\u2192] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;
