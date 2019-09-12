import com.jayway.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class restapi {
        @Test
        public void track200(){
            RestAssured.given()
                    .when().post("http://httpbin.org/status/200").then().statusCode(200);
        }
        @Test
        public void track300(){
            RestAssured.given()
                    .when().post("http://httpbin.org/status/300").then().statusCode(300);
        }
        @Test
        public void track404(){
            RestAssured.given()
                    .when().post("http://httpbin.org/status/300").then().statusCode(404);
        }
    }
}
