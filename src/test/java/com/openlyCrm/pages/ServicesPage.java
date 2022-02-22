package com.openlyCrm.pages;

import com.openlyCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage extends BasePage{
    public ServicesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

   @FindBy(id = "POST_TITLE")
    public WebElement titleNewIdeas;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement ideaDescription;

    @FindBy(name = "TAGS")
    public WebElement tags;

    @FindBy(name = "UF_CATEGORY_CODE")
    public  WebElement category;

    @FindBy(xpath = "(//span[text()='Suggest New Idea!'])[2]")
    public  WebElement suggestNewIdea;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/a[2])[2]")
    public WebElement minusbutton2;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/a[2])[1]")
    public WebElement minusbutton1;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/a[1])[1]")
    public  WebElement plusbutton1;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/a[1])[2]")
    public WebElement plusbutton2;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/span)[1]")
    public WebElement rating1;

    @FindBy(xpath = "(//span[@class='idea-rating-block-content idea-rating-block-content-ext-standart']/span/span)[2]")
    public WebElement rating2;





}
