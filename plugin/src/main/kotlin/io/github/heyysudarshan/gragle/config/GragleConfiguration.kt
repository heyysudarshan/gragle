package io.github.heyysudarshan.gragle.config

import io.github.heyysudarshan.gragle.handler.GragleConfigurationHandler
import org.gradle.api.Project

fun Project.gragle(gragleConfigurationHandlerScope: GragleConfigurationHandler.() -> Unit) {
    GragleConfigurationHandler.apply(gragleConfigurationHandlerScope)
}