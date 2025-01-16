package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	public static void main(String[] args) {
		// Create a new instance of the chrome driver
		WebDriver driver = new ChromeDriver();

		// Open the browser
		driver.get("https://training-support.net/webelements/login-form");
		// print title of page
		System.out.println("Pae title is:" + driver.getTitle());
		// find about us link and click it
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.cssSelector("input#svelte-1pdjkmx")).sendKeys("Submit");
		System.out.println("new page title is:" + driver.getTitle());
		driver.quit();
	}
}

