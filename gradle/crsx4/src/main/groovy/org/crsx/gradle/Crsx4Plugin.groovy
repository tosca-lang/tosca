package org.crsx.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.NamedDomainObjectContainer


class Crsx4Plugin implements Plugin<Project> {
    
	void apply(Project target) {
		target.with {
			// Create configuration, for adding dependencies
			configurations.create("crsx4")
		
//		// Create and install the extension object
//		target.extensions.create("crsx4", Crsx4Extension,
//			target.container(Grammar),
//			target.container(Crsx))
//		
			// Create default tasks
			tasks.create(name:'crsx4', type:Crsx4Task)
			tasks.create(name:'pg4', type:PG4Task)
			tasks.create(name:'antlr4', type:Antlr4Task)
		}
    }
}
//
//class Grammar
//{
//	final String name
//	
//	String input
//	
//	Grammar(name) {
//		this.name = name
//	}
//	
////	void input(Closure closure) {
////		this.input.inputs.configure(closure)
////	}
//}
//
//class Crsx
//{
//	final String name
//	
//	String input
//	
//	Crsx(name) {
//		this.name = name
//	}
//	
////	void input(Closure closure) {
////		this.input.inputs.configure(closure)
////	}
//}
//
//class Crsx4Extension {
//
//	final NamedDomainObjectContainer<Grammar> grammars
//	
//	final NamedDomainObjectContainer<Crsx> crsxs
//	
//	String context
//	
//	Crsx4Extension(grammars, crsxs) {
//		this.grammars = grammars
//		this.crsxs = crsxs
//	}
//	
//	def grammars(Closure closure) {
//		this.grammars.configure(closure)
//	}
//	
//	def crsxs(Closure closure) {
//		this.crsxs.configure(closure)
//	}
//}