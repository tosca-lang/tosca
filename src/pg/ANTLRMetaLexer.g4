/*
ELEMENTOPTIONS * [The "BSD license"]
 *  Copyright (c) 2014 Terence Parr
 *  Copyright (c) 2014 Sam Harwell
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

/** A grammar for ANTLR v4 tokens */
lexer grammar ANTLRMetaLexer;

tokens {
	TOKEN_REF,
	RULE_REF,
	LEXER_CHAR_SET 
}

@members {
	/** Track whether we are inside of a rule and whether it is lexical parser.
	 *  _currentRuleType==Token.INVALID_TYPE means that we are outside of a rule.
	 *  At the first sign of a rule name reference and _currentRuleType==invalid,
	 *  we can assume that we are starting a parser rule. Similarly, seeing
	 *  a token reference when not already in rule means starting a token
	 *  rule. The terminating ';' of a rule, flips this back to invalid type.
	 *
	 *  This is not perfect logic but works. For example, "grammar T;" means
	 *  that we start and stop a lexical rule for the "T;". Dangerous but works.
	 *
	 *  The whole point of this state information is to distinguish
	 *  between [..arg actions..] and [charsets]. Char sets can only occur in
	 *  lexical rules and arg actions cannot occur.
	 */
	private int _currentRuleType = Token.INVALID_TYPE;

	public int getCurrentRuleType() {
		return _currentRuleType;
	}

	public void setCurrentRuleType(int ruleType) {
		this._currentRuleType = ruleType;
	}

	protected void handleBeginArgAction() {
		if (inLexerRule()) {
			pushMode(LexerCharSet);
			more();
		}
		else {
			pushMode(ArgAction);
			more();
		}
	}

	@Override
	public Token emit() {
		if (_type == ID) {
			String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
			if (Character.isUpperCase(firstChar.charAt(0))) {
				_type = TOKEN_REF;
			} else {
				_type = RULE_REF;
			}

			if (_currentRuleType == Token.INVALID_TYPE) { // if outside of rule def
				_currentRuleType = _type;                 // set to inside lexer or parser rule
			}
		}
		else if (_type == SEMI) {                  // exit rule def
			_currentRuleType = Token.INVALID_TYPE;
		}

		return super.emit();
	}

	private boolean inLexerRule() {
		return _currentRuleType == TOKEN_REF;
	}
	private boolean inParserRule() { // not used, but added for clarity
		return _currentRuleType == RULE_REF;
	}
}

// Configurable
fragment META_CHAR    : '#';
fragment START_EMBED_CHAR : '⟨';
fragment END_EMBED_CHAR : '⟩';

MT_GRAMMARSPEC          : META_CHAR 'grammarSpec' [0-9]*;
ET_GRAMMARSPEC          : START_EMBED_CHAR 'grammarSpec:'           -> pushMode(Embed);
    
MT_DOC_COMMENT_OPT      : META_CHAR 'DOC_COMMENT?' [0-9]*;
ET_DOC_COMMENT_OPT      : START_EMBED_CHAR 'DOC_COMMENT:'           -> pushMode(Embed);
    
MT_GRAMMARTYPE          : META_CHAR 'grammarType' [0-9]*;
ET_GRAMMARTYPE          : START_EMBED_CHAR 'grammarType:'           -> pushMode(Embed);
    
MT_GRAMMARTYPE_S1       : META_CHAR 'grammarType_S1' [0-9]*;
ET_GRAMMARTYPE_S1       : START_EMBED_CHAR 'grammarType_S1:'        -> pushMode(Embed);
    
MT_PREQUELCONSTRUCT_ZOM : META_CHAR 'prequelConstruct*' [0-9]*;
ET_PREQUELCONSTRUCT_ZOM : START_EMBED_CHAR 'prequelConstruct*:'     -> pushMode(Embed);

MT_PREQUELCONSTRUCT     : META_CHAR 'prequelConstruct' [0-9]*;
ET_PREQUELCONSTRUCT     : START_EMBED_CHAR 'prequelConstruct:'      -> pushMode(Embed);

MT_OPTIONSSPEC          : META_CHAR 'optionsSpec' [0-9]*;
ET_OPTIONSSPEC          : START_EMBED_CHAR 'optionsSpec:'           -> pushMode(Embed);

MT_MODESPEC_ZOM         : META_CHAR 'modeSpec*' [0-9]*;
ET_MODESPEC_ZOM         : START_EMBED_CHAR 'modeSpec*:'             -> pushMode(Embed);

MT_ID                   : META_CHAR 'id' [0-9]*;
ET_ID                   : START_EMBED_CHAR 'id:'                   -> pushMode(Embed);

MT_RULE_REF             : META_CHAR 'RULE_REF' [0-9]*;
ET_RULE_REF             : START_EMBED_CHAR 'RULE_REF:'             -> pushMode(Embed);

MT_TOKEN_REF            : META_CHAR 'TOKEN_REF' [0-9]*;
ET_TOKEN_REF            : START_EMBED_CHAR 'TOKEN_REF:'            -> pushMode(Embed);
       
MT_RULES                : META_CHAR 'rules' [0-9]*;
ET_RULES                : START_EMBED_CHAR 'rules:'                 -> pushMode(Embed);
    
MT_RULESPEC_ZOM         : META_CHAR 'ruleSpec*' [0-9]*;
ET_RULESPEC_ZOM         : START_EMBED_CHAR 'ruleSpec*:'             -> pushMode(Embed);
    
MT_RULESPEC             : META_CHAR 'ruleSpec' [0-9]*;
ET_RULESPEC             : START_EMBED_CHAR 'ruleSpec:'              -> pushMode(Embed);
    
MT_RULEMODIFIERS_OPT    : META_CHAR 'ruleModifiers?' [0-9]*;
ET_RULEMODIFIERS_OPT    : START_EMBED_CHAR 'ruleModifiers?:'        -> pushMode(Embed);

MT_ARG_ACTION_OPT       : META_CHAR 'ARG_ACTION?' [0-9]*;
ET_ARG_ACTION_OPT       : START_EMBED_CHAR 'ARG_ACTION?:'           -> pushMode(Embed);

MT_ARG_ACTION           : META_CHAR 'ARG_ACTION' [0-9]*;
ET_ARG_ACTION           : START_EMBED_CHAR 'ARG_ACTION:'           -> pushMode(Embed);

MT_RULERETURNS_OPT      : META_CHAR 'ruleReturns?' [0-9]*;
ET_RULERETURNS_OPT      : START_EMBED_CHAR 'ruleReturns?:'          -> pushMode(Embed);

MT_THROWSSPEC_OPT       : META_CHAR 'throwsSpec?' [0-9]*;
ET_THROWSSPEC_OPT       : START_EMBED_CHAR 'throwsSpec?:'           -> pushMode(Embed);

MT_LOCALSSPEC_OPT       : META_CHAR 'localsSpec?' [0-9]*;
ET_LOCALSSPEC_OPT       : START_EMBED_CHAR 'localsSpec?:'           -> pushMode(Embed);

MT_RULEPREQUEL_ZOM      : META_CHAR 'rulePrequel*' [0-9]*;
ET_RULEPREQUEL_ZOM      : START_EMBED_CHAR 'rulePrequel*:'          -> pushMode(Embed);

MT_PARSERRULESPEC       : META_CHAR 'parserRuleSpec' [0-9]*;
ET_PARSERRULESPEC       : START_EMBED_CHAR 'parserRuleSpec:'        -> pushMode(Embed);

MT_EXCEPTIONHANDLER_ZOM : META_CHAR 'exceptionHandler*' [0-9]*;
ET_EXCEPTIONHANDLER_ZOM : START_EMBED_CHAR 'exceptionHandler*:'     -> pushMode(Embed);

MT_FINALLYCLAUSE_OPT    : META_CHAR 'finallyClause?' [0-9]*;
ET_FINALLYCLAUSE_OPT    : START_EMBED_CHAR 'finallyClause?:'        -> pushMode(Embed);

MT_RULEBLOCK            : META_CHAR 'ruleBlock' [0-9]*;
ET_RULEBLOCK            : START_EMBED_CHAR 'ruleBlock:'             -> pushMode(Embed);

MT_RULEALTLIST_S1_ZOM   : META_CHAR 'ruleAltList_S1*' [0-9]*;
ET_RULEALTLIST_S1_ZOM   : START_EMBED_CHAR 'ruleAltList_S1*:'       -> pushMode(Embed);

MT_RULEALTLIST          : META_CHAR 'ruleAltList' [0-9]*;
ET_RULEALTLIST          : START_EMBED_CHAR 'ruleAltList:'           -> pushMode(Embed);

MT_RULEALTLIST_S1       : META_CHAR 'ruleAltList_S1' [0-9]*;
ET_RULEALTLIST_S1       : START_EMBED_CHAR 'ruleAltList_S1:'        -> pushMode(Embed);

MT_LABELEDALT_S1_OPT    : META_CHAR 'labeledAlt_S1?' [0-9]*;
ET_LABELEDALT_S1_OPT    : START_EMBED_CHAR 'labeledAlt_S1?:'        -> pushMode(Embed);

MT_LABELEDALT           : META_CHAR 'labeledAlt' [0-9]*;
ET_LABELEDALT           : START_EMBED_CHAR 'labeledAlt:'            -> pushMode(Embed);

MT_LABELEDALT_S1        : META_CHAR 'labeledAlt_S1' [0-9]*;
ET_LABELEDALT_S1        : START_EMBED_CHAR 'labeledAlt_S1:'         -> pushMode(Embed);

MT_ALTLIST_S1_ZOM       : META_CHAR 'altList_S1*' [0-9]*;
ET_ALTLIST_S1_ZOM       : START_EMBED_CHAR 'altList_S1*:'           -> pushMode(Embed);

MT_ALTLIST              : META_CHAR 'altList' [0-9]*;
ET_ALTLIST              : START_EMBED_CHAR 'altList:'               -> pushMode(Embed);

MT_ALTLIST_S1           : META_CHAR 'altList_S1' [0-9]*;
ET_ALTLIST_S1           : START_EMBED_CHAR 'altList_S1:'            -> pushMode(Embed);

MT_ELEMENTOPTIONS_OPT   : META_CHAR 'elementOptions?' [0-9]*;
ET_ELEMENTOPTIONS_OPT   : START_EMBED_CHAR 'elementOptions?:'       -> pushMode(Embed);

MT_ELEMENTOPTIONS_S1   : META_CHAR 'elementOptions_S1' [0-9]*;
ET_ELEMENTOPTIONS_S1  : START_EMBED_CHAR 'elementOptions_S1:'       -> pushMode(Embed);

MT_ELEMENTOPTION_S1   : META_CHAR 'elementOption_S1' [0-9]*;
ET_ELEMENTOPTION_S1  : START_EMBED_CHAR 'elementOption_S1:'       -> pushMode(Embed);

MT_ELEMENTOPTIONS_S1_ZOM   : META_CHAR 'elementOptions_S1*' [0-9]*;
ET_ELEMENTOPTIONS_S1_ZOM  : START_EMBED_CHAR 'elementOptions_S1*:'       -> pushMode(Embed);

MT_ELEMENTOPTIONS   : META_CHAR 'elementOptions' [0-9]*;
ET_ELEMENTOPTIONS  : START_EMBED_CHAR 'elementOptions:'       -> pushMode(Embed);

MT_ELEMENTOPTION   : META_CHAR 'elementOption' [0-9]*;
ET_ELEMENTOPTION  : START_EMBED_CHAR 'elementOption:'       -> pushMode(Embed);

MT_ELEMENT_ZOM          : META_CHAR 'element*' [0-9]*;
ET_ELEMENT_ZOM          : START_EMBED_CHAR 'element*:'              -> pushMode(Embed);

MT_ALTERNATIVE          : META_CHAR 'alternative' [0-9]*;
ET_ALTERNATIVE          : START_EMBED_CHAR 'alternative:'           -> pushMode(Embed);

MT_ELEMENT              : META_CHAR 'element' [0-9]*;
ET_ELEMENT              : START_EMBED_CHAR 'element:'               -> pushMode(Embed);
    
MT_QUESTION_OPT         : META_CHAR 'QUESTION?' [0-9]*;
ET_QUESTION_OPT         : START_EMBED_CHAR 'QUESTION?:'             -> pushMode(Embed);

MT_ELEMENT_A1_S1        : META_CHAR 'element_A1_S1' [0-9]*;
ET_ELEMENT_A1_S1        : START_EMBED_CHAR 'element_A1_S1:'       -> pushMode(Embed);

MT_ELEMENT_A2_S1         : META_CHAR 'element_A2_S1' [0-9]*;
ET_ELEMENT_A2_S1         : START_EMBED_CHAR 'element_A2_S1:'       -> pushMode(Embed);

MT_LABELEDELEMENT       : META_CHAR 'labeledElement' [0-9]*;
ET_LABELEDELEMENT       : START_EMBED_CHAR 'labeledElement:'       -> pushMode(Embed);

MT_LABELEDLEXERELEMENT       : META_CHAR 'labeledLexerElement' [0-9]*;
ET_LABELEDLEXERELEMENT       : START_EMBED_CHAR 'labeledLexerElement:'       -> pushMode(Embed);

MT_LABELEDLEXERELEMENT_S1       : META_CHAR 'labeledLexerElement_S1' [0-9]*;
ET_LABELEDLEXERELEMENT_S1       : START_EMBED_CHAR 'labeledLexerElement_S1:'       -> pushMode(Embed);


MT_LABELEDELEMENT_S1      : META_CHAR 'labeledElement_S1' [0-9]*;
ET_LABELEDELEMENT_S1       : START_EMBED_CHAR 'labeledElement_S1:'       -> pushMode(Embed);

MT_LABELEDELEMENT_S2       : META_CHAR 'labeledElement_S2' [0-9]*;
ET_LABELEDELEMENT_S2     : START_EMBED_CHAR 'labeledElement_S2:'       -> pushMode(Embed);

MT_BLOCKSUFFIX_OPT         : META_CHAR 'blockSuffix?' [0-9]*;
ET_BLOCKSUFFIX_OPT         : START_EMBED_CHAR 'blockSuffix?:'             -> pushMode(Embed);

MT_BLOCKSUFFIX       : META_CHAR 'blockSuffix' [0-9]*;
ET_BLOCKSUFFIX     : START_EMBED_CHAR 'blockSuffix:'       -> pushMode(Embed);

MT_EBNFSUFFIX       : META_CHAR 'ebnfSuffix' [0-9]*;
ET_EBNFSUFFIX     : START_EMBED_CHAR 'ebnfSuffix:'       -> pushMode(Embed);

MT_EBNFSUFFIX_OPT       : META_CHAR 'ebnfSuffix?' [0-9]*;
ET_EBNFSUFFIX_OPT     : START_EMBED_CHAR 'ebnfSuffix?:'       -> pushMode(Embed);

MT_ATOM       : META_CHAR 'atom' [0-9]*;
ET_ATOM     : START_EMBED_CHAR 'atom:'       -> pushMode(Embed);

MT_LEXERATOM       : META_CHAR 'lexerAtom' [0-9]*;
ET_LEXERATOM     : START_EMBED_CHAR 'lexerAtom:'       -> pushMode(Embed);

MT_LEXERBLOCK       : META_CHAR 'lexerBlock' [0-9]*;
ET_LEXERBLOCK    : START_EMBED_CHAR 'lexerBlock:'       -> pushMode(Embed);


MT_FRAGMENT_OPT       : META_CHAR 'FRAGMENT?' [0-9]*;
ET_FRAGMENT_OPT     : START_EMBED_CHAR 'FRAGMENT:'       -> pushMode(Embed);

MT_LEXER_RULE       : META_CHAR 'lexerRule' [0-9]*;
ET_LEXER_RULE     : START_EMBED_CHAR 'lexerRule:'       -> pushMode(Embed);

MT_LEXER_RULE_BLOCK       : META_CHAR 'lexerRuleBlock' [0-9]*;
ET_LEXER_RULE_BLOCK     : START_EMBED_CHAR 'lexerRuleBlock:'       -> pushMode(Embed);

MT_LEXERALTLIST       : META_CHAR 'lexerAltList' [0-9]*;
ET_LEXERALTLIST     : START_EMBED_CHAR 'lexerAltList:'       -> pushMode(Embed);

MT_LEXERALTLIST_S1_ZOM       : META_CHAR 'lexerAltList_S1*' [0-9]*;
ET_LEXERALTLIST_S1_ZOM     : START_EMBED_CHAR 'lexerAltList_S1*:'       -> pushMode(Embed);

MT_LEXERALTLIST_S1       : META_CHAR 'lexerAltList_S1' [0-9]*;
ET_LEXERALTLIST_S1     : START_EMBED_CHAR 'lexerAltList_S1:'       -> pushMode(Embed);

MT_LEXERALT       : META_CHAR 'lexerAlt' [0-9]*;
ET_LEXERALT     : START_EMBED_CHAR 'lexerAlt:'       -> pushMode(Embed);

MT_LEXERCOMMAND_OPT       : META_CHAR 'lexerCommands?' [0-9]*;
ET_LEXERCOMMAND_OPT     : START_EMBED_CHAR 'lexerCommands?:'       -> pushMode(Embed);

MT_LEXERELEMENT_OOM       : META_CHAR 'lexerElement+' [0-9]*;
ET_LEXERELEMENT_OOM     : START_EMBED_CHAR 'lexerElement+:'       -> pushMode(Embed);

MT_LEXERELEMENTS       : META_CHAR 'lexerElements' [0-9]*;
ET_LEXERELEMENTS     : START_EMBED_CHAR 'lexerElements:'       -> pushMode(Embed);

MT_LEXERELEMENT       : META_CHAR 'lexerElement' [0-9]*;
ET_LEXERELEMENT     : START_EMBED_CHAR 'lexerElement:'       -> pushMode(Embed);

MT_LEXERCOMMANDS_S1_ZOM       : META_CHAR 'lexerCommands_S1*' [0-9]*;
ET_LEXERCOMMANDS_S1_ZOM     : START_EMBED_CHAR 'lexerCommands_S1*:'       -> pushMode(Embed);

MT_LEXERCOMMANDS       : META_CHAR 'lexerCommands' [0-9]*;
ET_LEXERCOMMANDS     : START_EMBED_CHAR 'lexerCommands:'       -> pushMode(Embed);

MT_LEXERCOMMAND       : META_CHAR 'lexerCommand' [0-9]*;
ET_LEXERCOMMAND     : START_EMBED_CHAR 'lexerCommand:'       -> pushMode(Embed);

MT_LEXERCOMMANDS_S1       : META_CHAR 'lexerCommands_S1' [0-9]*;
ET_LEXERCOMMANDS_S1     : START_EMBED_CHAR 'lexerCommands_S1:'       -> pushMode(Embed);

MT_RULEREF       : META_CHAR 'ruleref' [0-9]*;
ET_RULEREF      : START_EMBED_CHAR 'ruleref:'       -> pushMode(Embed);

MT_RANGE       : META_CHAR 'range' [0-9]*;
ET_RANGE       : START_EMBED_CHAR 'range:'       -> pushMode(Embed);

MT_NOTSET       : META_CHAR 'notSet' [0-9]*;
ET_NOTSET       : START_EMBED_CHAR 'notSet:'       -> pushMode(Embed);


MT_BLOCK_S1_OPT       : META_CHAR 'block_S1?' [0-9]*;
ET_BLOCK_S1_OPT       : START_EMBED_CHAR 'block_S1?:'       -> pushMode(Embed);

MT_BLOCK       : META_CHAR 'block' [0-9]*;
ET_BLOCK      : START_EMBED_CHAR 'block:'       -> pushMode(Embed);

MT_ACTION     : META_CHAR 'ACTION' [0-9]*;
ET_ACTION     : START_EMBED_CHAR 'ACTION:'       -> pushMode(Embed);

PMT_ACTION     : META_CHAR 'action' [0-9]*;
PET_ACTION     : START_EMBED_CHAR 'action:'       -> pushMode(Embed);

MT_STRING_LITERAL : META_CHAR 'STRING_LITERAL' [0-9]*;
ET_STRING_LITERAL : START_EMBED_CHAR 'STRING_LITERAL:'  -> pushMode(Embed);

MT_LEXER_CHAR_SET : META_CHAR 'LEXER_CHAR_SET' [0-9]*;
ET_LEXER_CHAR_SET : START_EMBED_CHAR 'LEXER_CHAR_SET:'  -> pushMode(Embed);


DOC_COMMENT
	:	'/**' .*? ('*/' | EOF)
	;

BLOCK_COMMENT
	:	'/*' .*? ('*/' | EOF)  -> channel(HIDDEN)
	;

LINE_COMMENT
	:	'//' ~[\r\n]*  -> channel(HIDDEN)
	;

BEGIN_ARG_ACTION
	:	'[' {handleBeginArgAction();}
	;

// OPTIONS and TOKENS must also consume the opening brace that captures
// their option block, as this is teh easiest way to parse it separate
// to an ACTION block, despite it usingthe same {} delimiters.
//
OPTIONS      : 'options' [ \t\f\n\r]* '{'  ;
TOKENS		 : 'tokens'  [ \t\f\n\r]* '{'  ;

IMPORT       : 'import'               ;
FRAGMENT     : 'fragment'             ;
LEXER        : 'lexer'                ;
PARSER       : 'parser'               ;
GRAMMAR      : 'grammar'              ;
PROTECTED    : 'protected'            ;
PUBLIC       : 'public'               ;
PRIVATE      : 'private'              ;
RETURNS      : 'returns'              ;
LOCALS       : 'locals'               ;
THROWS       : 'throws'               ;
CATCH        : 'catch'                ;
FINALLY      : 'finally'              ;
MODE         : 'mode'                 ;

COLON        : ':'                    ;
COLONCOLON   : '::'                   ;
COMMA        : ','                    ;
SEMI         : ';'                    ;
LPAREN       : '('                    ;
RPAREN       : ')'                    ;
RARROW       : '->'                   ;
LT           : '<'                    ;
GT           : '>'                    ;
ASSIGN       : '='                    ;
QUESTION     : '?'                    ;
STAR         : '*'                    ;
PLUS         : '+'                    ;
PLUS_ASSIGN  : '+='                   ;
OR           : '|'                    ;
DOLLAR       : '$'                    ;
DOT		     : '.'                    ;
RANGE        : '..'                   ;
AT           : '@'                    ;
POUND        : '#'                    ;
NOT          : '~'                    ;
RBRACE       : '}'                    ;

/** Allow unicode rule/token names */
ID	:	NameStartChar NameChar*;

fragment
NameChar
	:   NameStartChar
	|   '0'..'9'
	|   '_'
	|   '\u00B7'
	|   '\u0300'..'\u036F'
	|   '\u203F'..'\u2040'
	;

fragment
NameStartChar
	:   'A'..'Z'
	|   'a'..'z'
	|   '\u00C0'..'\u00D6'
	|   '\u00D8'..'\u00F6'
	|   '\u00F8'..'\u02FF'
	|   '\u0370'..'\u037D'
	|   '\u037F'..'\u1FFF'
	|   '\u200C'..'\u200D'
	|   '\u2070'..'\u218F'
	|   '\u2C00'..'\u2FEF'
	|   '\u3001'..'\uD7FF'
	|   '\uF900'..'\uFDCF'
	|   '\uFDF0'..'\uFFFD'
	; // ignores | ['\u10000-'\uEFFFF] ;

INT	: [0-9]+
	;

// ANTLR makes no distinction between a single character literal and a
// multi-character string. All literals are single quote delimited and
// may contain unicode escape sequences of the form \uxxxx, where x
// is a valid hexadecimal number (as per Java basically).
STRING_LITERAL
	:  '\'' (ESC_SEQ | ~['\r\n\\])* '\''
	;

UNTERMINATED_STRING_LITERAL
	:  '\'' (ESC_SEQ | ~['\r\n\\])*
	;

// Any kind of escaped character that we can embed within ANTLR
// literal strings.
fragment
ESC_SEQ
	:	'\\'
		(	// The standard escaped character set such as tab, newline, etc.
			[btnfr"'\\]
		|	// A Java style Unicode escape sequence
			UNICODE_ESC
		|	// Invalid escape
			.
		|	// Invalid escape at end of file
			EOF
		)
	;

fragment
UNICODE_ESC
    :   'u' (HEX_DIGIT (HEX_DIGIT (HEX_DIGIT HEX_DIGIT?)?)?)?
    ;

fragment
HEX_DIGIT : [0-9a-fA-F]	;

WS  :	[ \t\r\n\f]+ -> channel(HIDDEN)	;

// Many language targets use {} as block delimiters and so we
// must recursively match {} delimited blocks to balance the
// braces. Additionally, we must make some assumptions about
// literal string representation in the target language. We assume
// that they are delimited by ' or " and so consume these
// in their own alts so as not to inadvertantly match {}.

ACTION
	:	'{'
		(	ACTION
		|	ACTION_ESCAPE
        |	ACTION_STRING_LITERAL
        |	ACTION_CHAR_LITERAL
        |	'/*' .*? '*/' // ('*/' | EOF)
        |	'//' ~[\r\n]*
        |	.
		)*?
		('}'|EOF)
	;

fragment
ACTION_ESCAPE
		:   '\\' .
		;

fragment
ACTION_STRING_LITERAL
        :	'"' (ACTION_ESCAPE | ~["\\])* '"'
        ;

fragment
ACTION_CHAR_LITERAL
        :	'\'' (ACTION_ESCAPE | ~['\\])* '\''
        ;

// -----------------
// Illegal Character
//
// This is an illegal character trap which is always the last rule in the
// lexer specification. It matches a single character of any value and being
// the last rule in the file will match when no other rule knows what to do
// about the character. It is reported as an error but is not passed on to the
// parser. This means that the parser to deal with the gramamr file anyway
// but we will not try to analyse or code generate from a file with lexical
// errors.
//
ERRCHAR
	:	.	-> channel(HIDDEN)
	;

mode ArgAction; // E.g., [int x, List<String> a[]]

	NESTED_ARG_ACTION
		:	'['                         -> more, pushMode(ArgAction)
		;

	ARG_ACTION_ESCAPE
		:   '\\' .                      -> more
		;

    ARG_ACTION_STRING_LITERAL
        :	('"' ('\\' . | ~["\\])* '"')-> more
        ;

    ARG_ACTION_CHAR_LITERAL
        :	('"' '\\' . | ~["\\] '"')   -> more
        ;

    ARG_ACTION
		:   ']'                         -> popMode
		;

	UNTERMINATED_ARG_ACTION // added this to return non-EOF token type here. EOF did something weird
		:	EOF							-> popMode
		;

    ARG_ACTION_CHAR // must be last
        :   .                           -> more
        ;



mode LexerCharSet;

	LEXER_CHAR_SET_BODY
		:	(	~[\]\\]
			|	'\\' .
			)+
                                        -> more
		;

	LEXER_CHAR_SET
		:   ']'                         -> popMode
		;

	UNTERMINATED_CHAR_SET
		:	EOF							-> popMode
		;


mode Embed;
    
    EMBED_END
        : END_EMBED_CHAR                -> popMode
        ;
        
    EMBED_NESTED
        : START_EMBED_CHAR              -> pushMode(NestedEmbed), more   
        ;
        
    EMBEDDED
        : .                             -> more
        ;
    

mode NestedEmbed;    
    
    NESTED_EMBED_END
        : END_EMBED_CHAR                -> popMode, more
        ;
        
    NESTED_EMBED_NESTED
        : START_EMBED_CHAR              -> pushMode(NestedEmbed), more   
        ;
        
    NESTED_EMBEDDED
        : .                             -> more
        ;
