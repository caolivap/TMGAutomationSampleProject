package com.tmg.automation.questions;

import com.tmg.automation.interactions.GoTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static com.tmg.automation.userinterfaces.ShoppingCartPage.SHOPPING_CART_PRODUCTS;

public class TheProductWas implements Question<Boolean> {

    public static TheProductWas addedSuccessfullyMessage() {
        return new TheProductWas();
    }

    @Step("{0} should see that product is on shopping cart view")
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                GoTo.shoppingCart()
        );
        return SHOPPING_CART_PRODUCTS.resolveFor(actor).getText().contains(actor.recall("productName"));
    }

}
