# TradeMe_APITest
Using the TradeMe Sandbox web site, the following REST API scenarios are automated using RestAssured library in Java.  

The data to the test cases is passed through the config.properties file. This file is present under the /src/test/resources directory.

The /src/test/java/commons/utilities.java file contains the commmon methods. As of now the only method implementation is to read the property value from the config.properties file.


## I. Retrieve a list of charities and confirm that St John is included in the list.
This test scenario is implemented in the /src/test/java/apitest/Charities.java file. 

The tests are junit tests and can be triggered using the following command:


## II. Query any existing Used Car listing and confirm that Number plate, Kilometres, Body, Seats details are shown.
This test scenario is implemented in the /src/test/java/apitest/CarDetails.java file.

The tests are junit tests and can be triggered using the following command:

