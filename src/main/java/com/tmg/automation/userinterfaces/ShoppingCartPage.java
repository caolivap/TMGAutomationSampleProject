package com.tmg.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target SHOPPING_CART_PRODUCTS = Target.the("Products added to shopping cart")
            .locatedBy("css:div.sc-list-item-content");

}
