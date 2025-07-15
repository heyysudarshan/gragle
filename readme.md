### What is Gragle?

`Gragle` is a powerful Gradle plugin designed to simplify and automate build configurations for Kotlin-based projects.
It enables effortless setup of `build.gradle.kts` files with minimal effort for Android, Desktop (JVM with Compose
Multiplatform), and Kotlin Multiplatform projects.

By offering high-level APIs, Gragle streamlines project configuration and eliminates repetitive build logic across
multiple modules and projects. Using Gragle, you can focus more on writing clean, efficient code instead of dealing with
complex build setups, and Gragle will take care of all the configurations for you.

### Why Gragle Exits?

While working on a Kotlin Multiplatform project, I realized I was duplicating the same logic across all modules because
my project was divided into multiple parts. At first, it didn’t bother me much, but as the project grew, managing build
configurations became frustrating. Every time I added a new module, I had to repeat the same configuration steps and
write the same code, which slowed down development and increased the chances of mistakes.

That’s when I decided to create a plugin that could automate and simplify this entire process. I wanted something
reusable, not just for this project but for future ones as well. That’s how the idea of the Gragle plugin was born. I
started developing it to reduce repetitive work and improve consistency across modules. I made it open-source so others
could benefit from it and contribute to its improvement.

### Installation guide

To get started, add the Gragle plugin to your existing project. If you're creating a new project, consider using the
[Gragle Project Wizard](http://localhost:3000/project-wizard). This wizard provides a minimal Gradle project that you
can extend using the Gragle plugin.

To apply Gragle to any existing project, copy and paste the following line of code under your module's plugins block.

```groovy
id("io.github.heyysudarshan.gragle") version "1.0.0-Alpha" 
```

Note: Your project must have a `libs.version.catalog` file because Gragle uses it to enable some default features.

### Learn Gragle

Check out [Gragle learning](https://heyysudarshan.github.io/gragle/learn-gragle) guides to learn how to use Gragle
effectively.

### Contributing to Gragle

I'm always open to accepting contributions from all developers. If you find Gragle helpful and want to extend it,
consider contributing to the Gragle plugin's development. Your changes and improvements will help other developers who
use this plugin. See [contributing to Gragle](https://heyysudarshan.github.io/gragle/contribute) for more details.

### Thank you

I would like to thank you for checking out this project. It started as a personal project, but it’s evolving into
something more. If you appreciate my efforts, please consider leaving a star on this GitHub repository. Happy coding!