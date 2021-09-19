import classes from './signupmenu.module.css'
const SignUpMenu = () =>
{
  return(
      <div>
          <div className={classes.mainBox}>
              <div className={classes.boxTitle}>
                  Online Banking Login
              </div>
              <div className={classes.formWrapper}>
                  <form action="">
                      <div className={classes.inputWrapper}>
                          <label htmlFor="">Username</label>
                          <div className={classes.usernameDiv}>
                              <input type="text" className={classes.usernameInput}/>
                          </div>
                      </div>
                      <button className={classes.signInButton}>
                          SIGN IN
                      </button>
                  </form>
                  <div className={classes.signInOptions}>
                      <a href="">Forgot Password</a>
                      <a href="">New to Online Banking? <span>Enroll Now</span></a>
                      <a href="">Check Status of Application</a>
                  </div>
              </div>
              <div className={classes.bottomBox}>
                      <div className={classes.sandSTxt}>Simple and Secure.</div>
                      <div className={classes.openAccTxt}>Open an Account Today.</div>
                      <div className={classes.gsBttnWrap}>
                          <button className={classes.getStartedButton}>
                              GET STARTED
                          </button>
                      </div>
              </div>
          </div>
      </div>
  )
}
export default SignUpMenu;