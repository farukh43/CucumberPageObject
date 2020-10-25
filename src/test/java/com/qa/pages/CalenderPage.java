package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

public class CalenderPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	@CacheLookup
	WebElement CalendarTabLink;

	@FindBy(xpath = "//div[normalize-space()='Calendar']")
	WebElement CalendarViewName;

	@FindBy(xpath = "//*[contains(text(),'Events')]")
	WebElement EventsViewName;

	@FindBy(xpath = "//div[@class='rbc-calendar']")
	WebElement CalenderTable;

	public void clickOnCalender() {
		try {
			String CalendarviewNameOnPage = CalendarViewName.getText();
			String EventsViewNameOnPage = EventsViewName.getText();
			CalendarTabLink.click();
			Assert.assertEquals("Calendar", CalendarviewNameOnPage);
			Assert.assertEquals("Events", EventsViewNameOnPage);
			CalenderTable.isDisplayed();
			test.log(Status.PASS,
					"After Clicking on the Calendar Tab Calender details Page is displayed: " + CalendarviewNameOnPage);
		} catch (Exception e) {
			test.log(Status.FAIL, "Calendar page is not displayed : " + e);
		}
	}
}
