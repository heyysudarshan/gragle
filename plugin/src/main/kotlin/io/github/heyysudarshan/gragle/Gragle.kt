package io.github.heyysudarshan.gragle

import io.github.heyysudarshan.gragle.config.configureGroupIdAndVersion
import io.github.heyysudarshan.gragle.config.customizeBuildDirectory
import io.github.heyysudarshan.gragle.handler.GlobalConfigurationHandler
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Implementation of a Gradle plugin responsible for applying global configurations to a project.
 *
 * This plugin enables specific global configurations for a Gradle project by using properties from the
 * `GlobalConfigurationHandler`. The configurations include:
 *
 * - Customizing the build directory for each module in the project.
 * - Automatically assigning `groupId` and `version` to modules based on the version catalog definitions in the project.
 *
 * ### Features:
 *
 * - **Custom Build Directory**: If the `customBuildDirectory` property in `GlobalConfigurationHandler` is enabled,
 *   the plugin assigns a custom build directory path for modules.
 * - **GroupId and Version Assignment**: If the `groupAndIdAssignment` property in `GlobalConfigurationHandler` is enabled,
 *   the plugin automatically assigns `groupId` and `version` to modules using identifiers defined in the version catalog.
 *
 * The plugin relies on project-specific configurations found in the root project's version catalog and properties
 * accessible through the `GlobalConfigurationHandler` class.
 */
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