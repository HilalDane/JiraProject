package com.openlyCrm.step_definitions;

import com.openlyCrm.pages.LoginPage;
import com.openlyCrm.utilities.BrowserUtils;
import com.openlyCrm.utilities.ConfigurationReader;
import com.openlyCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
     String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid() {
        String username = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");
     LoginPage loginPage =new LoginPage();
     loginPage.login(username,password);

        BrowserUtils.waitFor(3);

    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(2);
        String actualTitle =Driver.get().getTitle();
        Assert.assertEquals("(4) Portal",actualTitle);

    }


}
