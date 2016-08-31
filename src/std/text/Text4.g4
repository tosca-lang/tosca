/*
 * Copyright (c) 2016 IBM Corporation.
 *
 * Grammar for simple structured text.
 *
 */
grammar Text4;

text
    : content text
    |
    ;

content
    : STRING
    | BREAK
    | CASTCONTENT text
    | ESCAPE
    | INDENT
    | OUTDENT
    ;

CASTCONTENT  : '\u2020'; // †
ESCAPE       : '⟨⟨';

STRING : ~[\n\r\f\u00b6\u2020⟨→←]+;
BREAK : [\n\r\f\u00b6]+; // ¶=\u00b6
INDENT: '→';
OUTDENT : '←';
