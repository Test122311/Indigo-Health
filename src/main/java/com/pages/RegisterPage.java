package com.pages;

import com.github.javafaker.Faker;
import com.shaft.driver.SHAFT;
import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage extends PageBase {
  TouchActions actions =  new TouchActions();
    By NoAccount = By.xpath("//a[@href=\"/register\"]");

    By titleDropDown = By.name("name.personalTitle");
    By UserEmailInput = By.xpath("//*[@placeholder='mail@mail.com']");
    By userFirstNameInput = By.name("name.firstName");
    By UserLastNameInput = By.name("name.lastName");
    By certificateDropDown = By.name("name.postNominalLetters");
    By passwordInput = By.name("password");
    By ConfirmPasswordInput = By.name("confirm_password");
    By CreateAccountButton = By.xpath("//button[@type=\"submit\"]");
    By ThankYouText = By.xpath("//p[@class=\"mb-8\"]");
    By confirmationUrl =  By.id("confirmationUrl");
    By ErrorEmail = By.xpath("//div[@data-testid=\"titleError\"]");
    By ErrorPass = By.xpath("//div[@class=\"error-info mb-12\"]");
    By ErrorConfirmPass = By.xpath("//div[@data-testid=\"titleError\"]");
    static RegisterPage instance;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public static RegisterPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new RegisterPage(driver);
        }
        return instance;
    }

    public void goToRegisterPage() {
        actions.element()
                .click(NoAccount);
    }






    public String getText() {
        return actions.element().getText(ThankYouText);
    }


    public void confirmationUrl() {
      String text =  actions.element()
                .getText(confirmationUrl);
        driver.get(driver.findElement(confirmationUrl).getAttribute("value"));
    }
    public String checkConfirmation() {
        String text =  actions.element()
                .getText(confirmationUrl);

        return text;
    }


    public String addAllData(String email) {
        Faker faker = new Faker();
        goToRegisterPage();
        String testURL = driver.getCurrentUrl()+"?testUserOwner=some_string&suppressEmail=true";
       driver.get(testURL);
        return actions.element()
                .typeAppend(UserEmailInput, email)
                .select(titleDropDown, "Dr.")
                .typeAppend(userFirstNameInput, faker.name().firstName())
                .typeAppend(UserLastNameInput, faker.name().lastName())
                .select(certificateDropDown, "PhD")
                .typeAppend(passwordInput, "P@ssw0rdP@ssw0rd")
                .typeAppend(ConfirmPasswordInput, "P@ssw0rdP@ssw0rd")
                .click(CreateAccountButton)
                .waitToBeReady(ThankYouText)
                .getText(ThankYouText);

    }
}