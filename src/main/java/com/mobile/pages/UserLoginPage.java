package com.mobile.pages;

import com.shaft.gui.element.TouchActions;
import io.github.shafthq.shaft.gui.element.FluentElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPage {
    WebDriver mobile;
    FluentElementActions actions;

    public UserLoginPage(WebDriver mobile) {
        this.mobile = mobile;
        actions = new TouchActions(mobile).performElementAction();
    }

    By skipButton = By.id("tvSkip");
    By changeLang = By.id("layout_change_app_lang");
    By btnChooseDev = By.id("tvChangeConfig");
    By chooseDev = By.id("rbDev");
    By confirmDev = By.id("btnConfirm");
    By countryCodeTxtBox = By.id("tvCountryCodeNumber");
    By numberTxtBox = By.id("etCurrentNumber");
    By egypt = By.id("cl_select_egypt");
    By numberContinue = By.id("btn_continue");
    By passwordTxtBox = By.id("etNewPassword");
    By loginBtn = By.id("btnLogin");

    By tv_search_main = By.id("tv_search_main");
    By choose = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView");
    By rbAnything = By.id("rbAnything");
    By button_done = By.id("button_done");


    public Home loginUser(String email, String password) {

        actions.click(skipButton)
                .click(countryCodeTxtBox)
                .click(egypt)
                .typeAppend(numberTxtBox, email)
                .click(numberContinue)
                .typeAppend(passwordTxtBox, password)
                .click(loginBtn);

        return new Home(mobile);
    }
    public UserLoginPage chooseCountryFlag() {

            actions
                    .click(countryCodeTxtBox)
                    .click(egypt);

        return this;
    }
    public UserLoginPage insertPhoneNumber (String phoneNumber) {
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
    public UserLoginPage chooseDevEnvironment() {
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
    public UserLoginPage chooseENLanguage() {
        if (!actions.getText(numberContinue).equalsIgnoreCase("Continue")) {
            actions.click(changeLang);
        }
        return this;
    }
    public UserLoginPage chooseARLanguage() {
        if (actions.getText(numberContinue).equalsIgnoreCase("Continue")) {
            actions.click(changeLang);
        }
        return this;
    }


}