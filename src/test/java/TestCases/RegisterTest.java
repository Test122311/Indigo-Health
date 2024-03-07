package TestCases;

import Global.TestBase;
import com.Global.GeneralConstants;
import com.github.javafaker.Faker;
import com.pages.LoginPage;
import com.pages.OnboardingPage;
import com.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {


    // TestCase to verify valid register with valid credential.
    // protected RegisterPage RegPage = new RegisterPage(driver);
   /* @Test
    public void TC_001() {
        String ExpectedText = "Thank you for registering. We’ve sent an email to";
        String ActualText = RegisterPage.getInstance(driver).addAllData("b3eb12b7e811@drmail.in");

         RegisterPage.getInstance(driver)
                .checkConfirmation();
        Assert.assertEquals(ActualText, ExpectedText);

    }*/

    @Test
    public void TC_002() {
        Faker faker = new Faker();
        String email =faker.name().firstName()+faker.name().bloodGroup()+"@gmail.com";

        driver.get("https://indigoproviderportal.vercel.app/login");
        RegisterPage.getInstance(driver)
                .addAllData(email);

        RegisterPage.getInstance(driver)
                .confirmationUrl();

        LoginPage.getInstance(driver)
                .login(email, "P@ssw0rdP@ssw0rd");

        try {
            OnboardingPage.getInstance(driver).onBoardingData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

   /* @Test
    public void registerWithInValidEmail() {
        RegisterPage RegPage = new RegisterPage(driver);
        RegPage.GoToRegisterPage();
        RegPage.setUserEmailInput("b3eb12b7e811@drmail");
        RegPage.setDropDown("Dr.");
        RegPage.enterUserFirstName("Mohamed");
        RegPage.enterUserLastName("Magdy");
        RegPage.setCertificateDropDown("PhD");
        RegPage.enterPassword("0123456789");
        RegPage.enterConfirmPassword("0123456789");
        RegPage.clickOnCreateAccount();
        System.out.println(RegPage.getTextError());
        String ExpectedText= "Please enter a valid email";
        String  ActualText = RegPage.getTextError();
        Assert.assertEquals(ActualText,ExpectedText);

    }
    @Test
    public void registerWithInValidPassword() {
        RegisterPage RegPage = new RegisterPage(driver);
        RegPage.GoToRegisterPage();
        RegPage.setUserEmailInput("b3eb12b7e811@drmail.in");
        RegPage.setDropDown("Dr.");
        RegPage.enterUserFirstName("Mohamed");
        RegPage.enterUserLastName("Magdy");
        RegPage.setCertificateDropDown("PhD");
        RegPage.enterPassword("01234567");
        RegPage.enterConfirmPassword("01234567");
        RegPage.clickOnCreateAccount();
        System.out.println(RegPage.getPassError());
        String ExpectedText= "Min. length is 10 characters";
        String  ActualText = RegPage.getPassError();
        Assert.assertEquals(ActualText,ExpectedText);

    }
    @Test
    public void registerWithoutConfirmPassword() {
        RegisterPage RegPage = new RegisterPage(driver);
        RegPage.GoToRegisterPage();
        RegPage.setUserEmailInput("b3eb12b7e811@drmail.in");
        RegPage.setDropDown("Dr.");
        RegPage.enterUserFirstName("Mohamed");
        RegPage.enterUserLastName("Magdy");
        RegPage.setCertificateDropDown("PhD");
        RegPage.enterPassword("0123456789");
        RegPage.enterConfirmPassword("");
        RegPage.clickOnCreateAccount();
        System.out.println(RegPage.getConfirmPassError());
        String ExpectedText= "Password is required";
        String  ActualText = RegPage.getConfirmPassError();
        Assert.assertEquals(ActualText,ExpectedText);

    }
*/
}