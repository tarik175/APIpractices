package denemeler;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Task11 {
    /*
    https://jsonplaceholder.typicode.com/posts/22 url'ine
    bir GET request yolladigimizda
    donen response body’sinin asagida verilen ile ayni oldugunutest ediniz

    {
        "userId":3,
        "id":22,
        "title":"dolor sint quo a velit explicabo quia nam",
        "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
                     um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
    }
     */
    @Test
    public void Test10(){
        String url="https://jsonplaceholder.typicode.com/posts/22";
        Response response=given().when().get(url);
        response.prettyPrint();

        response.then().assertThat()
                .body("userId",equalTo(3),
                        "id",equalTo(22),
                        "title",equalTo("dolor sint quo a velit explicabo quia nam"),
                        "body",equalTo("eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"));




    }



}
