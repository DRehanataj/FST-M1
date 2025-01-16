package activities;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args) {
		// Create a new instance of the chrome driver
		WebDriver driver = new ChromeDriver();

		// Open the browser
		driver.get("https://training-support.net/webelements/login-form");
		// print title of page
		System.out.println("Pae title is:" + driver.getTitle());
		// find about us link and click it
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).sendKeys("Submit");
		System.out.println( driver.getTitle());
		driver.close();
	}
}

