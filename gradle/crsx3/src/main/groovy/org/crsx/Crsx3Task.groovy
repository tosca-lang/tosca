package org.crsx

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Crsx3Task extends DefaultTask {
	
	//RUNCRSX = $(JAVA) -Dfile.encoding=UTF-8 -Xss20000K -Xmx2000m -cp $(CRSXLIB):$(CRSXHOME)/targets/java/build:$(CRSXHOME)/targets/java/lib/antlr-runtime-4.5.jar net.sf.crsx.run.Crsx allow-unnamed-rules allow-missing-cases
	
	
	@TaskAction
	def generate() {
		inputs.getFiles().each { File input ->
			Collection realargs = ['output=' + outputs.getFiles().getSingleFile(), 'allow-unnamed-rules', 'allow-missing-cases']
			
			//'-Dfile.encoding=UTF-8', 	  
			  
			project.javaexec {
				main 'org.net.sf.run.Crsx'
				classpath project.configurations.crsx3.asPath
				args realargs
				workingDir pwd
			}
		}
	}
}