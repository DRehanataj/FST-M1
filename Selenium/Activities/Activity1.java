package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
  public static void main(String[] args) {
    // Create a new instance of the chrome driver
    WebDriver driver = new ChromeDriver();
    
    // Open the browser
    driver.get("https://training-support.net");
//print title of page
    System.out.println("Pae title is:"+driver.getTitle());
    //find about us link and click it
    driver.findElement(By.linkText("About Us")).click();
    //print title of new page
    System.out.println("New page title"+ driver.getTitle());
    
    

    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
    driver.quit();
  }
}