"use client"

import Link from "next/link";
import React from "react";
import { usePathname } from "next/navigation";
import Spacer from "@/components/spacer/Spacer";

const NavigationOption = ({id, label, route}) => {
    const isSelected = usePathname() === route;

    const navigationOptionId = `navigation-option-${id}`;

    let labelStyle = "navigation-option-link ";
    if (isSelected) {
        labelStyle += "primary-color-text body-large semibold"
    } else {
        labelStyle += "secondary-font-color body-large regular"
    }

    let indicatorStyle = "indicator ";
    if (isSelected) {
        indicatorStyle += "primary-color"
    } else {
        indicatorStyle += ""
    }

    return (
        <li className="navigation-option" id={navigationOptionId} key={id}>
            <Link href={route} className={labelStyle}>
                <span className="navigation-option-label" id="navigation-option-label">{label}</span>
                <Spacer className="_8px"></Spacer>
                <div className={indicatorStyle} id="navigation-option-indicator">NA</div>
            </Link>
        </li>
    );
};

export default NavigationOption;