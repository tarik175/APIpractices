package denemeler;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Task14 {
    //    Soru 1-  https://jsonplaceholder.typicode.com/posts endpointine
    //    bir GET request gonderdigimizde donen response’un status code’unun 200 oldugunu
    //    ve Response’ta 100 kayit oldugunu test edin

    // 1- Request url vey bod'sini olustur

    // String url="https://jsonplaceholder.typicode.com/posts";
    @Test
    public void test14(){
        String url="https://jsonplaceholder.typicode.com/posts";
        Response response=given().when().get(url);
        response.prettyPrint();
        response.then().assertThat().statusCode(200).body("title", Matchers.hasSize(100));





    }










}
