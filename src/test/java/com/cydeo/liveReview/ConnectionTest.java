package com.cydeo.liveReview;

import com.cydeo.utilities.MobileUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionTest {
    @Test
    public void test01(){
        AndroidDriver driver;
        URL url;
        UiAutomator2Options options = new UiAutomator2Options();

        try {
            url = new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver = new AndroidDriver(url,options);

        System.out.println("Device Date and Time : " + driver.getDeviceTime());

        driver.findElement(new AppiumBy.ByAccessibilityId("Chrome")).click();

        MobileUtils.wait(3);

        driver.quit();



    }
}
