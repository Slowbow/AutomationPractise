package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

public class DriverTest {
    @BeforeTest
    public void beforeTest() {
        new BasePage();
    }

    @AfterTest
    public void tearDown() {
        BasePage.quit_it();
    }
}
