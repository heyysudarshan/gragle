package io.github.heyysudarshan.gragle.config

import io.github.heyysudarshan.gragle.handler.GlobalConfigurationHandler
import org.gradle.api.Project

fun Project.gragle(globalConfigurationHandlerScope: GlobalConfigurationHandler.() -> Unit) {
    globalConfigurationHandlerScope(GlobalConfigurationHandler)
}