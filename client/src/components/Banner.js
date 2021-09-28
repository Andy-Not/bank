import SignUpMenu from "./SignUpMenu";
import classes from "./banner.module.css";

const Banner = () => {
return(
    <div className={classes.wrapper}>
        <div className={classes['banner-text']}>
            <div>
                <span>Anywhere Everywhere Access</span><br/>
                Confidence no matter how you spend.
            </div>
            <button>Learn more</button>
        </div>
        <div className={classes['menu-holder']}>
            <SignUpMenu/>
        </div>

    </div>
)
}
export default Banner;