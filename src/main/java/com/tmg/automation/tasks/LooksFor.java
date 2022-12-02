package com.tmg.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.tmg.automation.userinterfaces.AmazonHomePage.*;

public class LooksFor implements Task {

    private String product;

    public LooksFor(String product) {
        this.product = product;
    }

    public static LooksFor theProduct(String product) {
        return new LooksFor(product);
    }

    @Step("{0} looks for little girl tennis section")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(LOCATION_OPTION_SECTION.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(CLOSE_LOCATION_OPTION)
                ),
                SendKeys.of(product).into(SEARCH_BAR),
                Click.on(SEARCH_BUTTON)
        );
    }
}
