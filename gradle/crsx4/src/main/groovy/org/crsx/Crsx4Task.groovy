package org.crsx

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.crsx.pg.PG //TODO: when I know how to manage dependencies

class Crsx4Task extends DefaultTask {
	
	@TaskAction
	def generate() {
		project.crsx4.grammars.each { grammar ->
			// Generate grammar.g4.nterm
			
			String absname = project.file(grammar.input).absolutePath
			String term = absname + '.term'   // grammar as term file
			String nterm = absname + '.nterm' // normalize grammar
			
			project.javaexec {
				main 'org.crsx.pg.PG'
				classpath project.configurations.crsx4.asPath
				args absname, term 
			}	
			
			project.javaexec {
				main 'net.sf.crsx.run.Crsx'
				classpath project.configurations.crsx4.asPath
				args 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/normalizer.crs', 'input=' + term, 'wrapper=Normalize', 'output=' + nterm
				workingDir 'src'
			}
			
//			project.javaexec {
//				main 'net.sf.crsx.run.Crsx'
//				classpath project.configurations.crsx4.asPath
//				args 'sink=net.sf.crsx.text.TextSink' 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.pg.ANTLRMeta\';)', 'rules=pg/genparser.crs', 'input=' + nterm, 'wrapper=MakeParser', 'output=' + nterm
//				workingDir 'src'
//			}
//			
			
		}
	}
}