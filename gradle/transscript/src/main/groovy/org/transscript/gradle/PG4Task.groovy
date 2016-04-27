// Copyright (c) 2015 IBM Corporation.
package org.transscript.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.*

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.Path
import java.nio.file.StandardCopyOption

class PG4Task extends DefaultTask {
	
	@InputFile
	File source 
	
	@OutputDirectory
	File generatedFileDir = project.file("${project.buildDir}/pg4")
	
	@Input
	@Optional
	boolean sort = true
	
	@Input
	@Optional
	boolean parsers = true
	
	@Input
	@Optional
	String metaPrefix = ""
	
	@Input
    @Optional
    String defaultRule = ""
    
    @Input
    @Optional
    boolean ncg = false
    
    @Input
    @Optional
    boolean np = false
    
	@TaskAction
	def generate() {
		if (sort || parsers)
		{
			// Configure PG runner
			MainRunner pgrunner = new MainRunner(project, project.configurations.transscript.files, "org.transscript.antlr.PG")
			
			// Configure Crsx3 runner
			MainRunner crsx3runner = new MainRunner(project, project.configurations.transscript.files, "net.sf.crsx.run.Crsx")
				
			// Generate grammars.
			String absname = source.absolutePath
			String nameext = source.name
			String name =  nameext.lastIndexOf('.').with {it != -1 ? nameext[0..<it] : nameext}
			String basename = generatedFileDir.absolutePath + "/" + name
			
			// .g4 -> .term
			String term = absname + '.term'   // grammar as term file
			pgrunner.run([ absname, term ])
			
			// .term -> .nterm
			String nterm = absname + '.nterm' // normalize grammar
			crsx3runner.run([ 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.antlr.ANTLRMeta\';)', 'rules=pg/normalizer.crs', 'input=' + term, 'wrapper=Normalize', 'output=' + nterm ])
			
			if (sort)
			{	
				// .nterm -> sort
				
				//String sortt = basename + '.crs' // generate sort
				//crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.antlr.ANTLRMeta\';)', 'rules=pg/gensort.crs', 'input=' + nterm, 'wrapper=MakeSorts', 'output=' + sortt ])
				
				String sortt4 = basename + '.tsc' // generate sort for transscript
                crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.antlr.ANTLRMeta\';)', 'rules=pg/gensort.crs', 'input=' + nterm, 'wrapper=MakeSorts', 'crsx4', ncg ? 'ncg' : '', 'output=' + sortt4 ])
			
		        // Copy file for bc
		        Path source = Paths.get(sortt4)
                Path target = Paths.get(basename + '.crs4')
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING)
			}
			
			if (parsers)
			{
				def commonargs = []
				commonargs << 'sink=net.sf.crsx.text.TextSink'
				commonargs << 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.antlr.ANTLRMeta\';)'
			
				// .nterm -> term lexer/parser
				String termparser = basename + 'Term.g4'
				crsx3runner.run([ 'sink=net.sf.crsx.text.TextSink', 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.antlr.ANTLRMeta\';)', 'rules=pg/genparser.crs', 'input=' + nterm, np ? 'np' : '', 'wrapper=MakeParser', 'output=' + termparser ])
					
				// .nterm -> meta lexer
				String metalexer = basename + 'MetaLexer.g4' // generate meta lexer
				def args = commonargs.collect()
				args << 'rules=pg/genparser.crs'
				args << "input=${nterm}"
				args << 'wrapper=MakeMetaLexer'
                args << "output=${metalexer}"
                if (!"".equals(metaPrefix))
					args << "metaprefix=${metaPrefix}"
			    if (!"".equals(defaultRule))
                    args << "defaultRule=${defaultRule}"
				crsx3runner.run(args)
				
				// .nterm -> meta parser
				String metaparser = basename + 'MetaParser.g4' // generate meta parser
				args = commonargs.collect()
				args << 'rules=pg/genparser.crs'
				args << "input=${nterm}"
				args << 'wrapper=MakeMetaParser'
				args << "output=${metaparser}"
				if (!"".equals(metaPrefix))
					args << "metaprefix=${metaPrefix}"
					
				crsx3runner.run(args)
			}
			// Cleanup
			project.delete(term)
			project.delete(nterm)
		}	
	}

}