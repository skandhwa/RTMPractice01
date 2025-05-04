package StepDefinition3;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageClasses.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class StepDefinition2 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	SignUpPage signp=new SignUpPage(driver);
	String ActualMessage="Thank you! Your data has been submitted.";
	
	
	
	@Given("user open the url for banking application")
	public void user_open_the_url_for_banking_application() {


	    System.out.println("Application launched");
	    System.out.println(getPageTitle());
		

		
	}
	
	@Given("user clicks on SignUp Button in WebPage")
	public void user_clicks_on_sign_up_button_in_web_page() {
		
		signp.clickOnSignUp();
	   
	}

	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String firstname) {
		
		signp.enterFirstName(firstname);
		
	    
	}

	@Given("user enters the lastname as {string}")
	public void user_enters_the_lastname_as(String lastname) {
		
		signp.enterLastName(lastname);
	   
	}

	@Given("user enters the phonenumber as {string}")
	public void user_enters_the_phonenumber_as(String phonenumber) {
		
		signp.enterPhone(phonenumber);
		scrollDown();
	  
	}

	@Given("user enters the dateofBirth as {string}")
	public void user_enters_the_dateof_birth_as(String DOB) throws InterruptedException {
		
		
		addHardcodedWait();
		signp.enterDOB(DOB);
		
	    
	}

	@Given("user selects the gender")
	public void user_selects_the_gender() {
		
		signp.selectGender(2);
	   
	}

	@Given("user enters the cityname as {string}")
	public void user_enters_the_cityname_as(String string) {
	   
	}

	@Given("user enters the userid as {string}")
	public void user_enters_the_userid_as(String string) {
	    
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	   
	}
	
	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
	   
		scrollDown();
		signp.clickonSubmit();
	}
	@Then("validate that user is getting proper response from site")
	public void validate_that_user_is_getting_proper_response_from_site() throws InterruptedException {
		
		addHardcodedWait();	
	String msg=	signp.validateMessage();
	Assert.assertEquals(ActualMessage, msg);
		
	    
	}

	@Then("also verify that the Title of the page is showing correct value")
	public void also_verify_that_the_title_of_the_page_is_showing_correct_value() {
	   
	}
	
	
	


	
	

}
