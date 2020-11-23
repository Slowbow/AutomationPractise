package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Home page je glavna stranica informacijama o Account-u
public class HomePage extends BasePage {

    public String verifyCorrectLogin() {
        String text = driver.findElement(By.xpath("//a[@class='account']/span")).getText();
        return text;
    }

    public LandingPage returnToLandingPage() {
        driver.findElement(By.id("header_logo")).click();
        return new LandingPage();
    }

    public String getCurrentURL () {
        return driver.getCurrentUrl();
    }

}
