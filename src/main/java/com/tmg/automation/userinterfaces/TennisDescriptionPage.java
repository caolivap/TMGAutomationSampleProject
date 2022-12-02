package com.tmg.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TennisDescriptionPage {

    public static final Target SIZE_DROPDOWN = Target.the("Dropdown for selecting any available tennis size")
            .locatedBy("css:#dropdown_selected_size_name");
    public static final Target AVAILABLE_SIZE_OPTION = Target.the("Available tennis size option")
            .locatedBy("css:li.a-dropdown-item.dropdownAvailable");
    public static final Target ADD_TO_SHOPPING_CART = Target.the("Button for adding products to shopping cart")
            .locatedBy("css:#desktop_qualifiedBuyBox #add-to-cart-button");
    public static final Target PRODUCT_ADDED_TO_SHOPPING_CART_SECTION = Target.the("Section with product message successfully added to shopping cart")
            .locatedBy("css:#sw-atc-confirmation");
    public static final Target GO_TO_SHOPPING_CART = Target.the("Button for going to shopping cart page")
            .locatedBy("css:#sw-gtc>span");

}
