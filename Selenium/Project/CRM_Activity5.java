package demosuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class CRM_Activity5 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();

	}

	@Test
	public void testNavigationMenuColor() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Navigate to the CRM login page
		driver.get("http://alchemy.hguy.co/crm");

		// Login with provided credentials

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar")));

		// Find the navigation menu element (adjust selector based on actual element)
		WebElement sales = driver.findElement(By.id("grouptab_0"));
		WebElement marketing = driver.findElement(By.id("grouptab_1"));
		WebElement support = driver.findElement(By.id("grouptab_2"));
		WebElement activities = driver.findElement(By.id("grouptab_3"));
		WebElement collabaration = driver.findElement(By.id("grouptab_4"));
		WebElement All = driver.findElement(By.id("grouptab_5"));

		// Get the color of the navigation menu
		String salesColor = sales.getCssValue("background-color");
		String marketingColor = sales.getCssValue("background-color");
		String supportColor = sales.getCssValue("background-color");
		String activitiesColor = sales.getCssValue("background-color");
		String collaborationColor = sales.getCssValue("background-color");
		String AllColor = sales.getCssValue("background-color");

		// Print the color to the console
		System.out.println("Navigation menu color: " + salesColor);
		System.out.println("Navigation menu color: " + marketingColor);
		System.out.println("Navigation menu color: " + supportColor);
		System.out.println("Navigation menu color: " + activitiesColor);
		System.out.println("Navigation menu color: " + collaborationColor);
		System.out.println("Navigation menu color: " + AllColor);

	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
