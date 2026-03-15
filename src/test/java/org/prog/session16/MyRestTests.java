package org.prog.session16;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyRestTests {
    @Test
    public void testApiCall() {
        RestAssured
                .given()
        .baseUri("https://randomuser.me/")
        .basePath("api")
        .queryParam("noinfo")
        .queryParam("inc", "gender,name,nat,location,street")
        .get()
        .then()
        .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results[0].location.street.name" , Matchers.notNullValue());



        }

    @Test
    public void testApiCall1() {

        RestAssured
                .given()
                .baseUri("https://randomuser.me/")
                .basePath("api")
                .queryParam("noinfo")
                .queryParam("inc", "gender,name,nat,location,street")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results[0].location.street.number" , Matchers.notNullValue());
    }
    }
