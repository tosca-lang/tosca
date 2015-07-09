/*
 * Copyright (c) 2015 IBM Corporation. 
 *
 * Grammar for simple structured text with embedded terms.
 *
 */
grammar Text;

n 
    : part n
    |
    ;

part 
    : CHARS
    | BREAK
    | OPENINDENT n CLOSEINDENT
    | CASTSTRING n 
    ;
    
OPENINDENT  : '\u27e6'; // ⟦
CLOSEINDENT : '\u27e7'; // ⟧
CASTSTRING  : '\u2020'; // †
         
CHARS : ~[\n\r\f\u00b6\u27e6\u27e7\u2020\u00ab\u00bb]+;
BREAK : [\n\r\f\u00b6]+;
