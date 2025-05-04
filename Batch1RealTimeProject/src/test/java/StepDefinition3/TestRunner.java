package StepDefinition3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		features="src/test/java/FeatureFiles2/",
		glue={"StepDefinition3"},
		
		dryRun=false,
		monochrome=false,
		plugin= {"pretty","html:target/HtmlReport/index.html",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		
		
		
		)





public class TestRunner {
	
	
	
	
	

}
