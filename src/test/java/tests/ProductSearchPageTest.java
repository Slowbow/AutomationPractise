package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductSearchPage;

public class ProductSearchPageTest {
    @Test
    public void isProductSearched() {
        ProductSearchPage pr;
        String productResult = "Printed Summer Dress";
        LandingPage landingPage = new LandingPage();
        //Navigate to Product Search Page
        landingPage.searchProduct();
        //// Instantiate ProductSearchPage class object
        pr = new ProductSearchPage();
        // Verify the text
        Assert.assertEquals(pr.getProductSearchResult(), productResult, "Expected Title is "+productResult+ " but actual is "+pr.getProductSearchResult());

    }


}
