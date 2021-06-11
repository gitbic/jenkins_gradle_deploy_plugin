package ru.clevertec.plugin.docker

import org.gradle.api.Plugin
import org.gradle.api.Project

class DockerPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.plugins.apply('com.bmuschko.docker-spring-boot-application')

        project.task('helloDocker').doLast {
            println "Hello from Docker groovy plugin"
        }

//        project.with {

//            def privateRegistry = System.properties['DOCKER_REGISTRY_HOST'] ?: 'docker.moscow.alfaintra.net'

//            docker {
//                javaApplication {
//                    tag = "${privateRegistry}/${project.name}:${project.version}"
//                    baseImage = 'docker.moscow.alfaintra.net/java:alpine-server-jre112-unlimited-ru'
//                    maintainer = 'alfabank'
//                }
//            }
//        }
//
//        project.tasks.create(
//                name: 'ufrDockerPushImage',
//                type: DefaultTask,
//                group: 'UFR',
//                description: 'UFR docker',
//                dependsOn: 'dockerBuildImage',
//        ).configure {
//            doLast {
//                def imageName = project.docker.javaApplication.tag
//                exec {
//                    commandLine 'docker', 'push', imageName
//                }
//                exec {
//                    commandLine 'docker', 'rmi', '-f', imageName
//                }
//            }
//        }
//
//        project.tasks.create(
//                name: 'dockerPushImageWithHistory',
//                dependsOn: 'ufrDockerPushImage'
//        )
//


    }
}
