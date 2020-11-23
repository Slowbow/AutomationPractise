package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.SignInPage;

public class SignInPageTest {
    @Test
    public void verifySignIn() {
        LandingPage landingPage = new LandingPage();
        SignInPage inPage;
        HomePage homePage;
        String expectedTitle = "Slobodan Savic";
        String URL = "http://automationpractice.com/index.php?controller=my-account";

        // Click on Sign In button
        landingPage.clickOnSignIn();

        inPage = new SignInPage();
        inPage.userSignIn("sloba@pokemail.net", "Sloba123");

        homePage = new HomePage();
        Assert.assertEquals(homePage.verifyCorrectLogin(), expectedTitle, "Expected Title is "+expectedTitle+ " but actual is "+homePage.verifyCorrectLogin());
        Assert.assertEquals(homePage.getCurrentURL(), URL, "Expected URL is "+URL+", actual URL is "+URL);
    }
}
