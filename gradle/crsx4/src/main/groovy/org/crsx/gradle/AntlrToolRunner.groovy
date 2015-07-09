// Copyright (c) 2015 IBM Corporation.
package org.crsx.gradle

import java.lang.reflect.Method

/**
 * Run Antlr tool. 
 * 
 * Cannot use Antlr main as System.exit is called.
 * 
 * @author Lionel Villard
 */
class AntlrToolRunner {
	
	/* The class containing main */
	Class toolclass
	
	AntlrToolRunner(Set<File> classpath) {
		URLClassLoader classLoader = new URLClassLoader(classpath.collect({file -> file.toURI().toURL()}) as URL[], MainRunner.class.getClassLoader())
	
		toolclass = new GroovyClassLoader(classLoader).loadClass("org.antlr.v4.Tool");
	}
	
	public void run(List<String> args) {
		def tool = toolclass.newInstance(args as String[])
		tool.processGrammarsOnCommandLine()
	}

}