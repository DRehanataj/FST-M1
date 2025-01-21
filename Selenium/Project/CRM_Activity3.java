package demosuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Activity3 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		// Open the URL
		driver.get("http://alchemy.hguy.co/crm");

	}
	
	 @Test
	public void getCopyrightText() {
		

		// Find the first copyright text element (typically in the footer)
		WebElement copyrightText = driver.findElement(By.id("admin_options"));

		// Print the copyright text to the console
		
		System.out.println("First copyright text: " + copyrightText.getText());
		Assert.assertEquals(copyrightText.getText(), "© Supercharged by SuiteCRM");
	}

	// Tear down function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
