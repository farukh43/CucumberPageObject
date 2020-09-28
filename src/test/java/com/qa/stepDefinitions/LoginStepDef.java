package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef extends TestBase {

	LoginPage login;
	HomePage homepage;

	@Given("^I have launch the browser$")
	public void i_have_launch_the_browser() throws Exception {

		TestBase.LaunchBrowser();

	}

	@Given("^I should navigate to the login page of FREE Crm Application$")
	public void i_should_navigate_to_the_login_page_of_FREE_Crm_Application() {

		navigateToUrl();

	}

	@Then("^Verify the user is on Login Page$")
	public void verify_the_user_is_on_Login_Page() throws Throwable {

		login = new LoginPage();
		login.validateLoginPageTittle();

	}

	@When("^I Should be able to enter the credentials$")
	public void i_Should_be_able_to_enter_the_credentials() {

		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));

	}

}
