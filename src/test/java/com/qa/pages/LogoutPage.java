package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

public class LogoutPage extends TestBase {
	
	@FindBy(xpath="//i[@class='settings icon' and @aria-hidden='true']")
	@CacheLookup
	WebElement SettingIcon;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement LogoutLink;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);		
	}


	public void LogoutfromBPMApplication() {
		try
		{
			Thread.sleep(5000);
			SettingIcon.click();
			test.log(Status.PASS, "Clicked on setting icon");
			LogoutLink.click();
			test.log(Status.PASS, "Clicked on logout");		
		}
		catch(Exception e)
		{
			test.log(Status.FAIL, "Unable to click on logout");
			
		}
		
		
		
		
	}

}
