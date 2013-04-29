package de.lineas

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class KaratePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create("karate", KaratePluginExtension)

        // add a simple task
        Task karate = project.task('karate') {
            group = 'martial arts'
        }

        karate << {

            println "${project.karate.smartQuote}"
        }
    }
}

