package com.qa.stepDefinitions;

import com.qa.pages.LogoutPage;

import io.cucumber.java.en.Then;


public class LogoutStepDef extends LogoutPage {
	
	@Then("^I Logout from the Application$")
	public void i_Logout_from_the_Application() {
		LogoutfromBPMApplication();
	    
	}

}
