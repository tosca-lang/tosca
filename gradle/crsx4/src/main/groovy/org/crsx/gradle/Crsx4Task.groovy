package org.crsx.gradle

import java.io.File;
import java.util.Optional;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.*
import org.gradle.api.tasks.incremental.IncrementalTaskInputs


class Crsx4Task extends DefaultTask {

	@InputFiles
	def sources

	@OutputDirectory
	File outputDir = project.buildDir

	@Input
	String packageName = ""

	@TaskAction
	def generate(IncrementalTaskInputs inputs) {
		// Configure Crsx3 runner
		MainRunner crsx3runner = new MainRunner(project.configurations.crsx4.files, "net.sf.crsx.run.Crsx")
		
		inputs.outOfDate { change ->

			def source = change.file
			println "compile ${source}"

			def dest = computeDestination(source)
			def args = []
			args << 'sink=net.sf.crsx.text.TextSink'
			args << 'grammar=(\'net.sf.crsx.text.Text\';\'org.crsx.parser.CrsxMetaParser\';)'
			args << 'rules=crsx.crs'
			args << "term=\"${source}\""
			args << "output=${dest}"
			args << "wrapper=Compile"
			args << "verbose=3"
			if (!"".equals(packageName))
			{
				args << "javabasepackage=${packageName}"

				// Compute subpackage name
				String subpackage = source.parentFile.absolutePath.replace("${sources.dir}", '').replace('/', '.')
				if (!"".equals(subpackage))
				{
					subpackage = subpackage.replaceFirst('.', '')
					args << "javapackage=${subpackage}"
				}
			}
			//println args
			crsx3runner.run(args)
		}
		
		inputs.removed { change ->
			def source = change.file
			println "removed: ${source}"
			def dest = file(computeDestination(source))
			delete dest
		}
	}
	
	def computeDestination(File source) { 
		def dest = source.absolutePath.replace((String) sources.dir, (String) outputDir).replace(".crs", ".java");
		def lastSlash = dest.lastIndexOf('/');
		if (lastSlash != -1)
			dest = dest[0..lastSlash] + dest[lastSlash + 1].toUpperCase() + dest[lastSlash + 2..-1]
		else
			dest = dest[0].toUpperCase() + dest[1..-1]
		dest
	}
	 
}