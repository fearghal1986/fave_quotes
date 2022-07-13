$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/clinical_noting/feature_files/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Clinical Noting Application",
  "description": "\r\nDescription: As a user I should be able to login to the Clinical Noting application",
  "id": "login-to-clinical-noting-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10258282600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify a failed test for demo purposes",
  "description": "",
  "id": "login-to-clinical-noting-application;verify-a-failed-test-for-demo-purposes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    },
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@dev"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I should see my test fail",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeMyTestFail()"
});
formatter.result({
  "duration": 116743200,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat clinical_noting.steps.login.LoginSteps.iShouldSeeMyTestFail(LoginSteps.java:77)\r\n\tat ✽.Given I should see my test fail(src/test/java/clinical_noting/feature_files/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1884651200,
  "status": "passed"
});
formatter.before({
  "duration": 9304956200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "launch clinical noting from Maxims",
  "description": "",
  "id": "login-to-clinical-noting-application;launch-clinical-noting-from-maxims",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    },
    {
      "line": 9,
      "name": "@template"
    },
    {
      "line": 9,
      "name": "@regression"
    },
    {
      "line": 9,
      "name": "@TestRail(434462)"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am logged in and on the outpatient clinic list on Maxims",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search for a record",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I right click and access launch clinical noting option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I can open the clinical noting application on a new screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmLoggedInAndOnTheOutpatientClinicListOnMaxims()"
});
