package com.tmg.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.tmg.automation.userinterfaces.SearchResultsPage.PRODUCT_FOR_BUYING;
import static com.tmg.automation.userinterfaces.TennisDescriptionPage.*;

public class AddTennis implements Task {

    private String tennisName;

    public AddTennis(String tennisName) {
        this.tennisName = tennisName;
    }

    public static AddTennis toShoppingCart(String tennisName) {
        return new AddTennis(tennisName);
    }

    @Step("{0} adds the product to the shopping cart")
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(PRODUCT_FOR_BUYING.of(tennisName)),
                    Click.on(SIZE_DROPDOWN),
                    Click.on(AVAILABLE_SIZE_OPTION),
                    Click.on(ADD_TO_SHOPPING_CART)
            );
            actor.remember("productName", tennisName);
    }
}
