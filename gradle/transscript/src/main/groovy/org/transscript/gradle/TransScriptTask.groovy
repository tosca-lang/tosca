// Copyright (c) 2015-2016 IBM Corporation.
package org.transscript.gradle

import java.io.File; 

import javax.swing.text.InternationalFormatter.IncrementAction;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.*
import org.gradle.api.tasks.incremental.IncrementalTaskInputs

class TransScriptTask extends DefaultTask {

	@InputFiles
	def sources

	@OutputDirectory
	@Optional
	File outputDir = project.buildDir

	// Base package name.
	@Input
	@Optional
	String pkg = ""  

	@Input
	@Optional
	String command = 'build'
	
	@Input
	@Optional
	boolean sourceOnly = true
	
	@Input
	@Optional
	String bootparserpath = null
	
	@Input
    @Optional
    boolean bootstrap = false
    
    @Input
    @Optional
    boolean infer = false
    
    @Input
    @Optional
    boolean cpp = false
       
    
	@TaskAction
	def generate(IncrementalTaskInputs inputs) {
		logger.info("Tosca classpath: ${project.configurations.transscript.files}")
		
		inputs.outOfDate { change ->
			def source = change.file
			logger.lifecycle "process ${source}"
			
			def jargs = []
				
			jargs << command
			jargs << "rules=${source}"
			if (sourceOnly)
				jargs << "only-source"
            if (bootstrap)
                jargs << "bootstrap"
            if (cpp)
                jargs << "cpp"
            if (infer)
                jargs << "infer"
			jargs << "build-dir=${outputDir}" 
			if (bootparserpath != null)
				jargs << "bootparserpath=${bootparserpath}"
			jargs << "base=${sources.dir}"
						
			if (!"".equals(pkg))
				jargs << "javabasepackage=${pkg}"
			
			logger.debug "run Tosca with args" + " " + jargs
			
			 project.javaexec {
				main      = "org.transscript.Tool"
				classpath = project.files(project.configurations.transscript.files)
				args      = jargs
				jvmArgs   = ['-ea', '-Xss8192K']
			}
		}
		
		inputs.removed { change ->
			def source = change.file
			logger.lifecycle "should removed generated file corresponding to ${source}"
		}
	}
}