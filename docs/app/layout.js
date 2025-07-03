import pageInfo from "@/app/PageInfo";
import Header from "@/components/header/Header";

import "styles/App.css";
import "styles/Type.css";
import "styles/Color.css";
import "styles/Spacing.css";

export const metadata = pageInfo;

export default function RootLayout({children}) {
    return (
        <html lang="en">
            <body className="content-body" id="content-body">
                <div className="next-app" id="next-app">
                    <Header />
                    <main className="main-content" id="main-content">{children}</main>
                </div>
            </body>
        </html>
    );
}