package com.tmg.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage {
    public static final Target PRODUCT_FOR_BUYING = Target.the("A product from search results")
            .locatedBy("//span[contains(text(),'{0}')]");

}
