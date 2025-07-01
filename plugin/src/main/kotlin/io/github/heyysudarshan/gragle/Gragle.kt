package io.github.heyysudarshan.gragle

import io.github.heyysudarshan.gragle.config.configureBuildDirectory
import io.github.heyysudarshan.gragle.config.configureGroupIdAndVersion
import io.github.heyysudarshan.gragle.handler.GragleConfigurationHandler
import io.github.heyysudarshan.gragle.util.ProjectDirectoryNameManager
import org.gradle.api.Plugin
import org.gradle.api.Project

class Gragle: Plugin<Project> {
    override fun apply(target: Project) {
        defaultConfiguration(target = target)
    }

    private fun defaultConfiguration(target: Project) {
        if (GragleConfigurationHandler.assignGroupIdAndVersion) {
            target.configureGroupIdAndVersion()
        }

        if (GragleConfigurationHandler.customBuildDirectory) {
            val formattedProjectDirectoryName = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
                projectDirectoryName = target.name
            )
            target.configureBuildDirectory(buildDirectoryPath = formattedProjectDirectoryName)
        }
    }
}