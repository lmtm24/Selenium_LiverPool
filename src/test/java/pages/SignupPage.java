package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends HomePage{
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    By email = By.id("email");
    By pass= By.id("password");
    By crearCuentaButton = By.cssSelector(".c5f188417");


    public void typeCorreo(String text){
        type(email, text);
    }
    public void typePass(String text){
        type(pass, text);
    }
    public void clickCrearCuentaBtton(){
        click(crearCuentaButton);
    }

}
