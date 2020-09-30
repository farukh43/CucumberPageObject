package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.Status;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static String[] LocatorVal = null;
	public static JSONObject testData = null;
	public static Logger App_log = Logger.getLogger("devinoyLogger");
	public static com.aventstack.extentreports.ExtentReports extent = ExtReport.getInstance();
	public static com.aventstack.extentreports.ExtentTest test;
	static int PAGE_LOAD_TIME_OUT = 20;
	static int IMPLICIT_WAIT = 30;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// e.getMessage();
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void LaunchBrowser() throws Exception {
		System.out.println("Inside Launch method");
		String browser = prop.getProperty("Browser");
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				test.log(Status.INFO, "***************New Scenario ************");
				test.log(Status.INFO, "Starting Firefox Browser");
				driver = new FirefoxDriver();
				test.log(Status.INFO, "Firefox Browser Started");
			} else if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Static")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Chrome Browser Started");
				test.log(Status.INFO, "Chrome Browser Started");
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty(("user.dir")) + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
				dc.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
				dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				dc.setJavascriptEnabled(true);
				driver = new InternetExplorerDriver(dc);
			} else if (browser.equalsIgnoreCase("Grid")) {
				// System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+
				// "/src/resources/IEDriverServer.exe");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
				capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
				capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				String filePath = ("user.dir") + "\\src\\test\\resources\\config\\config.properties";
				File f = new File(filePath);
				if (f.exists()) {
					Properties properties = new Properties();
					FileInputStream ip = new FileInputStream(
							("user.dir") + "/src/test/resources/config/config.properties");
					properties.load(ip);
					driver = new RemoteWebDriver(new URL(properties.getProperty("ip") + "/wd/hub)"), capabilities);
				}
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		} catch (NullPointerException e) {
			System.out.println("Unable to launch the browser " + e.getMessage());
			test.log(Status.FAIL, "Unable to launch the browser :" + e.getMessage());
			throw (e);
		}
	}

	public static void navigateToUrl() {
		try {
			String env = prop.getProperty("env");
			switch (env) {
			case "SIT":
				driver.get("https://ui.cogmento.com/");
				test.log(Status.PASS, "SIT URL of FREE CRM application entered successfully");
				break;

			case "UAT":
				driver.get("https://ui.cogmento.com/");
				test.log(Status.PASS, "UAT URL of FREE CRM application entered successfully");
				break;

			case "PROD":
				driver.get("https://ui.cogmento.com/");
				test.log(Status.PASS, "PROD URL of FREE CRM application entered successfully");
				break;
			}
		} catch (Exception e) {
			test.log(Status.FAIL, "Application URL not opened");
			e.printStackTrace();
			System.out.println(e);
			throw (e);
		}
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static void captureScreenshot(String screenshot) throws IOException {
		File fs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("./TestResultScreenshot/" + screenshot + ".png"));
		System.out.println("ScreenShot Taken");
	}

	public void SelectDivDropDown(WebElement locatorValue, String Value) {
		try {
			Actions act = new Actions(driver);
			act.click(locatorValue).sendKeys(Value).build().perform();
			test.log(Status.PASS, "DropDown Selected : " + Value);
		} catch (NoSuchElementException e) {
			test.log(Status.FAIL, "Unable to select the dropdown: " + e);
			throw (e);
		}
	}

}
