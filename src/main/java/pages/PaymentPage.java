package pages;

import org.openqa.selenium.By;

public class PaymentPage extends BasePage {
    //Chose payment message na payment page-u
    public OrderSummaryPage clickOnPayByCheck() {
        driver.findElement(By.xpath(" //*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
        return new OrderSummaryPage();
    }
}
