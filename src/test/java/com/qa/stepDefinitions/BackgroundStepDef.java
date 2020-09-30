package com.qa.stepDefinitions;

import com.qa.utils.TestBase;

import io.cucumber.java.en.Given;

public class BackgroundStepDef extends TestBase {

	@Given("^I have launch the browser$")
	public void i_have_launch_the_browser() throws Exception {
		TestBase.LaunchBrowser();
	}

	@Given("^I should navigate to the login page of FREE Crm Application$")
	public void i_should_navigate_to_the_login_page_of_FREE_Crm_Application() {
		navigateToUrl();
	}

}
