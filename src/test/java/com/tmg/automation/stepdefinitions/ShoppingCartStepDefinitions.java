package com.tmg.automation.stepdefinitions;

import com.tmg.automation.questions.TheProductWas;
import com.tmg.automation.exceptions.ProductWasNotAddedException;
import com.tmg.automation.tasks.AddTennis;
import com.tmg.automation.tasks.LooksFor;
import com.tmg.automation.userinterfaces.AmazonHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.tmg.automation.exceptions.ProductWasNotAddedException.PRODUCT_NOT_ADDED_SHOPPING_CART;
import static com.tmg.automation.userinterfaces.TennisDescriptionPage.PRODUCT_ADDED_TO_SHOPPING_CART_SECTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingCartStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on Amazon official homepage$")
    public void carlosIsOnAmazonOfficialHomepage(String actorName) {
        theActorCalled(actorName).wasAbleTo(
                Open.browserOn().the(AmazonHomePage.class)
        );
    }

    @When("^he looks for (.*)$")
    public void heLooksForLittleGirlTennis(String product) {
        theActorInTheSpotlight().attemptsTo(
                LooksFor.theProduct(product)
        );
    }

    @And("^he adds the (.*) to the shopping cart$")
    public void heAddsTheProductToTheShoppingCart(String productName) {
        theActorInTheSpotlight().attemptsTo(
                AddTennis.toShoppingCart(productName)
        );
    }

    @Then("tennis should be added to shopping cart successfully")
    public void tennisShouldBeAddedToShoppingCartSuccessfully() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(PRODUCT_ADDED_TO_SHOPPING_CART_SECTION).isDisplayed()
        );

        theActorInTheSpotlight().should(seeThat(
                TheProductWas.addedSuccessfullyMessage()).orComplainWith(
                ProductWasNotAddedException.class, PRODUCT_NOT_ADDED_SHOPPING_CART)
        );
    }

}
