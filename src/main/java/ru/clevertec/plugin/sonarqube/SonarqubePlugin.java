package ru.clevertec.plugin.sonarqube;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SonarqubePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {

//        project.getPluginManager().apply("org.sonarqube");

        project.task("helloSonar").doLast(task -> {
            System.out.println("Hello from sonar plugin");
        });

    }
}
