package stepDefinitionClass;

//import org.junit.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;

//public class Response_Assertions {
//      Response response;
//       int statusCode;
//}
      
//       @Given("API for foreign exchange")
//       public void getURL()
//       {​​​​​​​
//           RestAssured.baseURI="https://api.ratesapi.io/api/latest";
//           //RestAssured.get("https://api.ratesapi.io/api/latest");
//       }​​​​​​​
//       
//        @When("Store the response into response object")
//        public void StoreResObj()
//        {​​​​​​​
//            response= RestAssured.given().header("Content-Type", "application/json")
//                       .when().get("/latest")
//                       .then().log().all().assertThat().statusCode(200).extract().response();
//        }​​​​​​​
//       
//        @Then("validate response code received using assertion")
//       public void print()
//       {​​​​​​​
//            Assert.assertEquals(200, response.getStatusCode());
//             System.out.println("Status Code of Response is :" + response.getStatusCode());
//       }​​​​​