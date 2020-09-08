package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

import org.junit.Assert;

public class LoginPage extends TestBase {

	// PageFactory
	@FindBy(name = "email")
	WebElement Username_Txt_Loc;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password_Txt_Loc;

	@FindBy(xpath = "//div[starts-with(text(),'Login')]")
	WebElement Submit_Btn_Loc;

	@FindBy(linkText = "Forgot your password?")
	WebElement CRM_Logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateLoginPageTittle() {
		String PageTittle = null;
		String PageTittleName = driver.getTitle();
		try {
			Assert.assertEquals("Cogmento CRM", PageTittleName);
			test.log(Status.PASS, "User is on Login Page : " + PageTittleName);
		}

		catch (Exception e) {
			test.log(Status.FAIL, "Login Page is not displayed :" + PageTittleName);
		}
		return PageTittle;
	}

	public boolean validateLoginPageImage() {
		return CRM_Logo.isDisplayed();
	}

	public HomePage login(String username, String Password) {
		try {
			Username_Txt_Loc.sendKeys(username);
			Password_Txt_Loc.sendKeys(Password);
			test.log(Status.PASS, "Valid Login Credentials entered successfully");
			Submit_Btn_Loc.click();
			test.log(Status.PASS, "Clicked on Login button:" + Submit_Btn_Loc.getText());
		} catch (Exception e) {
			test.log(Status.FAIL,
					"Unable to login to the application please check your credentials other please contact the support team ");
		}

		return new HomePage();

	}

}
