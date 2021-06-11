package ru.clevertec.plugin.sonarqube

import org.gradle.api.Plugin
import org.gradle.api.Project

class SonarPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {

        project.getPlugins().apply("org.sonarqube");

        project.task("helloSonar").doLast{
            System.out.println("Hello from sonar plugin");
        }

    }
}
