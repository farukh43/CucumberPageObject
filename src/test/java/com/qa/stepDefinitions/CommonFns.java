package com.qa.stepDefinitions;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonFns extends TestBase {
	public String scenarioName;

	@Before()
	public void commonlogin(Scenario S) {
		try {
			scenarioName = S.getName();
			test = extent.createTest(scenarioName, scenarioName);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			throw (e);
		}
	}
	
	
	@After
	public void takeSceenshot (Scenario s)
	{
		try
		{
			//File sb = null;
			if (s.getStatus().equalsIgnoreCase("Passed")) {
				System.out.println(s.getStatus());
				
			}
			else if (s.getStatus().equalsIgnoreCase("Failed"))
			{
				System.out.println(s.getStatus());	
			}
			extent.flush();
			driver.quit();
		}
		catch (Exception e) {
			// TODO: handle exception
			test.log(Status.FAIL, "Not Able to take the screenshot: "+e.getMessage());
		}
	}
}
