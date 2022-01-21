import React, { PureComponent } from "react";
import "./HeaderFooterComponent.css";

class HeaderComponent extends PureComponent {
  constructor(props) {
    super(props);

    this.state = {};
  }

  render() {
    return (
      <header>
        <div className="header">
          <div className="bg-light">
            <h1 className="header">Smart Tool</h1>
          </div>
        </div>
      </header>
    );
  }
}

export default HeaderComponent;
