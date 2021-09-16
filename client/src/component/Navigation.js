import classes from './navigation.module.css';
import logo from '../assets/images/logo.png'
import SearchIcon from '@material-ui/icons/Search';

const Navigation = () => {
  return(
      <>
          <nav className={classes['nav-wrapper']}>
              <img src={logo}/>
              <ul className={classes['menu']}>
                  <li>PERSONAL <i className={classes['down-arrow']}/> </li>
                  <li>BUSINESS <i className={classes['down-arrow']}/> </li>
                  <li>RESOURCES <i className={classes['down-arrow']}/> </li>
                  <li>WHY US? <i className={classes['down-arrow']}/> </li>
                  <div className={classes.icon}>
                      <SearchIcon/>
                  </div>
              </ul>
          </nav>
          <div style={{height:'100vh', background:'red'}}>
              ss
          </div>
      </>

  )
}
export default Navigation;