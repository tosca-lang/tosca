// Copyright (c) 2015 IBM Corporation.
package org.crsx.gradle

import java.io.File; 

import javax.swing.text.InternationalFormatter.IncrementAction;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.*
import org.gradle.api.tasks.incremental.IncrementalTaskInputs


class Crsx4Task extends DefaultTask {

	@InputFiles
	def sources

	@OutputDirectory
	@Optional
	File outputDir = project.buildDir

	@Input
	@Optional
	String packageName = "" // Base package name 

	@Input
	@Optional
	boolean usecompiler = false

	
	@TaskAction
	def generate(IncrementalTaskInputs inputs) {
		logger.info("crsx4 classpath: ${project.configurations.crsx4.files}")
		MainRunner crsxrunner = new MainRunner(project.configurations.crsx4.files, usecompiler ? "org.crsx.Crsx": "net.sf.crsx.run.Crsx")
		
		inputs.outOfDate { change ->
			def source = change.file
			logger.lifecycle "compile ${source}"
			
			def args = []
			def subpackage = ""
			
			// Compute subpackage name. 
			subpackage = source.parentFile.absolutePath.replace("${sources.dir}", '').replace('/', '.')
			if (!"".equals(subpackage))
				subpackage = subpackage.replaceFirst('.', '')
			
			if (usecompiler) {
				args << 'build'
				args << "rules=${source}"
				args << "only-source"
				args << "build-dir=${outputDir}"
			}
			else {
				def dest = computeDestination(source)
				
				args << 'sink=net.sf.crsx.text.TextSink'
				args << 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.parser.CrsxMetaParser\';\'org.crsx.core.CoreMetaParser\';\'org.crsx.text.Text4MetaParser\';)'
				args << 'rules=crsx.crs'
			
				args << "term=\"${source}\""
				args << "output=${dest}"
				args << "wrapper=Compile"
			}
						
			if (!"".equals(packageName))
				args << "javabasepackage=${packageName}"
			if (!"".equals(subpackage))
				args << "javapackage=${subpackage}"
			
			logger.debug "run with args" + " " + args
			
			crsxrunner.run(args)
		}
		
		inputs.removed { change ->
			def source = change.file
			logger.lifecycle "removed: ${source}"
			def dest = file(computeDestination(source))
			delete dest
		}

	}
		
	/** Compute the name of the generated java file */
	def computeDestination(File source) { 
		def dest = source.absolutePath.replace((String) sources.dir, (String) outputDir).replace(".crs4", ".java");
		def lastSlash = dest.lastIndexOf('/');
		if (lastSlash != -1)
			dest = dest[0..lastSlash] + dest[lastSlash + 1].toUpperCase() + dest[lastSlash + 2..-1]
		else
			dest = dest[0].toUpperCase() + dest[1..-1]
		dest
	}
	 
}