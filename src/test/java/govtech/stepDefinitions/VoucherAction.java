package govtech.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class VoucherAction {
    public static  Response response;
    private JSONObject jsonBody;
    private JSONArray jsonArray;
    public static  RequestSpecification request;


    @Given("get api request to check number of vocher for each customer")
    public void getApiRequestToCheckNumberOfVocherForEachCustomer() {

    }



    @And("status is {int}")
    public void statusIs(int arg0) {
    }

    @When("get api is triggered with parameters by person and type")
    public void getApiIsTriggeredWithParametersByPersonAndType() {
    }

    @Given("get api request to check number of voucher for each customer")
    public void getApiRequestToCheckNumberOfVoucherForEachCustomer() {
        
    }

    @And("status is {int} is expected")
    public void statusIsIsExpected(int arg0) {
    }

    @Then("response with Payload as expected")
    public void responseWithPayloadAsExpected() {
    }
}








