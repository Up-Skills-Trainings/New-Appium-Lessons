package com.cydeo.liveReview;

import com.cydeo.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {
    public EtsyPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver("local-etsy")),this);
    }

    @AndroidFindBy(id = "com.etsy.android:id/btn_sign_in_dialog")
    public WebElement signInButton;

    @AndroidFindBy(id = "com.etsy.android:id/clg_text_input")
    public WebElement emailBox;

    @AndroidFindBy(id = "com.etsy.android:id/sign_in_button_email")
    public WebElement continueButton;

    @AndroidFindBy(xpath = "//android.view.View/android.widget.TextView[2]")
    public WebElement userName;

}
