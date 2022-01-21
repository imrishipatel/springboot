// import logo from "./logo.svg";
// import { Dropdown } from "bootstrap";
import "./App.css";
import DropDown2 from "./components/DropDown2";
// import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";

function App() {
  return (
    <div>
      <HeaderComponent />
      <div className="container">
        <DropDown2 displayItem="I can not login in to my account" />
      </div>
      {/* <FooterComponent /> */}
    </div>
  );
}

export default App;
