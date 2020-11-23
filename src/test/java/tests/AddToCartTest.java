package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ItemPage;
import pages.LandingPage;

public class AddToCartTest {
    @Test
    public void verifyAddedItem() {
        LandingPage landingPage = new LandingPage();
        ItemPage itemPage;
        CartPage cartPage = new CartPage();
        String expectedItemName = "Faded Short Sleeve T-shirts";
        //na Landing Page-u klik na add to cart i proceed to checkout
        landingPage.clickOnItem();
        //Otvara se stranica sa itemom
        itemPage = new ItemPage();
        itemPage.addToCart();

        //Asertujemo da je pravilan item dodan
        Assert.assertEquals(cartPage.getItemInCartName(), expectedItemName, "Expected Item name is "+expectedItemName+ " but actual is "+cartPage.getItemInCartName());
    }
}
