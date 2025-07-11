import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.gradle.plugin.development)
}

group = libs.versions.plugin.groupId.get()
version = libs.versions.plugin.version.get()

val name = libs.versions.plugin.name.get()

gradlePlugin {
    plugins {
        create(name) {
            id = libs.versions.plugin.id.get()
            version = libs.versions.plugin.version.get()
            implementationClass = libs.versions.plugin.implementationClass.get()
        }
    }
}

dependencies {
    testImplementation(libs.kotlin.test)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
        vendor.set(JvmVendorSpec.ADOPTOPENJDK)
    }
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/plugin"))