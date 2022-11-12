package GoRest;

import java.util.HashMap;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest  extends BaseTest{
	public static HashMap<String, String> map = new HashMap<String, String>(); 
	UUID uuid = UUID.randomUUID();

	@Test(priority = 0)
	public void postData() {
		map.put("name", "athavan");
		logger.info("Added name");
		map.put("email", "athavan" + uuid + "@gmail.com");
		logger.info("Added email");
		map.put("gender", "male");
		logger.info("Added gender");
		map.put("status", "active");
		logger.info("Added status");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users";
		logger.info("Payload Created for creating the resource");
	}
	
	@Test(priority = 1)
	public void createdResource() {
		RestAssured
			.given()
				//.contentType("application/json")
				.contentType(ContentType.JSON)
				.body(map)
				.header("Authorization","Bearer b882b88bc6a678e431a52a999543be7d6e801da8ed5c6f60588f64a923f4d71a")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
		
		logger.info("Resource created");
		
	}
}
