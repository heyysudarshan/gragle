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
            id = libs.versions.plugin.groupId.get()
            version = libs.versions.plugin.version.get()
            implementationClass = libs.versions.plugin.implementationClass.get()
        }
    }
}