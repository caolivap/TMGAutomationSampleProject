package com.tmg.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.tmg.automation.userinterfaces.ShoppingCartPage.SHOPPING_CART_PRODUCTS;

public class TheProductWas implements Question<Boolean> {

    public static TheProductWas addedSuccessfullyMessage() {
        return new TheProductWas();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return SHOPPING_CART_PRODUCTS.resolveFor(actor).getText().contains(actor.recall("productName"));
    }

}
