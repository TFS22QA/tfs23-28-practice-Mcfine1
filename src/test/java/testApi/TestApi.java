package testApi;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.tinkoff.fintech.qa.apiModel.User;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApi {
    User user;
    User responseUser;
    private static final String BASE_URI = "http://localhost:8080/api/";
    @BeforeEach
    public void init(){
        user = new User();
        user.setFio("Ivan Ivanovich Ivanov");
        user.setId(1);
        user.setPhone("");
        user.setPasswordNumber(342246);
        user.setPasswordSeries(6244);
    }

    @Test
    public void addUser(){
        given()
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .baseUri(BASE_URI+"add/")
                .post()
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

}
