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

/*
 * This version has been partially hand-annotated and normalized 
 * 
 * In the future this file should be automatically generated. 
 */ 


/** A grammar for ANTLR v4 written in ANTLR v4.
*/
parser grammar ANTLRMeta;

options {
	tokenVocab=ANTLRMetaLexer;
}

@parser::members
{
    public ANTLRMeta()
    {}
    
    protected Lexer newLexer(CharStream stream)
    {
        return new ANTLRMetaLexer(stream);
    }
    
    protected String _prefix()
    {
        return "ANTLR_";
    }
    
    protected void initATN()
    {
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }
    
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
    
    protected void embed()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).embed(_ctx);
    }
    
    protected void term()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).term(_ctx);
    }
    
    protected void tail()
    {
        if ( _parseListeners != null)
            for (ParseTreeListener listener : _parseListeners)
                if (listener instanceof SinkAntlrListener) 
                    ((SinkAntlrListener) listener).tail(_ctx);
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
grammarSpec_EOF
    : grammarSpec EOF
    ;

grammarSpec
	:  {enterAlt();} ({enterOPT();} DOC_COMMENT? {exitOPT();} | {term();} MT_DOC_COMMENT_OPT | {embed();} ET_DOC_COMMENT_OPT EMBED_END)
		  grammarType id SEMI
		  prequelConstruct_ZOM
		  rules
		  modeSpec_ZOM 
	   {exitAlt();}
	|  {term();} MT_GRAMMARSPEC 
	|  {embed();} ET_GRAMMARSPEC EMBED_END   
	;

prequelConstruct_ZOM_EOF
    : prequelConstruct_ZOM EOF
    ;
    
prequelConstruct_ZOM
    : {enterZOM();} prequelConstruct*  {exitZOM();} 
    | {term();} MT_PREQUELCONSTRUCT_ZOM 
    | {embed();} ET_PREQUELCONSTRUCT_ZOM EMBED_END
    ;
        
modeSpec_ZOM_EOF
    : modeSpec_ZOM EOF
    ;
    
modeSpec_ZOM
    :   {enterZOM();} modeSpec* {exitZOM();} 
    |   {term();} MT_MODESPEC_ZOM 
    |   {embed();} ET_MODESPEC_ZOM EMBED_END
    ;   
        
grammarType_EOF
    :  grammarType EOF
    ;

grammarType
	:  {enterAlt();} grammarType_S1 {exitAlt();}
	|  {term();} MT_GRAMMARTYPE
	|  {embed();} ET_GRAMMARTYPE EMBED_END  
	;

grammarType_S1_EOF 
    :   grammarType_S1 EOF
    ;
    
grammarType_S1
    : {enterAlt("1");} LEXER GRAMMAR {exitAlt();}
    | {enterAlt("2");} PARSER GRAMMAR {exitAlt();}
    | {enterAlt("3");} GRAMMAR {exitAlt();}
    | {term();} MT_GRAMMARTYPE_S1
    | {embed();} ET_GRAMMARTYPE_S1 EMBED_END  
    ;

// This is the list of all constructs that can be declared before
// the set of rules that compose the grammar, and is invoked 0..n
// times by the grammarPrequel rule.

prequelConstruct_EOF 
    :   prequelConstruct EOF
    ;

prequelConstruct
	:  {enterAlt("1");} optionsSpec {exitAlt();} 
	|  {enterAlt("2");} delegateGrammars {exitAlt();}
	|  {enterAlt("3");} tokensSpec {exitAlt();}
	|  {enterAlt("4");} action {exitAlt();}
	|  {term();}  MT_PREQUELCONSTRUCT
	|  {embed();} ET_PREQUELCONSTRUCT EMBED_END  
	;

// A list of options that affect analysis and/or code generation
optionsSpec_EOF
    : optionsSpec EOF
    ; 

optionsSpec
	:  {enterAlt();} OPTIONS {enterZOM();} optionsSpec_S1* {exitZOM();} RBRACE {exitAlt();} 
	|  {term();}  MT_OPTIONSSPEC
    |  {embed();} ET_OPTIONSSPEC EMBED_END  
	;
	
optionsSpec_S1
    :  {enterAlt();} option SEMI {exitAlt();}
    ;
    
option
	:	{enterAlt();} id ASSIGN optionValue {exitAlt();}
	;

optionValue
	:	{enterAlt("1");} id optionValue1Sub1* {exitAlt();} 
	|	{enterAlt("2");} string_literal_TOKEN {exitAlt();} 
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
	:	{enterAlt();} AT {enterOPT();} action_S1? {exitOPT();} id action_TOKEN {exitAlt();}
	;
	
action_S1
    :   {enterAlt();} actionScopeName COLONCOLON {exitAlt();}
    ;   

/** Sometimes the scope names will collide with keywords; allow them as
 *  ids for action scopes.
 */
actionScopeName
	:   {enterAlt("1");} id {exitAlt();}
    |   {enterAlt("2");} LEXER {exitAlt();}
    |   {enterAlt("3");} PARSER {exitAlt();}
    ;

modeSpec
	:	{enterAlt();} MODE id SEMI {enterZOM();} lexerRule* {exitZOM();} {exitAlt();}
	;

rules_EOF
    : rules EOF
    ;

rules
	: {enterAlt();} ruleSpec_ZOM {exitAlt();}
	| {term();}  MT_RULES
	| {embed();} ET_RULES EMBED_END
	;

ruleSpec_ZOM_EOF
    : ruleSpec_ZOM EOF
    ;
	
ruleSpec_ZOM
    : {enterZOM();} ruleSpec* ({tail();} ({term();} MT_RULESPEC_ZOM | {embed();} ET_RULESPEC_ZOM EMBED_END))? {exitZOM();} 
    | {term();} MT_RULESPEC_ZOM 
    | {embed();} ET_RULESPEC_ZOM EMBED_END
    ; 
	
ruleSpec_EOF
    : ruleSpec EOF
    ;

ruleSpec
	:  {enterAlt("1");} parserRuleSpec {exitAlt();}
	|  {enterAlt("2");} lexerRule {exitAlt();}
	|  {term();} MT_RULESPEC
	|  {embed();} ET_RULESPEC EMBED_END
	;

parserRuleSpec_EOF
    : parserRuleSpec EOF
    ;

parserRuleSpec
	:	{enterAlt();} 
	       ({enterOPT();} DOC_COMMENT? {exitOPT();} | {term();} MT_DOC_COMMENT_OPT | {embed();} ET_DOC_COMMENT_OPT EMBED_END)
           ({enterOPT();} ruleModifiers? {exitOPT();} | {term();} MT_RULEMODIFIERS_OPT | {embed();} ET_RULEMODIFIERS_OPT EMBED_END) 
           rule_ref_TOKEN 
           ({enterOPT();} ARG_ACTION? {exitOPT();} | {term();} MT_ARG_ACTION_OPT | {embed();} ET_ARG_ACTION_OPT EMBED_END)
           ({enterOPT();} ruleReturns? { exitOPT(); } | {term();} MT_RULERETURNS_OPT | {embed();} ET_RULERETURNS_OPT EMBED_END) 
           ({enterOPT();} throwsSpec? { exitOPT(); } | {term();} MT_THROWSSPEC_OPT | {embed();} ET_THROWSSPEC_OPT EMBED_END) 
           ({enterOPT();} localsSpec? { exitOPT(); } | {term();} MT_LOCALSSPEC_OPT | {embed();} ET_LOCALSSPEC_OPT EMBED_END)
		   ({enterZOM();} rulePrequel* { exitZOM(); } | {term();} MT_RULEPREQUEL_ZOM | {embed();} ET_RULEPREQUEL_ZOM EMBED_END)
		   COLON
           ruleBlock
		   SEMI
		   exceptionGroup 
		 {exitAlt();}
	|  {term();} MT_PARSERRULESPEC
    |  {embed();} ET_PARSERRULESPEC EMBED_END
	;

exceptionGroup_EOF
    : exceptionGroup EOF
    ;

exceptionGroup
	:  {enterAlt();} 
	       ({enterZOM();} exceptionHandler* {exitZOM();}  | {term();} MT_EXCEPTIONHANDLER_ZOM | {embed();} ET_EXCEPTIONHANDLER_ZOM EMBED_END)
	       ({enterOPT();} finallyClause? {exitOPT();}  | {term();} MT_FINALLYCLAUSE_OPT | {embed();} ET_FINALLYCLAUSE_OPT EMBED_END) 
	   {exitAlt();}
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

ruleBlock_EOF
    :   ruleBlock EOF
    ;

ruleBlock
	:  {enterAlt();} ruleAltList {exitAlt();}
	|  {term();} MT_RULEBLOCK
    |  {embed();} ET_RULEBLOCK EMBED_END
	;

ruleAltList_EOF
    :   ruleAltList EOF
    ;

ruleAltList
	:  {enterAlt();} labeledAlt ruleAltList_S1_ZOM {exitAlt();}
	|  {term();} MT_RULEALTLIST
    |  {embed();} ET_RULEALTLIST EMBED_END  
	;

ruleAltList_S1_ZOM_EOF
    :   ruleAltList_S1_ZOM EOF
    ;
        
ruleAltList_S1_ZOM
    : {enterZOM();} ruleAltList_S1* ({tail();} ({term();} MT_RULEALTLIST_S1_ZOM | {embed();} ET_RULEALTLIST_S1_ZOM EMBED_END))? {exitZOM();}  
    ;

ruleAltList_S1_EOF
    :   ruleAltList_S1 EOF
    ;

ruleAltList_S1
    :  {enterAlt();} OR labeledAlt {exitAlt();}
    |  {term();} MT_RULEALTLIST_S1
    |  {embed();} ET_RULEALTLIST_S1 EMBED_END  
    ;

labeledAlt_EOF
    :   labeledAlt EOF
    ;
    
labeledAlt
	:  {enterAlt();} 
	       alternative 
	       ({enterOPT();} labeledAlt_S1? {exitOPT();} | {term();} MT_LABELEDALT_S1_OPT | {embed();} ET_LABELEDALT_S1_OPT EMBED_END)
	   {exitAlt();}
	|  {term();} MT_LABELEDALT
    |  {embed();} ET_LABELEDALT EMBED_END  
	;

labeledAlt_S1_EOF
    :   labeledAlt_S1 EOF
    ;

labeledAlt_S1
    :   {enterAlt();} POUND id {exitAlt();}
    |   {term();} MT_LABELEDALT_S1
    |   {embed();} ET_LABELEDALT_S1 EMBED_END  
    ;

lexerRule_EOF
    : lexerRule EOF
    ;
	
lexerRule
	:	{enterAlt();} 
	       ({enterOPT();} DOC_COMMENT? {exitOPT();}  | {term();} MT_DOC_COMMENT_OPT | {embed();} ET_DOC_COMMENT_OPT EMBED_END)
	       ({enterOPT();} FRAGMENT? {exitOPT();} | {term();} MT_FRAGMENT_OPT | {embed();} ET_FRAGMENT_OPT EMBED_END)
		  token_ref_TOKEN COLON lexerRuleBlock SEMI 
		{exitAlt();}
    |   {term();} MT_LEXER_RULE
    |   {embed();} ET_LEXER_RULE EMBED_END  
	;

lexerRuleBlock_EOF
    : lexerRuleBlock EOF
    ;

lexerRuleBlock
	:  {enterAlt();} lexerAltList {exitAlt();} 
	|  {term();} MT_LEXER_RULE_BLOCK
    |  {embed();} ET_LEXER_RULE_BLOCK EMBED_END  
    ;
	
	
lexerAltList_EOF
    : lexerAltList EOF
    ; 

lexerAltList
	:  {enterAlt();} lexerAlt lexerAltList_S1_ZOM {exitAlt();} 
	|  {term();} MT_LEXERALTLIST
    |  {embed();} MT_LEXERALTLIST EMBED_END  
	;

lexerAltList_S1_EOF
    : lexerAltList_S1 EOF
    ;


lexerAltList_S1_ZOM_EOF
    :   lexerAltList_S1_ZOM EOF
    ;
        
lexerAltList_S1_ZOM
    : {enterZOM();} lexerAltList_S1* ({tail();} ({term();} MT_LEXERALTLIST_S1_ZOM | {embed();} ET_LEXERALTLIST_S1_ZOM EMBED_END))? {exitZOM();}
    ;


lexerAltList_S1
    :  {enterAlt();} OR lexerAlt {exitAlt();}
    |  {term();} MT_LEXERALTLIST_S1
    |  {embed();} MT_LEXERALTLIST_S1 EMBED_END 
    ;

lexerAlt_EOF
    : lexerAlt EOF
    ;
    
lexerAlt
	:  {enterAlt("1");}	lexerElements 
	       ({enterOPT();} lexerCommands? {exitOPT();} | {term();} MT_LEXERCOMMAND_OPT | {embed();} ET_LEXERCOMMAND_OPT EMBED_END)
	   {exitAlt();}
	|  {enterAlt("2");} {exitAlt();}
	|  {term();} MT_LEXERALT
    |  {embed();} MT_LEXERALT EMBED_END 
	;

lexerElements_EOF
    : lexerElements EOF
    ;

lexerElements
	:	{enterAlt();} lexerElement_OOM {exitAlt();}
	|  {term();} MT_LEXERELEMENTS
    |  {embed();} MT_LEXERELEMENTS EMBED_END 
	;
	
lexerElement_OOM_EOF
    : lexerElement_OOM EOF
    ;

lexerElement_OOM
    : {enterOOM();} lexerElement+ ({tail();} ({term();} MT_LEXERELEMENT_OOM | {embed();} ET_LEXERELEMENT_OOM EMBED_END))? {exitOOM();} 
    | {term();} MT_LEXERELEMENT_OOM
    | {embed();} ET_LEXERELEMENT_OOM EMBED_END
    ;

lexerElement_EOF
    : lexerElement EOF
    ;
    
lexerElement
	:	{enterAlt("1");} labeledLexerElement ebnfSuffix_OPT {exitAlt();}
	|	{enterAlt("2");} lexerAtom ebnfSuffix_OPT  {exitAlt();}
	|	{enterAlt("3");} lexerBlock ebnfSuffix_OPT {exitAlt();}
	|   {enterAlt("4");} action_TOKEN ({enterOPT();} QUESTION? {exitOPT();} | {term();} MT_QUESTION_OPT | {embed();} ET_QUESTION_OPT EMBED_END){exitAlt();} // actions only allowed at end of outer alt actually but preds can be anywhere
    |  {term();} MT_LEXERELEMENT
    |  {embed();} MT_LEXERELEMENT EMBED_END 
	;
	
	
labeledLexerElement_EOF
    : labeledLexerElement EOF
    ;

labeledLexerElement
	: {enterAlt();} id labeledLexerElement_S1 labeledLexerElement_S2 {exitAlt();}
	| {term();} MT_LABELEDLEXERELEMENT
    | {embed();} ET_LABELEDLEXERELEMENT EMBED_END
	;

labeledLexerElement_S1
    : {enterAlt("1");} ASSIGN  {exitAlt();}
    | {enterAlt("2");} PLUS_ASSIGN {exitAlt();}
    | {term();} MT_LABELEDLEXERELEMENT_S1
    | {embed();} ET_LABELEDLEXERELEMENT_S1 EMBED_END
    ;
    
labeledLexerElement_S2
    :   {enterAlt("1");} lexerAtom  {exitAlt();}
    |   {enterAlt("2");} lexerBlock {exitAlt();} 
    ; 
    
lexerBlock
	: {enterAlt();} LPAREN lexerAltList RPAREN {exitAlt();}
	| {term();} MT_LEXERBLOCK
    | {embed();} ET_LEXERBLOCK EMBED_END
    
	;

// E.g., channel(HIDDEN), skip, more, mode(INSIDE), push(INSIDE), pop
lexerCommands_EOF
    : lexerCommands EOF
    ;
    
lexerCommands
	:	{enterAlt();} RARROW lexerCommand 
	       ({enterZOM();} lexerCommands_S1* {exitZOM();} | {term();} MT_LEXERCOMMANDS_S1_ZOM | {embed();} ET_LEXERCOMMANDS_S1_ZOM EMBED_END) 
	    {exitAlt();}
	|  {term();} MT_LEXERCOMMANDS
    |  {embed();} MT_LEXERCOMMANDS EMBED_END 
	;

lexerCommands_S1_EOF
    : lexerCommands_S1 EOF
    ;

lexerCommands_S1
    :  {enterAlt();} COMMA lexerCommand {exitAlt();}
    |  {term();} MT_LEXERCOMMANDS_S1
    |  {embed();} MT_LEXERCOMMANDS_S1 EMBED_END 
    ;

lexerCommand_EOF
    : lexerCommand EOF
    ;
    
lexerCommand
	:  {enterAlt("1");} lexerCommandName LPAREN lexerCommandExpr RPAREN {exitAlt();}
	|  {enterAlt("2");} lexerCommandName {exitAlt();}
	|  {term();} MT_LEXERCOMMAND
    |  {embed();} MT_LEXERCOMMAND EMBED_END 
	;

lexerCommandName
	:	{enterAlt("1");} id {exitAlt();}
	|	{enterAlt("2");} MODE {exitAlt();}
	;

lexerCommandExpr
	:	{enterAlt("1");} id {exitAlt();}
	|	{enterAlt("2");} INT {exitAlt();}
	;

altList_EOF
    :   altList EOF
    ;

altList
	:  {enterAlt();} 
	       alternative 
	       altList_S1_ZOM
	   {exitAlt();}
    |  {term();} MT_ALTLIST
    |  {embed();} ET_ALTLIST EMBED_END  
	;

altList_S1_ZOM_EOF
    : altList_S1_ZOM EOF
    ;

altList_S1_ZOM
    : {enterZOM();} altList_S1* ({tail();} ({term();} MT_ALTLIST_S1_ZOM | {embed();} ET_ALTLIST_S1_ZOM EMBED_END))? {exitZOM();} 
    | {term();} MT_ALTLIST_S1_ZOM
    | {embed();} ET_ALTLIST_S1_ZOM EMBED_END  
    ;


altList_S1_EOF
    :   altList_S1 EOF
    ;

altList_S1
    :  {enterAlt();} OR alternative  {exitAlt();}
    |  {term();} MT_ALTLIST_S1
    |  {embed();} ET_ALTLIST_S1 EMBED_END
    ;

alternative_EOF
    :   alternative EOF
    ;

alternative
	:  {enterAlt();}
	       ({enterOPT();} elementOptions? {exitOPT();} | {term();} MT_ELEMENTOPTIONS_OPT | {embed();} ET_ELEMENTOPTIONS_OPT EMBED_END)
	       element_ZOM
	   {exitAlt();}
	|  {term();} MT_ALTERNATIVE
    |  {embed();} ET_ALTERNATIVE EMBED_END
	;
	
element_ZOM_EOF
    : element_ZOM EOF
    ;

element_ZOM
    : {enterZOM();} element* ({tail();} ({term();} MT_ELEMENT_ZOM | {embed();} ET_ELEMENT_ZOM EMBED_END))? {exitZOM();} 
    | {term();} MT_ELEMENT_ZOM
    | {embed();} ET_ELEMENT_ZOM EMBED_END
	;

element_EOF
    :   element EOF
    ;

element
	:	{enterAlt("1");} labeledElement element_A1_S1 {exitAlt();} 
	|	{enterAlt("2");} atom element_A2_S1 {exitAlt();}
	|	{enterAlt("3");} ebnf {exitAlt();} 
	|	{enterAlt("4");} action_TOKEN ({enterOPT();} QUESTION? {exitOPT();} | {term();} MT_QUESTION_OPT | {embed();} ET_QUESTION_OPT EMBED_END){exitAlt();} // SEMPRED is ACTION followed by QUESTION
	|   {term();} MT_ELEMENT
    |   {embed();} ET_ELEMENT EMBED_END
	;
	
element_A1_S1_EOF
    : element_A1_S1 EOF
    ;	
	
element_A1_S1
    :   {enterAlt("1");} ebnfSuffix {exitAlt();}
    |   {enterAlt("2");} {exitAlt();} 
    |   {term();} MT_ELEMENT_A1_S1
    |   {embed();} ET_ELEMENT_A1_S1 EMBED_END
    ;

element_A2_S1_EOF
    :   element_A2_S1 EOF
    ;

element_A2_S1
    :   {enterAlt("1");} ebnfSuffix {exitAlt();}
    |   {enterAlt("2");} {exitAlt();} 
    |   {term();} MT_ELEMENT_A2_S1
    |   {embed();} ET_ELEMENT_A2_S1 EMBED_END
    ;

labeledElement_EOF
    : labeledElement EOF
    ;

labeledElement
	:	{enterAlt();} id labeledElement_S1 labeledElement_S2 {exitAlt();}
	|   {term();} MT_LABELEDELEMENT
    |   {embed();} ET_LABELEDELEMENT EMBED_END
	;

labeledElement_S1_EOF
    :   labeledElement_S1 EOF
    ;
    
labeledElement_S1
    :   {enterAlt("1");} ASSIGN {exitAlt();} 
    |   {enterAlt("2");} PLUS_ASSIGN {exitAlt();}
    |   {term();} MT_LABELEDELEMENT_S1
    |   {embed();} ET_LABELEDELEMENT_S1 EMBED_END
    ;

labeledElement_S2_EOF
    :   labeledElement_S2 EOF
    ;

labeledElement_S2
    :   {enterAlt("1");} atom {exitAlt();}
    |   {enterAlt("2");} block {exitAlt();}
    |   {term();} MT_LABELEDELEMENT_S2
    |   {embed();} ET_LABELEDELEMENT_S2 EMBED_END
    ;
    
ebnf_EOF
    :   ebnf EOF
    ;
    
ebnf:   {enterAlt();} block 
            ({enterOPT();} blockSuffix? {exitOPT();} | {term();} MT_BLOCKSUFFIX_OPT | {embed();} ET_BLOCKSUFFIX_OPT EMBED_END)
        {exitAlt();}
	;
	
blockSuffix_EOF
    : blockSuffix EOF
    ;

blockSuffix
	:	{enterAlt();} ebnfSuffix {exitAlt();} // Standard EBNF
	|   {term();} MT_BLOCKSUFFIX
    |   {embed();} ET_BLOCKSUFFIX EMBED_END
	;


ebnfSuffix_OPT_EOF
    : ebnfSuffix_OPT EOF
    ;

ebnfSuffix_OPT
    : {enterOPT();} ebnfSuffix? ({tail();} ({term();} MT_EBNFSUFFIX_OPT | {embed();} ET_EBNFSUFFIX_OPT EMBED_END))? {exitZOM();} 
    | {term();} MT_EBNFSUFFIX_OPT
    | {embed();} ET_EBNFSUFFIX_OPT EMBED_END  
    ;

ebnfSuffix_EOF
    : ebnfSuffix EOF
    ;
    
ebnfSuffix
	:	{ enterAlt("1"); } QUESTION ({enterOPT();} QUESTION? { exitOPT(); }| {term();} MT_QUESTION_OPT | {embed();} ET_QUESTION_OPT EMBED_END){exitAlt();}
  	|	{ enterAlt("2"); } STAR ({ enterOPT(); } QUESTION? { exitOPT(); }| {term();} MT_QUESTION_OPT | {embed();} ET_QUESTION_OPT EMBED_END){exitAlt();}
   	|	{ enterAlt("3"); } PLUS ({ enterOPT(); } QUESTION? { exitOPT(); }| {term();} MT_QUESTION_OPT | {embed();} ET_QUESTION_OPT EMBED_END){exitAlt();}
   	|   {term();} MT_EBNFSUFFIX
    |   {embed();} ET_EBNFSUFFIX EMBED_END
	;

lexerAtom_EOF
    : lexerAtom EOF
    ;
    
lexerAtom
	:	{ enterAlt("1"); } range {exitAlt();}
	|	{ enterAlt("2"); } terminal {exitAlt();}
	|	{ enterAlt("3"); } ruleref {exitAlt();}
	|	{ enterAlt("4"); } notSet {exitAlt();}
	|	{ enterAlt("5"); } lexer_char_set_TOKEN {exitAlt();}
	|	{ enterAlt("6"); } DOT elementOptions_OPT {exitAlt();}
	|   {term();} MT_LEXERATOM
    |   {embed();} ET_LEXERATOM EMBED_END
    ;

elementOptions_OPT
    : {enterOPT();} elementOptions? 
    (
        {tail();}

        (
            {term();}

            MT_ELEMENTOPTIONS_OPT
            |
            {embed();}

            ET_ELEMENTOPTIONS_OPT EMBED_END
        )
    )?
    {exitOPT();}

    {}

    |
    {term();}

    MT_ELEMENTOPTIONS_OPT
    |
    {embed();}

    ET_ELEMENTOPTIONS_OPT EMBED_END
    ;

atom_EOF 
    :   atom EOF
    ;
    
atom
	:	{enterAlt("1");} range {exitAlt();} // Range x..y - only valid in lexers
	|	{enterAlt("2");} terminal {exitAlt();}
	|	{enterAlt("3");} ruleref {exitAlt();}
	|   {enterAlt("4");} notSet {exitAlt();}
	|	{enterAlt("5");} DOT elementOptions_OPT {exitAlt();}
	|   {term();} MT_ATOM
    |   {embed();} ET_ATOM EMBED_END
	;

notSet
	:	{enterAlt("1");} NOT setElement {exitAlt();}
	|	{enterAlt("2");} NOT blockSet {exitAlt();}
	|   {term();} MT_NOTSET
    |   {embed();} ET_NOTSET EMBED_END
	;

blockSet
	:	{enterAlt("1");} LPAREN setElement {enterZOM();} blockSet_S1* {enterZOM();} RPAREN {exitAlt();}
	;

blockSet_S1
    :   {enterAlt();} OR setElement {exitAlt();}
    ;

setElement
	:	{enterAlt("1");} TOKEN_REF elementOptions_OPT {exitAlt();}
	|	{enterAlt("2");} STRING_LITERAL elementOptions_OPT {exitAlt();}
	|	{enterAlt("3");} range {exitAlt();}
	|	{enterAlt("4");} LEXER_CHAR_SET {exitAlt();}
	;

block_EOF
    : block EOF
    ;


block
	:	{enterAlt();} LPAREN
		block_S1_OPT
		altList
		RPAREN {exitAlt();} 
	|   {term();} MT_BLOCK
    |   {embed();} ET_BLOCK EMBED_END
	;
	
block_S1_OPT
    : {enterOPT();} block_S1? 
    (
        {tail();}

        (
            {term();}

            MT_BLOCK_S1_OPT
            |
            {embed();}

            ET_BLOCK_S1_OPT EMBED_END
        )
    )?
    {exitOPT();}

    {}

    |
    {term();}

    MT_BLOCK_S1_OPT
    |
    {embed();}    ET_BLOCK_S1_OPT EMBED_END
    ;
	
block_S1
    :   {enterAlt();}{enterOPT();} optionsSpec? {exitOPT();}{enterZOM();} ruleAction* {exitZOM();} COLON {exitAlt();}
    ;

ruleref_EOF
    : ruleref EOF
    ;
    
ruleref
	:  {enterAlt();} rule_ref_TOKEN 
	       arg_action_OPT elementOptions_OPT {exitAlt();}
	|   {term();} MT_RULEREF
    |   {embed();} ET_RULEREF EMBED_END
	;
	
	
lexer_char_set_TOKEN
    : LEXER_CHAR_SET 
    | {term();} MT_LEXER_CHAR_SET
    | {embed();} ET_LEXER_CHAR_SET EMBED_END
    ;
	
arg_action_OPT
    : {enterOPT();} ARG_ACTION? 
    (
        {tail();}

        (
            {term();}

            MT_ARG_ACTION_OPT
            |
            {embed();}

            ET_ARG_ACTION_OPT EMBED_END
        )
    )?
    {exitOPT();}

    {}

    |
    {term();}

    MT_ARG_ACTION_OPT
    |
    {embed();}

    ET_ARG_ACTION_OPT EMBED_END
    ;

range
	:  {enterAlt();} STRING_LITERAL RANGE STRING_LITERAL {exitAlt();}
	|  {term();} MT_RANGE
    |  {embed();} ET_RANGE EMBED_END
    ;

terminal
	:  {enterAlt("1");} token_ref_TOKEN elementOptions_OPT {exitAlt();}
	|  {enterAlt("2");} string_literal_TOKEN elementOptions_OPT {exitAlt();}
	;

// Terminals may be adorned with certain options when
// reference in the grammar: TOK<,,,>
elementOptions_EOF
    : elementOptions EOF;

elementOptions
	:	{enterAlt();} LT elementOption elementOptions_S1_ZOM GT {exitAlt();}
	| {term();} MT_ELEMENTOPTIONS
    | {embed();} ET_ELEMENTOPTIONS EMBED_END  
	;

elementOptions_S1_ZOM_EOF
    : elementOptions_S1_ZOM EOF
    ;

elementOptions_S1_ZOM
    : {enterZOM();} elementOptions_S1* ({tail();} ({term();} MT_ELEMENTOPTIONS_S1_ZOM | {embed();} ET_ELEMENTOPTIONS_S1_ZOM EMBED_END))? {exitZOM();} 
    | {term();} MT_ELEMENTOPTIONS_S1_ZOM
    | {embed();} ET_ELEMENTOPTIONS_S1_ZOM EMBED_END  
    ;


elementOptions_S1
    : {enterAlt();} COMMA elementOption {exitAlt();}
    | {term();} MT_ELEMENTOPTIONS_S1
    | {embed();} ET_ELEMENTOPTIONS_S1 EMBED_END  
    ;

elementOption_EOF
    : elementOption EOF;

elementOption
	:	// This format indicates the default node option
		{enterAlt("1");} id {exitAlt();}
	|	// This format indicates option assignment 
		{enterAlt("2");} id ASSIGN elementOption_S1 {exitAlt();}
    | {term();} MT_ELEMENTOPTION
    | {embed();} ET_ELEMENTOPTION EMBED_END  
	;

elementOption_S1_EOF
    : elementOption_S1 EOF;

elementOption_S1
    :   {enterAlt("1");} id {exitAlt();}
    |   {enterAlt("2");} string_literal_TOKEN {exitAlt();}
    | {term();} MT_ELEMENTOPTION_S1
    | {embed();} ET_ELEMENTOPTION_S1 EMBED_END 
    ;

id_EOF
    : id EOF
    ;

id	:	{enterAlt("1");} rule_ref_TOKEN {exitAlt();}
	|	{enterAlt("2");} token_ref_TOKEN {exitAlt();}
	|   {term();} MT_ID
	|   {embed();} ET_ID EMBED_END
	;
	
rule_ref_TOKEN
    : RULE_REF | {term();} MT_RULE_REF | {embed();} ET_RULE_REF EMBED_END
    ;
    
    
token_ref_TOKEN
    : (TOKEN_REF | {term();} MT_TOKEN_REF | {embed();} ET_TOKEN_REF EMBED_END)
    ;
    
string_literal_TOKEN
    : STRING_LITERAL 
    | {term();} MT_STRING_LITERAL 
    | {embed();} ET_STRING_LITERAL EMBED_END
    ;
    
action_TOKEN
    :   ACTION 
    | {term();} MT_ACTION 
    | {embed();} ET_ACTION EMBED_END
    ;
    
    
arg_action_TOKEN
    :  ARG_ACTION 
    | {term();} MT_ARG_ACTION 
    | {embed();} ET_ARG_ACTION EMBED_END
    ;
    
    