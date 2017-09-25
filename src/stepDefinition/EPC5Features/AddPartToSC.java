package stepDefinition.EPC5Features;

import java.util.Collection;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import stepDefinition.EPC5ApplicationFunctionLibrary;
import stepDefinition.Wave3AutomationBaseClass;
/*
*/
//Class hold glue code for AddPartToSC feature [Add Part To Shopping Cart] 
public class AddPartToSC extends Wave3AutomationBaseClass{

	public static EPC5ApplicationFunctionLibrary objApplicationFunctionLibrary= new EPC5ApplicationFunctionLibrary(); 
	
	@Before
	public void beforeHook(Scenario scenario) {
	    objAutomation.objTestResult.addCucumberTestInformation(scenario);
	}
	
	@After
	public void afterHook(Scenario scenario) {
		if (scenario.isFailed()) {System.out.println(scenario.getName() + " Is failed");}
		else {System.out.println(scenario.getName() + " Is passed");}
	}	
//*************************************************************************************************************************************************
//Feature:AddPartToSC || Scenario-1: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button
	@Given("^SC1 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC1_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}

	//Feature:AddPartToSC || Scenario-2: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Enter Key
	@Given("^SC2 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC2_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}	

	//Method to add part to Shopping Cart using enter key
	@When("^Add Parts to Shopping Cart Using Enter Key$")
	public void add_Parts_to_Shopping_Cart_Using_Enter_Key() throws Throwable {

	}
	
	//Feature:AddPartToSC || Scenario-3: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Space Bar --> START	
	@Given("^SC3 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC3_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}
	
	@When("^User Manually Graph Navigate To SBS From Home Via TTN$")
	public void user_Manually_Graph_Navigate_To_SBS_From_Home_Via_TTN() throws Throwable 
	{
		objApplicationFunctionLibrary.navigateToSBSInGraphicalMode(objAutomation, Driver, "TTN");
	}

	@When("^Add Parts to Shopping Cart Using Space Bar$")
	public void add_Parts_to_Shopping_Cart_Using_Space_Bar() throws Throwable 
	{
		objApplicationFunctionLibrary.addPartToShoppingCart(objAutomation, Driver, "SPACE");
	}	
	//Feature:AddPartToSC || Scenario-3: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Space Bar --> END
	
	//Feature:AddPartToSC || Scenario-4: Graphical Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Enter Key --> START	
	@Given("^Navigation Mode is Graphical$")
	public void navigation_Mode_is_Graphical() throws Throwable {
		objApplicationFunctionLibrary.gotoHome(objAutomation, Driver); // This would always be first step in any scenario
		objApplicationFunctionLibrary.switchNavigationStyle(objAutomation, Driver, "G");
	}
	
	@Given("^SC4 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC4_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}
	
	@When("^User Manually Graph Navigate To SBS From Home$")
	public void user_Manually_Graph_Navigate_To_SBS_From_Home() throws Throwable {
		objApplicationFunctionLibrary.navigateToSBSInGraphicalMode(objAutomation, Driver, "Click");
	}

	@When("^Add Parts to Shopping Cart Using Plus Button$")
	public void add_Parts_to_Shopping_Cart_Using_Plus_Button() throws Throwable 
	{
		objApplicationFunctionLibrary.addPartToShoppingCart(objAutomation, Driver, "PLUS");
	}
		
	@Then("^Added Parts Appear in Shopping Cart$")
	public void added_Parts_Appear_in_Shopping_Cart() throws Throwable 
	{
		objApplicationFunctionLibrary.verifyPartAdditionInShoppingCart(objAutomation, Driver);
	}

	//Feature:AddPartToSC || Scenario-4: Graphical Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Enter Key --> END

	//Feature:AddPartToSC || Scenario-5: List Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button --> START
	@Given("^SC5 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC5_Test_Data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}

	@When("^User Manually List Navigate To SBS From Home Via TTN$")
	public void user_Manually_List_Navigate_To_SBS_From_Home_Via_TTN() throws Throwable 
	{
		objApplicationFunctionLibrary.NavigateToSBSList(objAutomation, Driver, "TTN");
	}
	//Feature:AddPartToSC || Scenario-5: List Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button --> END
	
	//Feature:AddPartToSC || Scenario-6: List Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button --> START	
	@Given("^SC6 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC6_Test_Data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}

	@Given("^Navigation Mode is List$")
	public void navigation_Mode_is_List() throws Throwable {
		objApplicationFunctionLibrary.gotoHome(objAutomation, Driver); // This would always be first step in any scenario
		objApplicationFunctionLibrary.switchNavigationStyle(objAutomation, Driver, "L");
	}

	@When("^User Manually List Navigate To SBS From Home$")
	public void user_Manually_List_Navigate_To_SBS_From_Home() throws Throwable {
		objApplicationFunctionLibrary.NavigateToSBSList(objAutomation, Driver, "Click");
	}	
	//Feature:AddPartToSC || Scenario-6: List Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button --> END

	//Feature:AddPartToSC || Scenario-7: Full VIN Navigation to SBS and Add Parts to Shopping Cart Using Plus Button
	@Given("^SC7 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC7_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable 
	{
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "VIN|Model|Model Type|Catalog|Section|Figure|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6 + strTestDataSeparator + arg7).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
 	}
	
	@When("^User Navigate To SBS From Home Using Full VIN$")
	public void user_Navigate_To_SBS_From_Home_Using_Full_VIN() throws Throwable 
	{
		objApplicationFunctionLibrary.navigateToSBSByVINDecode(objAutomation, Driver, "VIN");
	}
	
    //Feature:AddPartToSC || Scenario-8: Partial VIN Navigation to SBS and Add Parts to Shopping Cart Using Plus Button
    @Given("^SC8 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void SC8_Test_Data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable 
    {
           String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
           String strDataElement [] = "PartialVIN|VIN|Model|Model Type|Catalog|Section|Figure|Part".split("\\|");
           String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator+ arg6 + strTestDataSeparator+ arg7 + strTestDataSeparator + arg8 + strTestDataSeparator).split(strTestDataSeparator);
           objAutomation.objTestData.addTestData(strDataElement, strDataValue);     
    }
    
    @When("^User Navigate To SBS From Home Using Partial VIN$")
    public void user_Navigate_To_SBS_From_Home_Using_Partial_VIN() throws Throwable 
    {
    	objApplicationFunctionLibrary.navigateToSBSByVINDecode(objAutomation, Driver, "PartialVIN");
    }

//*************************************************************************************************************************************************
//Feature: PreviewIllustration || Scenario-101: Navigate to illustration other than default and return back to default illustration after adding part to shopping cart
	@Given("^SC101 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC101_Test_data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Figure|Default Image|Next Image|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6 + strTestDataSeparator + arg7 + strTestDataSeparator + arg8).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}	
	
	@When("^Preview Illustration And Select For Part Lookup$")
	public void Preview_Illustration_And_Select_For_Part_Lookup() throws Throwable 
	{
		//String strDafaultIllustration = objAutomation.objTestData.getTestData("Default Image").toUpperCase();
		objApplicationFunctionLibrary.previewIllustration(objAutomation, Driver);
	}

	@Then("^User Navigate Back To Previous Image Via ReturnTo HyperLink$")
	public void User_Navigate_Back_To_Previous_Image_Via_ReturnTo_HyperLink() throws Throwable 
	{
		objApplicationFunctionLibrary.gotoFirstIllustrationViaHyperlinkFromSBS(objAutomation, Driver);
	}

//Feature: PreviewIllustration || Scenario-102: Navigate in illustrations using next and previous illustration arrow button
	@Given("^SC102 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC102_Test_Data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Default Figure|Default Image|Next Figure|Next Image|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6 + strTestDataSeparator + arg7 + strTestDataSeparator + arg8 + strTestDataSeparator + arg9).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
	}	
	
	@When("^Navigate to next figure using right arrow button$")
	public void navigate_to_next_figure_using_right_arrow_button() throws Throwable 
	{
		objApplicationFunctionLibrary.navigateInFigureUsingArrowButtons(objAutomation, Driver, "NEXT");
	}

//Feature: PreviewIllustration || Scenario-103: Use Previous illustration arrow key to move to Previous Figure via manual navigation	
	@Given("^SC103 Test Data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void SC103_Test_Data_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Throwable {
		String strTestDataSeparator = objAutomation.objAutomationConfig.getConfigValues("TestDataSeparator");
		String strDataElement [] = "Lineup|Model Type|Catalog|Section|Default Figure|Default Image|Next Figure|Next Image|Part".split("\\|");
		String strDataValue [] = (arg1 + strTestDataSeparator + arg2 + strTestDataSeparator + arg3 + strTestDataSeparator + arg4 + strTestDataSeparator + arg5 + strTestDataSeparator + arg6 + strTestDataSeparator + arg7 + strTestDataSeparator + arg8 + strTestDataSeparator + arg9).split(strTestDataSeparator);
		objAutomation.objTestData.addTestData(strDataElement, strDataValue);
		System.out.println("In Sc103");
	}	
	
	@When("^Navigate to previous figure using left arrow button$")
	public void navigate_to_previous_figure_using_left_arrow_button() throws Throwable {
		objApplicationFunctionLibrary.navigateInFigureUsingArrowButtons(objAutomation, Driver, "PREVIOUS");
	}
}
