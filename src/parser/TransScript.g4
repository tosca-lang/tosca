/*
 * Copyright (c) 2015-2016 IBM Corporation.
 *
 * This is the complete TransScript 4 grammar specification.
 *
 * WARNING: do not change this file lightly. Several Java classes depends on it.
 *
 */
grammar TransScript;

// The code below is Java. It's simple enough to be ported to other languages.
@header {
import java.util.*;
}

// Operator precedence climbing.

@members {
/** Fixity for each operator operator */
Map<String, String> fixities = new HashMap<>();

/** Precedence for each operator operator */
Map<String, Integer> precedences = new HashMap<>();

/** Get the next precedence for the give operator */
public int nextp (String op) {
    String fixity = fixities.get(op);
    int p = precedences.get(op);

    if (fixity.equals("infixr"))  return p;
    if (fixity.equals("infixl"))  return p+1;
    if (fixity.equals("prefix"))  return p;
    if (fixity.equals("postfix")) return p+1;
    if (fixity.equals("infix"))   return p+1;
    return 0;
}

/** Add new symbol with given fixity and precedence */
private void addOp(String op, String fixity, Integer precedence) {
		if (fixity != null)	{
			fixities.put(op,  fixity);
			precedences.put(op, precedence);
		}
}

private boolean isPrefix(String op) {
  return "prefix".equals(fixities.get(op));
}

private boolean isAnyInfix(String op, int currentp) {
  String fixity = fixities.get(op);
  return fixity != null && fixity.startsWith("infix") && precedences.get(op) >= currentp;
}

private boolean isPostfix(String op, int currentp) {
  return "postfix".equals(fixities.get(op)) && precedences.get(op) >= currentp;
}

{
  // Builtin operator for matching list tail.
  fixities.put("...", "postfix");
  precedences.put("...", 2);
}

}

// A TransScript program is a module declaration and a list of declarations
transscript
    : decl+
    ;

decl
    //: moduleDecl
    : importDecl
    | sortDecl
    | ruleDecl
    | fnDecl
    ;

importDecl
    : IMPORT qidentifier                               /* Import module - short syntax */
    | IMPORT MODULE qidentifier                       /* Import module */
    | IMPORT GRAMMAR qidentifier                      /* Import grammar */
    ;

sortDecl
     : ENUM constructor sortParams? (OR variant)+                    /* Variant sort declaration */
     | STRUCT constructor sortParams? (AND sortMap)+                 /* Map sort declaration */
     ;

sortParams
    : LT VARIABLE+ GT                                               /* Sort parameter declarations. */
    ;

// Variant type

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

// Map type

sortMap
    : STRING COLON sort
    | sort COLON sort
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

paramSort
    : constructor sortArgs?                                          /*  Parameterized sort */
    | LCURLY sortMap RCURLY
    | VARIABLE
    ;

sortArgs
    : LT sort* GT                                                    /* Sort arguments */
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
    : anno* EXTERN? FUNC fnFixity sortParams? fnParamDecls?
            FNTYPE sort fnBody?                                    /* Function declaration  */
    ;


anno
    : AT CONSTRUCTOR                                                 /* General purpose annotation */
    ;

fnFixity
    : f=FIXITY p=NUMBER c=constructor { addOp($c.text, $f.text, $p.int); }
    | constructor
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
    : term[0] (COMMA term[0])*
    ;

term[int p]
    : aterm nterm[p]*
    ;

// Next term
nterm[int p]
    : // infixl infixr infix case
      {isAnyInfix(_input.LT(1).getText(), $p)}?
      op=operator
      term[nextp($op.text)]

      // infix case, no assoc, stop trying to match more infix operator
      {!"infix".equals(fixities.get($op.text))}?
    |
      // postfix case
      {isPostfix(_input.LT(1).getText(), $p)}?
      operator
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
    | { isPrefix(_input.LT(1).getText())}?
      op=operator term[nextp($op.text)]                              /* Prefixed term */
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

scope
    : LSQUARE binders                                                /* Scoped term  */
    | LPAR formalParams                                              /* Formal parameters */
    | term[0]                                                        /* Term */
    ;

binders
    : VARIABLE<boundvar=x> sortAnno? binders<bound=x>
    | RSQUARE FNTYPE term[0]
    | RSQUARE LPAR formalParams
    ;

formalParams
    : VARIABLE<boundvar=x> sortAnno? formalParams<bound=x>
    | RPAR FNTYPE term[0]
    ;

subst
    : LSQUARE terms? RSQUARE
    ;

apply
    : LPAR terms? RPAR
    ;

groupOrList
    : LPAR RPAR                                                      /* Empty list */
    | LPAR term[0] COMMA RPAR                                        /* Single term list */
    | LPAR terms RPAR                                                /* Grouped term/Multiple terms list */
 // TODO: enable below when meta parser handle + properly.
 //   | LPAR term[0] RPAR                                            /* Grouped term */
//    | LPAR term[0] (COMMA term[0])+ RPAR                           /* Multiple terms list */
    ;

literal
    : STRING                                                         /* String literal */
    | NUMBER                                                         /* Double literal */
    ;

dispatch
    : DISPATCH LPAR terms RPAR dispatchCases                     /*   */
    ;

dispatchCases
    : OR term[0] ARROW term[0] (COMMA dispatchCases)*            /*  */
    ;

concrete
    : CONCRETE
    ;

map
    : LCURLY kvs? RCURLY sortAnno?
    ;

kvs
    : kv (COMMA kv)*
    ;

kv
    : METAVAR                                               /* property reference (match/construct)      */
    | NOT  METAVAR                                          /* no property references (match only)       */
    | METAVAR COLON term[0]                                 /* match property value / construct          */
    | VARIABLE<variable>                                    /* match / construct variable property       */
    | NOT VARIABLE<variable>                                /* no variable (match only)                  */
    | VARIABLE<variable> COLON term[0]                      /* match variable property value / construct */
    | STRING                                                /* match / construct named property          */
    | NOT STRING                                            /* no named property (match only)            */
    | STRING COLON term[0]                                  /* match named property value / construct    */
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
VAR             : 'allows-variable';
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
fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
fragment Ebnf     : '*' | '?' | '+';

WS               : [ \t\r\n\f]+ -> channel(HIDDEN) ;
