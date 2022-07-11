package com.LoginLogoutAutomation.Step_Definitions;

import com.LoginLogoutAutomation.Pages.LoginPage;
import com.LoginLogoutAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidCredentialsLoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the upgnix login web page")
    public void userIsOnTheUpgnixLoginWebPage() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user enter the {string} in email field")
    public void userEnterTheInEmailField(String username) {
        loginPage.emailField.sendKeys(username);
    }

    @And("user enter the {string} in password field")
    public void userEnterTheInPasswordField(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @And("user click the login button and login")
    public void userClickTheLoginButtonAndLogin() {
        loginPage.loginButton.click();
    }

    @Then("user should see the inbox page")
    public void userShouldSeeTheInboxPage() {
        String inboxPageTitle = Driver.getDriver().getTitle();
    }
}
