package com.openlyCrm.step_definitions;

import com.openlyCrm.pages.LoginPage;
import com.openlyCrm.pages.MainPage;
import com.openlyCrm.pages.ServicesPage;
import com.openlyCrm.utilities.BrowserUtils;
import com.openlyCrm.utilities.ConfigurationReader;
import com.openlyCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ServicesStepDefs {

    MainPage mainPage = new MainPage();
    ServicesPage services = new ServicesPage();

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);

        String username = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");
        LoginPage loginPage =new LoginPage();
        loginPage.login(username,password);

        BrowserUtils.waitFor(3);

    }

    @When("user clicks Services button")
    public void user_clicks_Services_button() {
       BrowserUtils.waitFor(2);
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,250)");
        BrowserUtils.waitFor(2);
        mainPage.Services.click();
        BrowserUtils.waitFor(4);
        mainPage.Ideas.click();
        BrowserUtils.waitFor(3);




    }

    @When("user clicks New Idea button")
    public void user_clicks_New_Idea_button() {
       BrowserUtils.waitFor(2);
        mainPage.newIdea.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user on the New Ideas Page")
    public void user_on_the_Ideas_Page() {
        String actualTitle=Driver.get().getTitle();
        //Assert.assertEquals("(4) Suggest New Idea!",actualTitle);
        Assert.assertTrue(actualTitle.contains("Suggest New Idea!"));
    }

    @When("user enters sth as title")
    public void user_enters_sth_as_title() {
        BrowserUtils.waitFor(3);
        String sth ="something";
        services.titleNewIdeas.sendKeys(sth);



    }

    @Then("user should be able to write sth as Title")
    public void user_should_be_able_to_write_sth_as_Title() {
       BrowserUtils.waitFor(2);
        String sth ="something";
        BrowserUtils.waitFor(2);

       Assert.assertEquals(services.titleNewIdeas.getAttribute("value"),sth);
    }

    @When("user enters sth as Idea description")
    public void user_enters_sth_as_Idea_description() {
       BrowserUtils.waitFor(3);
        String sth ="something";
        WebElement element = Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.get().switchTo().frame(element);
        BrowserUtils.waitFor(2);
        WebElement idea = Driver.get().findElement(By.xpath("//body[@contenteditable='true']"));
        idea.sendKeys(sth);
        BrowserUtils.waitFor(2);

        Driver.get().switchTo().defaultContent();
    }

    @Then("user should be able to write sth as Idea")
    public void user_should_be_able_to_write_sth_as_Idea() {
       BrowserUtils.waitFor(2);
        String sth ="something";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(services.ideaDescription.getText(),sth);
    }

    @When("user enter sth to Tags")
    public void user_enter_sth_to_Tags() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,250)");
        BrowserUtils.waitFor(2);
        String sth ="something";
        services.tags.sendKeys(sth);
    }

    @Then("user should be able to write sth to Tags")
    public void user_should_be_able_to_write_sth_to_Tags() {
        BrowserUtils.waitFor(2);
        String sth ="something";
        Assert.assertEquals(services.tags.getAttribute("value"),sth);
    }

    @When("user clicks Category")
    public void user_clicks_Category() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,250)");
      BrowserUtils.waitFor(3);
      services.category.click();


    }

    @When("user chooses any category")
    public void user_chooses_any_category() {
        Select select = new Select(services.category);
        select.selectByIndex(2);

    }

    @Then("user should be able to choose any category")
    public void user_should_be_able_to_choose_any_category() {
        Select select = new Select(services.category);
       select.getFirstSelectedOption();
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,250)");

    }

    @When("user clicks Add Step button")
    public void user_clicks_Add_Step_button() {
        BrowserUtils.waitFor(2);
        services.suggestNewIdea.click();
    }

    @Then("user should be able to add step")
    public void user_should_be_able_to_add_step() {
        BrowserUtils.waitFor(2);
     String title= Driver.get().getTitle();
    // Assert.assertEquals(title,"(15) something");
     Assert.assertTrue(title.contains("something"));

    }

}
