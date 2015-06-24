# Copyright (c) 2015 IBM Corporation.

# Main CRSX makefile. 

# Boostrapping makefile
# 
CRSXHOME = $(abspath .)
include $(CRSXHOME)/Env.mk

# Default target
all: bootstrap pg 

clean::

# Print help
help:
	@echo "make [target] ..."
	@echo ""
	@echo "where target is:"
	@echo ""
	@echo "all         make everything"
	@echo "clean       clean generated files, except the distribution tarballs"
	@echo "java        generate everything related to the Java target language"
	@echo "dist        generate the distribution tarball, using VERSION"


# --- Bootstrapping

# Bootstrapping using CRSX3 interpreter and CRSX4 Java backend
JAVATGT = targets/java

.PHONY: bootstrap
bootstrap:
	@$(MAKE) -C $(JAVATGT) bootstrap

# TODO: should be a jar	
JAVARUNTIME = $(JAVATGT)/build
RUNJAVAPG = $(JAVA) -cp $(JAVARUNTIME):$(JAVATGT)/lib/antlr-runtime-4.5.jar:$(CRSXLIB) org.crsx.pg.PG

# Make sorts and printer for PG4.
PGSRC = src/pg
PGSORT = $(PGSRC)/bootstrap/ANTLR.crs

clean::
	@rm $(PGSORT)

.PHONY: pg 
pg: $(PGSRC)/bootstrap/ANTLR.crs

$(PGSORT): $(PGSRC)/ANTLR.g4
	$(RUNJAVAPG) $< "$<.term"
	@cd src && $(RUNCRSX) "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/normalizer.crs input="pg/ANTLR.g4.term" wrapper=Normalize output="pg/ANTLR.g4.nterm"
	@cd src && $(RUNCRSX) "grammar=('net.sf.crsx.text.Text';)" sink=net.sf.crsx.text.TextSink rules=pg/gensort.crs input="pg/ANTLR.g4.nterm" wrapper=MakePrinter output="pg/bootstrap/ANTLR.crs"
	@rm "$<.term" "$<.nterm"

# --- Java target language

java:
	@(MAKE) -C targets/java

# --- Distribution 
