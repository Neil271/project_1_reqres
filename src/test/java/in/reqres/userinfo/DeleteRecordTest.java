package in.reqres.userinfo;

import in.reqres.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteRecordTest extends TestBase {

    @Test
    public void deleteUser() {
        given()
                .pathParam("id", 6)
                .when()
                .delete("/users/{id}")
                .then().log().all()
                .statusCode(204);
    }

}
