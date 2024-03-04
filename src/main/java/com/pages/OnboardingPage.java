package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnboardingPage extends PageBase{

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
}
