package com.pages;

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
    By ErrorEmail = By.xpath("//div[@data-testid=\"titleError\"]");
    By ErrorPass = By.xpath("//div[@class=\"error-info mb-12\"]");
    By ErrorConfirmPass = By.xpath("//div[@data-testid=\"titleError\"]");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void GoToRegisterPage() {
        driver.findElement(NoAccount).click();
    }

    public void setUserEmailInput(String UserEmail) {
        driver.findElement(UserEmailInput).sendKeys(UserEmail);
    }

    public void setDropDown(String titleValue) {
        WebElement titleDropdown = driver.findElement(titleDropDown);
        Select title = new Select(titleDropdown);
        title.selectByValue(titleValue);
    }

    public void enterUserFirstName(String UserFName) {

        driver.findElement(userFirstNameInput).sendKeys(UserFName);
    }

    public void enterUserLastName(String UserLName) {

        driver.findElement(UserLastNameInput).sendKeys(UserLName);
    }

    public void setCertificateDropDown(String certificateValue) {
        WebElement certificateDropdown = driver.findElement(certificateDropDown);
        Select Certificate = new Select(certificateDropdown);
        Certificate.selectByValue(certificateValue);
    }

    public void enterPassword(String password) {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(ConfirmPasswordInput).sendKeys(confirmPassword);
    }

    public void clickOnCreateAccount() {

        driver.findElement(CreateAccountButton).click();
    }

    public String getText() {
        return actions.element().getText(ThankYouText);
    }




    public void addAllData() {
        actions.element()
                .click(NoAccount)
                .typeAppend(UserEmailInput, "b3eb12b7e811@drmail.in")
                .select(titleDropDown, "Dr.")
                .typeAppend(userFirstNameInput, "Mona")
                .typeAppend(UserLastNameInput, "Magdy")
                .select(certificateDropDown, "PhD")
                .typeAppend(passwordInput, "0123456789")
                .typeAppend(ConfirmPasswordInput, "0123456789")
                .click(CreateAccountButton);

    }
}