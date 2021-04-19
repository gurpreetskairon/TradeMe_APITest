package apitest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static commons.Utilities.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CarDetails {
	
	@Test
	public void getCarDetails() {
		
		// get the car details response given the oauth details
		Response response = given()
				.auth()
				.oauth(getConfigProperty("consumer_key"),
				getConfigProperty("consumer_secret"),
				getConfigProperty("access_token"),
				getConfigProperty("access_token_Secret"))
				.get(getConfigProperty("car_details_uri"));
			
			// convert the response body to string
			String responseBodyAsString = response.getBody().asString();
			
			// fetch the car details to be validated from the config.properties files
			String[] details = getConfigProperty("car_details_to_validate").split(",");
			
			// assert if each of the expected car details properties is part of the response body
			for (String validateCarDetail : details)
				assertTrue("The response body does not contain " + validateCarDetail.trim() + "!", responseBodyAsString.contains(validateCarDetail.trim()));
	}
	
}
