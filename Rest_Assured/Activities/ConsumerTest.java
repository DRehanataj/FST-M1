package liveProject;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.given;
import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
	// set the headers
	Map<String,String> headers= new HashMap<>();
	// create the contract(pact)
	@Pact(consumer = "USerConsumer", provider  = "UserProvider")
	public RequestResponsePact createPact(PactDslWithProvider builder) {
		// set the headers
		headers.put("Content-Type", "application/json");
		//request response body
		
		DslPart reqResBody= new PactDslJsonBody().
				numberType("id",195	)
				.stringType("firstName", "Rehana")
				.stringType("lastName","Taj")
				.stringType("email", "rdudek10@in.ibm.com");
		// create pact
		return builder.given("POST Request")
				.uponReceiving("A request to create a user")
				.method("POST")
				.headers(headers)
				.path("/api/users")
				.body(reqResBody)
				.willRespondWith()
				.status(201)
				.body(reqResBody)
				.toPact();
	}
	
	//Consumer test with MockProvider
	
  @Test
  @PactTestFor(providerName= "UserProvider" , port= "8282")
  public void postRequesttest() {
	  
	  // create request body
	  Map<String, Object> reqBody= new HashMap<>();
	  reqBody.put("id", 195);
	  reqBody.put("firstName", "Rehana");
	  reqBody.put("lastName", "Taj");
	  reqBody.put("email", "rdudek10@in.ibm.com");
	  // send request and get response,add assertions
	  given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).log().all()
	  .when().post()
	  .then().statusCode(201).body("firstName",equalTo("Rehana")).log().all();
	  
	  
	  
  }
}
