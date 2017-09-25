package stepDefinition.CommonFeatures;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import AutomationBaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition.EPC5ApplicationFunctionLibrary;
import stepDefinition.Wave3AutomationBaseClass;


//Class hold glue code for valid login scenario -- "THE" only scenario in valid login feature
public class ValidLogin extends Wave3AutomationBaseClass{
	
	public EPC5ApplicationFunctionLibrary objApplicationFunctionLibrary= new EPC5ApplicationFunctionLibrary();
	
	//Feature:ValidLogin || Scenario:Valid Application Login --> START
	@Given("^Application Is Launched$")
	public void application_Is_Launched() throws Throwable 
	{
		setBrowser(); // This is critical to manage browser across multiple glue code classes
		String strApplication = (objAutomation.objAutomationConfig.getConfigValues("Application").toUpperCase()); // Get name of application
		String strURL = strApplication.toUpperCase() + "URL"; // Prepare URL 

		switch (strApplication) // Case statement to open application in browser
		{
			case "EPC5": Driver.get(objAutomation.objAutomationConfig.getConfigValues(strURL)); break;
			case "GM":
			case "CNH":
			case "JD":
			case "POWER":
		}
	}

	@When("^User Authenticate$")
	public void user_Authenticate() throws Throwable 
	{
		objApplicationFunctionLibrary.authenticateUser(objAutomation, Driver);
	}

	@Then("^Application Available For Use$")
	public void application_Available_For_Use() throws Throwable 
	{
		//objApplicationFunctionLibrary.initializeApplication(objAutomation, Driver); 
	}
	//Feature:ValidLogin || Scenario:Valid Application Login --> END
}
