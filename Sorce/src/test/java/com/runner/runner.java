package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith (Cucumber.class)
@CucumberOptions(
		
		
		
		features = "src/test/resources",
		glue = {"com.lao.Hooks","com.lao.stepdefenition"},
		dryRun= false,
		monochrome =  true,
		publish =true,
		tags = "@tag",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
		
		"html:target/cucumberreport/report.html",
		
		"json:target/cucumberreport/report.json",
		
		"junit:target/cucumberreport/report.xml"
		
		
		
		
		
		
		
		
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
			
		
		)





























public class runner {
	
	
	

}
