package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SignInPage extends BasePage {

    public HomePage userSignIn(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();

        return new HomePage();
    }

    public Boolean alertMessagePresent() {
        //Authentication failed - There is 1 error
        boolean alertPresent = driver.findElements (By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).size() > 0;
        return alertPresent;
    }

    public CreateAccountPage userSignUp(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        //Click na sign up btn

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

        return new CreateAccountPage();
    }



}
