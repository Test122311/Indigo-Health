package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class UserApp {
    private static UserApp instance;
    private WebDriver mobile;
    private UserLoginPage userLoginPage;

    public static UserApp getInstance(AppiumDriver driver){
        if (instance == null){
            instance = new UserApp(driver);
        }
        return instance;
    }

    public UserApp(WebDriver mobile) {
        this.mobile = mobile;
    }

    public UserLoginPage getCourierLoginPage() {
        if (userLoginPage == null){
            userLoginPage = new UserLoginPage(mobile);}
        return userLoginPage;
    }
}
