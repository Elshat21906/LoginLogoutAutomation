package com.LoginLogoutAutomation.Step_Definitions;

import com.LoginLogoutAutomation.Pages.LoginPage;
import com.LoginLogoutAutomation.utilities.ConfigurationReader;
import com.LoginLogoutAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ValidCredentialsLoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the upgnix login web page")
    public void userIsOnTheUpgnixLoginWebPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter the {string} in email field")
    public void userEnterTheInEmailField(String string) {
        loginPage.emailField.sendKeys(string);
    }

    @And("user enter the {string} in password field")
    public void userEnterTheInPasswordField(String string) {
        loginPage.passwordField.sendKeys(string);
    }

    @And("user click the login button and login")
    public void userClickTheLoginButtonAndLogin() {
        loginPage.loginButton.click();
    }

    @Then("user should see the inbox page")
    public void userShouldSeeTheInboxPage() {
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
