package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(String platform){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(platform)),this);
    }

    @iOSXCUITFindBy(accessibility = "Wikipedia")
    @AndroidFindBy(accessibility = "Wikipedia")
    public WebElement wikipedia;
}
