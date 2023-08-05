package utilities;


import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class RestApiTest {

    public static void main(String[] args) {
        /*
        Make get yard api call
        Request
            1.URL -> BaseURL & Endpoint -> http://3.137.169.132/en-us/api/v2/yards/10/
            2.Headers -> Authorization (Token), Accept(application/json)
            3.Method -> GET
        Response
            1.Status code -> 200
            2.Body -> JSON Data
         */

        given().baseUri("http://3.137.169.132/en-us/api/v2/")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().header("Accept", "application/json")
                .when().get("/yards/10/")
                .then().log().all();

   //     System.out.println(response.statusCode());
   //     System.out.println(response.body().asString());

        /*
        POST call
        Request:
        1.URL -> BaseURL & Endpoint
        2.Headers -> Authorization (Token), Accept(application/json), Content-Type (application/json)
        3.Payload/Body -> JSON
        4.Method -> POST
         Response
            1.Status code -> 201
            2.Body -> JSON Data
         */

        Response postResponse = given().baseUri("http://3.137.169.132/en-us/api/v2/")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                .and().body("{\n" +
                        "  \"location\": \"Gulzira87\",\n" +
                        "  \"status\": \"active\",\n" +
                        "  \"address\": \"567 Grant avenue\",\n" +
                        "  \"apt_suite_company_co\": \"\",\n" +
                        "  \"city\": \"Satellite Beach\",\n" +
                        "  \"state\": \"IN\",\n" +
                        "  \"zip_code\": \"32937\",\n" +
                        "  \"spots\": \"345678\",\n" +
                        "  \"warning\": \"\",\n" +
                        "  \"notes\": \"\",\n" +
                        "  \"yard_picture\": [],\n" +
                        "  \"contacts\": [],\n" +
                        "  \"service_phone_number\": [\n" +
                        "    {\n" +
                        "      \"service_phone\": \"\",\n" +
                        "      \"service_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"owner_phone_number\": [\n" +
                        "    {\n" +
                        "      \"owner_phone\": \"\",\n" +
                        "      \"owner_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                .when().post("/yards/");
        System.out.println(postResponse.statusCode());
        System.out.println(postResponse.body().asString());

        /*
        Patch call
        Request:
        1.URL -> BaseURL & Endpoint
        2.Headers -> Authorization (Token), Accept(application/json), Content-Type (application/json)
        3.Payload/Body -> JSON
        4.Method -> PATCH
         Response
            1.Status code -> 200
            2.Body -> JSON Data
         */

        Response updateResponse = given().baseUri("http://3.137.169.132/en-us/api/v2/")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                .and().body("{\n" +
                        "  \"id\": 68,\n" +
                        "  \"location\": \"Gulzira87Gulzi\",\n" +
                        "  \"name\": \"Y68\",\n" +
                        "  \"status\": \"active\",\n" +
                        "  \"address\": \"567 Grant avenue\",\n" +
                        "  \"apt_suite_company_co\": \"\",\n" +
                        "  \"city\": \"Satellite Beach\",\n" +
                        "  \"state\": \"IN\",\n" +
                        "  \"zip_code\": \"32937\",\n" +
                        "  \"spots\": 345678,\n" +
                        "  \"warning\": \"\",\n" +
                        "  \"notes\": \"\",\n" +
                        "  \"contacts\": []\n" +
                        "}")
                .when().patch("/yards/68/");
        System.out.println(updateResponse.statusCode());
        System.out.println(updateResponse.asString());

    }
}
