import Link from "next/link";
import NavigationOption from "@/components/header/NavigationOption";
import navigationOptionList from "@/components/header/NavigationOptionList";

import "./Header.css";

const HeaderLogoAndTitle = () => {
    return (
        <div className="header-logo-and-title-container" id="header-logo-and-title-container">
            <Link to="/" href="/" className="primary-font-color header-link" id="header-link">
                <h1 className="title-medium semibold" id="header-title">Gragle</h1>
            </Link>
        </div>
    );
};

const HeaderNavigation = () => {
    return (
        <nav className="header-navigation" id="header-navigation">
            <ul className="navigation-options" id="navigation-options">
                {
                    navigationOptionList.map((navigationOption) => (
                        <NavigationOption
                            id={navigationOption.id}
                            label={navigationOption.label}
                            route={navigationOption.endpoint}>
                        </NavigationOption>
                    ))
                }
            </ul>
        </nav>
    );
};

const githubLink = "https://github.com/heyysudarshan/gragle";

const HeaderActionButtons = () => {
    return (
        <div className="header-action-buttons" id="header-action-buttons">
            <Link href={githubLink} target="_blank" className="header-github-button" id="header-github-button">
                <img src="/icons/ic-github.svg" alt="Github" className="github-icon" id="github-icon"/>
            </Link>
        </div>
    );
}

const Header = () => {
    return (
        <header className="header-container" id="header-container">
            <HeaderLogoAndTitle/>
            <HeaderNavigation/>
            <HeaderActionButtons/>
        </header>
    );
};

export default Header;