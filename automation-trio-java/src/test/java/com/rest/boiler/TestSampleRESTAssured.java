package com.rest.boiler;

import com.rest.boiler.utils.Utils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBodyExtractionOptions;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestSampleRESTAssured extends APIBaseTestCase {

    Map<String,Object> payload = new HashMap<>();

    String name, email, gender, status;

    @BeforeEach
    public void setup() {
        name = Utils.getRandomName();
        email = Utils.getRandomEmail();
        gender = RandomUtils.nextBoolean() ? "male" : "female";
        status = RandomUtils.nextBoolean() ? "active" : "inactive";

        payload.put("name", name);
        payload.put("email", email);
        payload.put("gender", gender);
        payload.put("status", status);
    }

    @Test
    public void test404ResourceNotExist() {
        ResponseBodyExtractionOptions response = RestAssured.expect()
                .given().contentType(ContentType.JSON).body(payload)
                .post("Constants.BASE_URI" + "public/v2/vampires")
                .then().assertThat()
                .statusCode(404)
                .extract().body();
        Utils.logResponse(response);
    }
}
