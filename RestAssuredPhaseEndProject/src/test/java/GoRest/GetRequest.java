package GoRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {
	
	@Test
	public void getR() {
		RestAssured
			.when()
				.get("https://gorest.co.in/public/v2/users")
			.then()
				.log().all();	
	}
}