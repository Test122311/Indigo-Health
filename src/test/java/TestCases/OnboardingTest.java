package TestCases;

import Global.TestBase;
import com.pages.OnboardingPage;
import org.testng.annotations.Test;

public class OnboardingTest extends TestBase {

    @Test
    public void OnboardingFlow() throws InterruptedException {
        OnboardingPage onboard=new OnboardingPage(driver);
        String link="http://url9167.indigo.health/ls/click?upn=diptHC4kCj-2FuxC6v0SjHIeKb7M6Zrt-2F-2FvyBuksPjiaauzIgRzTJElnNAqk1gSlvUrV32fDz6ZGrMZAGvBbroO2i-2FcojzId7B7ulf0AJc4YeyoTJUYJzgy6sHx8DnyS6zr55-2FYmIk-2FYFhOWqmdq6fj0v1swzgcVFicwgMfH5N2d8AIEqAFigbKg445t-2FbjmmHquGV-2FjYbzBh12cUa-2BERv31n5REDNIVXmdAZk3-2B2VGhfW2FZha-2FvyoV1mW7Mu88YbL9hmslOD0kLeCgSxSEHdlZ2DnZIGdmqO266hldxfaCbadHs8zkm2amZsO8jsnaLVp1TeXV9HlB45PMgxTK27gh8rNrNSvg1jrCruCvmO1bRKMCWE3xkydFcY77kk77wYykOvaM-2BNW8yim7NgRfLi1WWedQvrC6iFFCkpja0vafUXWbZgefWzsIqjujdugOLXIrQtXtH6ySn3JDOxi6JLzVB1DHEQYHxhBcD0wyzM-2FHN31UISayKBZWEy3rpFtw8agJcdHF508dd4zWmheueyMB9vhuv9dZofsmprtMuVA7eb144WeDiEKUb9sBwE0JEO4FMwIf-2BgKIhCn1cGDYXMocb5zgVIa4i8bO0QFA7rpHuPbV-2FjsAqEob-2BXdhIfgXeWT-2FfoYd-2FNYQe3z0vsIElN8VuOdQ9HV85CGq2XHMaTGPM-3DFJaC_tKPrBtxMzxOFtD1-2FkzwChOOlCgcrsPAZ8-2FMPSgYx-2FHzh-2BW3eBED6SXOLLcHtJPTUKREnudm4a5hrWesHiDnYvpuNbT2NlCjXZT7owWJUQQCwtf9Qap02hFM8b3xMZfP-2Bgg22fUd0WD4bo7Rd3xHDyzReebkMcnGylCLqn38JsDo4tiNTXnvscyCV5ZNwBbNKQ688VwMCrUPWt5lXyUj1yQ-3D-3D";
        driver.get(link);
        onboard.enterUserName("monam2715@gmail.com");
        onboard.enterPassword("0123456789");
        onboard.clickOnAcceptButton();
        onboard.clickOnSignInButton();
        Thread.sleep(5000);
        onboard.setClickStartOnboarding();

        onboard.enterPhoneNumber("1270036438");
        onboard.enterNpiNumber("0123456789");
        Thread.sleep(3000);
        onboard.enterCompanyName("Company xx");
        onboard.ClickOnNextbutton();
       Thread.sleep(3000);
        onboard.setUpload();
       // onboard.ClickOnNextbutton2();
    }
}
