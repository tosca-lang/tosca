Lexical Structure
*****************

This sections enumerates the basic building blocks use to write Tosca programs.

.. _constructors:

Constructors
============

A ``constructor`` is a name used to identify various Tosca concepts, such as types, enumeration cases
and function. It must start with a uppercase character, or ``_``. The ``$`` character is reserved for internal
use only.
Here the exact ``constructor`` syntax::

  CONSTRUCTOR       : ConsHead ConsChar* Ebnf?;
  ConsHead          : Upper | UnicodeS | '_' | '$';
  ConsChar          : Alpha | Digit | Unicode | '_' | '-' | '$';
  fragment Digit    : [0-9];
  fragment Upper    : [A-Z];
  fragment Lower    : [a-z];
  fragment Alpha    : [a-zA-Z];
  fragment Unicode  : ~[\u0000-\u00FF\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
  fragment UnicodeS : ~[\u0000-\u00FF\uD800-\uDBFF\u27e6\u27e7\u27e8\u27e9\u2192] | [\uD800-\uDBFF] [\uDC00-\uDFFF];
  fragment Ebnf     : '*' | '?' | '+';


Meta-Variables
==============

Tosca calls ``meta-variable`` what is usually just called variable in other programming languages.
After all Tosca is a meta-compiler. A ``meta-variable`` starts with the ``#`` character. For instance
``#``, ``#1``, and ``#let?1`` are all valid meta-variable.

Here the exact syntax::

  METAVAR           : '#' (Alpha | Digit | '-' | '_' | Unicode)* Ebnf? Digit*

Variable Literals
=================

A ``variable`` is a special literal that is mainly used to represent the variables of the language
being compiled. It starts with a lower case character. For instance ``var``, ``i`` and ``l_Let1``
are variables.

::

  VARIABLE          : Lower (Alpha | Digit | '-' | '_')*;

String Literals
===============

``Strings`` are a sequence of zero or more characters enclosed within double-quotes.

::

  STRING            :  '"' ('\\"'|'""'|~'"')*? '"';

Numeric Literals
================

``Numbers`` are either integers, or decimals.

::

  NUMBER: '-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
