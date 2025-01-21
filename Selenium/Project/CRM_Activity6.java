package demosuit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity6 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		// Initialize Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open the page
		driver.get("https://alchemy.hguy.co/crm/");
		
	}
	    @Test
	    public void testActivitiesMenu() {
	    	
	    	
	        // Locate the login fields and login
	        driver.findElement(By.id("user_name")).sendKeys("admin"); 
	        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd"); 
	        driver.findElement(By.id("bigbutton")).click();
	        
	        // Wait for the page to load and ensure the Activities menu item exists and is clickable
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement activitiesMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_3")));

	        WebElement parentMenu = driver.findElement(By.id("toolbar")); 

	        // Use Actions class to hover over the parent menu
	        Actions actions = new Actions(driver);
	        actions.moveToElement(parentMenu).perform();

	        // Now, locate and click on the hidden child menu item
	        WebElement childMenu = driver.findElement(By.id("grouptab_3")); 
	        Assert.assertTrue(childMenu.isDisplayed(), "Child menu is not visible");
	        childMenu.click();
	       
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser after the test
	        driver.quit();
	    }
	}


