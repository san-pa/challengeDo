package govtech.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class HeroAction {

    @Given("I set Headers for request")
    public void i_set_Headers_for_request(io.cucumber.datatable.DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {

            RequestSpecification request = given().headers(list.get(i).get("KEY"), list.get(i).get("VALUE"));
        }
    }

    @When("send POST request with headers")
    public void sendPOSTRequestWithHeaders() {
    }

    {
        JSONObject request = new JSONObject();
        String Salary="1500.00";
        String taxPaid="167.89";
        String browniePoints="9";
        request.put("natid","natid-7087");
        request.put("name","Arya");
        request.put("gender","FEMALE");
        request.put("birthDate","1999-03-22T05:06:07");
        request.put("deathDate",null);
        request.put("salary",(Salary));
        request.put("taxPaid",(taxPaid));
        request.put("browniePoints",(browniePoints));
        String Requstbody = (request.toJSONString());
        System.out.println(request);
       given().header("content-Type","application/json").
                body(request.toJSONString()).
                when().post("http://localhost:9997/api/v1/hero");

    }


    @When("POST request with headers with an existing id entry in database")
    public void postRequestWithHeadersWithAnExistingIdEntryInDatabase() {
        JSONObject request = new JSONObject();
        String Salary="1500.00";
        String taxPaid="167.89";
        String browniePoints="9";
        request.put("natid","natid-7087");
        request.put("name","Arya");
        request.put("gender","FEMALE");
        request.put("birthDate","1999-03-22T05:06:07");
        request.put("deathDate",null);
        request.put("salary",(Salary));
        request.put("taxPaid",(taxPaid));
        request.put("browniePoints",(browniePoints));
        String Requstbody = (request.toJSONString());
        System.out.println(request);
        given().header("content-Type","application/json").
                body(request.toJSONString()).
                when().post("http://localhost:9997/api/v1/hero").
        then().statusCode(400).log()
                .body().statusCode(400);

    }
}








