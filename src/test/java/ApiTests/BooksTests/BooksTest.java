package ApiTests.BooksTests;

import ApiTests.BookData;
import ApiTests.BookResponse;
import ApiTests.Specifications.Specification;
import com.google.gson.internal.bind.util.ISO8601Utils;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BooksTest {

    public static final String URL = "https://demoqa.com/BookStore/v1/";

    @Test
    public void checkAllBooks(){
        Specification.installSpec(Specification.requestSpec(URL),Specification.responseSpecOK200());

        ValidatableResponse response = given()
                .when()
                .get("Books")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkAllExistedBooks(){
        Map<String, List<Map<String, Object>>> resp = get("Books").as(new TypeRef<Map<String, List<Map<String, Object>>>>() {});
        List<Map<String,Object>> products = resp.get("books");
        assertThat(products,hasSize(9));


//        ValidatableResponse response = given()
//                .when()
//                .get("Books")
//                .then()
//                .body("books.findAll.title", hasItems("Git Pocket Guide"));

    }
}
