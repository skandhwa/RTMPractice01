package testClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.RegisterPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class RegisterPatientTest extends BaseClass{
	
//	RegisterPage rpObj= new RegisterPage();
//	LoginTest logintest=new LoginTest();
	@DataProvider (name="registerpatientdata")
	public Object [] [] method()
	{
		return new Object[][] {
			
			{"Harry","dsouza","32","Mumbai"},
			
			{"Henry","Williamson","45","Delhi"},
			
			
		};
	}
	
	@Test(dataProvider="registerpatientdata",groups={"smoke"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public void addPatient(String fn,String ln, String age,String add) throws InterruptedException
	{
		LoginTest.executeLoginTest();
		
		addExplicitWait(RegisterPage.addPatientButton());
		driver.findElement(RegisterPage.addPatientButton()).click();
		addExplicitWait(RegisterPage.patientIdentityButton());
		driver.findElement(RegisterPage.patientIdentityButton()).click();
		addExplicitWait(RegisterPage.firstName());
		driver.findElement(RegisterPage.firstName()).sendKeys(fn);
		addExplicitWait(RegisterPage.lastName());
		driver.findElement(RegisterPage.lastName()).sendKeys(ln);
		scrollDown();
		addExplicitWait(RegisterPage.gender());
		Thread.sleep(3000);
		driver.findElement(RegisterPage.gender()).click();
		addExplicitWait(RegisterPage.dobStataus());
		scrollDown();
		WebElement element=driver.findElement(RegisterPage.dobStataus());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		addExplicitWait(RegisterPage.age());
		Thread.sleep(3000);
		driver.findElement(RegisterPage.age()).sendKeys(age);
		addExplicitWait(RegisterPage.address());
		//scrollDown();
		WebElement element1=	driver.findElement(RegisterPage.address());
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		    element1.sendKeys(add);
		addExplicitWait(RegisterPage.btnregPat());
		Thread.sleep(3000);
		driver.findElement(RegisterPage.btnregPat()).click();
		addExplicitWait(RegisterPage.validatePatID());
		WebElement patId=	driver.findElement(RegisterPage.validatePatID());
		if(patId.isDisplayed()==true)
		{
			System.out.println("Test case is successful");
		}
	
		else
		{
		 throw new NullPointerException("Patient Registation is failed");
		
		
		
	}
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


