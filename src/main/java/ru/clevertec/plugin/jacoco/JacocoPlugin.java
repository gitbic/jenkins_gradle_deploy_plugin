package ru.clevertec.plugin.jacoco;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JacocoPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getPluginManager().apply("jacoco");


        project.task("hello").doLast(task -> {
            System.out.println("Hello from jacoco plugin");
        });

        project.task("jacocoRun").dependsOn("test").dependsOn("jacocoTestReport");
    }
}

