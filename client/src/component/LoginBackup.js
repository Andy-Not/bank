import classes from './loginbackup.module.css'
import logo from '../assets/images/loginlogo2.png'
import Card from '@mui/material/Card';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
const LoginBackup = () => {
    return(
        <div className={classes.background}>
            <form action="">
                <Card style={{borderRadius: '10px'}} variant="outlined" className={classes.wrapper}>
                    <img src={logo} alt="log-in form top logo"/>
                    <div className={classes['input-section']}>
                        <TextField id="outlined-basic" label="Username" variant="outlined" />
                        <div className={classes.forgot}>
                            Forgot?
                        </div>
                    </div>
                    <div className={classes['bottom-section']}>
                        <div>
                            First Time User? Enroll now.
                        </div>
                        <Button style={{backgroundColor:'rgb(182, 2, 80)', padding:'0.8rem', borderRadius:'9px'}} type={"submit"} variant="contained">Continue</Button>
                    </div>
                </Card>
            </form>


        </div>
    )
}
export default LoginBackup;