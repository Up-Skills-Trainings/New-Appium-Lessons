package com.cydeo.tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.appmanagement.BaseOptions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class TC06_Wikipedia {
    private AppiumDriverLocalService service;
    @BeforeEach
    public void startServer(){
            AppiumServiceBuilder builder = new AppiumServiceBuilder();
            builder.usingAnyFreePort();

            service = AppiumDriverLocalService.buildService(builder);
            service.start();


        }

    @AfterEach
    public void killServer(){
        if (service != null) {
            service.stop();
        }
    }

@Test
    public void test() throws MalformedURLException {
    XCUITestOptions options = new XCUITestOptions();
    IOSDriver driver = new IOSDriver(
            // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
            new URL("http://127.0.0.1:4723"), options
    );
    try {
       driver.findElement(new AppiumBy.ByAccessibilityId("Wikipedia")).click();
    } finally {
        driver.quit();
    }
    // assert()
}

@Test
    public void test2() throws MalformedURLException {
    UiAutomator2Options options = new UiAutomator2Options();
    AndroidDriver driver = new AndroidDriver(
            // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
            new URL(service.getUrl().toString()), options
    );
    try {
        driver.findElement(new AppiumBy.ByAccessibilityId("Wikipedia")).click();
    } finally {
        driver.quit();
    }
}

@Test
    public void test3(){
    String serviceUrl = service.getUrl().toString();
    System.out.println("Appium server started on: " + serviceUrl);
}

}
