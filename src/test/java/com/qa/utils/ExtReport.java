package com.qa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtReport {
	static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		String fileName = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter ("./ExtentReports/ExtentReport_"+fileName+".html");
		htmlReporter.config().setReportName("Application Regression Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		return extent;
			
	}

}
