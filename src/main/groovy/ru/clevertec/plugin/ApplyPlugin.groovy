package ru.clevertec.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ApplyPlugin implements Plugin<Project> {
    static final PLUGIN_IDS = [
            'jacoco-plugin',
            'sonar-plugin'
    ]

    @Delegate
    Project project

    @Override
    void apply(Project project) {
        this.project = project

        if (project == project.rootProject) {
            PLUGIN_IDS.each { project.plugins.apply(it) }

        }
    }
}
