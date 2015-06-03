package org.crsx

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Antlr4Task extends DefaultTask {
		
	// Working directory
	String pwd = '.'
		
	// Target language. Default: java
	String language = 'Java'
	
	// Super class to override
	String superClass = null
	
	// Package name
	String packageName = null
	
	@TaskAction
	def generate() {
		inputs.getFiles().each { File input ->
			Collection realargs = [input.name, '-o', outputs.getFiles().getSingleFile()]
			if (superClass != null)
			{	realargs.addAll('-DsuperClass=' + superClass) }
			
			if (packageName != null)
			{	realargs.addAll(['-package', packageName]) } 
			  
			  
			project.javaexec {
				main 'org.antlr.v4.Tool'
				classpath project.configurations.antlr4.asPath
				args realargs
				workingDir pwd
			}
		}
	}
}