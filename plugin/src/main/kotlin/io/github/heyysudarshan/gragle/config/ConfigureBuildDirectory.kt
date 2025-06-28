package io.github.heyysudarshan.gragle.config

import org.gradle.api.Project

internal fun Project.configureBuildDirectory(buildDirectoryPath: String) {
    this.layout.buildDirectory.set(file("$rootDir/.build/$buildDirectoryPath"))
}