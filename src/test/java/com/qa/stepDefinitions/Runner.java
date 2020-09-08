package com.qa.stepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				//path of the feature file
				glue= {"com/qa/stepDefinitions"},//path of step definition file
				format= {"pretty","json:Destination/cucumber.json","html:Destination/CucumberHtmlReport",
						"junit:Destination/junit_CucumberXmlReport.xml"},//Genarated report
				monochrome=true,// display the o/p in readable format on console
				strict=true,// it will check if any step is not defined in step definition file 
				dryRun=false,// to check the mapping is proper between feature file and step definition file
				tags={"@SmokeTestOfFreeCRM"}
			// ORed : Tags= {"@smokeTest, @Regression"} -- execute all the tagged as @SmokeTest OR @RegressionTest
			// ANDed : Tags= {"@smokeTest", "@Regression"} -- execute all the tagged as @SmokeTest AND @RegressionTest
			//IgnoredTag : Tags= {"~@smokeTest", "~@Regression"} --All the tagged as @SmokeTest AND @RegressionTest will be ignored

				)
public class Runner {

	
	
}
