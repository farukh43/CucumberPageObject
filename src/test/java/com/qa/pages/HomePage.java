package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.qa.utils.TestBase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[.='Farukh Pathan']")
	@CacheLookup
	WebElement UserNameLabel;

	@FindBy(xpath = "//span[contains(text(),'Home')]")
	WebElement HomeTabLink;

	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement CalendarTabLink;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement ContactsTabLink;

	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement CompaniesTabLink;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement DealsTabLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement TasksTabLink;

	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement CasesTabLink;

	@FindBy(xpath = "//span[contains(text(),'Calls')]")
	WebElement CallsTabLink;

	@FindBy(xpath = "//span[contains(text(),'Documents')]")
	WebElement DocumentsTabLink;

	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement EmailTabLink;

	@FindBy(xpath = "//span[contains(text(),'Campaigns')]")
	WebElement CampaignsTabLink;

	@FindBy(xpath = "//span[contains(text(),'Forms')]")
	WebElement FormsTabLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTittle() {
		String Home_Page = null;
		try {

			String Home_Page_tittle = driver.getTitle();
			test.log(Status.PASS, "User is on Home Page : " + Home_Page_tittle);
		} catch (Exception e) {
			test.log(Status.PASS, "Unable to get the home page tittle : " + e);
		}
		return Home_Page;
	}

	public boolean validateCorrectUseName() {
		boolean name = false;
		try {

			String validateCorrectUseName = UserNameLabel.getText();
			Assert.assertEquals(prop.getProperty("DisplayName"), validateCorrectUseName);
			UserNameLabel.isDisplayed();
			test.log(Status.PASS, "User name is displayed as per the given Condition : " + validateCorrectUseName);
		} catch (Exception e) {
			test.log(Status.PASS,
					"User name is not displayed as per the given Condition please check the config proprties file or the mame displayed in application are matching : "
							+ e);
		}
		return name;
	}

	public String HomeTabLink() {
		String HomeLinkVar = null;
		try {

			String HomeTabLinkVar = HomeTabLink.getText();
			HomeTabLink.isDisplayed();
			Assert.assertEquals("Home", HomeTabLinkVar);
			test.log(Status.PASS,
					"Home Tab is displayed and the name of the Tab displayed in the app is : " + HomeTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Home Tab is not displayed : " + e);
		}
		return HomeLinkVar;
	}

	public String CalenderTabLink() {
		String CalendarLinkVar = null;
		try {

			String CalendarTabLinkVar = CalendarTabLink.getText();
			CalendarTabLink.isDisplayed();
			System.out.println(CalendarTabLinkVar);
			Assert.assertEquals("Calendar", CalendarTabLinkVar);
			test.log(Status.PASS, "Calender Tab is displayed and the name of the Tab displayed in the app is : "
					+ CalendarTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Calender Tab is not displayed : " + e);
		}
		return CalendarLinkVar;
	}

	public String ContactsTabLink() {
		String ContactsLinkVar = null;
		try {
			String ContactsTabLinkVar = ContactsTabLink.getText();
			ContactsTabLink.isDisplayed();
			Assert.assertEquals("Contacts", ContactsTabLinkVar);
			test.log(Status.PASS, "Contacts Tab is displayed and the name of the Tab displayed in the app is : "
					+ ContactsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Contacts Tab is not displayed : " + e);
		}
		return ContactsLinkVar;
	}

	public String CompaniesTabLink() {
		String CompaniesLinkVar = null;
		try {

			String CompaniesTabLinkVar = CompaniesTabLink.getText();
			CompaniesTabLink.isDisplayed();
			Assert.assertEquals("Companies", CompaniesTabLinkVar);
			test.log(Status.PASS, "Companies Tab is displayed and the name of the Tab displayed in the app is : "
					+ CompaniesTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Companies Tab is not displayed : " + e);
		}
		return CompaniesLinkVar;
	}

	public String DealsTabLink() {
		String DealsLinkVar = null;
		try {

			String DealsTabLinkVar = DealsTabLink.getText();
			DealsTabLink.isDisplayed();
			Assert.assertEquals("Deals", DealsTabLinkVar);
			test.log(Status.PASS,
					"Deals Tab is displayed and the name of the Tab displayed in the app is : " + DealsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Deals Tab is not displayed : " + e);
		}
		return DealsLinkVar;
	}

	public String TasksTabLink() {
		String TasksLinkVar = null;
		try {

			String TasksTabLinkVar = TasksTabLink.getText();
			TasksTabLink.isDisplayed();
			Assert.assertEquals("Tasks", TasksTabLinkVar);
			test.log(Status.PASS,
					"Tasks Tab is displayed and the name of the Tab displayed in the app is : " + TasksTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Tasks Tab is not displayed : " + e);
		}
		return TasksLinkVar;
	}

	public String CasesTabLink() {
		String CasesLinkVar = null;
		try {

			String CasesTabLinkVar = CasesTabLink.getText();
			TasksTabLink.isDisplayed();
			Assert.assertEquals("Cases", CasesTabLinkVar);
			test.log(Status.PASS,
					"Cases Tab is displayed and the name of the Tab displayed in the app is : " + CasesTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Cases Tab is not displayed : " + e);
		}
		return CasesLinkVar;
	}

	public String CallsTabLink() {
		String CallsLinkVar = null;
		try {

			String CallsTabLinkVar = CallsTabLink.getText();
			CallsTabLink.isDisplayed();
			Assert.assertEquals("Calls", CallsTabLinkVar);
			test.log(Status.PASS,
					"Calls Tab is displayed and the name of the Tab displayed in the app is : " + CallsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Calls Tab is not displayed : " + e);
		}
		return CallsLinkVar;
	}

	public String DocumentsTabLink() {
		String DocumentsLinkVar = null;
		try {

			String DocumentsTabLinkVar = DocumentsTabLink.getText();
			DocumentsTabLink.isDisplayed();
			Assert.assertEquals("Documents", DocumentsTabLinkVar);
			test.log(Status.PASS,
					"Calls Tab is displayed and the name of the Tab displayed in the app is : " + DocumentsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Calls Tab is not displayed : " + e);
		}
		return DocumentsLinkVar;
	}

	public String EmailTabLink() {
		String EmailLinkVar = null;
		try {

			String EmailTabLinkVar = EmailTabLink.getText();
			EmailTabLink.isDisplayed();
			Assert.assertEquals("Email", EmailTabLinkVar);
			test.log(Status.PASS,
					"Email Tab is displayed and the name of the Tab displayed in the app is : " + EmailTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Email Tab is not displayed : " + e);
		}
		return EmailLinkVar;
	}

	public String CampaignsTabLink() {
		String CampaignsLinkVar = null;
		try {

			String CampaignsTabLinkVar = CampaignsTabLink.getText();
			CampaignsTabLink.isDisplayed();
			Assert.assertEquals("Campaigns", CampaignsTabLinkVar);
			test.log(Status.PASS, "Campaigns Tab is displayed and the name of the Tab displayed in the app is : "
					+ CampaignsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Campaigns Tab is not displayed : " + e);
		}
		return CampaignsLinkVar;
	}

	public String FormsTabLink() {
		String FormsLinkVar = null;
		try {

			String FormsTabLinkVar = FormsTabLink.getText();
			FormsTabLink.isDisplayed();
			Assert.assertEquals("Forms", FormsTabLinkVar);
			test.log(Status.PASS,
					"Forms Tab is displayed and the name of the Tab displayed in the app is : " + FormsTabLinkVar);
		} catch (Exception e) {
			test.log(Status.FAIL, "Forms Tab is not displayed : " + e);
		}
		return FormsLinkVar;
	}
	
	

//	public static int countOfWorking_And_Non_workingLink_Old() throws IOException {
//		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
//		linkslist.addAll(driver.findElements(By.tagName("img")));
//
//		int count = 0;
//		for (int i = 0; i < linkslist.size(); i++) {
//			WebElement el = linkslist.get(i);
//			String url = el.getAttribute("href");
//			URL urlToBeCheck = new URL(url);
//			HttpURLConnection connection = (HttpURLConnection) urlToBeCheck.openConnection();
//			connection.connect();
//			connection.setRequestMethod("GET");
//			if (connection.getResponseCode() == 200) {
//				System.out.println("links working fine");
//				test.log(Status.PASS, "Total number of working links ==" + count);
//				
//			} else {
//				count++;
//			}
//		}
//		System.out.println("Total number of non working link ==" + count);
//		test.log(Status.PASS, "Total number of non working links ==" + count);
//		return count;
//	}
//
	public void countOfWorking_And_Non_workingLink() throws Exception, IOException {
		int count = 0;
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		test.log(Status.PASS, "Total number of links available is==" + linkslist.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for (int i = 0; i < linkslist.size(); i++) {
			if (linkslist.get(i).getAttribute("href") != null
					&& (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkslist.get(i));

			}
			
			test.log(Status.PASS, "Total number of Active links available is==" + activeLinks.size());

			for (int j = 0; j < activeLinks.size(); j++) {
				HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
						.openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activeLinks.get(j).getAttribute("href") + "-->" + response);
				test.log(Status.INFO, "Total number of Active links available i s==" + activeLinks.size());
				
				if (connection.getResponseCode() == 200) {
					System.out.println("links working fine");
					test.log(Status.PASS, "Total number of working links ==" + count);
					
				} else {
					System.out.println(count);
					test.log(Status.FAIL, "Total number of non working links ==" + count);
					count++;
				}
			}	

			}

		}

	}
