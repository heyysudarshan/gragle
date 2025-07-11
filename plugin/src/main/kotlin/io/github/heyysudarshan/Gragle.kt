package io.github.heyysudarshan

import io.github.heyysudarshan.config.configureGroupIdAndVersion
import io.github.heyysudarshan.config.customizeBuildDirectory
import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import org.gradle.api.Plugin
import org.gradle.api.Project

class Gragle : Plugin<Project> {
    override fun apply(target: Project) {
        applyGlobalConfigurations(project = target.project)
    }

    private fun applyGlobalConfigurations(project: Project) {
        val setCustomBuildDirectory = GlobalConfigurationHandler.customBuildDirectory
        if (setCustomBuildDirectory) {
            customizeBuildDirectory(project = project)
        }

        val enableGroupIdAndVersion = GlobalConfigurationHandler.groupAndIdAssignment
        if (enableGroupIdAndVersion) {
            configureGroupIdAndVersion(project = project)
        }
    }
}