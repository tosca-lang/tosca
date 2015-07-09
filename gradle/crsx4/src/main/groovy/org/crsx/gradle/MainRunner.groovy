// Copyright (c) 2015 IBM Corporation.
package org.crsx.gradle

import java.lang.reflect.Method

/**
 * Dynamically load a class and run main(). 
 * 
 * @author Lionel Villard
 */
class MainRunner {
	
	/* The class containing main */
	Class mainclass
	
	/* The classloader to use */
	URLClassLoader classLoader
	
	MainRunner(Set<File> classpath, String classname) {
		classLoader = new URLClassLoader(classpath.collect({file -> file.toURI().toURL()}) as URL[], MainRunner.class.getClassLoader());
		mainclass = new GroovyClassLoader(classLoader).loadClass(classname);
	}
	
	public void run(List<String> args) {
		def thread = Thread.start { 
			Thread.currentThread().setContextClassLoader(classLoader);
			mainclass.main(args as String[])
		}
		thread.join()
	}

}