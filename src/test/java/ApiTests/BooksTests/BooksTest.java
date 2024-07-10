package ApiTests.BooksTests;

import ApiTests.BookData;
import ApiTests.Specifications.Specification;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    public static final String URL = "https://demoqa.com/BookStore/v1/";

    @Test
    public void checkAllBooks(){
        Specification.installSpec(Specification.requestSpec(URL),Specification.responseSpecOK200());

        Response response = given()
                .when()
                .get("Books");


//        List<BookData> books = given()
//                .when()
//                .get("Books")
//                .then().log().all()
//                .extract().body().jsonPath().getList("books", BookData.class);

    }
}
