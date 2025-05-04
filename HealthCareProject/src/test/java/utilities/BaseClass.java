package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import constantData.ConstantData;

public class BaseClass {

//declare WebDriver
	
	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void openBrowser() throws IOException
	{
		String browserName=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
			
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
		
		
	}
	
	public static void addExplicitWait(By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void addImpicitWait() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void scrollDown()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", " ");
	}
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
	
	
	
	
	
	
	
	
	
	

