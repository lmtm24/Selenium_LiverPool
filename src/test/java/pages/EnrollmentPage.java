package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnrollmentPage extends BasePage {

    public EnrollmentPage(WebDriver driver) {
        super(driver);
    }

    By verificacion = By.cssSelector(".ca7efebbc");

    public String verifySignup(){
        String text= getText(verificacion);
        return text;
    }


}
