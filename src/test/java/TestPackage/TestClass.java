package TestPackage;

import com.mobile.pages.UserLoginPage;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    SHAFT.GUI driver2;
    SHAFT.TestData.JSON testData;
     SHAFT shaft;


    @Test
    public void test() {
          new UserLoginPage(driver).loginUser("01012661525", "12345678");

    }

    @BeforeClass
    public void beforeClass() {

        // Change Property
        System.setProperty("executionAddress", "0.0.0.0:4724");
        System.out.println(System.getProperty("executionAddress")+" llllllllllllll");
        // System.setProperty("mobile_deviceName", "R58M65SMYVV");
        System.setProperty("targetOperatingSystem", "Android");

        //Read from json file
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
        

        // Run default in #ExecutionPlatform
        /*1*/ //driver = DriverFactory.getDriver();
        /*2*/ //driver2 = new SHAFT.GUI();




        // Run default in #ExecutionPlatform
        /*1*/
        // driver = DriverFactory.getDriver();
        /*2*/
        driver2 = new SHAFT.GUI();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
