package org.crsx

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.NamedDomainObjectContainer


class Crsx4Plugin implements Plugin<Project> {
    
	void apply(Project target) {
		// Create configuration
		target.configurations.create("crsx4")
		
		// Create default task
		target.task('compileCrsx4', type: Crsx4Task) {
		}
		
		// Create and install the extension object
		target.extensions.create("crsx4", Crsx4Extension, 
			target.container(Grammar),
			target.container(Crsx))
    }
}

class Grammar
{
	final String name
	
	String input
	
	Grammar(name) {
		this.name = name
	}
	
//	void input(Closure closure) {
//		this.input.inputs.configure(closure)
//	}
}

class Crsx
{
	final String name
	
	String input
	
	Crsx(name) {
		this.name = name
	}
	
//	void input(Closure closure) {
//		this.input.inputs.configure(closure)
//	}
}

class Crsx4Extension {
	final NamedDomainObjectContainer<Grammar> grammars
	final NamedDomainObjectContainer<Crsx> crsxs
	
	String context
	
	Crsx4Extension(grammars, crsxs) {
		this.grammars = grammars
		this.crsxs = crsxs
	}
	
	def grammars(Closure closure) {
		this.grammars.configure(closure)
	}
	
	def crsxs(Closure closure) {
		this.crsxs.configure(closure)
	}
}