package com.openlyCrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {

    @FindBy(id = "sitemap-menu")
    public WebElement menu;

    @FindBy(xpath = "(//a[@href='/services/idea/'])[2]")
    public WebElement direktIdea;
    @FindBy(xpath = "(//div/ul/li)[12]/a/span")
    public WebElement Services;

    @FindBy(xpath = "(//div[@data-text='Ideas']/a/span)[2]")
    public WebElement Ideas;

    @FindBy(xpath = "//a[@href='/services/idea/edit/new/']")
    public WebElement newIdea;










}
