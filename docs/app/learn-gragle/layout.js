import "./Style.css";

const LearnGragle = ({children}) => {
    return (
        <article className="learn-gragle" id="learn-gragle">
            <nav className="learn-gragle-primary-navigation" id="learn-gragle-primary-navigation">

            </nav>
            <div className="article-content" id="article-content">{children}</div>
            <aside className="learn-gragle-secondary-navigation" id="learn-gragle-secondary-navigation">

            </aside>
        </article>
    );
};

export default LearnGragle;