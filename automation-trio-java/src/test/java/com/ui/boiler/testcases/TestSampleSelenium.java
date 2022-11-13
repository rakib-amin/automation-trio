package com.ui.boiler.testcases;

import com.ui.boiler.UIBaseTestCase;
import com.ui.boiler.utils.TestConfig;
import com.ui.boiler.utils.Utilities;
import com.ui.boiler.webelements.Elements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSampleSelenium extends UIBaseTestCase {

//    @BeforeEach
//    public void setup() {
//        webDriver = TestConfig.getBrowser("edge");
//        Elements.setWebDriver(webDriver);
//        webDriver.get(Constants.URL_BASE);
//        Utilities.waitForElement(webDriver, SearchBox.searchInput.getLocator());
//        Assertions.assertTrue(HomePage.isReady());
//        SearchBox.searchInput.locate().sendKeys(Constants.SAMPLE_SEARCH_TERM);
//    }
//
//    @AfterEach
//    public void tearDown() {
//        webDriver.quit();
//    }
//
//    @Test
//    public void testSearchByAutoComplete() {
//        Utilities.waitForElement(webDriver, AutoCompleteBox.autoCompleteResult.getLocator());
//        Assertions.assertTrue(AutoCompleteBox.autoCompleteResult.locate().isDisplayed());
//        Assertions.assertTrue(AutoCompleteBox.autoCompleteResultFirst
//                .locate().getText().contains(Constants.SAMPLE_SEARCH_TERM));
//        AutoCompleteBox.autoCompleteResultFirst.locate().click();
//        Utilities.waitForElement(webDriver, ProductDetailPage.productName.getLocator());
//        Assertions.assertTrue(ProductDetailPage.isReady(Constants.SAMPLE_SEARCH_TERM));
//        Assertions.assertEquals(ProductDetailPage.productName.locate().getText(), Constants.SAMPLE_SEARCH_TERM);
//    }
}
