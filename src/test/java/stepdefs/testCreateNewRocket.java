package stepdefs;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class testCreateNewRocket {
	
	@Test(priority = 1)
	public void test_getAllSpaceX()
	{
 given()
.when()
.get("https://api.spacexdata.com/v4/rockets")
.then().statusCode(200);

}

	@Test(priority = 2)
	public void test_addnewRocket()
	{
		HashMap data = new HashMap<>();
		data.put("name", "rocketsingh1");
		data.put("type", "rocket");
		data.put("active", "false");
		data.put("boosters", "0");
		
		Response res=
		given()
		.contentType("application/json")
		.headers("x-api-Key", "spacex-key")
		.body(data)
		.when()
		        .post("https://api.spacexdata.com/v4/rockets")
		.then()
		        .statusCode(200)
		        .log().body()
		        .extract().response();
		
		String jsonString= res.asString();
		
		Assert.assertEquals(jsonString.contains("Record added"), true);
		
		
	}
	
}
