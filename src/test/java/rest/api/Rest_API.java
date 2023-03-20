package rest.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_API {
	
	@Test
	private void url_launch() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users/2");
		System.out.println("response: "+response.asString());
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode: "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		System.out.println("Stutus code validated");
		
	}

}
