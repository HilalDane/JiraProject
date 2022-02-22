package com.openlyCrm.step_definitions;

import com.openlyCrm.pages.ServicesPage;
import com.openlyCrm.utilities.BrowserUtils;
import com.openlyCrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC002StepDefs {

    ServicesPage servicesPage = new ServicesPage();
    String str =servicesPage.rating1.getText();
    String str2 = servicesPage.rating2.getText();
    @When("the user clicks minus button")
    public void the_user_clicks_minus_button() {
        BrowserUtils.waitFor(2);
      servicesPage.minusbutton1.click();
      BrowserUtils.waitFor(2);
      servicesPage.minusbutton2.click();
      BrowserUtils.waitFor(2);
    }

    @Then("the number of rating should be change")
    public void the_number_of_rating_should_be_change() {
        Assert.assertFalse(str.equals(servicesPage.rating1));
        Assert.assertFalse(str2.equals(servicesPage.rating2));
    }

    @When("the user clicks plus button")
    public void the_user_clicks_plus_button() {

        BrowserUtils.waitFor(2);
        servicesPage.plusbutton1.click();
        BrowserUtils.waitFor(2);
        servicesPage.plusbutton2.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks date added button")
    public void the_user_clicks_date_added_button() {
        BrowserUtils.waitFor(2);
        servicesPage.dateadded.click();
        BrowserUtils.waitFor(2);


    }

    @Then("the ideas must be sorted by date added")
    public void the_ideas_must_be_sorted_by_date_added() {
        System.out.println(servicesPage.lastdate.getText());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(servicesPage.lastdate.getText().contains("February"));
    }

    @When("the user clicks rating button")
    public void the_user_clicks_rating_button() {
       BrowserUtils.waitFor(2);
       servicesPage.rating.click();
       BrowserUtils.waitFor(2);
    }

    @Then("the ideas must be sorted by rating")
    public void the_ideas_must_be_sorted_by_rating() {
        BrowserUtils.waitFor(2);
       double num1= Double.parseDouble(servicesPage.rating1.getText());
       double int2 = Double.parseDouble(servicesPage.rating2.getText());
       BrowserUtils.waitFor(3);

       Assert.assertTrue(num1>int2);

    }

    @When("user clicks New Category button")
    public void user_clicks_New_Category_button() {
      BrowserUtils.waitFor(2);
      servicesPage.newCategory.click();
      BrowserUtils.waitFor(4);

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
       servicesPage.nameC.sendKeys("xname");
       servicesPage.codeC.sendKeys("code");
       BrowserUtils.waitFor(3);
       Select select = new Select(servicesPage.ParentSection);
       select.selectByIndex(1);
       BrowserUtils.waitFor(2);

       servicesPage.saveAndAdd.click();
       BrowserUtils.waitFor(2);
       servicesPage.close.click();
       BrowserUtils.waitFor(2);
        Driver.get().navigate().refresh();


    }

    @Then("new category should be created")
    public void new_category_should_be_created() {
         String str= Driver.get().findElement(By.xpath("//ul/li[1]/ul/li[5]")).getText();
         Assert.assertTrue(str.equals("xname"));

    }

    @When("the user navigate back and clicks Lists button")
    public void the_user_navigate_back_and_clicks_Lists_button() {
      Driver.get().navigate().back();
      BrowserUtils.waitFor(2);
      servicesPage.Listspage.click();
      BrowserUtils.waitFor(2);
    }

    @When("the user clicks print button under Lists Page")
    public void the_user_clicks_print_button_under_Lists_Page() {

      /*  servicesPage.printbutton.click();
        BrowserUtils.waitFor(5);
        servicesPage.printit.click();
        BrowserUtils.waitFor(3);
*/
    }

    @Then("the user should be able to print the lists")
    public void the_user_should_be_able_to_print_the_lists() {

        String str = Driver.get().getTitle();
        Assert.assertTrue(str.contains("Lists"));
    }



}
