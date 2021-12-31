import React, { useEffect, useState } from "react";
import LoanAppDataService from "../api/LoanAppDataService.js";

function DropDown1(props) {
  const [isActive, setIsActive] = useState(false);
  const [isSearched, setIsSearched] = useState(false);
  const [applicationNumber, setApplicationNumber] = useState("");
  const [applicationSearchMessage, setApplicationSearchMessage] = useState([]);

  const applicationSearchHandler = (event) => {
    event.preventDefault();
    console.log(applicationNumber);

    setIsSearched(!isSearched);

    setApplicationNumber("");
  };

  useEffect(() => {
    LoanAppDataService.retreiveLoanApplication(applicationNumber).then(
      (response) => {
        console.log(response);
        setApplicationSearchMessage(response.data);
      }
    );
  }, []);

  //   useEffect(() => {
  //     LoanAppDataService.retrieveLoanApplication().then((response) => {
  //       console.log(response);
  //       setApplicationSearchMessage(response.data);
  //     });
  //   }, []);

  const applicationNumChangeHandler = (event) => {
    setApplicationNumber(event.target.value);
  };

  return (
    <div>
      <div className="dropdown">
        <button
          className="dropdown-btn round-corner"
          onClick={(e) => setIsActive(!isActive)}
        >
          {props.displayItem}
          <span></span>
        </button>
        {isActive && (
          <div className="dropdown-content">
            <div className="dropdown-item" aria-labelledby="dropdownMenuButton">
              <form onSubmit={applicationSearchHandler}>
                <input
                  type="text"
                  id="Application-number-search"
                  placeholder="Application Number"
                  maxLength={10}
                  value={applicationNumber}
                  onChange={applicationNumChangeHandler}
                />{" "}
                <button type="submit">Search</button>
                {isSearched && (
                  <div className="container">
                    {applicationSearchMessage.map((application) => (
                      <div>
                        <p>{"  "}</p>
                        <p>{application.applicationId}</p>
                        <p>{application.name}</p>
                      </div>
                    ))}
                  </div>
                )}
              </form>
            </div>
          </div>
        )}
      </div>
    </div>
  );
}

export default DropDown1;
