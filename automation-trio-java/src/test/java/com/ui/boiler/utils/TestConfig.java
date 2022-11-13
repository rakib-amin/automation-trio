package com.ui.boiler.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class TestConfig {
    public static WebDriver getBrowser(String browser) {
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", Utilities.getFilePathFromRootDir("drivers"
                    + File.separator + "geckodriver.exe"));
            return new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",Utilities.getFilePathFromRootDir("drivers"
                    + File.separator + "chromedriver.exe"));
            return new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",Utilities.getFilePathFromRootDir("drivers"
                    + File.separator + "msedgedriver.exe"));
            return new EdgeDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver",Utilities.getFilePathFromRootDir("drivers"
                    + File.separator + "chromedriver.exe"));
            return new ChromeDriver();
        }
    }
}
