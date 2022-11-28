package denemeler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

public class Task02 {
    /*2.
    https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
    status code’unun 200,
    ve content type’inin application/json; charset=utf-8,
    ve Server isimli Header’in degerinin Cowboy,
    ve status Line’in HTTP/1.1 200 OK
    */
    //put 200 var olan kullanıcı tamammen degisiklik
    //post sifirdan 201 basarılı sekilde kayıt body id sifre
    //get 200
    //fetch 200  kismi
    //delete

    @Test
    public void test01(){
        String url="https://restful-booker.herokuapp.com/booking/10 ";
        Response response= RestAssured.get(url);
        response.prettyPrint();
        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                statusLine("HTTP/1.1 200 OK").
                header("Server","Cowboy");


    }
}
