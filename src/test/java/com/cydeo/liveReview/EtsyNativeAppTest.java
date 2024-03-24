package com.cydeo.liveReview;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.MobileUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class EtsyNativeAppTest {
    @Test
    public void signInTest01(){
        String testDir = System.getProperty("user.dir");
        AndroidDriver driver;
        URL url;
        UiAutomator2Options options = new UiAutomator2Options();
        // we need to define which app we are testing
        options.setApp(testDir+"/etsy.apk");
        options.setAppPackage("com.etsy.android");
        options.setAppActivity("com.etsy.android.ui.user.auth.SignInActivity");

        try {
            url = new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver = new AndroidDriver(url,options);

        // click on sign in button
        driver.findElement(By.id("com.etsy.android:id/btn_sign_in_dialog")).click();

        WebElement emailBox = driver.findElement(By.id("com.etsy.android:id/clg_text_input"));


    }

    @Test
    public void signInTest02(){
        AppiumDriver driver = Driver.getDriver("local-etsy");

        driver.findElement(By.id("com.etsy.android:id/btn_sign_in_dialog")).click();

        WebElement emailBox = driver.findElement(By.id("com.etsy.android:id/clg_text_input"));

    }

    @Test
    public void signInTest03(){

        EtsyPage page = new EtsyPage();

        page.signInButton.click();
        page.emailBox.sendKeys("areatha@uspeakw.com");
        page.continueButton.click();

        MobileUtils.wait(10);



    }



}
