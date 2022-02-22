package com.openlyCrm.pages;

import com.openlyCrm.utilities.BrowserUtils;
import com.openlyCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement email;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginbtn;

    @FindBy(partialLinkText = "services")
    public WebElement Services;

    @FindBy(xpath = "//span[text()='Ideas']")
    public WebElement Ideas;



    public void login(String emailStr, String passwordStr){
        email.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        loginbtn.click();
        BrowserUtils.waitFor(3);

        Driver.get().manage().window().maximize();


    }



}
