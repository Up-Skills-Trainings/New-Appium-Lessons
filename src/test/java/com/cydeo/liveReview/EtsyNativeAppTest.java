package com.cydeo.liveReview;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class EtsyNativeAppTest {
    @Test
    public void signInTest(){

        AndroidDriver driver;
        URL url;
        UiAutomator2Options options = new UiAutomator2Options();
        // we need to define which app we are testing
        options.setApp();


        try {
            url = new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver = new AndroidDriver(url,options);


    }



}
