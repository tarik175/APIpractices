package denemeler;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Task07 {
/*
        https://restful-booker.herokuapp.com/booking/10 url’ine

        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application-json,
        ve response body’sindeki
            "firstname“in,"Susan",
            ve "lastname“in, "Jackson",
            ve "totalprice“in,612,
            ve "depositpaid“in,false,
            ve "additionalneeds“in,"Breakfast"
        oldugunu test edin
 */

    @Test
    public void test07(){
        String url="https://restful-booker.herokuapp.com/booking/10";

        Response response=given().when().get(url);
        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname", Matchers.equalTo("James"))
                .body("lastname",Matchers.equalTo("Brown"))
                .body("totalprice",Matchers.equalTo(111))
                .body("depositpaid",Matchers.equalTo(true))
                .body("additionalneeds",Matchers.equalTo("Breakfast"));



    }
}
