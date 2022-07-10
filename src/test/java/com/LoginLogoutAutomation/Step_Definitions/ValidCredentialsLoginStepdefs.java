package com.LoginLogoutAutomation.Step_Definitions;

import com.LoginLogoutAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidCredentialsLoginStepdefs {
    @Given("user is on the upgnix login web page")
    public void userIsOnTheUpgnixLoginWebPage() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user enter the {string} in email field")
    public void userEnterTheInEmailField(String arg0) {

    }

    @And("user enter the {string} in password field")
    public void userEnterTheInPasswordField(String arg0) {
    }

    @And("user click the login button and login")
    public void userClickTheLoginButtonAndLogin() {
    }

    @Then("user should see the inbox page")
    public void userShouldSeeTheInboxPage() {
    }
}
