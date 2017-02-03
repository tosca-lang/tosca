Tool
****

To run the Tosca tool, type this command in the terminal::

  $ java -jar tosca.jar

which prints how to use it::

  $ Usage: java -jar <tosca.jar> <command> [<args>]

The main commands are:

* `build` - reads Tosca source code and generates Java or C++ code.
* `run` - read Tosca source code, generates Java or C++ source code, compile it and run it.
* `parse` - read Tosca source code and check for malformed syntax.
  It also prints the original source code with the concrete syntax being expanded.
* `pg`: reads an ANTLR4 grammar definition and generates various artifacts: a meta-parser,
   associated type definitions and a basic pretty printer.

Compiler
========

The compiler is invoked by the command `build` and `run`.

Parser Generator
================

The `pg` command takes an ANTLR4 grammar definition as input and generates three artifacts: a meta-parser,
type definitions and a pretty-printer.
See the section :ref:`concrete-syntax` for more information how these artifacts are used.

The parser generator supports the following arguments:

* grammar=<filename.g4> - the input ANTLR4 grammar specification.
* build-dir=<directory> - the directory where to store generated files. By default it is set to `./build/`.
* prefixsep=<value> - the string separating the grammar name from grammar rule names when generating type names. The default is `_`.
  For instance, for the grammar rule `term` located in `Core.g4`, the corresponding enumeration type name is `Core_term` when using the default prefix separator
* suffix=<value> - the string appended at the end of a type name. The default is `_sort`. Going back to the example just above,
  the type name is `Core_term_sort` when using the default type name suffix.
* location=<value> - the name of the location type. By default, location information is not propagated.
* metaprefix=<value> - the meta variable prefix string. The default is `#` to match the Tosca meta-variable syntax. Can be overriden
  if `#` conflicts with the concrete language
* defaultrule=<value> - the default grammar rule name. None by default. See :ref:`concrete-syntax` for more information.
* catprefix=<value> - the category prefix string. The empty string by default. See :ref:`concrete-syntax` for more information.
* truevar - indicates to generate *typed* variable. If not specified, variables have the type `String`; the <variable> option is ignored.
* notext - omit text package import declarations. Only used to generate the `Text4` artifacts.
* bootparserpath=<name> - the builtin parsers location. Only used for bootstrapping Tosca. (ADVANCED)
