import "./ProjectWizardPage.css";
import Spacer from "@/components/Spacer";

const title = "Gragle Project Wizard"
const message = "This project wizard generates a Gradle project with the Gragle plugin pre-applied. You can set up Android, Kotlin Multiplatform, and other supported modules using Gragle APIs."

const ProjectWizardTitleAndMessage = () => {
    return (
        <section className="project-wizard-title-and-message" id="project-wizard-title-and-message">
            <h1 className="project-wizard-title title-medium semi-bold" id="project-wizard-title">{title}</h1>
            <Spacer className="spacer-4px-height" id="project-wizard-title-and-message-spacer"></Spacer>
            <p className="project-wizard-message body-medium regular" id="project-wizard-message">{message}</p>
        </section>
    );
};

const ProjectWizardPage = () => {
    return (
        <article className="project-wizard-page" id="project-wizard-page">
            <ProjectWizardTitleAndMessage></ProjectWizardTitleAndMessage>
        </article>
    );
};

export default ProjectWizardPage;