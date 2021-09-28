import './App.css';
import { createMuiTheme, ThemeProvider } from "@mui/material";
import Navigation from "./components/Navigation";
import Banner from "./components/Banner";


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
          <div>
              <Navigation/>
              <Banner/>
          </div>
      </ThemeProvider>
  );
}

export default App;
