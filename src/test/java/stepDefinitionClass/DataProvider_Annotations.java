package stepDefinitionClass;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class DataProvider_Annotations {
	RequestSpecification spec;

	@BeforeMethod
	public void setUpSpec(){
	  RequestSpecBuilder builder = new RequestSpecBuilder();
	  builder.addQueryParam(parameterName, parameterValue); // define common parameters
	  builder.setContentType(ContentType.JSON);
	  spec = builder.build();
	}
	
	@DataProvider(parallel = true)
	  public Object[] getId() {
	    return new Object[] {"EMP_001", "EMP_002", "EMP_003"};
	    
	    @Test(dataProvider = "getId")
	    public void responseTimeOfEndpoint(String id) {
	      Map<String, String> map = new HashMap<>();
	      map.put("id", id);

	      given()
	        .spec(spec)
	        .body(map)
	      .when()
	        .log()
	        .all()
	        .post(ENDPOINT_ADDRESS)
	      .then()
	        .time(lessThan(2000L))
	        .and()
	        .statusCode(200);
	    }
	  }

}
