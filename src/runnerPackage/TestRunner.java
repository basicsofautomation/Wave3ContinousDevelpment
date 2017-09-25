package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Essentials reference to support functionality of class and methods in it import org.junit.runner.RunWith; import cucumber.api.CucumberOptions; import cucumber.api.junit.Cucumber;

// Starting point for jUnit to start execution
@RunWith(Cucumber.class)

// specify path to feature files, step definitions etc 
@CucumberOptions(
		features = {"Features//0-ValidLogin.feature", "Features//1-AddPartToSC.feature", "Features//2-PreviewIllustrations.feature"} , 
		//tags = {"@Execute"}, 
		//plugin = {"pretty", "html:Features/Destination"}, 
		//tags = {"@GenerateCode"},
		//features = {"Features//1-AddPartToSC.feature"} ,
		glue = { "stepDefinition" }
		)

// Main runner class from where automation execution start
public class TestRunner {

}
