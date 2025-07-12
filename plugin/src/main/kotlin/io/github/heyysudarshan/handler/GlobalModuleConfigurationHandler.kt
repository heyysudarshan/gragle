package io.github.heyysudarshan.handler

import java.io.File

internal object GlobalModuleConfigurationHandler {

    fun configure(moduleName: String) {
        addModuleToSettingsFile(moduleName = moduleName)
        createModuleDirectory(moduleName = moduleName)
        createBuildGradleFile(moduleName = moduleName)
    }

    private fun addModuleToSettingsFile(moduleName: String): Any? {
        val settingsFile = File("settings.gradle.kts")
        if (!settingsFile.exists()) {
            throw IllegalArgumentException("""
                Please note that Gragle is designed for multi-module projects, but your project is missing a `settings.gradle.kts` file, which is essential for any multi-module setup. 
                If you’ve accidentally deleted it, please add it back. Otherwise, consider opting out of using Gragle for single-module projects.
            """.trimIndent())
        }

        val settingsFileLines = settingsFile.readLines()
        val statementToAppend = """include(":$moduleName")"""

        if (!settingsFileLines.contains(element = statementToAppend)) {
            settingsFile.appendText(text = "\n$statementToAppend")
        }

        return Unit
    }

    private fun createModuleDirectory(moduleName: String) {
        val moduleDirectory = File(moduleName)
        if (!moduleDirectory.exists()) {
            moduleDirectory.mkdir()
        }
    }

    private fun createBuildGradleFile(moduleName: String) {
        val buildGradleFile = File("$moduleName/build.gradle.kts")
        if (!buildGradleFile.exists()) {
            buildGradleFile.createNewFile()
        }
    }
}