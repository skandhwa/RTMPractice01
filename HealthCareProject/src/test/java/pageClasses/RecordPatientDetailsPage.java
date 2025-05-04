package pageClasses;

import org.openqa.selenium.By;

public class RecordPatientDetailsPage {
	
	
	
	
	public static By clickPatName()
	{		
	return	By.xpath("//a[@href='/openmrs/spa/patient/be1795e1-85c3-4e1d-adee-9b05d5f424c7/chart']");
	}
	
	public static By recordVitals()
	{
		return	By.xpath("(//button[@class='cds--btn cds--btn--sm cds--layout--size-sm cds--btn--ghost'])[1]");
	}
	
	public static By temprature()
	{
		return	By.xpath("//input[@name='Temperature']");
	}
	
	public static By systolic()
	{
		return	By.xpath("//input[@name='systolic']");
	}
	
	public static By diastolic()
	{
		return	By.xpath("//input[@name='diastolic']");
	}
	
	public static By heartRate()
	{
		return	By.xpath("//input[@name='Pulse']");
	}
	
	
	public static By submitDetails()
	{
		return	By.xpath("//button[@type='submit']");
	}

}
