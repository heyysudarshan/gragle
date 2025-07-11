import WebInfo from "./WebInfo";

const NextApp = ({children}) => {
    return (
        <html lang="en">
            <head>
                <meta name="description" content={WebInfo.description} />
                <title>{WebInfo.title}</title>
            </head>
            <body>
                <div className="main-app" id="main-app">{children}</div>
            </body>
        </html>
    );
};

export default NextApp;