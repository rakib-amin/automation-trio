package com.ui.boiler.utils;

import com.ui.boiler.utils.annot.JavaScript;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;

public class Utilities {

    public static String getRandomEmail() {
        return RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(3) + "."
                + RandomStringUtils.randomAlphabetic(3);
    }

    public static Boolean waitForElement(WebDriver webDriver, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by)) != null;
        } catch (TimeoutException timeoutException) {
            return false;
        }
    }
    public static String getFilePathFromRootDir(String fileName) {
        return Paths.get("").toAbsolutePath().normalize()
                + File.separator + fileName;
    }
    @JavaScript
    public static Boolean documentIsReady(WebDriver webDriver, String docTitle) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
                        && ((JavascriptExecutor) wd).executeScript("return document.title").equals(docTitle));
    }
}
