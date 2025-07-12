package io.github.heyysudarshan.config

import io.github.heyysudarshan.util.ProjectDirectoryNameManager
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension

internal fun configureGroupIdAndVersion(project: Project) {
    val libs = project.extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")

    val formattedProjectDirectoryName = ProjectDirectoryNameManager
        .getFormattedProjectDirectoryName(projectDirectoryName = project.name)

    val groupIdIdentifier = "$formattedProjectDirectoryName-groupId"
    val versionIdentifier = "$formattedProjectDirectoryName-version"

    val groupId = libs.findVersion(groupIdIdentifier).orElseThrow {
        IllegalArgumentException(
            """
                To let Gragle set the groupId for the ${project.name} module automatically, add a version for `$groupIdIdentifier` in your version catalog.
                If you don’t want Gragle to do this, just set `assignGroupIdAndVersion = false` in the gragle {} block of your root build.gradle.kts file.
            """.trimIndent()
        )
    }
    val version = libs.findVersion(versionIdentifier).orElseThrow {
        IllegalArgumentException(
            """
                To let Gragle set the groupId for the ${project.name} module automatically, add a version for `$versionIdentifier` in your version catalog.
                If you don’t want Gragle to do this, just set `assignGroupIdAndVersion = false` in the gragle {} block of your root build.gradle.kts file.
            """.trimIndent()
        )
    }

    project.group = groupId
    project.version = version
}