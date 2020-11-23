package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LandingPage;
import pages.SignInPage;

import java.util.Random;

public class SignUpUserTest {
    @Test
    public void verifySignUp() {
        LandingPage landingPage = new LandingPage();
        SignInPage inPage;
        HomePage homePage;
        CreateAccountPage createAccount;
        String expectedTitle = "Kocko Kockic";
        // Click on Sign In button
        landingPage.clickOnSignIn();

        inPage = new SignInPage();
        //Enters an email and clicks on Create Account
        inPage.userSignUp(generateName()+"@pokemail.net");
        //Generisi email

        //CreateAccount page
        createAccount = new CreateAccountPage();
        //Improvment
        createAccount.userEnterData("Kocko","Kockic", "kockica123", "Branka Kockice 6", "Kockolorado", "54321", "1", "21", "432432432", "Kocka");

        homePage = new HomePage();

        Assert.assertEquals(homePage.verifyCorrectLogin(), expectedTitle, "Expected Title is "+expectedTitle+ " but actual is "+homePage.verifyCorrectLogin());
    }

    //improvment ideja - izvuci funkciju da se moze koristiti u svim testovima gdje je potrebno generisati Unique novog korisnika
    private String generateName () {
        String sample= "0123456789abcdefghijklmnopqrstuvwxyz";

        String generated = "name";
        Random r = new Random();

        for (int i = 0; i<5; i++) {
            generated+=sample.charAt(r.nextInt(36));
        }

        return generated;
    }

}
