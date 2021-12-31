// import logo from "./logo.svg";
import "./App.css";
import "./style.css";

import DropDown1 from "./components/DropDown1";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <div className="app-title">
          <h1 className="header">Smart Tool</h1>
          <div className="dropdown-area"></div>
        </div>
      </header>

      <div className="app-body">
        <DropDown1 displayItem="I can not login to my account" />
      </div>
    </div>
  );
}

export default App;
