/*
 * Copyright (c) 2016 IBM Corporation.
 *
 * Grammar for simple structured text with embedded terms.
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
    | OPENINDENT text CLOSEINDENT
    | CASTCONTENT text
    ;

OPENINDENT  : '\u27e6'; // ⟦
CLOSEINDENT : '\u27e7'; // ⟧
CASTCONTENT  : '\u2020'; // †


STRING : ~[\n\r\f\u00b6\u27e6\u27e7\u27e8\u2020\u00ab\u00bb⟨]+;
BREAK : [\n\r\f\u00b6]+;
