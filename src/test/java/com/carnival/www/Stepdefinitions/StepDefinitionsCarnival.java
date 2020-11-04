package com.carnival.www.Stepdefinitions;

import com.carnival.www.Task.ClicOn;
import com.carnival.www.Task.OpenBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefinitionsCarnival {

    //private Actor juan = Actor.named("Juan");
    private WebDriver hisBrowser= null;

    @Before
    public void prepareStage(){ OnStage.setTheStage(new OnlineCast()); }

    @After
    public void finishStage(){ //theActor("Juan").wasAbleTo(CloseBrowser.using(hisBrowser));
        }

    @Given("A customer navigate to Homepage of cruisers")
    public void aCustomerNavigateToHomepageOfCruisers() {
        System.out.println("Welcome!");
        theActorCalled("Usuario").assignName("Juan");
        theActor("Juan").wasAbleTo(OpenBrowser.using(hisBrowser));
    }

    @When("A customer selects a destiny and Duration")
    public void aCustomerSelectsADestinyAndDuration() {
        theActor("Juan").attemptsTo(ClicOn.inElement(hisBrowser));
    }
    @Then("A customer search the link of contact support on page")
    public void aCustomerSearchTheLinkOfContactSupportOnPage() {

    }
    @Then("A customer clicked on the search button")
    public void aCustomerClickedOntheSearchButton() {

    }
}
