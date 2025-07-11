package io.github.heyysudarshan.config

import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import org.gradle.api.Project

/**
 * Extension function to configure Gragle's global settings.
 *
 * This function provides access to the [GlobalConfigurationHandler], allowing you to enable or disable
 * various Gragle features such as custom build directory locations, automatic group ID assignment, and more.
 *
 * By accessing the scope of [GlobalConfigurationHandler] in this extension function's lambda block, you can also
 * use Gragle APIs like `createModule` to automatically add new modules to your existing project declaratively.
 *
 * Note: Changes made using this configuration will apply globally and affect all modules in the project.
 */
fun Project.gragle(globalConfigurationHandlerScope: GlobalConfigurationHandler.() -> Unit) {
    globalConfigurationHandlerScope(GlobalConfigurationHandler)
}