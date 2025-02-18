package ApiTests.BooksTests;


import ApiTests.Specifications.Specification;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    public static final String URL = "https://demoqa.com/BookStore/v1/";

    @Test
    public void checkAllBooks(){
        Specification.installSpec(Specification.requestSpec(URL),Specification.responseSpecOK200());

        ValidatableResponse response = given()
                .when()
                .get("Books")
                .then();
    }

    @Test
    public void negativeApiCheck(){
        Specification.installSpec(Specification.requestSpec(URL),Specification.responseBadGateway502());

        ValidatableResponse response = given()
                .when()
                .get("Book")
                .then();
    }

    @Test
    public void checkAllExistedBooks(){
        Specification.installSpec(Specification.requestSpec(URL));
        Map<String, List<Map<String, Object>>> resp = get("Books").as(new TypeRef<>() {});
        List<Map<String,Object>> products = resp.get("books");
        assertEquals(products.size(), 8);

    }

    @Test
    public void checkAllTitlesInBooks(){
        Specification.installSpec(Specification.requestSpec(URL));
        Map<String, List<Map<String, Object>>> resp = get("Books").as(new TypeRef<>() {});
        List<Map<String,Object>> products = resp.get("books");
        System.out.println(products.get(0));
    }
}
