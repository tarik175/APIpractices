package denemeler;

import BaseUrlDepo.BaseUrlHerokuApp;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class Task16 extends BaseUrlHerokuApp {
    /*
    2- https://restful-booker.herokuapp.com/booking endpointine
    asagidaki body’ye sahip bir POST request gonderdigimizde
    donen response’un status code’unun 200 oldugunu ve “firstname” degerinin “Ahmet” oldugunu test edin

        {
        "firstname" : "Ahmet",
        "lastname" : “Bulut",
        "totalprice" : 500,
        "depositpaid" : false,
        "bookingdates" : {
               "checkin" : "2021-06-01",
               "checkout" : "2021-06-10"
                  },
        "additionalneeds" : "wi-fi" }
     */

    //Yapamadım


    @Test
    public void test16(){

        specHerokuapp.pathParams("pp1","booking");
        JSONObject jsonObject=new JSONObject();
        JSONObject bookingbilgileri=new JSONObject();



        jsonObject.put("firstname","Ahmet");
        jsonObject.put("lastname","Bulut");
        jsonObject.put("totalprice",500);
        jsonObject.put("depositpaid",false);
        bookingbilgileri.put("checkin","2021-06-01");
        bookingbilgileri.put("checkout","2021-06-10");
        jsonObject.put("bookingdates",bookingbilgileri);
        jsonObject.put("additionalneeds","wi-fi");

        Response response= RestAssured.given().spec(specHerokuapp).when().post("/{pp1}");

        response.then().statusCode(200)
                .body("firstname",equalTo("Ahmet"));









    }



}
