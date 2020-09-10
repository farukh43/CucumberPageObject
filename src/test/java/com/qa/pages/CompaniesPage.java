package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

public class CompaniesPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	@CacheLookup
	WebElement CompaniesTabLink;

	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement NewButtonLoc;

	@FindBy(xpath = "//input[@name='name' and @autocomplete='new-password']")
	WebElement NameTxtLoc;

	@FindBy(xpath = "//input[@name='url']")
	WebElement URLTxtLoc;

	@FindBy(name = "address")
	WebElement AddressTxtLoc;

	@FindBy(name = "city")
	WebElement CityTxtLoc;

	@FindBy(name = "state")
	WebElement StateTxtLoc;

	@FindBy(name = "zip")
	WebElement ZipTxtLoc;

	@FindBy(xpath = "//div[contains(text(),'Country')]")
	WebElement CountryDropDownLoc;

	@FindBy(xpath = "//div[contains(text(),'United States')]")
	WebElement PhoneNoCountryDropDownLoc;

	@FindBy(xpath = "//input[contains(@placeholder,'Home, Work, Mobile..')]")
	WebElement PhoneNoTypeTxtLoc;

	@FindBy(xpath = "//div[@class='ui fluid multiple search selection dropdown']")
	WebElement TagsTxtLoc;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement DescriptionTxtLoc;

	@FindBy(xpath = "//input[@placeholder='Twitter handle']")
	WebElement SocialChannelTxtLoc;

	@FindBy(name = "industry")
	WebElement IndustryTxtLoc;

	@FindBy(name = "num_employees")
	WebElement Num_EmployeesTxtLoc;

	@FindBy(name = "symbol")
	WebElement SymbolTxtLoc;

	@FindBy(name = "annual_revenue")
	WebElement Annual_RevenueTxtLoc;

	@FindBy(name = "priority")
	WebElement PriorityTxtLoc;

	@FindBy(name = "status")
	WebElement StatusTxtLoc;

	@FindBy(name = "source")
	WebElement SourceTxtLoc;

	@FindBy(name = "category")
	WebElement CategoryTxtLoc;

	@FindBy(name = "vat_number")
	WebElement Vat_numberTxtLoc;

	@FindBy(name = "identifier")
	WebElement IdentifierTxtLoc;

	@FindBy(name = "image")
	WebElement IsmageTxtLoc;

	@Override
	public void SelectDivDropDown(WebElement locatorValue, String Value) {
		// TODO Auto-generated method stub
		super.SelectDivDropDown(locatorValue, Value);
	}

	public void navigateToCompaniesPage() {
		try {
			CompaniesTabLink.click();
			test.log(Status.PASS, "Clicked on " + CompaniesTabLink.getText() + "Tab");
		} catch (Exception e) {
			test.log(Status.FAIL, "Unable to click on  Companies Tab: " + e);
			e.printStackTrace();
		}
	}

	public void navigateToNewCompaniesPage() {
		try {
			NewButtonLoc.click();
			test.log(Status.PASS, "Clicked on " + NewButtonLoc.getText() + "Button");
		} catch (Exception e) {
			test.log(Status.FAIL, "Unable to click on  New button: " + e);
			e.printStackTrace();
		}

	}

	public void enterCompanyName(String conmany_name) {
		try {
			NameTxtLoc.sendKeys(conmany_name);
			test.log(Status.PASS, "Entered " + NameTxtLoc.getText() + "value in Name field");
		} catch (Exception e) {
			test.log(Status.FAIL, "Unable to enter the value: " + e);
			e.printStackTrace();
		}

	}

	public void enterCompanyWebSiteLink(String Url) {
		try {
			URLTxtLoc.sendKeys(Url);
			test.log(Status.PASS, "Entered " + URLTxtLoc.getText() + "value in Website Url field");
		} catch (Exception e) {
			test.log(Status.FAIL, "Unable to enter the value: " + e);
			e.printStackTrace();
		}

	}

}  
