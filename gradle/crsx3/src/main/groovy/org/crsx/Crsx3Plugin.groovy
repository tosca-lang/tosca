package org.crsx

import org.gradle.api.Project
import org.gradle.api.Plugin


class Crsx3Plugin implements Plugin<Project> {
    void apply(Project target) {
		target.configurations.create("crsx3") 
    }
}