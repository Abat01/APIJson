package util;

import static io.restassured.RestAssured.given;

public class AuthenticationHerOkuApp {

    public static String generateToken(){

        String url = "https://restful-booker.herokuapp.com/auth";
        /*
        {
    "username" : "admin",
    "password" : "password123"
}
         */

        given().body().when().post();


    }

}
