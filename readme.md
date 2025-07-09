### What is Gragle?

`Gragle` is a powerful Gradle plugin designed to simplify and automate build configurations for Kotlin-based projects.
It
enables effortless setup of `build.gradle.kts` files with minimal effort for Android, Desktop (JVM with Compose
Multiplatform), and Kotlin Multiplatform projects.

By offering high-level APIs, Gragle streamlines project configuration
and eliminates repetitive build logic across multiple modules and projects. By using Gragle, you can focus more on
writing clean, efficient code instead of dealing with complex build setups, and Gragle will take care of all the
configurations for you.

### Why Gragle Exits?

While working on a Kotlin Multiplatform project, I realized I was duplicating the same logic across all modules because
my project was divided into multiple parts. At first, it didn’t bother me much, but as the project grew, managing build
configurations became frustrating. Every time I added a new module, I had to repeat the same configuration steps and
write the same code, which slowed down development and increased the chances of mistakes.

That’s when I decided to create a plugin that could automate and simplify this entire process. I wanted something
reusable, not just for this project but for future ones as well. That’s how the idea of the Gragle plugin was born. I
started developing it to reduce repetitive work and improve consistency across modules. I made it open-source so others
could benefit from it and contribute to its improvement.