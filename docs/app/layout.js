import WebInfo from "./WebInfo";

import "/styles/Global.css";
import "/styles/Type.css";
import "/styles/Color.css";
import "/styles/Spacing.css";

const NextApp = ({children}) => {
    return (
        <html lang="en">
            <head>
                <meta name="description" content={WebInfo.description} />
                <title>{WebInfo.title}</title>
            </head>
            <body>
                <div className="main-app">{children}</div>
            </body>
        </html>
    );
};

export default NextApp;