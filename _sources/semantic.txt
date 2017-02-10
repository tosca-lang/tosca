Syntax and Semantic
*******************

Functions
=========

Tosca programs are composed of ``functions``. The basic syntax is::

  func Main() -> Numeric → 0

``func`` indicates this declaration is a function named ``Main``, which must be a :ref:`constructor <constructors>`.
The function return type must be specified after the ``->`` separator, in this case ``Numeric``. The function body
is commonly written after the character ``→`` (U+2192) or for unicode-adverse people after the ``=`` symbol.
Note that there is no semicolons after ``0``.

Functions can take parameters::

  func Compile(#program: Program, #target: String) -> Compiled → ...

This function takes 2 comma-separated parameters, ``#program`` of type ``Program`` and ``#target`` of type ``String``.
Function signatures must specify parameter types. For function without parameters, the parenthesis are optional::

  func Main -> Numeric → 0

which is the same as the first declaration of ``Main`` above.

Rules
=====

The function body is optional and instead it can be described as a set of ``rules``. In that case, the parameter names in the
function signature can be omitted::

  func Compile(Program, String) -> Compiled

A ``rule`` consists of a pattern and a body. For instance::

  rule Compile(#program, #target) → ...

A ``rule`` starts with the keyword ``rule``, followed by the name of the function which the rule applied to and a comma-separated
list of patterns enclosed within parenthesis. The rule body occurs after the ``→`` (or ``=``) character.

Tosca supports two kinds of pattern:

* Meta-variables to match all values, and
* enumeration :ref:`destructuring <enumdestructuring>`

Patterns usually match only a subset of all possible values and multiple rules are used to cover all cases. Tosca evaluates rules
in lexical order, from top to bottom. The first one to match is evaluated, ignoring the other rules.

For instance::

  func And(Bool, Bool) -> Bool
  rule And(TRUE, TRUE) → TRUE
  rule And(#1  , #2)   → FALSE

This defines the function ``And`` and two associated rules. When this function is evaluated, the top-most rule is first considered:
if the two arguments are the value ``TRUE``, then the function returns ``TRUE``. Otherwise, the next rule is considered, and in
this case it's a *catch all* rule evaluating to ``FALSE``.

Enums
=====

An `enum` is a type defining multiple cases a value can be. The type ``Bool`` is an enumeration with two cases::

  enum Bool | TRUE
            | FALSE

The enum type name is a :ref:`constructor <constructors>` followed by a list of cases starting with the character ``|``.
Each case is a :ref:`constructor <constructors>`.

It is possible to associate values independently to each case. For example, the ``Option`` type, commonly found in functional programming language,
is defined in Tosca as follows::

  enum Option<a> | SOME(a) | NONE

``SOME`` takes one parameter of type ``a`` (see :ref:`generics` for more details on what's ``a`` in this context).


.. _enumdestructuring:

Destructuring
-------------

TBA.

.. _generics:

Generics
========

TBA.

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
