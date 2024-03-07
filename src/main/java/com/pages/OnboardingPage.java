package com.pages;

import com.Global.GeneralConstants;
import com.github.javafaker.Faker;
import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnboardingPage extends PageBase{
    static OnboardingPage instance;
    TouchActions actions = new TouchActions();
    Faker faker = new Faker();
    public static OnboardingPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new OnboardingPage(driver);
        }
        return instance;
    }

    By spinner = By.xpath("//*[contains(@id,'welcome')]");
    By startOnboardingBtn = By.xpath("//*[contains(@id,'welcome')]");
    By businessName = By.xpath("//*[contains(@id,'companyName')]");
    By phoneNum = By.xpath("//*[contains(@id,'phoneNumbe')]");
    By npiNumber = By.xpath("//*[contains(@id,'npiNumber')]");
    By timeZone= By.xpath("//*[(contains(@id,'time') and @name = 'timeZoneId' ) or @name='timeZoneId' ]");
    By nextBtn= By.xpath("//*[contains(@id,'business-info-bt')]");
    By nextBtn2= By.xpath("//*[contains(@id,'business-logo-btn')]");


    By nextBtn3= By.xpath("//*[contains(@type,'submit')]");
    By nextBtn4= By.xpath("//*[contains(@id,'personal-photo')]");

    By UserNameInput= By.name("username");
    By PasswordInput=By.name("password");
    By signInButton=By.xpath("//button[@type=\"submit\"]");
    By acceptButton=By.xpath("//button[@type=\"button\"]");

    By clickStartOnboarding=By.xpath("//button[@type=\"button\"]");
    By InputCompanyName=By.name("companyName");
    By phoneNumber=By.id("phoneNumber");
    By npiNumberInput=By.name("npiNumber");
   // By clickOnNext=By.xpath("//button[@type=\"submit\" and @class=\"btn-with-border\"]");
    By clickOnNext=By.className("btn-with-border");
    //By clickOnUploadFile=By.xpath("//input[@type=\"file\"]");
    By upload=By.xpath("//p[@class=\"mb-0\"]");
    By clickOnNext2=By.xpath("//button[@type=\"button\" and @class=\"btn-with-border\"]");


    public OnboardingPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String userName){
        driver.findElement(UserNameInput).sendKeys(userName);
    }
    public void enterPassword(String pass){
        driver.findElement(PasswordInput).sendKeys(pass);
    }
    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
    public void clickOnAcceptButton(){
        driver.findElement(acceptButton).click();
    }
    public void setClickStartOnboarding(){
        driver.findElement(clickStartOnboarding).click();
    }
    public void enterCompanyName(String companyName){
        driver.findElement(InputCompanyName).clear();
        driver.findElement(InputCompanyName).sendKeys(companyName);
    }
   public void enterPhoneNumber(String PNumber){
       driver.findElement(InputCompanyName).clear();
        driver.findElement(phoneNumber).sendKeys(PNumber);
    }
     public void enterNpiNumber(String npiNumber){
         driver.findElement(npiNumberInput).clear();
        driver.findElement(npiNumberInput).sendKeys(npiNumber);
    }
    public void ClickOnNextbutton(){

        driver.findElement(clickOnNext).click();
    }
    public void setUpload(){

        driver.findElement(upload).click();
        String imagePath="D:\\projects\\Provider\\Files\\image1.jpg";
        driver.findElement(upload).sendKeys(imagePath);
    }
    public void ClickOnNextbutton2(){

        driver.findElement(clickOnNext2).click();
    }

    public void onBoardingData() throws InterruptedException {
       Thread.sleep(5000);

        actions.element()
                .click(startOnboardingBtn);
       Thread.sleep(10000);
        actions .element().type(businessName,faker.company().name())
                .type(phoneNum,"10"+faker.number().digits(8))
                .type(npiNumber,faker.number().digits(10))
                .select(timeZone, GeneralConstants.TIME_ZONE)
                .click(nextBtn);
        Thread.sleep(10000);
        actions .element().click(nextBtn2);
        Thread.sleep(10000);
        actions .element()
                .type(npiNumber,faker.number().digits(10))
                .select(timeZone, GeneralConstants.TIME_ZONE)
                .click(nextBtn3);
        Thread.sleep(10000);
        actions .element().click(nextBtn4);

    }
}
