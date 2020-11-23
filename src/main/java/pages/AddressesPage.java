package pages;

import org.openqa.selenium.By;

public class AddressesPage extends BasePage {
    //Klik na Proceed to Checkout
    public ShippingPage clickOnProceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        return new ShippingPage();
    }
    //po potrebi dodati metode koje ce pomoci kod verifikacije adresa i da je checkirano billing address polje

}
