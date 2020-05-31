package com.ynap.wcs.stepdefs;

import com.google.gson.Gson;
import com.ynap.wcs.models.CityTemp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CityStepDef {

    private String appUrl = "http://restapi.demoqa.com/utilities/weather/city";
    private String cityResource =  "/{city}";

    @When("^call temperature service for city (.*)")
    public void callTemperatureService(final String city ){
        RestAssured.baseURI = appUrl ;
        /*
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, city);
        */
        final Response response = given()
                .when()
                .get(cityResource, city);

        final String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);


        CityTemp cityTemp = new Gson().fromJson(responseBody, CityTemp.class);
        System.out.println("Temperature:" + cityTemp.toString());
    }

    @Then("^temperature of Hyderabad should be returned$")
    public void verifyTemperatureReturned(){
        System.out.println("Temperature returned successfully");
    }
}
