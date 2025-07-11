package io.github.heyysudarshan.extension

import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import io.github.heyysudarshan.handler.GlobalModuleConfigurationHandler

enum class ModuleType {
    Android,
    Desktop,
    KotlinMultiplatformLibrary
}

data class Module(
    val type: ModuleType,
    val moduleName: String
)

/**
 * Extension function to create a new module inside your existing Gradle project using Gragle.
 *
 * This extension function lets you create a new module inside your project automatically. You can call this function
 * anywhere, but to improve readability and expect predictable behavior, it's scoped under the lambda body of the
 * [createModule] function.
 *
 * When you call this function, it takes a lambda function as its parameter, which should return [Module] as its return
 * value. You can pass any of the following functions as its argument to create a new module:
 *
 * 1. [kotlinMultiplatformLibrary]: This function creates a new Kotlin multiplatform library module inside your project.
 * You can pass this function as an argument for the [createModule] function.
 */
fun GlobalConfigurationHandler.createModule(
    module: KotlinMultiplatformConfigScope.() -> Module
) {
    val currentModule = module(KotlinMultiplatformConfigScope)
    when(currentModule.type) {
        ModuleType.KotlinMultiplatformLibrary -> {

        }
        else -> {

        }
    }
}


private fun handleKotlinMultiplatformModuleCreation(moduleName: String) {
    GlobalModuleConfigurationHandler.configure(moduleName = moduleName)
}