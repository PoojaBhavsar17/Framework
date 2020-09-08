package cucumberJava;



import org.junit.AfterClass;


import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class) 
@CucumberOptions(strict = false,tags= {"@o"}, features = "Feature", plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, glue="stepDefination") 
@RunWith(Cucumber.class) 

public class runTest {
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/extent-config.xml");
    }
}