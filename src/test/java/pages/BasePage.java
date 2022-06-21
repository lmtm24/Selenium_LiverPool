package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// BasePage class to abstract all common actions into a central location and leverage them in any Page Object
public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver =driver;
    } //constructor which takes a WebDriver object to initialize it

    public void click(By element){
        driver.findElement(element).click();
    } // Generic method to click on an element

    public void type (By element, String text){
        driver.findElement(element).sendKeys(text);
    } // Generic method to type on any text field

    public String getText(By element){ // Generic method to get text from an element to validate an expected result
        String text=driver.findElement(element).getText();
        return text;
    }


}
