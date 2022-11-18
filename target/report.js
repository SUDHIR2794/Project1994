$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Its We/eclipse-workspace/Cucumber/src/test/resources/Facebook.feature");
formatter.feature({
  "name": "Validate the facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the facebook using invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User must be able to launch and navigate to the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinationClass.user_must_be_able_to_launch_and_navigate_to_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinationClass.user_must_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationClass.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the unsuccessful login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationClass.user_validates_the_unsuccessful_login()"
});
formatter.result({
  "status": "passed"
});
});