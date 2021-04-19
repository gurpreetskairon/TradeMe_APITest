# TradeMe_APITest
Using the TradeMe Sandbox web site, the following REST API scenarios are automated using RestAssured library in Java. 
This is a maven project and the POM file contains all the required dependecies.


## Test Scenareos:
### I. Retrieve a list of charities and confirm that St John is included in the list.
This test scenario is implemented in the /src/test/java/apitest/Charities.java file. 

### II. Query any existing Used Car listing and confirm that Number plate, Kilometres, Body, Seats details are shown.
This test scenario is implemented in the /src/test/java/apitest/CarDetails.java file.

## Resources:
The data to the test cases is passed through the config.properties file. 
This file is present under the /src/test/resources directory.

## Code Structure:
  The /src/test/java/commons/utilities.java file contains the commmon methods. As of now the only method implementation is to read the property value from the config.properties file.
  The /src/test/java/apitest directory contains the test case implementation files. These are JUnit test cases. 
  The Test Scenario I related to charities is implemented in the "Charities.java" file.
  The Test Scenario II related to car details is implemented in the "CarDetails.java" file

## Execution Command:
  The test case are triggered by running the following command on the project directory propompt:
    > mvn -Dtest=Charities,CarDetails test

## Execution Results:
  The test execution results are stored under the ./target directory file under the project root directory.

