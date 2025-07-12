package io.github.heyysudarshan.handler

/**
 * Handles global configuration settings for the Gragle plugin.
 *
 * This object defines global properties that influence how the Gragle plugin operates across your project.
 * The settings here are applied at the project level and affect all modules.
 *
 * Properties:
 * - `customBuildDirectory`: Determines whether a custom build directory should be configured for
 *   each module in the project.
 * - `groupAndIdAssignment`: Controls whether the `groupId` and `version` should be automatically
 *   assigned to a module based on entries in the `libs.versions.toml` file.
 */
object GlobalConfigurationHandler {
    var customBuildDirectory = true
    var groupAndIdAssignment = true
}