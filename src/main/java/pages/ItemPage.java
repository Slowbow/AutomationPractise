package pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ItemPage extends BasePage {

    public CartPage addToCart() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();

        return new CartPage();
    }

    public String getItemName() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1")).getText();
    }
    //To Do:
    //Change color
    //Change quantity
    // /html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button
}
