package com.ui.boiler.pages.search;

import com.ui.boiler.pages.Page;
import com.ui.boiler.webelements.StoreElement;
import org.openqa.selenium.By;

public class SearchResultPage extends Page {
    public static StoreElement searchHeading = new StoreElement.Builder()
        .setLabel("SEARCH")
        .setLocator(By.cssSelector("#center_column > h1 > span.lighter")).build();
    public static StoreElement searchResultCount = new StoreElement.Builder()
            .setLocator(By.cssSelector(".top-pagination-content .product-count")).build();
    public static StoreElement searchResultList = new StoreElement.Builder()
            .setLocator(By.id("product_list")).build();

    public static String getFirstResultProductName() {
        return searchResultList.locate().findElement(By.className("product-name")).getText();
    }

    public static String getNthItemFromSearchResult(Integer n) {
        return searchResultList.locate()
                .findElement(By.cssSelector("li:nth-child(" + n + ") > div > div.right-block > h5 > a"))
                .getText();
    }
}
