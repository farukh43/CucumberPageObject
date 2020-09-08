@SmokeTestOfFreeCRM
Feature: FreeCRM Smoke Test

@TC01
Scenario: TC_SMOKE_TEST_FREECRM_001
Given I have launch the browser
And I should navigate to the login page of FREE Crm Application
Then Verify the user is on Login Page
When I Should be able to enter the credentials
Then HomePage Should be displayed
And Verify all the tabs are visible
And Verify the broken and working links
And I Logout from the Application


