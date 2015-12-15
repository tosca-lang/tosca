/*
 * [The "BSD license"]
 *  Copyright (c) 2013 Terence Parr
 *  Copyright (c) 2013 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 /* Copyright (c) 2014 IBM Corporation. */
 

/*
 * ANTLR 4 term parser
 * 
 * Input: ANTLR 4 grammar, Output: ANTLR4 grammar annotated to generate CRSX term.
 * 
 * Note: this has been hand annotated, for bootstrapping.
 */ 


/** A grammar for ANTLR v4 written in ANTLR v4.
*/
parser grammar ANTLRTerm;

options {
	tokenVocab=ANTLRTermLexer;
}

@header
{
    import org.crsx.antlr.SinkAntlrListener;
}

@parser::members
{
    protected void enterZOM()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
               if (listener instanceof SinkAntlrListener) 
                   ((SinkAntlrListener) listener).enterZOM(_ctx);
    }
    
    protected void exitZOM()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners) 
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).exitZOM(_ctx);
    }
    
    protected void enterOOM()
    {
        enterZOM();
    }
    
    protected void exitOOM()
    {
        exitZOM();
    }
    
    protected void enterOPT()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).enterOPT(_ctx);
    }
    
    protected void exitOPT()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).exitOPT(_ctx);
    }
    
    protected void enterAlt(String name)
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).enterAlt(_ctx, name);
    }
    
    protected void enterAlt()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).enterAlt(_ctx);
    }
    
    protected void exitAlt()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).exitAlt(_ctx);
    }
    
    
    protected void hide()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).hide(_ctx);
    }
}

// The main entry point for parsing a v4 grammar.
grammarSpec
	:  {enterAlt();}{enterOPT();} DOC_COMMENT? {exitOPT();}
		  grammarType id SEMI
		  {enterZOM();} prequelConstruct* {exitZOM();}
		  rules
          {enterZOM();} modeSpec* {exitZOM();} 
          {hide();} EOF  
	   {exitAlt();}
	;

grammarType
	:  {enterAlt();} grammarType_S1 {exitAlt();}
	;

grammarType_S1
    : {enterAlt("1");} LEXER GRAMMAR {exitAlt();}
    | {enterAlt("2");} PARSER GRAMMAR {exitAlt();}
    | {enterAlt("3");} GRAMMAR {exitAlt();}
    ;

// This is the list of all constructs that can be declared before
// the set of rules that compose the grammar, and is invoked 0..n
// times by the grammarPrequel rule.
prequelConstruct
	:	{enterAlt("1");} optionsSpec {exitAlt();} 
	|	{enterAlt("2");} delegateGrammars {exitAlt();}
	|	{enterAlt("3");} tokensSpec {exitAlt();}
	|	{enterAlt("4");} action {exitAlt();}
	;

// A list of options that affect analysis and/or code generation
optionsSpec
	:	{enterAlt();} OPTIONS {enterZOM();} optionsSpec_S1* {exitZOM();} RBRACE {exitAlt();} 
	;
	
optionsSpec_S1
    :  {enterAlt();} option SEMI {exitAlt();}
    ;
    
option
	:	{enterAlt();} id ASSIGN optionValue {exitAlt();}
	;

optionValue
	:	{enterAlt("1");} id optionValue1Sub1* {exitAlt();} 
	|	{enterAlt("2");} STRING_LITERAL {exitAlt();} 
	|	{enterAlt("3");} ACTION {exitAlt();} 
	|	{enterAlt("4");} INT {exitAlt();} 
	;
	
optionValue1Sub1 
    :  {enterAlt();} DOT id {exitAlt();}
    ; 

delegateGrammars
	:  {enterAlt();} IMPORT delegateGrammar delegateGrammarsSub1* SEMI {exitAlt();}
	;

delegateGrammarsSub1
    :  {enterAlt();} COMMA delegateGrammar {exitAlt();}
    ;

delegateGrammar
	:	id ASSIGN id
	|	id
	;

tokensSpec
	:	TOKENS id (COMMA id)* COMMA? RBRACE
	;

/** Match stuff like @parser::members {int i;} */
action
	:	{enterAlt();} AT {enterOPT();} action_S1? {exitOPT();} id ACTION {exitAlt();}
	;
	
action_S1
    :   {enterAlt();} actionScopeName COLONCOLON {exitAlt();}
    ;	

/** Sometimes the scope names will collide with keywords; allow them as
 *  ids for action scopes.
 */
actionScopeName
	:	{enterAlt("1");} id {exitAlt();}
	|	{enterAlt("2");} LEXER {exitAlt();}
	|	{enterAlt("3");} PARSER {exitAlt();}
	;

modeSpec
	:	MODE id SEMI lexerRule*
	;

rules
	: {enterAlt();}{enterZOM();} ruleSpec* {exitZOM();}{exitAlt();}
	;

ruleSpec
	:	{enterAlt("1");} parserRuleSpec {exitAlt();}
	|	{enterAlt("2");} lexerRule {exitAlt();}
	;

parserRuleSpec
	:	{enterAlt();}{enterOPT();} DOC_COMMENT? {exitOPT();}
        {enterOPT();} ruleModifiers? {exitOPT();} RULE_REF {enterOPT();}ARG_ACTION? {exitOPT();}
        {enterOPT();} ruleReturns? { exitOPT(); } { enterOPT(); } throwsSpec? { exitOPT(); } {enterOPT();} localsSpec? { exitOPT(); }
		{enterZOM();} rulePrequel* { exitZOM(); }
		COLON
            ruleBlock
		SEMI
		exceptionGroup {exitAlt();}
	;

exceptionGroup
	:	{enterAlt();} {enterZOM();} exceptionHandler* {exitZOM();} {enterOPT();} finallyClause? {exitOPT();} {exitAlt();}
	;

exceptionHandler
	:	CATCH ARG_ACTION ACTION
	;

finallyClause
	:	FINALLY ACTION
	;

rulePrequel
	:	optionsSpec
	|	ruleAction
	;

ruleReturns
	:	RETURNS ARG_ACTION
	;

throwsSpec
	:	THROWS id (COMMA id)*
	;

localsSpec
	:	LOCALS ARG_ACTION
	;

/** Match stuff like @init {int i;} */
ruleAction
	:	AT id ACTION
	;

ruleModifiers
	:	ruleModifier+
	;

// An individual access modifier for a rule. The 'fragment' modifier
// is an internal indication for lexer rules that they do not match
// from the input but are like subroutines for other lexer rules to
// reuse for certain lexical patterns. The other modifiers are passed
// to the code generation templates and may be ignored by the template
// if they are of no use in that language.
ruleModifier
	:	PUBLIC
	|	PRIVATE
	|	PROTECTED
	|	FRAGMENT
	;

ruleBlock
	:	{enterAlt();} ruleAltList {exitAlt();}
	;

ruleAltList
	:	{enterAlt();} labeledAlt {enterZOM();} ruleAltList_S1* {exitZOM();} {exitAlt();}
	;

ruleAltList_S1
    :   {enterAlt();} OR labeledAlt {exitAlt();}
    ;

labeledAlt
	:   {enterAlt();} alternative {enterOPT();} labeledAlt_S1? {exitOPT();} {exitAlt();}
	;

labeledAlt_S1
    :   {enterAlt();} POUND id {exitAlt();}
    ;
	
lexerRule
	:	{enterAlt();} {enterOPT();} DOC_COMMENT? {exitOPT();} {enterOPT();} FRAGMENT? {exitOPT();} 
		TOKEN_REF COLON lexerRuleBlock SEMI {exitAlt();}
	;

lexerRuleBlock
	:  {enterAlt();} lexerAltList {exitAlt();} 
	;

lexerAltList
	:  {enterAlt();} lexerAlt {enterZOM();} lexerAltList_S1* {exitZOM();} {exitAlt();} 
	;

lexerAltList_S1
    :  {enterAlt();} OR lexerAlt {exitAlt();}
    ;

lexerAlt
	:  {enterAlt("1");}	lexerElements {enterOPT();} lexerCommands? {exitOPT();} {exitAlt();}
	|  {enterAlt("2");} {exitAlt();}
	;

lexerElements
	:	{enterAlt();} {enterOOM();} lexerElement+ {exitOOM();} {exitAlt();}
	;

lexerElement
	:	{enterAlt("1");} labeledLexerElement {enterOPT();} ebnfSuffix? {exitOPT();} {exitAlt();}
	|	{enterAlt("2");} lexerAtom {enterOPT();} ebnfSuffix? {exitOPT();} {exitAlt();}
	|	{enterAlt("3");} lexerBlock {enterOPT();} ebnfSuffix? {exitOPT();} {exitAlt();}
	|	{enterAlt("4");} ACTION {enterOPT();} QUESTION? {exitOPT();} {exitAlt();} // actions only allowed at end of outer alt actually,
                         // but preds can be anywhere
	;

labeledLexerElement
	:	{enterAlt();} id labeledLexerElement_S1 labeledLexerElement_S2 {exitAlt();}
	;

labeledLexerElement_S1
    :   {enterAlt("1");} ASSIGN  {exitAlt();}
    |   {enterAlt("2");} PLUS_ASSIGN {exitAlt();}
    ;
    
labeledLexerElement_S2
    :   {enterAlt("1");} lexerAtom  {exitAlt();}
    |   {enterAlt("2");} block      {exitAlt();} 
    ; 
    
lexerBlock
	:	{enterAlt();} LPAREN lexerAltList RPAREN {exitAlt();}
	;

// E.g., channel(HIDDEN), skip, more, mode(INSIDE), push(INSIDE), pop
lexerCommands
	:	{enterAlt();} RARROW lexerCommand {enterZOM();} lexerCommands_S1* {exitZOM();} {exitAlt();}
	;

lexerCommands_S1
    :   {enterAlt();} COMMA lexerCommand {exitAlt();}
    ;

lexerCommand
	:	{enterAlt("1");} lexerCommandName LPAREN lexerCommandExpr RPAREN {exitAlt();}
	|	{enterAlt("2");} lexerCommandName {exitAlt();}
	;

lexerCommandName
	:	{enterAlt("1");} id {exitAlt();}
	|	{enterAlt("2");} MODE {exitAlt();}
	;

lexerCommandExpr
	:	{enterAlt("1");} id {exitAlt();}
	|	{enterAlt("2");} INT {exitAlt();}
	;

altList
	:	{enterAlt();} alternative {enterZOM();} altList_S1* {exitZOM();}{exitAlt();}
	;

altList_S1
    :  {enterAlt();} OR alternative  {exitAlt();}
    ;

alternative
	:  {enterAlt();}{enterOPT();} elementOptions? {exitOPT();} {enterZOM();} element* {exitZOM();} {exitAlt();}
	;

element
	:	{enterAlt("1");} labeledElement element_A1_S1 {exitAlt();} 
	|	{enterAlt("2");} atom element_A2_S1 {exitAlt();}
	|	{enterAlt("3");} ebnf {exitAlt();} 
	|	{enterAlt("4");} ACTION {enterOPT();} QUESTION? {exitOPT();}{exitAlt();} // SEMPRED is ACTION followed by QUESTION
	;
	
element_A1_S1
    :   {enterAlt("1");} ebnfSuffix {exitAlt();}
    |   {enterAlt("2");} {exitAlt();} 
    ;
    
element_A2_S1
    :   {enterAlt("1");} ebnfSuffix {exitAlt();}
    |   {enterAlt("2");} {exitAlt();} 
    ;

labeledElement
	:	{enterAlt();} id labeledElement_S1 labeledElement_S2 {exitAlt();}
	;

labeledElement_S1
    :   {enterAlt("1");} ASSIGN {exitAlt();} 
    |   {enterAlt("2");} PLUS_ASSIGN {exitAlt();}
    ;

labeledElement_S2
    :   {enterAlt("1");} atom {exitAlt();}
    |   {enterAlt("2");} block {exitAlt();}
    ;
    
ebnf:   {enterAlt();} block {enterOPT();} blockSuffix? {exitOPT();} {exitAlt();}
	;

blockSuffix
	:	{enterAlt();} ebnfSuffix {exitAlt();} // Standard EBNF
	;

ebnfSuffix
	:	{ enterAlt("1"); } QUESTION {enterOPT();} QUESTION? { exitOPT(); }{exitAlt();}
  	|	{ enterAlt("2"); } STAR { enterOPT(); } QUESTION? { exitOPT(); }{exitAlt();}
   	|	{ enterAlt("3"); } PLUS { enterOPT(); } QUESTION? { exitOPT(); }{exitAlt();}
	;

lexerAtom
	:	{ enterAlt("1"); } range {exitAlt();}
	|	{ enterAlt("2"); } terminal {exitAlt();}
	|	{ enterAlt("3"); } RULE_REF {exitAlt();}
	|	{ enterAlt("4"); } notSet {exitAlt();}
	|	{ enterAlt("5"); } LEXER_CHAR_SET {exitAlt();}
	|	{ enterAlt("6"); } DOT {enterOPT();} elementOptions? { exitOPT(); }{exitAlt();}
	;

atom
	:	{enterAlt("1");} range {exitAlt();} // Range x..y - only valid in lexers
	|	{enterAlt("2");} terminal {exitAlt();}
	|	{enterAlt("3");} ruleref {exitAlt();}
	|   {enterAlt("4");} notSet {exitAlt();}
	|	{enterAlt("5");} DOT {enterOPT();} elementOptions? {exitOPT();}{exitAlt();}
	;

notSet
	:	{enterAlt("1");} NOT setElement {exitAlt();}
	|	{enterAlt("2");} NOT blockSet {exitAlt();}
	;

blockSet
	:	{enterAlt("1");} LPAREN setElement {enterZOM();} blockSet_S1* {enterZOM();} RPAREN {exitAlt();}
	;

blockSet_S1
    :   {enterAlt();} OR setElement {exitAlt();}
    ;

setElement
	:	{enterAlt("1");} TOKEN_REF {enterOPT();} elementOptions? {exitOPT();} {exitAlt();}
	|	{enterAlt("2");} STRING_LITERAL {enterOPT();}  elementOptions? {exitOPT();} {exitAlt();}
	|	{enterAlt("3");} range {exitAlt();}
	|	{enterAlt("4");} LEXER_CHAR_SET {exitAlt();}
	;

block
	:	{enterAlt();} LPAREN
		{enterOPT();} block_S1? {exitOPT();}
		altList
		RPAREN {exitAlt();} 
	;
	
block_S1
    :   {enterAlt();}{enterOPT();} optionsSpec? {exitOPT();}{enterZOM();} ruleAction* {exitZOM();} COLON {exitAlt();}
    ;

ruleref
	:  {enterAlt();} RULE_REF {enterOPT();} ARG_ACTION? {exitOPT();}{enterOPT();} elementOptions? {exitOPT();}{exitAlt();}
	;

range
	:  {enterAlt();} STRING_LITERAL RANGE STRING_LITERAL {exitAlt();}
	;

terminal
	:  {enterAlt("1");} TOKEN_REF {enterOPT();} elementOptions? {exitOPT();}{exitAlt();}
	|  {enterAlt("2");} STRING_LITERAL {enterOPT();} elementOptions? {exitOPT();}{exitAlt();}
	;

// Terminals may be adorned with certain options when
// reference in the grammar: TOK<,,,>
elementOptions
	:	{enterAlt();} LT elementOption {enterZOM();} elementOptions_S1* {exitZOM();} GT {exitAlt();}
	;

elementOptions_S1
    :   {enterAlt();} COMMA elementOption {exitAlt();}
    ;

elementOption
	:	// This format indicates the default node option
		{enterAlt("1");} id {exitAlt();}
	|	// This format indicates option assignment 
		{enterAlt("2");} id ASSIGN elementOption_S1 {exitAlt();}
	;

elementOption_S1
    :   {enterAlt("1");} id {exitAlt();}
    |   {enterAlt("2");} STRING_LITERAL {exitAlt();}
    ;

id	:	{enterAlt("1");} RULE_REF {exitAlt();}
	|	{enterAlt("2");} TOKEN_REF {exitAlt();}
	;
