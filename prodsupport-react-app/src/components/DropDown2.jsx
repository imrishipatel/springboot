import React, { PureComponent } from "react";

class DropDown2 extends PureComponent {
  constructor(props) {
    super(props);

    this.state = {
      isActive: false,
      applicationNumber: "",
    };
    this.applicationNumChangeHandler =
      this.applicationNumChangeHandler.bind(this);
  }

  applicationNumChangeHandler(event) {
    this.setState({ applicationNumber: event.target.value });
  }

  searchApplicationId = (event) => {
    event.preventDefault();
  };

  render() {
    return (
      <div className="dropdown">
        <div>
          <h2 className="dropdown-header">
            <button
              className="dropdown-btn round-corner "
              onClick={() => this.setState({ isActive: !this.state.isActive })}
            >
              {this.props.displayItem}
            </button>
            {console.log(this.state.isActive)}
            {this.state.isActive && (
              <div className="dropdown-content">
                <div
                  className="dropdown-item"
                  aria-labelledby="dropdownMenuButton"
                >
                  <form onSubmit={() => this.searchApplication}>
                    <input
                      type="text"
                      placeholder="Application Number"
                      maxLength={10}
                      value={this.state.applicationNumber}
                      onChange={this.applicationNumChangeHandler}
                    />{" "}
                    <button
                      type="submit"
                      className="btn btn-sm"
                      onClick={this.searchApplicationId}
                    >
                      {" "}
                      Search
                    </button>
                  </form>
                </div>
              </div>
            )}
          </h2>
        </div>
      </div>
    );
  }
}

export default DropDown2;
