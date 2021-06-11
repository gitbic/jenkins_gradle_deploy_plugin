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

        project.with {
            sonarqube {
                properties {
                    property 'sonar.projectKey', "gradlePlugin"
                    property 'sonar.host.url', "http://localhost:9000"
                    property 'sonar.login', "admin"
                    property 'sonar.password', "58916092"
//                    property 'sonar.login', "08cf1b2bc8b3b0a53b37119d2c2c36b59e85750a"

//                    property 'sonar.projectName', "gradlePlugin"
//                    def time = new Date().format('dd.MM.YY HH:mm:ss')

//
//                    property 'sonar.projectVersion', "${project.version}: $time"
//                    property 'sonar.exclusions', "**/generated-src/**"
                }
            }
        }
    }
}
