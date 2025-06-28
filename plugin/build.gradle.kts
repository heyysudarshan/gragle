import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.gradle.plugin.development)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
        vendor = JvmVendorSpec.ADOPTIUM
    }
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

val pluginName = libs.versions.gragle.name.get()
gradlePlugin {
    plugins {
        create(pluginName) {
            id = libs.versions.gragle.groupId.get()
            version = libs.versions.gragle.version.get()
            implementationClass = libs.versions.gragle.implementationClass.get()
        }
    }
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/plugin"))