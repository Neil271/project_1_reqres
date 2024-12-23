package in.reqres.userinfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserLoginTest extends TestBase {

    @Test
    public void userLogin() {
        UserPojo userPojo = new UserPojo();
        userPojo.setEmail("eve.holt@reqres.in");
        userPojo.setPassword("cityslicka");

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/login");
        response.prettyPrint();
        response.then().statusCode(200);

    }


}
