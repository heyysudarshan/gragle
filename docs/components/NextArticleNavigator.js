import "./Components.css";
import Spacer from "@/components/Spacer";
import Link from "next/link";

const NextArticleNavigator = ({label, route}) => {
    return (
        <Link className="next-article-navigator" href={route}>
            <span className="next-article-navigator-labels">
                <span className="next-article-navigator-name body-small medium secondary-font-color">Next</span>
                <Spacer className="spacer-8px-height"></Spacer>
                <span className="next-article-navigator-label body-medium semi-bold primary-font-color">{label}</span>
            </span>
        </Link>
    );
};

export default NextArticleNavigator;