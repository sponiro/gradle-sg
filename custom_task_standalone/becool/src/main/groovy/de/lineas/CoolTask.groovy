package de.lineas

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CoolTask extends DefaultTask {

    Integer repeatMessage = 3

    void setRepeatMessage(Integer repeatCount) {
        if (repeatCount == null) {
            repeatMessage = 1
        } else {
            repeatMessage = repeatCount
        }
    }

    CoolTask() {
        doLast {
            println "Constructor init"
        }
    }

    @TaskAction
    def beCool() {
        repeatMessage.times {
            println "I am very cool"
        }
    }
}