package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;
public class LandingPageTest {

    @Test
    public void isLandingPageDisplayed() {
        LandingPage landingPage = new LandingPage();
        String expectedTitle = "My Store";
        //Verify the titles
        Assert.assertEquals(landingPage.getTitle(), expectedTitle, "Expected Title is "+expectedTitle+ " but actual is "+landingPage.getTitle());
    }

}
