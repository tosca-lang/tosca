Syntax and Semantic
*******************

.. _concrete-syntax:

Concrete syntax
===============

Concrete syntax provides an alternative way to define enumerations using an EBNF notation (currently based on ANTLR4).
This is very useful in particular when dealing with language constructs.

Overview
--------

For instance look at this typical constant declaration EBNF-like grammar definition::

   let : 'let' id '=' LITERAL

where :code:`let` is a grammar rule definition, followed by the grammar rule elements. This gets expanded to the following enumeration::

   enum Let_sort | Let(Id_sort, String /* LITERAL */)

While this can shorten enumeration definition, language syntax can also be used in pattern and contraction, for instance::

   Compile(let⟦ let #id = #LITERAL ⟧) → ...

The expression :code:`let⟦ code ⟧` indicates *code* follows the let *meta* syntax.

The following sections semi-formally describe the concreate syntax feature.

Rules
-----

Tosca allows defining *grammar rule* as follows::

   rulename : block ;

For each grammar rule, Tosca generates an enumeration and a category::

   enum Rulename_sort | ...
   rulename⟦ ... ⟧

Alternatives
------------

A grammar rule consists of a set of *alternatives* separated by the '|' character::

   rulename : alternative1 | ... | alternativen ;

Each alternative corresponds to an enumeration value:::

   enum Rulename_sort | Rulename_A1( ... ) | Rulename_A2( ... ) | ...

when the rule contains only one alternative, the *_An* suffix is omitted.

Elements
--------

An alternative is composed of a sequence, possibly empty, of *elements*. An element can either be:

* a literal ;
* a reference to a rule ;
* or a reference to a token.

Sort
^^^^

Literals and tokens are always mapped to the :code:`$String` sort. Rule references are mapped to their corresponding sort name.
Going back to the let example above, here how it looks:::

   let : 'let' id '=' LITERAL
   enum Let_sort |  Let(Id_sort /* rule reference */, String /* token reference */)

In the case the alternative has no element, the generated constructor has no arguments.

Pattern
^^^^^^^

For each rule and token declaration, there is a special grammar token used to match any terms. The name of the special token is constructed as follows::

   META_CHAR rulename [0-9]*

By default, *META_CHAR* is the '#' character.::

   Compile( let⟦ let #id = #LITERAL ⟧ ) → ...

 says to match any terms for the rule reference :code:`id` and for the token reference :code:`LITERAL`. This pattern is expanded to the following term::

   Compile( Let(#id, #LITERAL) ) → ...



Contraction
^^^^^^^^^^^

Each element, other than literals, can be constructed by arbitrary rewrites. This is achieved by *embedding* CRSX code within the language syntax.

For instance::

   Compile( let⟦ let #id = #LITERAL ⟧ ) → local⟦ var ⟨id: #id⟩ := #LITERAL ⟧
