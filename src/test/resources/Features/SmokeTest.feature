@SmokeTestOfFreeCRM
Feature: FreeCRM Smoke Test

  Background: User Should be on Login Page
    Given I have launch the browser
    And I should navigate to the login page of FREE Crm Application

  @TC01
  Scenario: TC_SMOKE_TEST_FREECRM_001
    Then Verify the user is on Login Page
    When I Should be able to enter the credentials
    Then HomePage Should be displayed
    And Verify all the tabs are visible
    And Verify the broken and working links
    And I Logout from the Application
@TC02
  Scenario: TC_SMOKE_TEST_FREECRM_002
    Then HomePage Should be displayed
    And I Verify Calender page is displayed
    And I Verify Contacts page is displayed
    And I Verify Companies page is displayed
    And I Verify Deals page is displayed
    And I Verify Tasks page is displayed
    And I Verify Cases page is displayed
    And I Verify Calls page is displayed
    And I Verify Documents page is displayed
    And I Verify Email page is displayed
    And I Verify Compaigns page is displayed
    And I Verify Forms page is displayed
    And I Logout from the Application
