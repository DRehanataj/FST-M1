package demosuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Activity4 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		// Step 1: Open the site
        driver.get("https://alchemy.hguy.co/crm");

	}
	
	@Test
    public void testLogin() {
        

        // Step 2: Find and select the username and password 
        WebElement usernameField = driver.findElement(By.id("user_name"));
        WebElement passwordField = driver.findElement(By.id("username_password"));
        
        // Step 3: Enter login credentials into the respective fields
        usernameField.sendKeys("admin");  
        passwordField.sendKeys("pa$$w0rd"); 

        // Step 4: Click login
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        loginButton.click();

        // Step 5: Verify successful login by checking if a specific element is present	
        WebElement dashboard = driver.findElement(By.id("moduleTab_Home")); 

        // Assert that the element is displayed (indicating successful login)
        Assert.assertTrue(dashboard.isDisplayed(), "Login failed!");
       
       
    }
	// Tear down function
		@AfterClass
		public void tearDown() {
			// Close the browser
			driver.quit();
		}
}
