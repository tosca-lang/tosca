// Copyright (c) 2015 IBM Corporation.
package org.crsx.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.*

class Antlr4Task extends DefaultTask {
	
	@InputFile
	File grammar 
	
	@InputFile
	@Optional
	File lexer = null
	
	@OutputDirectory
	File generatedFileDir = project.file("${project.buildDir}/antlr4")

	@Input
	@Optional
	String packageName = ""
	
	@Input
	@Optional
	String superClass = ""

	@TaskAction
	def generate() {
		
		// Configure ANTLR4 runner
		AntlrToolRunner antlr4runner = new AntlrToolRunner(project.configurations.crsx4.files)
		
		if (lexer != null)
		{
			def args = []
			args << '-o' << generatedFileDir.absolutePath
			if (!"".equals(packageName))
				args << '-package' << packageName
			args << lexer.absolutePath
			
			antlr4runner.run(args)
		}
	
		def args = []
		args << '-o' << generatedFileDir.absolutePath
		if (!"".equals(packageName))
			args << '-package' << packageName
			
		if (!"".equals(superClass))
			args << "-DsuperClass=${superClass}" 
		
		args << grammar.absolutePath
			
		antlr4runner.run(args)
	}

}