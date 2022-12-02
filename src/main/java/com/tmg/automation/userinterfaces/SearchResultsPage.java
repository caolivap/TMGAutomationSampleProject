package com.tmg.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage extends PageObject {

    public static final Target PRODUCT_FOR_BUYING = Target.the("A product from the search results")
            .locatedBy("//span[contains(text(),'{0}')]");

}
