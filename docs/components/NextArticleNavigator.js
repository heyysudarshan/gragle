import Spacer from "@/components/Spacer";
import Link from "next/link";

import "./Components.css";

const NextArticleNavigator = ({label, route}) => {
    return (
        <Link className="next-article-navigator" href={route}>
            <span className="next-article-navigator-labels">
                <span className="next-article-navigator-name body-small medium secondary-font-color">Next</span>
                <Spacer className="spacer-8px-height"></Spacer>
                <span className="next-article-navigator-label body-medium semi-bold primary-font-color">{label}</span>
            </span>
            <Spacer className="spacer-20px-width"></Spacer>
            <img className="next-article-navigator-arrow" src="/assets/arrow-right.svg" alt="Next Article Arrow"/>
        </Link>
    );
};

export default NextArticleNavigator;