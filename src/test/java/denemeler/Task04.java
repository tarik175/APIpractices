package denemeler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class Task04 {

    /*4
    https://jsonplaceholder.typicode.com/posts/70 url’ine asagidaki
    Json formatindaki body ile bir PUT request gonderdigimizde
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
        donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin cloudflare,
        ve status Line’in HTTP/1.1 200 OK
         */

    @Test
    public void test04(){
        String url="https://jsonplaceholder.typicode.com/posts/70";

        JSONObject yeni=new JSONObject();
        yeni.put("title","Ahmet");
        yeni.put("body","Merhaba");
        yeni.put("userId",10);
        yeni.put("id",70);

        Response response= RestAssured.get(url);
        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                header("Server","cloudflare").
                statusLine("HTTP/1.1 200 OK");





    }

}
