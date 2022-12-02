package denemeler;

import BaseUrlDepo.BaseUrlHerokuApp;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Task15 extends BaseUrlHerokuApp {
    /*
    1-  https://restful-booker.herokuapp.com/booking endpointine
    bir GET request gonderdigimizde donen response’un
    status code’unun 200 oldugunu ve Response’ta 12 booking oldugunu test edin
    */


    @Test
    public void Test15(){
        specHerokuapp.pathParam("pp1","booking");
        Response response=given().spec(specHerokuapp).when().get("/{pp1}");
        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(200).
                body("bookingid", Matchers.greaterThan(12));
    }






}
