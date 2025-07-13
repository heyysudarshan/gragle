import Spacer from "@/components/Spacer";
import Link from "next/link";
import NextArticleNavigator from "@/components/NextArticleNavigator";

const Article1 = () => {
    return (
        <div>
            <section className="article-heading-and-overview">
                <h2 className="title-large bold primary-font-color">
                    Gragle Documentation
                </h2>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    Welcome to Gragle Documentation: your guide to simplifying and automating Gradle project
                    configurations.
                </p>
            </section>
            <hr/>
            <section className="article-body-section">
                <h3 className="title-medium bold primary-font-color">
                    What is Gragle?
                </h3>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    Gragle is a build-configuration automation plugin designed to make build-configuration (i.e.,
                    writing your<span className="highlighted-content">build.gradle.kts</span>files) easier and simpler.
                    It's a plugin for those who use Gradle as their build tool of choice. You can automate many tasks by
                    just applying this plugin inside each module of your project. It automates the following tasks by
                    default, like
                </p>
                <Spacer className="spacer-8px-height"></Spacer>
                <ul className="body-list">
                    <li className="body-large medium secondary-font-color">
                        Automatically customizing the build output directory location for each module inside your
                        project that applies the Gragle plugin,
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Automatically assigning properties like<span className="highlighted-content">groupId</span>and
                        <span className="highlighted-content">version</span>to each module by looking for their
                        declarations inside your project's version catalog,
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Creation of new modules inside any existing project.
                    </li>
                </ul>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    I'm planning to add more tasks that Gragle will automate for your project as this project grows and
                    developers give feedback.
                </p>
                <Spacer className="spacer-12px-height"></Spacer>
                <h4 className="title-medium bold primary-font-color">
                    Features
                </h4>
                <Spacer className="spacer-12px-height"></Spacer>
                <ul className="body-list">
                    <li className="body-large medium secondary-font-color">
                        Automate build directory output location customization.
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Automate assignment of<span className="highlighted-content">groupId</span>and
                        <span className="highlighted-content">version</span>for all modules.
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Guides on structuring your project for multi-module builds.
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Add new modules inside of your project by just calling functions in the root
                        <span className="highlighted-content">build.gradle.kts</span>file of your project.
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Simplify Kotlin Multiplatform project configurations in multi-module projects.
                    </li>
                    <Spacer className="spacer-8px-height"></Spacer>
                    <li className="body-large medium secondary-font-color">
                        Share common dependencies between modules.
                    </li>
                </ul>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    If you find Gragle helpful and want to extend it for other use cases, then you can contribute to the
                    development of this plugin. To contribute to this plugin, see
                    <Link href="/contribute">contributing to Gragle.</Link>
                </p>
            </section>
            <hr/>
            <section className="article-body-section">
                <h3 className="title-medium bold primary-font-color">
                    Why to use Gragle?
                </h3>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    Well, you can do pretty much everything using core DSL APIs provided by the plugins you use, like
                    Kotlin Multiplatform Plugin, Android Gradle Plugin, etc., but these configurations become hard to
                    manage in multi-module builds. Gragle provides high-level APIs to configure Kotlin Multiplatform,
                    Android, and Desktop JVM (with Compose Multiplatform) modules easily. You don't even have to worry
                    about plugin management. You can apply required plugins for a specific model by just calling
                    Gragle-provided functions.
                </p>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    Also, Gragle is developed to simplify and automate build configuration across multi-project builds
                    from day 0. You get many features from this plugin, which makes it easy to work with multi-module
                    projects.
                </p>
            </section>
            <hr/>
            <section className="article-body-section">
                <h3 className="title-medium bold primary-font-color">
                    How to get started?
                </h3>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    Interested in exploring the APIs provided by this plugin or want to see what it offers? Here's how
                    you can get started.
                </p>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    <span className="dash">-</span><Link href="/learn-gragle/installation">Installation guide: </Link>
                    Follow these steps to easily add and use this plugin in your project.
                </p>
                <Spacer className="spacer-8px-height"></Spacer>
                <p className="body-large medium secondary-font-color">
                    <span className="dash">-</span><Link href="/learn-gragle/layout">Usage Guide: </Link>Learn how to
                    use this plugin effectively in your project.
                </p>
            </section>
            <section className="article-footer">
                <div></div>
                <NextArticleNavigator
                    label="Installation Guide"
                    route="/learn-gragle/installation">
                </NextArticleNavigator>
            </section>
        </div>
    );
};

export default Article1;