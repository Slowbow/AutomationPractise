package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{

    //Verifikovanje naslova stranice
    public String getTitle() {
        return driver.getTitle();
    }

    //Pretraga proizvoda na LandingPage rezultuje pokazivanjem pretrazenih
    //proizvoda pa je rezultat ProductSearchPage and return value is new Product Search Page()
    public ProductSearchPage searchProduct() {
        //Unosenje teksta u pretragu
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        //Klik na Search button
        driver.findElement(By.name("submit_search")).click();
        //Prikaz SearchPage-a
        return new ProductSearchPage();
    }

    //Klik na SignIn button
    public SignInPage clickOnSignIn() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        //klik na Sign in dugme - pokazuje Sign In stranicu
        return new SignInPage();
    }

    //Klikni na prvi item
    public ItemPage clickOnItem() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]")).click();
        return new ItemPage();
    }


    public String getFirstItemName() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/h5/a")).getText();
    }

}
