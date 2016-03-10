Overview
========

TransScript is a set of tools to facilitate writing compilers and other syntax-directed transformation systems. That's the vision. 

The first tool this project defines is a functional programming language and a compiler featuring:

* special notations for using embedded syntax, higher order abstract syntax
* special support for symbol tables, environments, and attributes, as used in compilers
* special support for recursive descendent traversals that don't blow up your stack

Status
======

This project is at an early development stage and fairly [active](https://github.com/TransScript/TransScript/pulse). 

The current compiler targets high-level type-safe (with some limitations) readable Java 8 code. C++11 is also planned.

Getting Started
===============

To get started, open a terminal and run these commands:

    git clone https://github.com/TransScript/TransScript.git
    cd TransScript
    
The build system is Gradle.  

TransScript is built using this command:

    gradlew
    
Common Issues
=============

ERROR: JAVA_HOME is set to an invalid directory:

[StackOverflow](
http://stackoverflow.com/questions/26882221/gradle-does-not-recognize-the-java-home-i-have-set) says 

it is quite common issue. Just go to your gradle home directory and bin for example:

/home/user/gradle-2.0/bin
and there you should have gradle script, i'm on windows machine now so i have gradle.bat, probably you will have gradle.sh or something like this. and there find line:

set JAVA_HOME=%JAVA_HOME:"=%
or as i can see you are on linux so there will be "export" and change it to your java home direcotry for example:

export JAVA_HOME=/usr/lib/jvm/java-7-oracle

License
=======

This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0, 
which accompanies this distribution, and is available at http://opensource.org/licenses/EPL-1.0.
