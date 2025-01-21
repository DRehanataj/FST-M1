package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
			
public class GoogleSearchSteps extends BaseClass{
	@Given("user is on the Google homepage") 
	public void user_is_on_the_google_homepage() throws Throwable{
		//open browser
	    driver.get("https://www.google.com");
	}

	@When("user types in Cheese and hits enter")
	public void user_types_in_cheese_and_hits_enter()throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
	}

	@Then("Show how many search results were shown")
	public void show_how_many_search_results_were_shown() throws Throwable{
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
		String resultStats = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats"))).getText();
		System.out.println("Number of results found: " + resultStats);
	}

}
