package demosuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity1 {
	WebDriver driver;

	@Test
	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize Chrome driver
		driver = new ChromeDriver();
		// Open the page
		driver.get("https://alchemy.hguy.co/crm/");
	}
	 @Test
	    public void testCase1() {
	        // This test case will pass
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        Assert.assertEquals(title, "SuiteCRM");
	    }


//Tear down function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
