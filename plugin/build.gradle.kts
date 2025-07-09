plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.gradle.plugin.development)
}

group = libs.versions.plugin.groupId.get()
version = libs.versions.plugin.version.get()

gradlePlugin {
    plugins {
        create("Gragle") {
            id = libs.versions.plugin.groupId.get()
            version = libs.versions.plugin.version.get()
            implementationClass = libs.versions.plugin.implementationClass.get()
        }
    }
}