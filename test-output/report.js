$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SHIV/eclipse-workspace/PracticeBDDFramework/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the Store Website",
  "description": "",
  "id": "testing-the-store-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login_Test_Scenario",
  "description": "",
  "id": "testing-the-store-website;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the sign link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the email to create new Account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter the contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the contact details missing error",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "browser get close",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launches_the_browser()"
});
formatter.result({
  "duration": 61955164500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.User_clicks()"
});
formatter.result({
  "duration": 7268128200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_email()"
});
formatter.result({
  "duration": 2879674799,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_contact_details()"
});
formatter.result({
  "duration": 5286320900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.verify_the_contact_details_missing_errors()"
});
formatter.result({
  "duration": 5714388101,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.browser_get_close()"
});
formatter.result({
  "duration": 2986217700,
  "status": "passed"
});
});