// Copyright (c) 2015-2017 IBM Corporation.
package org.transscript.gradle

import java.io.File; 

import javax.swing.text.InternationalFormatter.IncrementAction;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.*

class TransScriptTask extends DefaultTask {

	@InputFiles
	def dependencies

	@OutputDirectory
	@Optional
	File outputDir = project.buildDir

    @Input
    def sources

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
    
    @Input
    @Optional
    boolean nostd = false
    
    @Input
    @Optional
    String parsers = ""
    
    @Input
	@Optional
	String metaprefix = ""
	
	@Input
    @Optional
    String defaultrule = ""
    
    @Input
    @Optional
    String sortsuffix = "_sort"
    
    @Input
    @Optional
    String prefixsep = "_"
    
    @Input
    @Optional
    boolean notext = false
        
    @Input
    @Optional
    String location = ""
    
	@TaskAction
	def generate() {
        logger.info("Tosca classpath: ${project.configurations.transscript.files}")
		
		sources.each { source ->
			
			logger.lifecycle "process ${source}"
			
			def jargs = []
				
			jargs << command
			if ("pg".equals(command))
				jargs << "grammar=${source}"
			else	
				jargs << "rules=${source}"
			if (sourceOnly)
				jargs << "only-source"
            if (bootstrap)
                jargs << "bootstrap"
            if (cpp)
                jargs << "cpp"
            if (infer)
                jargs << "infer"
            if (nostd)
                jargs << "nostd"
            if (!"".equals(metaprefix))
            	jargs << "metaprefix=${metaprefix}"
            if (!"".equals(defaultrule))
          	  	jargs << "defaultrule=${defaultrule}"
           	jargs << "suffix=${sortsuffix}"
           	jargs << "prefixsep=${prefixsep}"
           	if (notext)
                jargs << "notext"
          	if (!"".equals(location))
          	  	jargs << "location=${location}"
           
            jargs << "build-dir=${outputDir}" 
			if (bootparserpath != null)
				jargs << "bootparserpath=${bootparserpath}"
			jargs << "base=${sources.dir}"
						
			if (!"".equals(pkg))
				jargs << "javabasepackage=${pkg}"
			
			if (!"".equals(parsers))
				jargs << "parsers=${parsers}"
			
			logger.debug "run Tosca with args" + " " + jargs
			
			 project.javaexec {
				main      = "org.transscript.Tool"
				classpath = project.files(project.configurations.transscript.files)
				args      = jargs
				jvmArgs   = ['-Xss8192K', '-ea']
			}
		}
		
	}
	
}