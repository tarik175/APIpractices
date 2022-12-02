package denemeler;

import BaseUrlDepo.BaseUrlHerokuApp;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

public class Test18 extends BaseUrlHerokuApp {
    /*
    2- https://restful-booker.herokuapp.com/booking endpointine
    gerekli Query parametrelerini yazarak
    “firstname” degeri “Eric” olan rezervasyon oldugunu test edecek
    bir GET request gonderdigimizde, donen response’un
    status code’unun 200 oldugunu ve “Eric” ismine sahip en az bir booking oldugunu test edin

     */

    @Test
    public void Test18(){
        specHerokuapp.pathParam("pp1","booking").queryParam("firstname","Eric");
        Response response= RestAssured.given().spec(specHerokuapp).when().get("/{pp1}");
        response.then().assertThat().statusCode(200)
                .body("firstname",Matchers.greaterThan(0));

    }


}
