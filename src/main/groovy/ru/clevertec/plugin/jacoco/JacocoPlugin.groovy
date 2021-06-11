package ru.clevertec.plugin.jacoco

import org.gradle.api.Plugin
import org.gradle.api.Project

class JacocoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.plugins.apply('jacoco')

        project.task('helloJacoco').doLast {
            println "Hello from jacoco groovy plugin"
        }

        project.task("runJacoco")
                .dependsOn("test")
                .dependsOn("jacocoTestReport")

    }
}
