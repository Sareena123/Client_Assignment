package stepDefinitionClass;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

//Given API for foreign exchange 
//When posted with correct Information
//Then validate positive response code received

public class ValidateResponseCode
{
	Response res;
	int StatusCode;
	
@Given("API for foreign exchange")
public void getURL()
{
	res=RestAssured.get("https://api.ratesapi.io/api/latest");
}
	
@When("posted with correct information")
public void getResponse()
{
	StatusCode=res.getStatusCode();
	System.out.println("StatusCode:"+StatusCode);
}

@Then("validate positive response code received")
public void ResponseReceived()
{
	Assert.assertEquals(StatusCode, 200);
}
}