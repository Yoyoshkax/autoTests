package ApiTests.BooksTests;

import ApiTests.BookData;
import ApiTests.Specifications.Specification;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    public static final String URL = "https://demoqa.com/BookStore/v1/";

    @Test
    public void checkAllBooks(){
        Specification.installSpec(Specification.requestSpec(URL),Specification.responseSpecOK200());

        ValidatableResponse response = given()
                .when()
                .get("Books")
                .then()
//                .body("books.findAll {it.pages < 300}.title", hasItems("Git Pocket Guide","Learning JavaScript Design Patterns","Designing Evolvable Web APIs with ASP.NET","You Don't Know JS","Programming JavaScript Applications"));
                .extract().body().
    }
}
