import "./PrimaryButton.css";

const PrimaryButton = ({label, isOutlined, id, onClick}) => {
    let buttonStyle = "button-default label-large semibold";
    if (isOutlined) {
        buttonStyle += " outlined-button";
    } else {
        buttonStyle += " primary-button";
    }

    return (
        <button className={buttonStyle} id={id} onClick={onClick}>{label}</button>
    );
};

export default PrimaryButton;