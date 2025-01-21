package demosuit;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Activity7 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alchemy.hguy.co/crm/");
	}
	@Test
    public void testReadingPopupInformation() throws InterruptedException {
		 // Locate the login fields and login
        driver.findElement(By.id("user_name")).sendKeys("admin"); 
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd"); 
        driver.findElement(By.id("bigbutton")).click();
        
        // Step 2: Navigate to Sales -> Leads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0")));
        driver.findElement(By.id("grouptab_0")).click();  
        driver.findElement(By.id("moduleTab_9_Leads")).click();  
        Thread.sleep(2000);
        // Step 3: Find the Additional Information icon in the leads table and click it
        WebElement additionalInfoIcon = driver.findElement(By.xpath("//span[@title='Additional Details']"));
        additionalInfoIcon.click();        
        Thread.sleep(2000);
        // Step 4: Extract and print the phone number from the popup
                WebElement phoneNumberElement = driver.findElement(By.xpath("//span[@class='phone']"));
        String phoneNumber = phoneNumberElement.getText();  // Get the phone number text
        System.out.println("Phone Number from popup: " + phoneNumber); 
        Assert.assertFalse(phoneNumber.isEmpty(),"phone number not available");
       
    }
 // Tear down function
 		@AfterClass
 		public void tearDown() {
 			// Close the browser
 			driver.quit();
 		}

}
