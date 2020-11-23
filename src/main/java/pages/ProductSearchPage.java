package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearchPage extends  BasePage {
    //metoda koja vraca ime proizvoda
    public String getProductSearchResult(){
        String result = driver.findElement(By.xpath("//li[1]/div/div[2]/h5/a")).getText();
        // Alternate:  //div[@class='right-block']//a[@class='product-name']
        //*[@id="center_column"]/ul/li[1]/div/div[2]/h5/a
        return result;
    }

}
