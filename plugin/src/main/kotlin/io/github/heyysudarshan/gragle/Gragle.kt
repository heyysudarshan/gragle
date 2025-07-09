package io.github.heyysudarshan.gragle

import io.github.heyysudarshan.gragle.config.configureGroupIdAndVersion
import io.github.heyysudarshan.gragle.config.customizeBuildDirectory
import io.github.heyysudarshan.gragle.handler.GlobalConfigurationHandler
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