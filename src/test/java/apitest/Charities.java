package apitest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static commons.Utilities.*;
import java.util.ArrayList;
import org.junit.Test;

public class Charities {
	
   @Test
    public void verifyNameInListofCharities	()
    {
	   // extract the description tag values from the response body 
    	ArrayList<String> lstCharities = given()
    										.when()
    										.get(getConfigProperty("charities_uri"))
    										.then()
    										.extract()
    										.path(getConfigProperty("charities_tag"));
    	
    	// verify that the list of charities contains "St John"
    	assertTrue("Could not find " + getConfigProperty("expected_charity") + " under the listed charities!", lstCharities.contains(getConfigProperty("expected_charity")));
    }
}
