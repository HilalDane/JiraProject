package com.openlyCrm.pages;

import com.openlyCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{
    public MainPage(){
        PageFactory.initElements(Driver.get(), this);
    }

}
