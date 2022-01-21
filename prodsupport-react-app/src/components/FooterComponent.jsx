import React, { PureComponent } from "react";
// import "./HeaderFooterComponent.css";

class FooterComponent extends PureComponent {
  constructor(props) {
    super(props);

    this.state = {};
  }

  render() {
    return (
      <div>
        <footer className="footer">
          <span className="text-muted">
            All Rights Reserved 2021 ©{" "}
            <a href="https://patelrishi.com" target="_blank">
              patelrishi.com
            </a>
          </span>
        </footer>
      </div>
    );
  }
}

export default FooterComponent;
