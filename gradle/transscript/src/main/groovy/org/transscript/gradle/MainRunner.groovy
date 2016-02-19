// Copyright (c) 2015 IBM Corporation.
package org.transscript.gradle

import java.lang.reflect.Method
import org.gradle.api.tasks.*
import org.gradle.api.file.FileCollection
import org.gradle.api.Project
/**
 * Dynamically load a class and run main(). 
 * 
 * @author Lionel Villard
 */
class MainRunner {
	
	Project project_
	
	/* The class containing main */
	String classname_
	
	/* The classpath to use */
	FileCollection classpath_
	
	MainRunner(Project project, Set<File> classpath, String classname) {
		project_ = project
		classname_ = classname
		classpath_ = project.files(classpath)
	}
	
	public void run(List<String> jargs) {
		project_.javaexec {
			main = classname_
			classpath = classpath_
			args      = jargs
		}	
	}

}