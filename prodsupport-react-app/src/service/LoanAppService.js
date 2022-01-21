import axios from "axios";

const PROD_SUPPORT_API_BASE_URL = "http://localhost:8080/api/v1";

class LoanAppService {
  getLoanAppById(applicationId) {
    return axios.get(PROD_SUPPORT_API_BASE_URL + "/" + applicationId);
  }
}

export default new LoanAppService();
