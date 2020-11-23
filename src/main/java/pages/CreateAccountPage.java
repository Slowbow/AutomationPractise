package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateAccountPage extends BasePage {
    //
    public HomePage userEnterData (String firstName, String lastName, String password, String address, String city, String postcode, String state, String country, String phone, String alias) {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys(lastName);

        driver.findElement(By.id("passwd")).sendKeys(password);

        //Address
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);

        driver.findElement(By.id("address1")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);


        driver.findElement(By.id("postcode")).sendKeys(postcode);
        //Select by Value State and Country
        Select dropdownState = new Select( (driver.findElement(By.id("id_state"))));
        dropdownState.selectByValue(state);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        Select dropdownCountry = new Select( (driver.findElement(By.id("id_country"))));
        dropdownCountry.selectByValue(country);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("phone_mobile")).sendKeys(phone);
        //Alias Ime adrese
        driver.findElement(By.id("alias")).sendKeys(alias);


        driver.findElement(By.id("submitAccount")).click();

        return new HomePage();
    }
}
