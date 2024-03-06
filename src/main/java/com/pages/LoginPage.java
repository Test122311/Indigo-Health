package com.pages;

import com.Global.GeneralConstants;
import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    TouchActions actions =  new TouchActions();
    private static LoginPage instance;
    By UserNameInput = By.name("username");
    By PasswordInput = By.name("password");
    By signInButton = By.xpath("//button[@id='sign-in-1']");
    By acceptButton = By.xpath("//button[@id='welcome-1']");
    By ErrorEmail = By.xpath("//div[@data-testid='titleError']");
    By ErrorPass = By.className("error-info");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static LoginPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new LoginPage(driver);
        }
        return instance;
    }

    public String getTextError() {
        return driver.findElement(ErrorEmail).getText();
    }

    public String getPassError() {
        return driver.findElement(ErrorPass).getText();
    }

    public void login(String userName, String pass) {
        actions.element()
                .waitToBeReady(UserNameInput)
                .typeAppend(UserNameInput,userName)
                .typeAppend(PasswordInput,pass)
                .click(signInButton)
                .click(acceptButton);

    }

}
