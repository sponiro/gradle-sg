package de.lineas

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CoolTask extends DefaultTask {

    CoolTask() {
        doLast {
            println "Constructor init"
        }
    }

    @TaskAction
    def beCool() {
        println "I am very cool"
    }

    @TaskAction
    def moreCoolness() {
        println "Lots of coolness"
    }
}