package com.rest.boiler.utils;

import io.restassured.response.ResponseBodyExtractionOptions;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Utils {
    public static String getResourceAsString(String fileName) {
        InputStream inputStream = Utils.class.getResourceAsStream(fileName);
        if (inputStream != null) {
            return new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                    .lines().collect(Collectors.joining("\n"));
        }
        return "";
    }

    public static String getRandomName() {
        return RandomStringUtils.randomAlphabetic(5) + " " + RandomStringUtils.randomAlphabetic(5);
    }

    public static String getRandomEmail() {
        return RandomStringUtils.randomAlphabetic(5) + System.currentTimeMillis() + "@"
                + RandomStringUtils.randomAlphabetic(5) + "." + RandomStringUtils.randomAlphabetic(3);
    }

    public static void logResponse(ResponseBodyExtractionOptions response) {
        System.out.println("Log: " + response.asPrettyString());
    }
}
