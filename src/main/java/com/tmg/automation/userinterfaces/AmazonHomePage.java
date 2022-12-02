package com.tmg.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AmazonHomePage {

    public static final String AMAZON_HOME_PAGE_URL = "https://www.amazon.com/";
    public static final Target SEARCH_BAR = Target.the("Amazon Search Bar")
            .locatedBy("css:#twotabsearchtextbox");
    public static final Target SEARCH_BUTTON = Target.the("Amazon Search Button")
            .locatedBy("css:#nav-search-submit-button");

    public static final Target LOCATION_OPTION_SECTION = Target.the("Section for changing location")
            .locatedBy("css:div.glow-toaster-content");

    public static final Target CLOSE_LOCATION_OPTION = Target.the("Button for closing location option")
            .locatedBy("//input[@data-action-type='DISMISS']");

}
