import "./Style.css";

const LearnGragle = ({children}) => {
    return (
        <article className="learn-gragle">
            <nav className="learn-gragle-primary-navigation"></nav>
            <div className="article-content">{children}</div>
            <aside className="learn-gragle-secondary-navigation"></aside>
        </article>
    );
};

export default LearnGragle;