plugins {
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.gradle.plugin.development) apply false
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/project"))