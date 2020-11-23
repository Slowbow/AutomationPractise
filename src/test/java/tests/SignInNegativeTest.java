package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.SignInPage;
/* Testing a negative scenario with LogIn
*  Using email of a non-existing user and invalid password
*  Expecting not to be able to login with the alert message
* */
public class SignInNegativeTest {
    @Test
    public void verifySignIn() {
        LandingPage landingPage = new LandingPage();
        SignInPage inPage;
        HomePage homePage;
        Boolean alertPresent = true;

        // Click on Sign In button
        landingPage.clickOnSignIn();

        inPage = new SignInPage();
        //Using email of a non-existing user and incorrect password
        inPage.userSignIn("pogresan@email.net", "pogresan1234");

        inPage.alertMessagePresent();

        Assert.assertTrue(inPage.alertMessagePresent(), "Expecting that alert message is showing");

    }
}