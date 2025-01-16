
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity5 {
    public static void main(String[] args) {
        
        // Initializing a driver
        WebDriver driver = new ChromeDriver();
        
        // Open a browser/page
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Find the checkbox element
        WebElement checkbox = driver.findElement(By.id("checkbox"));

        // Print the visibility of the checkbox
        System.out.println("Is the checkbox visible? " + checkbox.isDisplayed());

        // Find and click the button to toggle the checkbox
        driver.findElement(By.xpath("//button[contains(text(), 'Toggle')]")).click();

        // Print the visibility of the checkbox after toggling
        System.out.println("Is the checkbox visible now? " + checkbox.isDisplayed());

        // Close the browser
        driver.quit();
    }
}