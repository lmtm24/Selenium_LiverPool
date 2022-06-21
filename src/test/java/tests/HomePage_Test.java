package tests;

import dataproviders.ProductsDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;


// HomPage_Test class that test the methods which are instantiated in our pages object.
public class HomePage_Test extends BaseTest{

    HomePage homePage;


    @BeforeTest // Using TestNG to indicate that a HomePage object needs to be instantiated before starting the test
    public void setup(){
        homePage = new HomePage(driver);
    }



    @Test (dataProvider = "products", dataProviderClass = ProductsDataProvider.class) // Test method that is using a dataprovider to get the brand, model and characteristics from a product
    public void testSearchProduct(String brand, String model, String characteristics){
        homePage.setImageAltText(characteristics);
        homePage.searchProduct(brand+" "+characteristics+" "+model);
        homePage.clickProductDisplayed();
        Assert.assertTrue(homePage.verifyProduct().contains(characteristics));


    }





}
