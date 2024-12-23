package in.reqres.userinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetListUsersTest extends TestBase {

    @Test
    public void getAllUsers() {
        Response response = given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getSingleUserById() {
        //get the data of particular id
        Response response = given()
                .pathParam("id", 2)
                .when()
                .get("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getPageTwoUsers() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        //response.prettyPrint();
        response.then().statusCode(200);
        //System.out.println(response.getBody().prettyPrint());

    }

}
