package com.tenant.evaluation.test.stepdefinitions;

import com.tenant.evaluation.test.tasks.Navigate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LoginStepDefinitions {

    @Given("{actor} is on the sample app login page")
    public void userIsOnTheLoginPage(Actor actor) {
        actor.wasAbleTo(
                Navigate.toHomePage()
        );
    }

    @When("She enters {string} as the username and {string} as the password")
    public void userEntersAsTheUsernameAndAsThePassword(String username, String password) {
        System.out.println("WHEN: " + username + " " + password);
    }

    @And("She clicks the Log In button")
    public void userClicksTheLogInButton() {
        System.out.println("AND");
    }

    @Then("She should see the message {string}")
    public void userShouldSeeTheMessage(String string) {
        System.out.println("THEN");
    }


    @Given("She is logged in as {string} with password {string}")
    public void userIsLoggedInAsWithPassword(String username, String password) {
        System.out.println("GIVEN: " + username + " " + password);
    }

    @When("She clicks the Log Out button")
    public void userClicksTheLogOutButton() {
        System.out.println("WHEN");
    }

}
