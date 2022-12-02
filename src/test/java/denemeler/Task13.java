package denemeler;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Task13 {

    ///ERROR
    /*
        http://dummy.restapiexample.com/api/v1/update/21 url’ine
        asagidaki body’ye sahip bir PUT request gonderdigimizde
        donen response’un asagidaki gibi oldugunu test edin.

        Request Body
                {
                "status": "success",
                "data": {
                    "name": "Ahmet",
                    "salary": "1230",
                    "age": "44",
                    "id": 40
                        }
               }

        Response Body

               {
                "status": "success",
                "data": {
                    "status": "success",
                    "data": {
                        "name": "Ahmet",
                        "salary": "1230",
                        "age": "44",
                        "id": 40
                    }
                },
                "message": "Successfully! Record has been updated."
            }

  */

    @Test
    public void test1(){
        String url="http://dummy.restapiexample.com/api/v1/update/21";
        JSONObject reqObj=new JSONObject();
        reqObj.put("status","success");
        JSONObject dataObj=new JSONObject();
        dataObj.put("name","Ahmet");
        dataObj.put("salary","1230");
        dataObj.put("age","44");
        dataObj.put("id",40);
        reqObj.put("data",dataObj);
        Response response=given().contentType(ContentType.JSON).when()
                .body(reqObj.toString()).put(url);

        response.prettyPrint();
        JsonPath actual=response.jsonPath();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actual.get("status"),reqObj.get("status"));
        softAssert.assertEquals(actual.get("data.data.name"),reqObj.getJSONObject("data").get("name"));
        softAssert.assertEquals(actual.get("data.data.id"),reqObj.getJSONObject("data").get("id"));
        softAssert.assertEquals(actual.get("data.data.salary"),reqObj.getJSONObject("data").get("salary"));
        softAssert.assertEquals(actual.get("data.data.age"),reqObj.getJSONObject("data").get("age"));





    }








}
