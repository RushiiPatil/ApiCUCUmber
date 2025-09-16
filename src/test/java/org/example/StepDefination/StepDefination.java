package org.example.StepDefination;

import Resources.TestDataBuild;
import Resources.Util;
import Resources.APIResources;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.pojo.AddPlace;

import static io.restassured.RestAssured.given;

public class StepDefination {

    AddPlace place;
    Response response;
    RequestSpecification requestSpec;
    String placeId;
    ResponseSpecification responseSpec;
    TestDataBuild data = new TestDataBuild();
    Util ut = new Util();

    // ✅ Using parameterized payload
    @Given("Add place payload with {string} {string} {string}")
    public void add_place_payload_with(String name, String language, String address) throws Exception {
        requestSpec = given()
                .spec(Util.requestspecification())
                .body(data.addPlacePayload(name, language, address));  // correct method
    }

    @When("user called {string} with {string} http request")
    public void user_called_with_post_http_request(String resource, String requestType) throws Exception {
        APIResources api = APIResources.valueOf(resource); // enum constant from string
        String endpoint = api.getResource();              // fetch actual API endpoint

        if (requestType.equalsIgnoreCase("POST")) {
            response = requestSpec.when().post(endpoint);
        } else if (requestType.equalsIgnoreCase("GET")) {
            response = requestSpec.when().get(endpoint);
        } else if (requestType.equalsIgnoreCase("DELETE")) {
            response = requestSpec.when().delete(endpoint);
        }

        System.out.println("API Response: " + response.asString());
    }
    @Then("the API call is successful with status code {int}")
    public void the_api_call_is_successful_with_status_code(Integer statusCode) {
        response.then().statusCode(statusCode); // ✅ validate directly
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {

        String actualValue = response.jsonPath().getString(key);
        System.out.println("Validating: " + key + " = " + actualValue);
        assert actualValue.equals(value);

        // ✅ save place_id globally

        // Always capture place_id if present in response
        if (response.jsonPath().getString("place_id") != null) {
            Util.place_id = response.jsonPath().getString("place_id");
            System.out.println("✅ Saved Place ID: " + Util.place_id);
        }

    }
    @Given("Get place payload")
    public void get_place_payload() throws Exception {
        requestSpec = given()
                .spec(Util.requestspecification())
                .queryParam("place_id", Util.place_id);
    }
    @Given("Delete place payload")
    public void delete_place_payload() throws Exception {
        String deletePayload = "{ \"place_id\":\"" + Util.place_id + "\" }";

        requestSpec = given()
                .spec(Util.requestspecification())
                .body(deletePayload); // ✅ send body with place_id
    }




}
