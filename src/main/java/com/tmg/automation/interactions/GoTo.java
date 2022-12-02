package com.tmg.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.tmg.automation.userinterfaces.TennisDescriptionPage.GO_TO_SHOPPING_CART;

public class GoTo implements Interaction {

    public static GoTo shoppingCart() {
        return new GoTo();
    }

    @Step("{0} go to shopping cart view")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GO_TO_SHOPPING_CART)
        );
    }
}
