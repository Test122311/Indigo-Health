package TestCases;

import Global.TestBase;
import com.Global.GeneralConstants;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage login=new LoginPage(driver);
    String ExpectedText="Please enter a valid email";
    String ExpectedText2="Invalid username or password";
    @Test
    public void ValidLogin(){

        login.login(GeneralConstants.VALID_EMAIL,GeneralConstants.VALID_PASSWORD);
    }
    @Test
    public void LoginWithInvalidEmail(){
        login.login("monam2715@gmail",GeneralConstants.VALID_PASSWORD);
        String ActualText=login.getTextError();
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @Test
    public void LoginWithInvalidPass(){
        login.login(GeneralConstants.VALID_EMAIL,"01234567");
        String ActualText=login.getPassError();
        Assert.assertEquals(ActualText,ExpectedText2);
    }
}
