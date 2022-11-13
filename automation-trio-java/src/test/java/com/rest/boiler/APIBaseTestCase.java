package com.rest.boiler;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class APIBaseTestCase {

    @BeforeAll
    public static void setUpAll() {
        RestAssured.baseURI = "Constants.BASE_URI";
    }

}