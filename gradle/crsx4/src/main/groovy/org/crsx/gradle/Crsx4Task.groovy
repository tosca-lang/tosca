package org.crsx.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


class Crsx4Task extends DefaultTask {
	
	@TaskAction
	def generate() {
//		// Configure PG runner
//		MainRunner pgrunner = new MainRunner(project.configurations.crsx4.files, "org.crsx.pg.PG")
//		
//		// Configure Crsx3 runner
//		MainRunner crsx3runner = new MainRunner(project.configurations.crsx4.files, "net.sf.crsx.run.Crsx")
//		
//		// Generate grammars.
//		project.crsx4.grammars.each { grammar ->
//			String absname = project.file(grammar.input).absolutePath
//			String basename = absname.lastIndexOf('.').with {it != -1 ? absname[0..<it] : absname}
//			
//			// .g4 -> .term
//			String term = absname + '.term'   // grammar as term file
//			pgrunner.run([ absname, term ]) 		
//			
//			// .term -> .nterm
//			String nterm = absname + '.nterm' // normalize grammar
//			crsx3runner.run([ 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/normalizer.crs', 'input=' + term, 'wrapper=Normalize', 'output=' + nterm ])
//
//			// .nterm -> sort
//			String sortt = basename + '.crs' // generate sort
//			crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/gensort.crs', 'input=' + nterm, 'wrapper=MakePrinter', 'output=' + sortt ])
//			
//			// .nterm -> term lexer/parser
//			String termparser = basename + 'TermParser.g4' 
//			crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/genparser.crs', 'input=' + nterm, 'wrapper=MakeParser', 'output=' + termparser ])
//				
//			// .nterm -> meta lexer
//			String metalexer = basename + 'MetaLexer.g4'  
//			crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/genparser.crs', 'input=' + nterm, 'wrapper=MakeMetaLexer', 'output=' + metalexer ])
//			
//			
//			// .nterm -> meta parser
//			String metaparser = basename + 'MetaParser.g4'  
//			crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/genparser.crs', 'input=' + nterm, 'wrapper=MakeMetaParser', 'output=' + metaparser ])
//		
//		}
	}
}