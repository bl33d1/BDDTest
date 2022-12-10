package org.example.stepdefinitions.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestTest {
  Response response;
  @Given("make a GET request to {string}")
  public void make_a_get_request_to(String string) {
    RestAssured.baseURI = string;
    response = RestAssured.get("/get");
  }
  @Then("i should receive a status code of {int}")
  public void i_should_receive_a_status_code_of(Integer int1) {
    response.then().statusCode(200);
  }
}
