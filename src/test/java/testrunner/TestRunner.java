package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ravik\\Desktop\\Testing\\Cucumber\\src\\test\\java\\feature",
glue = {"stepdef"}, plugin = {"pretty","json:target/HTmlreports.json"}, monochrome = true, 
dryRun = true, tags = "@smoke or not @regression")

public class TestRunner {
	
	

}
