package com.pages;

import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.WebDriver;

public class PageBase {
    public static WebDriver driver;
    public  PageBase(WebDriver driver){
           this.driver=driver;
    }
    public  PageBase(){
    }

}
