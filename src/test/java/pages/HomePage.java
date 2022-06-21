package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// HomePage class Page Object, has a constructor which takes a WebDriver object and passes it on to its superclass constructor
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String imageAltText = "";

    public void setImageAltText(String imageAltText) {
        this.imageAltText = imageAltText;
    }

    //Locators
    By searchBox = By.xpath("//input[@id='mainSearchbar']");
    By productInformation = By.xpath("//div[@class='o-product__description']//h1[@class='a-product__information--title']");
    By iniciarSesionLink = By.cssSelector("[class='o-col col-lg-auto d-none d-lg-flex text-center order-lg-4 sessionMinWidth'] .a-header__topLink");



    // Methods that are receiving the locators to perform the actions.

    public By getProductDisplayed() { // specific method that uses a relative xpath to locate a product that contains the characteristics added in the test
        return By.xpath("//div[@class='m-search-suggestion-product mb-3']//img[contains(@alt,'" + imageAltText + "')]");
    }
    public void clickProductDisplayed() {
        click(getProductDisplayed());
    }
    public void searchProduct(String text) {
        type(searchBox, text);
    }
    public String verifyProduct() {
        String text = getText(productInformation);
        return text;
    }
    public void clickIniciarSesion(){
        click(iniciarSesionLink);
    }





}
