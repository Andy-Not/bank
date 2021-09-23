import classes from './loginbackup.module.css'
import logo from '../assets/images/loginlogo2.png'
import Card from '@mui/material/Card';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';


const LoginBackup = () => {
    const btnStyles = {
        padding:'0.8rem',
        borderRadius:'9px',
        fontWeight: '600',

    }

    return(
        <div className={classes.background}>
            <form action="">
                <Card style={{borderRadius: '10px'}} variant="outlined" className={classes.wrapper}>
                    <img src={logo} alt="log-in form top logo"/>
                    <div className={classes['input-section']}>
                        <div className={classes['input-error']}>
                            not a valid username
                        </div>
                        <TextField classes={classes['text-input']} color={'primary'} id="outlined-basic" label="Username" type={'text'} variant="outlined" sx={{mb: 3}}/>
                        <TextField classes={classes['text-input']} color={'primary'} id="outlined-basic" label="Password" type={'password'} variant="outlined" />
                        <div className={classes.forgot}>
                            Forgot?
                        </div>
                    </div>
                    <div className={classes['bottom-section']}>
                        <div>
                            First Time User? Enroll now.
                        </div>
                        <Button color={"primary"} style={btnStyles} type={"submit"} variant="contained">Continue</Button>
                    </div>
                </Card>
            </form>


        </div>
    )
}
export default LoginBackup;