package io.github.heyysudarshan.config

import io.github.heyysudarshan.extension.createModule
import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import org.gradle.api.Project

/**
 * Extension function to configure Gragle's global settings.
 *
 * This function provides access to the [GlobalConfigurationHandler]'s scope, allowing you to enable or disable
 * various Gragle features such as custom build directory locations, automatic group ID assignment, and more.
 *
 *
 * Note: Changes made using this configuration will apply globally and affect all modules in the project. Also, you
 * should use this block only once in your file, and that too in the root `build.gradle.kts file`.
 */


/**
 * Extension function to configure Gragle's global settings from root `build.gradle.kts` of your project.
 *
 * This function allows you to configure global settings for the Gragle plugin. It provides access to the scope of the
 * [GlobalConfigurationHandler] class inside the lambda body. This class contains properties that Gragle uses to:
 * - Set a custom build directory for every module inside your project,
 * - Finds declarations for `groupId` and `version` from `libs.versions.toml` file of your project and assigns them
 * automatically,
 * - Other global configurations.
 *
 * You can disable these features of Gragle using this extension function, like
 *
 * ```
 * // Root build.gradle.kts
 * gragle {
 *     customBuildDirectory = false
 *     groupAndIdAssignment = false
 * }
 * ```
 *
 * By accessing the scope of [GlobalConfigurationHandler] in this extension function's lambda block, you can also
 * use Gragle APIs like [createModule] to automatically add new modules to your existing project declaratively in the
 * following way:
 *
 * ```
 * gragle {
 *     createModule {
 *         kotlinMultiplatformLibrary {
 *             moduleName = "julie"
 *             targetType = TargetType.MobileTargets
 *         }
 *     }
 * }
 * ```
 *
 * Note: Changes made using this configuration will apply globally and affect all modules in the project. Also, you
 * should use this block only once in your file, and that too in the root `build.gradle.kts file`.
 */
fun Project.gragle(globalConfigurationHandlerScope: GlobalConfigurationHandler.() -> Unit) {
    globalConfigurationHandlerScope(GlobalConfigurationHandler)
}