package in.reqres.userinfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateNewUserTest extends TestBase {

    @Test
    public void createNewUser(){

        UserPojo userPojo=new UserPojo();
        userPojo.setName("janu");
        userPojo.setJob("Teacher");

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .body(userPojo)
                .post("/users");
        response.prettyPrint();
        response.then().statusCode(201);

    }


}
