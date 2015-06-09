# Compile CRSX to Java

CRSXHOME = $(abspath ../../)

include $(CRSXHOME)/Env.mk

JAVATGTHOME  = $(CRSXHOME)/targets/java
JAVATGTBUILD = $(JAVATGTHOME)/build
RUNJAVAPG = $(JAVA) -cp $(JAVATGTBUILD):$(JAVATGTHOME)/lib/antlr-runtime-4.5.jar:$(CRSXLIB) org.crsx.pg.PG

PACKAGE = org.crsx
PACKAGEPG = $(PACKAGE).pg
ANTLRTGT = $(JAVATGTHOME)/parsers

RUNANTLR = $(JAVA) -Xmx500M -cp $(ANTLR) org.antlr.v4.Tool -Dlanguage=Java

.PHONY: all clean
all: pg parser jar
clean::
 
bootstrap: pg
 
#
# Generate PG and PG META parsers. 
#

PGSRC = $(SRC)/pg
PGTGT = $(ANTLRTGT)/org/crsx/pg
PGPKG = org.crsx.pg
PGLEXER =  $(PGTGT)/ANTLRTermLexer.java $(PGTGT)/ANTLRTermLexer.tokens $(PGTGT)/ANTLRTerm.tokens
PGPARSER = $(PGTGT)/ANTLRTerm.java $(PGTGT)/ANTLRTermBaseListener.java $(PGTGT)/ANTLRTermListener.java 
PGFILES = $(PGLEXER) $(PGPARSER)

PGMETALEXER =  $(PGTGT)/ANTLRMetaLexer.java $(PGTGT)/ANTLRMetaLexer.tokens $(PGTGT)/ANTLRMeta.tokens
PGMETAPARSER = $(PGTGT)/ANTLRMeta.java $(PGTGT)/ANTLRMetaBaseListener.java $(PGTGT)/ANTLRMetaListener.java 
PGMETAFILES = $(PGMETALEXER) $(PGMETAPARSER)

.PHONY: pg pgmeta
pg: $(PGFILES)
pgmeta: $(PGMETAFILES)

.PHONY: pgprereq
pgprereq:
	@mkdir -p $(PGTGT)
	
clean::
	@rm -f $(PGFILES) $(PGMETAFILES)
	
$(PGLEXER): $(PGSRC)/ANTLRTermLexer.g4 pgprereq
	@$(RUNANTLR) $< -o $(PGTGT) -package $(PGPKG)
	
$(PGPARSER): $(PGSRC)/ANTLRTerm.g4 $(PGLEXER)
	@$(RUNANTLR) $< -o $(PGTGT) -package $(PGPKG)
	
$(PGMETALEXER): $(PGSRC)/ANTLRMetaLexer.g4 pgprereq
	@$(RUNANTLR) $< -o $(PGTGT) -package $(PGPKG)
	
$(PGMETAPARSER): $(PGSRC)/ANTLRMeta.g4 $(PGLEXER)
	@$(RUNANTLR) $< -o $(PGTGT) -package $(PGPKG) -DsuperClass=org.crsx.pg.Crsx3Parser

#
# Generate CRSX Java parser and sorts
#

PARSERSRC = $(SRC)/parser
PARSERTGT = $(ANTLRTGT)/org/crsx/parser
PARSERPKG = org.crsx.parser
PARSERLEXER =  $(PARSERTGT)/CrsxTermLexer.java $(PARSERTGT)/CrsxTermLexer.tokens 
PARSERPARSER = $(PARSERTGT)/CrsxTerm.java $(PARSERTGT)/CrsxTermBaseListener.java $(PARSERTGT)/CrsxTermListener.java $(PARSERTGT)/CrsxTerm.tokens
PARSERFILES = $(PARSERLEXER) $(PARSERPARSER)

METAPARSERLEXER =  $(PARSERTGT)/CrsxMetaLexer.java $(PARSERTGT)/CrsxMetaLexer.tokens 
METAPARSERPARSER = $(PARSERTGT)/CrsxMetaParser.java $(PARSERTGT)/CrsxMetaParserBaseListener.java $(PARSERTGT)/CrsxMetaParserListener.java  $(PARSERTGT)/CrsxMetaParser.tokens 
METAPARSERFILES = $(METAPARSERLEXER) $(METAPARSERPARSER)

.PHONY: parser
parser: $(PARSERFILES) $(METAPARSERFILES) $(PARSERSRC)/Crsx.crs

.PHONY: pgprereq
parserprereq:
	@mkdir -p $(PARSERTGT)
	
clean::
	@rm -f $(PARSERFILES) $(METAPARSERFILES)
	@rm -f $(PARSERSRC)/CrsxTerm.g4.nterm $(PARSERSRC)/CrsxTerm.g4 $(PARSERSRC)/CrsxMetaParser.g4 $(PARSERSRC)/CrsxMetaLexer.g4
	@rm -f $(PARSERSRC)/Crsx.crs

$(PARSERSRC)/CrsxTerm.g4.nterm: $(PARSERSRC)/Crsx.g4 $(PGSRC)/normalizer.crs
	@echo Normalize CRSX grammar
	@$(RUNJAVAPG) $< "$<.term"
	@cd ../../src && $(RUNCRSX) "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/normalizer.crs input="$<.term" wrapper=Normalize output="$<.nterm"
	@rm "$<.term"
	

# Generate Crsx.crs
$(PARSERSRC)/Crsx.crs: $(PARSERSRC)/Crsx.g4 $(PARSERSRC)/CrsxTerm.g4.nterm $(PGSRC)/normalizer.crs
	@echo Generate CRSX sorts
	@cd ../../src && $(RUNCRSX) sink=net.sf.crsx.text.TextSink "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/gensort.crs input="$<.nterm" wrapper=MakePrinter output="$@"

# Generate CrsxTerm.g4,
$(PARSERSRC)/CrsxTerm.g4: $(PARSERSRC)/Crsx.g4 $(PARSERSRC)/CrsxTerm.g4.nterm  $(PGSRC)/normalizer.crs
	@echo Generate CRSX term parser
	@cd ../../src && $(RUNCRSX) sink=net.sf.crsx.text.TextSink "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/genparser.crs input="$<.nterm" wrapper=MakeParser output="$@"

# Generate CrsxMetaParser.g4,
$(PARSERSRC)/CrsxMetaParser.g4: $(PARSERSRC)/Crsx.g4 $(PARSERSRC)/CrsxTerm.g4.nterm  $(PGSRC)/normalizer.crs
	@echo Generate CRSX meta parser
	@cd ../../src && $(RUNCRSX) sink=net.sf.crsx.text.TextSink "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/genparser.crs input="$<.nterm" wrapper=MakeMetaParser output="$@"

# Generate CrsxMetaLexer.g4,
$(PARSERSRC)/CrsxMetaLexer.g4: $(PARSERSRC)/Crsx.g4 $(PARSERSRC)/CrsxTerm.g4.nterm  $(PGSRC)/normalizer.crs
	@echo Generate CRSX meta lexer
	@cd ../../src && $(RUNCRSX) sink=net.sf.crsx.text.TextSink "grammar=('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)" rules=pg/genparser.crs input="$<.nterm" wrapper=MakeMetaLexer output="$@"
	
# Generate Java CRSX parser 
$(PARSERFILES): $(PARSERSRC)/CrsxTerm.g4 parserprereq
	@$(RUNANTLR) $< -o $(PARSERTGT) -package $(PARSERPKG)

# Generate Java CRSX meta lexer 
$(METAPARSERLEXER): $(PARSERSRC)/CrsxMetaLexer.g4 parserprereq
	@$(RUNANTLR) $< -o $(PARSERTGT) -package $(PARSERPKG)
	
# Generate Java CRSX meta parser 
$(METAPARSERPARSER): $(PARSERSRC)/CrsxMetaParser.g4 $(PARSERSRC)/CrsxMetaLexer.g4 $(METAPARSERLEXER) parserprereq
	@$(RUNANTLR) $< -o $(PARSERTGT) -package $(PARSERPKG) -DsuperClass=org.crsx.pg.Crsx3Parser
	
#
# Generate Crsx4 runtime jar
#

jar: pg parser
	