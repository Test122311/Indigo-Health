package com.pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFawryLoginScreen extends PageBase {
    WebDriver driver;

    private By mobileBtn   = By.xpath("//*[contains(@resource-id, 'btnmobileNumber') and @class]");
    private By userNameFld = By.xpath("//*[contains(@resource-id, 'editText_username')]");
    private By passwordFld = By.xpath("//*[contains(@resource-id, 'editText_password')");
    private By loginBtn    = By.xpath("//*[contains(@resource-id, 'button_login')]");
    private By NationalIdFld  = By.xpath("//*[contains(@resource-id, 'et_nationa_id')]");
    private By NationalIDConfirmBtn = By.xpath("//*[contains(@resource-id, 'btn_nation_id_confirm')]");
    public MyFawryLoginScreen(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Home loginUser(String phone, String password,String id) {
        new TouchActions().element()
                .waitToBeReady(mobileBtn)
                .click(mobileBtn)
                .typeAppend(userNameFld, phone)
                .typeAppend(passwordFld, password)
                .click(loginBtn);

        return new Home(driver);
    }
    /*public MyFawryLoginScreen chooseCountryFlag() {

            actions
                    .click(countryCodeTxtBox)
                    .click(egypt);

        return this;
    }
    public MyFawryLoginScreen insertPhoneNumber (String phoneNumber) {
            actions
                    .typeAppend(numberTxtBox, phoneNumber)
                    .click(numberContinue);
        return this;
    }
    public Home insertPasswordAndClickLogin(String password) {
        actions
                .typeAppend(passwordTxtBox, password)
                .click(loginBtn);
        return new Home(mobile);
    }
    public MyFawryLoginScreen chooseDevEnvironment() {
        actions
                .click(skipButton);
        if (!actions.getText(btnChooseDev).equals("env:Dev")) {

            actions
                    .click(skipButton)
                    .click(btnChooseDev)
                    .click(chooseDev)
                    .click(confirmDev);
        }
        return this;
    }
    public MyFawryLoginScreen chooseENLanguage() {
        if (!actions.getText(numberContinue).equalsIgnoreCase("Continue")) {
            actions.click(changeLang);
        }
        return this;
    }
    public MyFawryLoginScreen chooseARLanguage() {
        if (actions.getText(numberContinue).equalsIgnoreCase("Continue")) {
            actions.click(changeLang);
        }
        return this;
    }*/


}