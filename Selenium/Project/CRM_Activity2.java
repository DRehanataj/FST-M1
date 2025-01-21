package demosuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Activity2 {
	 WebDriver driver;

	    @BeforeTest
	    public void beforeMethod() {
	        // Create a new instance of the Chrome driver
	        driver = new ChromeDriver();

	        // Open the browser
	        driver.get("https://alchemy.hguy.co/crm/");
	    }
	   
	    @Test
	    public void getHeaderImageURL() {
	        // Find the header image element using its XPath
	        WebElement headerImage = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));

	        // Get the URL of the header image
	        String imageURL = headerImage.getDomAttribute("src");
	        // Print the image URL to the console
	        System.out.println("Header Image URL: " + imageURL);
	       
	    }
	  //Tear down function
		@AfterClass
		public void tearDown() {
			// Close the browser
			driver.quit();
		}

}
