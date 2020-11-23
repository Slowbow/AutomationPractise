package pages;

import org.openqa.selenium.By;

public class OrderSummaryPage extends BasePage {
    //Confirm order - I confirm my order button pressed
    public OrderConfirmationPage confirmOrder() {
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
        return new OrderConfirmationPage();
    }
    //Order details can be checked from the Order summary: //*[@id="center_column"]/form
}
