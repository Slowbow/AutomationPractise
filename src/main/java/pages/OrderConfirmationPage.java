package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BasePage {
    //Zeleni alert prisutan order is complete
    //Detalji transakicje poznati
     public boolean alertSuccessMessagePresent() {
        boolean alertPresent = driver.findElements (By.xpath("//*[@id=\"center_column\"]/p[1]")).size() > 0;
        return alertPresent;
    }

}
