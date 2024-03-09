package Global;

import com.pages.RegisterPage;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
    protected static WebDriver driver;
    protected final String URL = "https://indigoproviderportal.vercel.app/login";
    protected RegisterPage RegPage;


    @Parameters("browserName")
    @BeforeSuite
    public void SetUp(@Optional("SHAFT") String browserName) {
        System.out.println(" The browser name is : " + browserName);
        if (browserName.equalsIgnoreCase("SHAFT")) {
            DriverFactory DriverF=new DriverFactory();
            driver = DriverF.getDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        //RegPage = new RegisterPage(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }




}
