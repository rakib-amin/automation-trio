package com.ui.boiler.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreElement extends Elements {

    By locator;
    String label;
    String value;

    StoreElement(Builder builder) {
        this.locator = builder.locator;
        this.label = builder.label;
        this.value = builder.value;
    }

    public WebElement locate() {
        return webDriver.findElement(this.locator);
    }

    public By getLocator() {
        return locator;
    }

    public String getLabel() {
        return label;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public static class Builder {
        private By locator;
        private String label;
        private String value;

        public Builder setLocator(By locator) {
            this.locator = locator;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public StoreElement build(){
            return new StoreElement(this);
        }
    }

}
