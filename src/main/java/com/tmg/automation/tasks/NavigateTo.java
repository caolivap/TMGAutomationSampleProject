package com.tmg.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static com.tmg.automation.userinterfaces.AmazonHomePage.AMAZON_HOME_PAGE_URL;

public class NavigateTo implements Task {
    public static NavigateTo amazonHomePage() {
        return new NavigateTo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(AMAZON_HOME_PAGE_URL)
        );
    }
}
