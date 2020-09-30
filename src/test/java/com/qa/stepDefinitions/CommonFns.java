package com.qa.stepDefinitions;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
			if (s.getStatus().equals("PASSED")) {
				System.out.println(s.getStatus());
				captureScreenshot(scenarioName);
			}
			else if (s.getStatus().equals("FAILED"))
			{
				System.out.println(s.getStatus());
				captureScreenshot(scenarioName);
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
