package liveProject;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssureProject {
	RequestSpecification requestSpec;
	ResponseSpecification responsespec;
	String keyId;
	int keyvalue = 0;
	@BeforeClass
	public void setup() {
		// Request Specification
		requestSpec = new RequestSpecBuilder().setBaseUri("https://api.github.com")
				.addHeader("Authorization", "token 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")
				.addHeader("Content-Type", "application/json").build();
		// Response Specification
		responsespec = new ResponseSpecBuilder()
				//expectStatusCode(200)
				.expectResponseTime(lessThanOrEqualTo(20000L))
				.expectBody("title",equalTo("TestAPIKey"))
				
				
				.build();
	}
	@Test(priority = 1)
	public void postRequest() {

		// create request body
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("title", "TestAPIKey");
		reqBody.put("key",  "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIG/i5mmtxjqpV1b/9DJvD6G0p1n3UYroUkCFMwgf5uDX");
		
		Response response = given().spec(requestSpec).body(reqBody)
				.log().all()// add request body
				.when().post("/user/keys");// send post request
		// Extract petId
		keyvalue = response.then().extract().path("id");
		// Assertion
		response.then().spec(responsespec)
		.statusCode(201);

	}
	@Test(priority = 2)
	public void getRequest() {

		 given().spec(requestSpec).
				pathParam("keyId", keyvalue).when().get("/user/keys/{keyId}").then().spec(responsespec)
				.statusCode(200);
	}
	@Test(priority = 3)
	public void deleteRequest() {

		given().spec(requestSpec).pathParam("keyId", keyvalue).when().delete("/user/keys/{keyId}").then().statusCode(204);
	}

}
