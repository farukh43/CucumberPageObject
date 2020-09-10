package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import cucumber.api.java.en.Then;

public class HomePageStepDef extends HomePage {

	@Then("^HomePage Should be displayed$")
	public void homepage_Should_be_displayed() {

		validateHomePageTittle();
		validateCorrectUseName();
	}

	@Then("^Verify all the tabs are visible$")
	public void verify_all_the_tabs_are_visible() {
		HomeTabLink();
		CalenderTabLink();
		ContactsTabLink();
		CompaniesTabLink();
		DealsTabLink();
		TasksTabLink();
		CasesTabLink();
		CallsTabLink();
		EmailTabLink();
		CampaignsTabLink();
		FormsTabLink();

	}

	@Then("^Verify the broken and working links$")
	public void verify_the_broken_and_working_links() throws Exception {
		countOfWorking_And_Non_workingLink();
	}

}
