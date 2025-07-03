import "./Header.css";
import Link from "next/link";
import NavigationOption from "@/components/header/NavigationOption";
import navigationOptionList from "@/components/header/NavigationOptionList";

const HeaderLogoAndTitle = () => {
    return (
        <div className="header-logo-and-title-container" id="header-logo-and-title-container">
            <Link to="/" href="/" className="primary-font-color header-link" id="header-link">
                <h1 className="title-medium semibold">Gragle</h1>
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

const Header = () => {
    return (
        <header className="header-container" id="header-container">
            <HeaderLogoAndTitle/>
            <HeaderNavigation/>
        </header>
    );
};

export default Header;