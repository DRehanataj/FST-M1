package demosuit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

public class CRM_Activity9 {

    WebDriver driver;
    WebDriverWait wait;

    // Set up the WebDriver and initialize the browser (Chrome in this case)
    @BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//step1
		driver.get("https://alchemy.hguy.co/crm/");
	}

    @Test
    public void testLeadsTable() throws InterruptedException {
       

        // Step 2: Login to the site
        driver.findElement(By.id("user_name")).sendKeys("admin"); 
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        

        // Step 3: Wait for the page to load and navigate to Sales -> Leads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0")));
        driver.findElement(By.id("grouptab_0")).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads")));
        driver.findElement(By.id("moduleTab_9_Leads")).click();

        // Step 4: Find the table on the page	
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table")));

        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table"));

        // Step 5: Get all rows from the table (excluding the header row)
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        // Step 6: Loop through the first 10 rows and print the Name and User columns
        int count = 0;
        for (WebElement row : rows) {
            if (count == 10) break; // Stop after 10 rows
           
            // Get the username and full name from the table row (assuming User is in the 1st column and Name is in the 2nd)
            WebElement nameCell = row.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr/td[3]"));
           
            WebElement usernameCell = row.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr/td[8]"));
           

            // Print the username and full name to the console
            System.out.println("Username: " + usernameCell.getText() + ", Full Name: " + nameCell.getText());

            count++;
        }
    }

    // Step 7: Close the browser after the test
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

