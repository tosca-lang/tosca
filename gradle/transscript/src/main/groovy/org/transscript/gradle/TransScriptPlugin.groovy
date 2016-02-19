// Copyright (c) 2015 IBM Corporation.
package org.transscript.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.NamedDomainObjectContainer


class TransScriptPlugin implements Plugin<Project> {
    
	void apply(Project target) {
		target.with {
			// Create configuration, for adding dependencies
			configurations.create("transscript")
		}
    }
	
}
