package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class OrderOneItemFullTest {
    @Test
    public void isProductOrdered() {

        LandingPage landingPage = new LandingPage();

        SignInPage inPage;
        HomePage homePage;
        ItemPage itemPage;
        CartPage cartPage;
        AddressesPage addressesPage;
        ShippingPage shippingPage;
        PaymentPage paymentPage;
        OrderSummaryPage orderSummary;
        OrderConfirmationPage orderConfirmed;

        //Klik na sign in
        landingPage.clickOnSignIn();
        //Korisnik se sign-in-uje
        inPage = new SignInPage();
        inPage.userSignIn("sloba@pokemail.net", "Sloba123");
        //Klik na logo da bi dosao do landing Page
        homePage = new HomePage();
        homePage.returnToLandingPage();
        //Na landing page-u klik na item
        landingPage.clickOnItem();
        itemPage = new ItemPage();
        //Add item to cart and proceed to checkout
        itemPage.addToCart();
        //open the cart page - cart summary
        cartPage = new CartPage();
        //Click on proceed to checkout
        cartPage.clickOnProceedToCheckout();
        //On the Address page, proceed to checkout
        addressesPage = new AddressesPage();
        addressesPage.clickOnProceedToCheckout();
        //Shpping page
        shippingPage = new ShippingPage();
        //Click on Terms of service and proceed to checkout
        shippingPage.checkTermsOfService();
        shippingPage.clickOnProceedToCheckout();
        //Load payment page and select pay by check
        paymentPage = new PaymentPage();
        paymentPage.clickOnPayByCheck();
        //Review order summary and confirm order
        orderSummary = new OrderSummaryPage();
        orderSummary.confirmOrder();
        //Order confirmation page is showing with the order complete message
        orderConfirmed = new OrderConfirmationPage();
        //Order complete alert present
        Assert.assertTrue(orderConfirmed.alertSuccessMessagePresent(), "Order successfully placed - Order confirmation message present.");


    }
}
