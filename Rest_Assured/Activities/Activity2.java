package activities;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import io.restassured.response.Response;

public class Activity2 {
	@Test(priority = 1)
	public void addNewUserFromFile() throws IOException {
		// Import JSON file
		FileInputStream inputJSON = new FileInputStream("F:/FST2025/FST_RestAssured/JsonFile.json");

		Response response = given().baseUri("https://petstore.swagger.io/v2/user") // Set base URI
				.header("Content-Type", "application/json") // Set headers
				.body(inputJSON) // Pass request body from file
				.when().post(); // Send POST request

		inputJSON.close();

		// Assertion
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("7806"));
	}

	@Test(priority = 2)
	public void getUserInfo() {
		// Import JSON file to write to
		File outputJSON = new File("src/test/java/activities/userGETResponse.json");

		Response response = given().baseUri("https://petstore.swagger.io/v2/user") // Set base URI
				.header("Content-Type", "application/json") // Set headers
				.pathParam("username", "vali") // Pass request body from file
				.when().get("/{username}"); // Send POST request

		// Get response body
		String resBody = response.getBody().asPrettyString();

		try {
			// Create JSON file
			outputJSON.createNewFile();
			// Write response body to external file
			FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(resBody);
			writer.close();
		} catch (IOException excp) {
			excp.printStackTrace();
		}

		// Assertion
		response.then().body("id", equalTo(7806));
		response.then().body("username", equalTo("vali"));
		response.then().body("firstName", equalTo("Rehana"));
		response.then().body("lastName", equalTo("Case"));
		response.then().body("email", equalTo("justincase@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));
	}

	@Test(priority = 3)
	public void deleteUser() throws IOException {
		Response response = given().baseUri("https://petstore.swagger.io/v2/user") // Set base URI
				.header("Content-Type", "application/json") // Set headers
				.pathParam("username", "vali") // Add path parameter
				.when().delete("/{username}"); // Send POST request

		// Assertion
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("vali"));
	}
}