package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ItemPage;
import pages.LandingPage;

public class DeleteItemTest {
    @Test
    public void verifyDeletedItem() {
        LandingPage landingPage = new LandingPage();
        String emptyCart = "Your shopping cart is empty.";
        ItemPage itemPage;
        CartPage cartPage;
        String expectedItemName = "Faded Short Sleeve T-shirts";
        landingPage.clickOnItem();
        //Otvara se stranica sa itemom
        itemPage = new ItemPage();
        itemPage.addToCart();
        //u kart page-u kliknemo na delete
        cartPage = new CartPage();
        cartPage.clickOnDelete();

        System.out.println(cartPage.isEmpty());
        //Asertujemo cart sada prazan
        //Assert.assertEquals(cartPage.isEmpty(),emptyCart, "Cart empty ex[ecting: "+emptyCart+" but we got:"+cartPage.isEmpty());
        Assert.assertTrue(cartPage.isEmpty());
    }

}
