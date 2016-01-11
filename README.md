Crsx
====
Crsx is a set of tools to facilitate writing compilers and other syntax-directed transformation systems. 

Crsx defines a high-level functional programming language featuring:

* special notations for using embedded syntax, even higher order abstract syntax,
* special support for symbol tables, environments, and attributes, as used in compilers,
* a polymorphic sort system  
* a fast runtime: CRSX systems are compiled directly to native code for effective execution.

Under the cover, Crsx implements an extended higher-order rewriting formalism.

Getting Started
===============

To get started, open a terminal and run these commands:

    git clone https://github.com/crsx/crsx4.git
    cd crsx4 
    
Crsx build system is Gradle. It depends on one custom plugin that needs to be built before building Crsx. Type these commands:

    cd gradle/crsx4
    gradle

Then Crsx can be built using these commands:

    cd ../..
    gradle -Pdev

License
=======

This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0, 
which accompanies this distribution, and is available at http://opensource.org/licenses/EPL-1.0.
