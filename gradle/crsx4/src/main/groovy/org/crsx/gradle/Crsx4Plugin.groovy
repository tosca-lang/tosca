// Copyright (c) 2015 IBM Corporation.
package org.crsx.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.NamedDomainObjectContainer


class Crsx4Plugin implements Plugin<Project> {
    
	void apply(Project target) {
		target.with {
			// Create configuration, for adding dependencies
			configurations.create("crsx4")

			// Create default tasks
			//tasks.create(name:'crsx4', type:Crsx4Task)
			//tasks.create(name:'pg4', type:PG4Task)
			//tasks.create(name:'antlr4', type:Antlr4Task)
		}
    }
	
}
