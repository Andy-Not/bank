import logo from './logo.svg';
import './App.css';
import LoginBackup from "./components/LoginBackup";
import { createMuiTheme, ThemeProvider } from "@mui/material";
import BackendTest from "./components/BackendTest";

const theme = createMuiTheme({
    palette: {
        primary:{
            main: 'rgb(182, 2, 80)'
        }
    }
})

function App() {
  return (
      //------- theme wrapper is for MUI theme override
      <ThemeProvider theme={theme}>
          <div className="App">
              {/*<LoginBackup/>*/}
              <BackendTest/>
          </div>
      </ThemeProvider>
  );
}

export default App;
