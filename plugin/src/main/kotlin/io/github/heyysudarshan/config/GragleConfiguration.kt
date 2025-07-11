package io.github.heyysudarshan.config

import io.github.heyysudarshan.handler.GlobalConfigurationHandler
import org.gradle.api.Project

fun Project.gragle(globalConfigurationHandlerScope: GlobalConfigurationHandler.() -> Unit) {
    globalConfigurationHandlerScope(GlobalConfigurationHandler)
}