package example;

public class Model {

  private Integer testId;

  private Boolean testRunMode;

  private String testCaseName;

  private String testApiType;

  private String testUrl;

  private String requestBody;

  private String requestHeaders;

  private String requestParameters;

  private String testSchemaFileName;

  private Integer expectedStatusCode;

  private Integer expectedResponse;

  private Integer actualStatusCode;

  private String actualResponse;

  public Integer getTestId() {
    return testId;
  }

  public void setTestId(Integer testId) {
    this.testId = testId;
  }

  public Boolean getTestRunMode() {
    return testRunMode;
  }

  public void setTestRunMode(Boolean testRunMode) {
    this.testRunMode = testRunMode;
  }

  public String getTestCaseName() {
    return testCaseName;
  }

  public void setTestCaseName(String testCaseName) {
    this.testCaseName = testCaseName;
  }

  public String getTestApiType() {
    return testApiType;
  }

  public void setTestApiType(String testApiType) {
    this.testApiType = testApiType;
  }

  public String getTestUrl() {
    return testUrl;
  }

  public void setTestUrl(String testUrl) {
    this.testUrl = testUrl;
  }

  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }

  public String getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(String requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public String getRequestParameters() {
    return requestParameters;
  }

  public void setRequestParameters(String requestParameters) {
    this.requestParameters = requestParameters;
  }

  public String getTestSchemaFileName() {
    return testSchemaFileName;
  }

  public void setTestSchemaFileName(String testSchemaFileName) {
    this.testSchemaFileName = testSchemaFileName;
  }

  public Integer getExpectedStatusCode() {
    return expectedStatusCode;
  }

  public void setExpectedStatusCode(Integer expectedStatusCode) {
    this.expectedStatusCode = expectedStatusCode;
  }

  public Integer getExpectedResponse() {
    return expectedResponse;
  }

  public void setExpectedResponse(Integer expectedResponse) {
    this.expectedResponse = expectedResponse;
  }

  public Integer getActualStatusCode() {
    return actualStatusCode;
  }

  public void setActualStatusCode(Integer actualStatusCode) {
    this.actualStatusCode = actualStatusCode;
  }

  public String getActualResponse() {
    return actualResponse;
  }

  public void setActualResponse(String actualResponse) {
    this.actualResponse = actualResponse;
  }

  @Override
  public String toString() {
    return "Model{" +
        "testId=" + testId +
        ", testRunMode=" + testRunMode +
        ", testCaseName='" + testCaseName + '\'' +
        ", testApiType='" + testApiType + '\'' +
        ", testUrl='" + testUrl + '\'' +
        ", requestBody='" + requestBody + '\'' +
        ", requestHeaders='" + requestHeaders + '\'' +
        ", requestParameters='" + requestParameters + '\'' +
        ", testSchemaFileName='" + testSchemaFileName + '\'' +
        ", expectedStatusCode=" + expectedStatusCode +
        ", expectedResponse=" + expectedResponse +
        ", actualStatusCode=" + actualStatusCode +
        ", actualResponse='" + actualResponse + '\'' +
        '}';
  }
}
