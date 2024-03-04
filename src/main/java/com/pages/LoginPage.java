package com.pages;

import com.Global.GeneralConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    private static LoginPage instance;
    By UserNameInput = By.name("username");
    By PasswordInput = By.name("password");
    By signInButton = By.xpath("//button[@type=\"submit\"]");
    By acceptButton = By.xpath("//button[@type=\"button\"]");
    By ErrorEmail = By.xpath("//div[@data-testid=\"titleError\"]");
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
        driver.findElement(UserNameInput).sendKeys(userName);
        driver.findElement(PasswordInput).sendKeys(pass);

        driver.findElement(signInButton).click();
        driver.findElement(acceptButton).click();
    }

}
