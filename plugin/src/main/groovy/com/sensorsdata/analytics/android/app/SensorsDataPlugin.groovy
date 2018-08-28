package com.sensorsdata.analytics.android.app

import org.gradle.api.Plugin
import org.gradle.api.Project

public class SensorsDataPlugin implements Plugin<Project> {
    void apply(Project project) {

        println "This is my first Plugin"

        project.extensions.create("sensorsData", SensorsDataPluginConfig)

        project.task('SensorsData-Plugin-Task') << {
            println "This is my first TasK"
        }

        project.afterEvaluate {
            println("debug=" + project.sensorsData.debug)
        }
    }
}