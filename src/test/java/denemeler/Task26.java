package denemeler;

import BaseUrlDepo.BaseUrlDummy;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Task26 extends BaseUrlDummy {
    /*http://dummy.restapiexample.com/api/v1/employee/3 url’ine bir GET request gonderdigimizde
    donen response’un asagidaki gibi oldugunu test edin.
    Response Body // expected data
    {
        "status":"success",
            "data":{
        "id":3,
                "employee_name":"Ashton Cox",
                "employee_salary":86000,
                "employee_age":66,
                "profile_image":""
    },
        "message":"Successfully! Record has been fetched."
    }
    */


    //JSonpath actual=response.jsonpath();
    //actual expected datayi karsılastır

    @Test
    public void Task26() {
        specDummyRestApi.pathParams("pp1","employee","pp2",3);

        Response response=given().spec(specDummyRestApi).when().get("/{pp1}/{pp2}");

        response.then().assertThat().body("status",equalTo("success"))
                .body("data.id",equalTo(3))
                .body("data.employee_name",equalTo("Ashton Cox"))
                .body("data.employee_salary",equalTo(86000))
                .body("data.employee_age",equalTo(66))
                .body("data.profile_image",equalTo(""))
                .body("message",equalTo("Successfully! Record has been fetched."));



    }






}
