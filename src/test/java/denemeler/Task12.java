package denemeler;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Task12 {
    /*
    https://restful-booker.herokuapp.com/booking url’ine
    asagidaki body'ye sahip bir POST request gonderdigimizde
    donen response’un id disinda asagidaki gibi oldugunu test edin.
                   Request body
              {
                   "firstname" : "Ahmet",
                   "lastname" : “Bulut",
                   "totalprice" : 500,
                   "depositpaid" : false,
                   "bookingdates" : {
                            "checkin" : "2021-06-01",
                            "checkout" : "2021-06-10"
                                     },
                   "additionalneeds" : "wi-fi"
               }

                  Response Body
                  {
                "bookingid":24,
                "booking":{
                    "firstname":"Ahmet",
                    "lastname":"Bulut",
                    "totalprice":500,
                    "depositpaid":false,
                    "bookingdates":{
                        "checkin":"2021-06-01",
                        "checkout":"2021-06-10"
                    ,
                    "additionalneeds":"wi-fi"
                }
     */
    @Test
    public void test12(){
        String url="https://restful-booker.herokuapp.com/booking";
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



        Response response=given().contentType(ContentType.JSON)
                .when()
                .body(jsonObject.toString())
                .post(url);

        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("booking.firstname", Matchers.equalTo("Ahmet"))
                .body("booking.lastname", Matchers.equalTo("Bulut"))
                .body("booking.totalprice", Matchers.equalTo(500))
                .body("booking.depositpaid", Matchers.equalTo(false))
                .body("booking.additionalneeds", Matchers.equalTo("wi-fi"))
                .body("booking.bookingdates.checkin", Matchers.equalTo("2021-06-01"))
                .body("booking.bookingdates.checkout" , Matchers.equalTo("2021-06-10"));

    }
}
