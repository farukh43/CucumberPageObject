$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "FreeCRM Smoke Test",
  "description": "",
  "id": "freecrm-smoke-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTestOfFreeCRM"
    }
  ]
});
formatter.before({
  "duration": 508544900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "TC_SMOKE_TEST_FREECRM_001",
  "description": "",
  "id": "freecrm-smoke-test;tc-smoke-test-freecrm-001",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to the login page of FREE Crm Application",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I Should be able to enter the credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "HomePage Should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify all the tabs are visible",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify the broken and working links",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Logout from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.i_have_launch_the_browser()"
});
formatter.result({
  "duration": 8082183400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_navigate_to_the_login_page_of_FREE_Crm_Application()"
});
formatter.result({
  "duration": 5540654100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.verify_the_user_is_on_Login_Page()"
});
formatter.result({
  "duration": 44401700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_Should_be_able_to_enter_the_credentials()"
});
formatter.result({
  "duration": 573046000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.homepage_Should_be_displayed()"
});
formatter.result({
  "duration": 1909368100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.verify_all_the_tabs_are_visible()"
});
formatter.result({
  "duration": 1312281000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.verify_the_broken_and_working_links()"
});
formatter.result({
  "duration": 1036800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.utils.TestBase.countOfWorking_And_Non_workingLink(TestBase.java:149)\r\n\tat com.qa.stepDefinitions.HomePageStepDef.verify_the_broken_and_working_links(HomePageStepDef.java:39)\r\n\tat ✽.And Verify the broken and working links(SmokeTest.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LogoutStepDef.i_Logout_from_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1863391700,
  "status": "passed"
});
});