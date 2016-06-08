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
	String packageName = ""  

	@Input
	@Optional
	boolean usecompiler = false

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
	
	@TaskAction
	def generate(IncrementalTaskInputs inputs) {
		logger.info("TransScript classpath: ${project.configurations.transscript.files}")
		
		inputs.outOfDate { change ->
			def source = change.file
			logger.lifecycle "process ${source}"
			
			def jargs = []
			def subpackage = ""
			
			// Compute subpackage name. 
			subpackage = source.parentFile.absolutePath.replace("${sources.dir}", '').replace('/', '.')
			if (!"".equals(subpackage))
				subpackage = subpackage.replaceFirst('.', '')
				
			if (usecompiler) {
				jargs << command
				jargs << "rules=${source}"
				if (sourceOnly)
					jargs << "only-source"
				if (bootstrap)
                    jargs << "bootstrap"
				jargs << "build-dir=${outputDir}" 
				if (bootparserpath != null)
					jargs << "bootparserpath=${bootparserpath}"
				jargs << "base=${sources.dir}"
			} else {
				def dest = computeDestination(source)
				
				jargs << 'sink=net.sf.crsx.text.TextSink'
				jargs << 'grammar=(\'net.sf.crsx.text.Text\';\'org.transscript.parser.TransScriptMetaParser\';\'org.transscript.core.CoreMetaParser\';\'org.transscript.text.Text4MetaParser\';)'
				jargs << 'rules=crsx.crs'
			
				jargs << "term=\"${source}\""
				jargs << "output=${dest}"
				jargs << "wrapper=Compile"
			}
						
			if (!"".equals(packageName))
				jargs << "javabasepackage=${packageName}"
			//if (!"".equals(subpackage))
			//	jargs << "javapackage=${subpackage}"
			
			logger.debug "run transscript with args" + " " + jargs
			
			 project.javaexec {
				main      = usecompiler ? "org.transscript.Tool": "net.sf.crsx.run.Crsx"
				classpath = project.files(project.configurations.transscript.files)
				args      = jargs
				jvmArgs   = ['-ea', '-Xss8192K']
			}
		}
		
		inputs.removed { change ->
			def source = change.file
			def dest = file(computeDestination(source))
			logger.lifecycle "removed: ${dest}"
			
			//delete dest
		}

	}
		
	/** Compute the name of the generated java file */
	def computeDestination(File source) { 
		def dest = source.absolutePath.replace((String) sources.dir, (String) outputDir).replace(".crs4", ".java").replace(".tsc", ".java");
		def lastSlash = dest.lastIndexOf('/');
		if (lastSlash != -1)
			dest = dest[0..lastSlash] + dest[lastSlash + 1].toUpperCase() + dest[lastSlash + 2..-1]
		else
			dest = dest[0].toUpperCase() + dest[1..-1]
		dest
	}
	 
}