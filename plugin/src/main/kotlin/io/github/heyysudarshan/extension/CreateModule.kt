package io.github.heyysudarshan.extension

import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import io.github.heyysudarshan.handler.GlobalModuleConfigurationHandler

object CreateModulesScope

/**
 * Extension function to create a new module inside your existing Gradle project using Gragle.
 *
 * This extension function lets you create a new module inside your project automatically. You can call this function
 * anywhere, but to improve readability and expect predictable behavior, it's scoped under the lambda body of the
 * [createModule] function.
 *
 * When you call this function, it takes a lambda function as its argument. You can pass any of the following functions
 * as its argument to create a new module:
 *
 * 1. [kotlinMultiplatformLibrary]: This function creates a new Kotlin multiplatform library module inside your project.
 * You can pass this function as an argument for the [createModule] function.
 */
fun GlobalConfigurationHandler.createModule(
    module: CreateModulesScope.() -> Unit
) {
    module(CreateModulesScope)
}
