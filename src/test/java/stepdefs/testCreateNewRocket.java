package stepdefs;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matcher;
import org.hamcrest.core.StringContains;
import org.testng.annotations.Test;

public class test04june2021 {
	
	@Test(priority = 1)
	public void test_getAllSpaceX()
	{
 given()
.when()
.get("https://api.spacexdata.com/v4/rockets")
.then().statusCode(200)
.log().body()
       .body("name[0]",equalTo("Falcon 1"))
       .body("type[0]",equalTo("rocket"))
       .body("engines[0].isp.sea_level",equalTo(267))
       .body("second_stage[0].thrust.kN",equalTo(31))
       .body("diameter[0].feet",equalTo(5.5F))
       .body("landing_legs[1].material",equalTo("carbon fiber"))
       .body("payload_weights[0].name",equalTo("Low Earth Orbit"))
       .body("success_rate_pct[2]",equalTo("98"))
       .body("mass[2]",equalTo("1420788"))
       .body("propellant_1[3]",equalTo("liquid oxygen"));
       
 

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
