package homeWork.hw2.hw35rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestCreateWithPojo {
    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testCreated(){
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        ForReq forReq = new ForReq("morpheus", "leader");
        ForResp forResp = given()
                .body(forReq)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(ForResp.class);
        Assert.assertEquals(forResp.getName(), "morpheus");
        Assert.assertEquals(forResp.getJob(), "leader");
        Assert.assertEquals(forResp.getId (), 977);
        Assert.assertEquals(forResp.getCreatedAt(), "2023-10-06T18:23:01.666Z");

    }
}
