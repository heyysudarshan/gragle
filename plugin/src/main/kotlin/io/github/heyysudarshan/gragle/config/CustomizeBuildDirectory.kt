package io.github.heyysudarshan.gragle.config

import io.github.heyysudarshan.gragle.util.ProjectDirectoryNameManager
import org.gradle.api.Project

internal fun customizeBuildDirectory(project: Project) {
    val projectDirectoryFormattedName = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
        projectDirectoryName = project.name
    )
    val buildDirectoryName = "${project.rootProject}/.build/$projectDirectoryFormattedName"

    project.layout.buildDirectory.set(project.file(buildDirectoryName))
}