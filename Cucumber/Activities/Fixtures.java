package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Fixtures extends BaseClass {
    @BeforeAll
    public static void setUp() {
        // Initialize chrome Driver
    	driver = new ChromeDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    
    @AfterAll
    public static void tearDown() {
        // Close the browser
    	driver.quit();
    }
}