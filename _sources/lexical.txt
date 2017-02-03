Lexical Definition
******************

Constructor
===========

Syntax::
  CONSTRUCTOR       : ConsHead ConsChar* Ebnf?;
  ConsHead          : Upper | UnicodeS | '_' | '$';
  ConsChar          : Alpha | Digit | Unicode | '_' | '-' | '$';

Constructors start with an upper case character or an underscore. The $ sign is for internal use only.

Meta-Variable
=============

Syntax::
  METAVAR           : '#' (Alpha | Digit | '-' | '_' | Unicode)* Ebnf? Digit*

Meta-variables start with the ``#``
