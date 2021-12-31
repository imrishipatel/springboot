import axios from "axios";

class LoanAppDataService {
  retreiveLoanApplication(applicationID) {
    return axios.get(`http://localhost:8080/api/v1/${applicationID}`);
  }
}

export default new LoanAppDataService();
