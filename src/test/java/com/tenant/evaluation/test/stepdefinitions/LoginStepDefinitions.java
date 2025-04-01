package com.tenant.evaluation.test.stepdefinitions;

import com.tenant.evaluation.test.questions.GetText;
import com.tenant.evaluation.test.tasks.Login;
import com.tenant.evaluation.test.tasks.Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.tenant.evaluation.test.userinterface.LoginPage.LOGOUT_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

import static com.tenant.evaluation.test.userinterface.LoginPage.LOGIN_STATUS_MESSAGE;

public class LoginStepDefinitions {

    @Given("{actor} is on the sample app login page")
    public void userIsOnTheLoginPage(Actor actor) {
        actor.wasAbleTo(
                Navigate.toHomePage()
        );
    }

    @When("{actor} logs in with {string} as the username and {string} as the password")
    public void userEntersAsTheUsernameAndAsThePassword(Actor actor, String username, String password) {
        actor.attemptsTo(
                Login.withCredentials(username, password)
        );
    }


    @Then("should see the message {string}")
    public void userShouldSeeTheMessage(String string) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("the login status message", GetText.fromTarget(LOGIN_STATUS_MESSAGE), equalTo(string))
        );
    }


    @When("{actor} clicks the Log Out button")
    public void userClicksTheLogOutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(LOGOUT_BUTTON)
        );
    }

}
