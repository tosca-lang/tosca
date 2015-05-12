# Boostrapping makefile

CRSXHOME = $(abspath .)

include $(CRSXHOME)/Env.mk

all: bootstrap pg 
clean::

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
	@$(RUNJAVAPG) $< "$<.term"
	@cd src && $(RUNCRSX) "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/normalizer.crs input="pg/ANTLR.g4.term" wrapper=Normalize output="pg/ANTLR.g4.nterm"
	@cd src && $(RUNCRSX) "grammar=('net.sf.crsx.text.Text';)" sink=net.sf.crsx.text.TextSink rules=pg/gensort.crs input="pg/ANTLR.g4.nterm" wrapper=MakePrinter output="pg/bootstrap/ANTLR.crs"
	@rm "$<.term" "$<.nterm"

	
	