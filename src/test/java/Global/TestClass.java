package Global;

import com.pages.MyFawryLoginScreen;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    SHAFT.TestData.JSON testData;



    @Test
    public void test() {
          new MyFawryLoginScreen(driver).loginUser("01012661525", "12345678","");

    }

    @BeforeClass
    public void beforeClass() {

        // Change Property


        //Read from json file
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
        




        // Run default in #ExecutionPlatform
        /*1*/
        driver = DriverFactory.getDriver();
        /*2*/
       //driver2 = new SHAFT.GUI.WebDriver();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
