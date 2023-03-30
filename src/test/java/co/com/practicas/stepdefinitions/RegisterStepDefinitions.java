package co.com.practicas.stepdefinitions;

import co.com.practica.tasks.JoinToday;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinitions {
    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Actor");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }


    @Managed
    private WebDriver driver;


    @Given("^The user enter to the page$")
    public void theUserEnterToThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));

    }


    @When("^The user star the process$")
    public void theUserStarTheProcess() {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.with());

    }

    @Then("^The user should see the next page$")
    public void theUserShouldSeeTheNextPage() {

    }

}
