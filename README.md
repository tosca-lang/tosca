Overview
========

Tosca is a compiler generator language based on syntax-directed transformation systems. The main features are: 

* special notations for using concrete syntax 
* special support for symbol tables, environments, and attributes, as used in compilers
* special support for recursive descendant traversals that don't blow up your stack

Status
======

This project is at an early development stage and fairly [active](https://github.com/tosca-lang/tosca/pulse). 

The current compiler targets high-level type-safe (in most cases) readable code - your alternative of either Java 8 code or C++11 code.

Getting Started
===============

To get started, open a terminal and run these commands:

    git clone https://github.com/tosca-lang/tosca.git
    cd tosca
    
The build system is Gradle, and typing this command will build everything:

    ./gradlew
    
To make sure that everything is working as planned, just type `./gradlew smoketest` and you should see a bunch of tests running successfully. 
    
Installing the Atom package
==================================

Download [atom](https://atom.io), install it then start Atom. Go to Preferences (ctrl-, or command-, depending on your system), Install and search for language-tosca and then click on Install.

Changes
=======
* Version 1.0.7 - fixes non-thread-safe issue with ref counting in C++ backend.
* Version 1.0.6 - fixes to make Tosca compile after clean pull from github
* Version 1.0.5 - gcc 4.8 support for C++ backend.
* Version 1.0.4 - Fix bug in PutProperty signature for C++ backend.
* Version 1.0.3 - Add GetProperty and PutProperty in core.tsc. Implement MapAddAll.  Both Java and C++ backends.
* Version 1.0.2 - Add ParseText for Java backend.
* Version 1.0.1 - Add BindVariable function in TermParser, C++ backend.
* Version 1.0.0 - Initial production release.

Contributing
============

The best way to start is to join us on [slack](https://tosca-lang.slack.com)

License
=======

This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0, 
which accompanies this distribution, and is available at http://opensource.org/licenses/EPL-1.0.
