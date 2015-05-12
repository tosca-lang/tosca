# Common environment for makefile

# Standard programs.

ifndef CRSXHOME
CRSXHOME = $(abspath .)
endif

SHELL = /bin/bash
FLEX = flex
CC = gcc
CXX = g++

ifdef JAVA_HOME 
JAVA = $(JAVA_HOME)/jre/bin/java
JAVAC = $(JAVA_HOME)/bin/javac
JAR = $(JAVA_HOME)/bin/jar
else
JAVA = java
JAVAC = javac
JAR = jar
endif

SRC = $(CRSXHOME)/src
CRSXLIB = $(CRSXHOME)/bin/lib/crsx.jar
RUNCRSX = $(JAVA) -Dfile.encoding=UTF-8 -Xss20000K -Xmx2000m -cp $(CRSXLIB):$(CRSXHOME)/targets/java/build:$(CRSXHOME)/targets/java/lib/antlr-runtime-4.5.jar net.sf.crsx.run.Crsx allow-unnamed-rules allow-missing-cases

ANTLR = $(CRSXHOME)/bin/lib/antlr-4.5-complete.jar

