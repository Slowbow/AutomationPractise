package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    //Deklaracija Web Drivera
    public static WebDriver driver;
    //Konstruktor bazne stranice - klase
    public BasePage() {
        if (driver == null) {
            //postavi path za chrome driver
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            driver = new ChromeDriver();
            //Idi na stranicu web-app-a
            driver.get("http://automationpractice.com/index.php");
            //maksimizuj prozor
            driver.manage().window().maximize();
        }
    }
    public static void quit_it() {
        driver.close();
    }


}
