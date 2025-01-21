package demosuit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Activity8 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//step1
		driver.get("https://alchemy.hguy.co/crm/");
	}
	@Test
	public void testAccountPageTable() throws InterruptedException {
               
        // Assuming login credentials are known
        driver.findElement(By.id("user_name")).sendKeys("admin"); 
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd"); 
        driver.findElement(By.id("bigbutton")).click();
        // Step 2: Navigate to Sales -> Accounts page
        driver.findElement(By.id("grouptab_0")).click(); // Sales menu
        driver.findElement(By.id("moduleTab_9_Accounts")).click(); // Accounts submenu
        Thread.sleep(2000);   
        // Step 3: Find the table on the page
        WebElement table = driver.findElement(By.xpath("//table[@class='list view table-responsive']")); 
        
        // Get all rows from the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        // Step 4: Print names of the first 5 odd-numbered rows (index starts from 0)
        int count = 0;
        for (int i = 1; i < rows.size(); i += 2) { // Odd-numbered rows: index 1, 3, 5...
            if (count == 5) break; // Stop after printing 5 rows
            WebElement row = rows.get(i);
            List<WebElement> columns = row.findElements(By.tagName("td"));
            
            if (columns.size() > 1) {
                String name = columns.get(1).getText(); // Assuming name is in 2nd column
                System.out.println(name);
            }
            count++;
        }
	}
	@AfterTest
    public void tearDown() {
        // Step 5: Close the browser
        driver.quit();
    }
}

