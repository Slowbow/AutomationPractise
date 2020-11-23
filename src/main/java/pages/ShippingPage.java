package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage {
    public PaymentPage clickOnProceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        return new PaymentPage();
    }
    //Toggle Check Box
    public void checkTermsOfService() {
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
    }
}
