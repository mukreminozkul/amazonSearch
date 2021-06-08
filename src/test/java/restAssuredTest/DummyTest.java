package restAssuredTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DummyTest {

    @BeforeMethod
    public static void init(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1" ;

    }

    @Test
    public void test1(){

        given()
                .log().all()
                .contentType( ContentType.JSON ).

                when()
                .get("/employees").

                then()
                .log().all()
                .statusCode( is(200) );

    }


    @Test
    public void test2(){

            given()
                    .log().all()
                    .contentType( ContentType.JSON ).

            when()
                    .get("/employee/1").

            then()
                    .log().all()
                    .statusCode( is(200) );

    }


    @Test
    public void testDelete(){

        when()
                .delete("/delete/{id}",1).
        then()
                .statusCode(204)
        ;

    }

    @Test
    public void test3(){
        Response response =
                given()
                .contentType( ContentType.JSON ).
                when()
                .get("/employee/1");

        JsonPath jp = response.jsonPath();

        int id = jp.getInt("data.id");
        String employee_name = jp.getString("data.employee_name");
        int employee_salary = jp.getInt("data.employee_salary");

        System.out.println("id = " + id);
        System.out.println("employee_name = " + employee_name);
        System.out.println("employee_salary = " + employee_salary);

    }


}
