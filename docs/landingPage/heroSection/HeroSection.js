"use client"

import Spacer from "@/components/spacer/Spacer";
import useWindowSize from "@/hooks/useWindowSize";
import PrimaryButton from "@/components/button/PrimaryButton";
import { useRouter } from 'next/navigation'

import "./HeroSection.css";

const heroSectionTitle = "A Gradle plugin designed to automate build configurations for Kotlin-based projects."
const heroSectionMessage = "Gragle is a build configuration automation plugin that simplifies and streamlines build configurations and project setup across all Kotlin-based Gradle projects, including Kotlin Multiplatform, Compose Multiplatform, Android, and more. It provides abstract APIs to make build setup easier and more enjoyable for developers working with Gradle projects."

const HeroSectionTitleAndMessage = () => {
    const width = useWindowSize();

    let heroSectionTitleStyle = "hero-section-title bold primary-font-color"
    if (width < 1000) {
        if (width < 600) {
            heroSectionTitleStyle += " headline-small"
        } else {
            heroSectionTitleStyle += " display-small"
        }
    } else {
        heroSectionTitleStyle += " display-medium"
    }

    return (
        <div className="hero-section-title-and-message" id="hero-section-title-and-message">
            <h2 className={heroSectionTitleStyle} id="hero-section-title">{heroSectionTitle}</h2>
            <Spacer className="_8px_height"></Spacer>
            <p className="hero-section-message body-large medium secondary-font-color" id="hero-section-message">
                {heroSectionMessage}
            </p>
        </div>
    );
};

const HeroSectionActionButtons = () => {
    const router = useRouter();

    const blogsButtonClickHandler = () => {
        router.push("/blogs")
    };

    const learnGragleButtonClickHandler = () => {
        router.push("/learn-gragle")
    };

    return (
        <div className="hero-section-action-buttons" id="hero-section-action-buttons">
            <PrimaryButton
                label="Read Blogs"
                isOutlined={true}
                id="learn-gragle-button"
                onClick={blogsButtonClickHandler}>
            </PrimaryButton>
            <Spacer className="_8px_width"></Spacer>
            <PrimaryButton
                label="Learn Gragle"
                isOutlined={false}
                id="learn-gragle-button"
                onClick={learnGragleButtonClickHandler}>
            </PrimaryButton>
        </div>
    );
}

const HeroSection = () => {
    return (
        <section className="hero-section" id="hero-section">
            <HeroSectionTitleAndMessage></HeroSectionTitleAndMessage>
            <HeroSectionActionButtons></HeroSectionActionButtons>
        </section>
    );
};

export default HeroSection;