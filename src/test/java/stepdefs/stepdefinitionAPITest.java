package stepdefs;

import org.testng.AssertJUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.Restassured.given;

public class stepdefsAPItest {
	
	RequestSpecification request;
	Response response;
	
	@Given("^User sets base <url>$")
	public void user_sets_base_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("step1");
	   RestAssured.baseURI = url;
	   
	}

	@Given("^user authenticates api request with <token>$")
	public void user_authenticates_api_request_with_token(String token) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step2");
	//	request = given().auth().oauth2(token);
	}

	@When("user sends request to get all the response information")
	public void user_sends_request_to_get_all_the_response_information() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step3");
		response=request.get("https://api.spacexdata.com/v4/company").then().extract().response();
	}

	@Then("^user gets response with status <code>$")
	public void user_gets_response_with_status_code(int code) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step4");
		AssertJUnit.assertEquals(code, response.getStatusCode());
	}


}
