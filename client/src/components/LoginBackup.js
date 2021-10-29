import classes from './loginbackup.module.css'
import logo from '../assets/images/loginlogo2.png'
import Card from '@mui/material/Card';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import { useState } from "react";

const btnStyles = {
    padding:'0.8rem',
    borderRadius:'9px',
    fontWeight: '600',
    width: '7rem'

}

const LoginBackup = () => {

    const [enteredPassword, setEnteredPassword] = useState('');
    const [enteredUsername, setEnteredUsername] = useState('');
    const [passwordFieldIsShown, setPasswordFieldIsShown] = useState(false);
    const [hasError, setHasError] = useState(false);

    const usernameIsValid = enteredUsername.length > 0 && enteredUsername.indexOf(' ') !== 0;


    const nextStepHandler = () => {

        if (!usernameIsValid){
            return setHasError(true)
        }

        setHasError(false)
        setPasswordFieldIsShown(true)
    };

    const passwordHandler = (event) => {
        setEnteredPassword(event.target.value);
    };

    const usernameHandler = (event) => {
        setEnteredUsername(event.target.value);
    };

    const submitHandler = (event) => {
        event.preventDefault();
    };

    const errorContent = (
        <div className={classes['input-error']}>
            Username must not be empty or contain white space
        </div>
    )
    console.log(enteredPassword + "" + enteredUsername);
    return(
        <div className={classes.background}>
            <form action="" onSubmit={submitHandler}>
                <Card style={{borderRadius: '10px'}} variant="outlined" className={classes.wrapper}>
                    <img src={logo} alt="log-in form top logo"/>
                    <div className={classes['input-section']}>
                        {hasError && errorContent}
                        <TextField onChange={usernameHandler} color={'primary'} id="outlined-basic" label="Username" type={'text'} variant="outlined" sx={{mb: 3}} value={enteredUsername}/>
                        { passwordFieldIsShown && <TextField onChange={passwordHandler} color={'primary'} id="outlined-basic" label="Password" type={'password'} variant="outlined" value={enteredPassword}/>}
                        <div className={classes.forgot}>
                            Forgot?
                        </div>
                    </div>
                    <div className={classes['bottom-section']}>
                        <div>
                            First Time User? Enroll now.
                        </div>
                        {!passwordFieldIsShown && <Button color={"primary"} style={btnStyles} variant="contained" onClick={nextStepHandler}>Continue</Button>}
                        {passwordFieldIsShown && <Button color={"primary"} style={btnStyles} type={"submit"} variant="contained">Submit</Button>}
                    </div>
                </Card>
            </form>


        </div>
    )
}
export default LoginBackup;