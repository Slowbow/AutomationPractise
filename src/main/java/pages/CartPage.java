package pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CartPage extends BasePage {
    //Informacije o dodanom itemu

    public String getItemInCartName() {
        //Ime prvog itema u cartu
        String cart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).getText();
        return cart;
    }

    //Cijena prvog itema u cartu
    public String getPriceOfItemInCart() {
        String price = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span")).getText();
        return price;
    }

    public void clickOnDelete() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a/i")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }

    public boolean isEmpty() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        boolean emptyAlert = driver.findElements(By.className("alert-warning")).size() > 0;
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        return emptyAlert;
    }


    //Proceed to checkout dugme
     public AddressesPage clickOnProceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        return new AddressesPage();
    }

}
