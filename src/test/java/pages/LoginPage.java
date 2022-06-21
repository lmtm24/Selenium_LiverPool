package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By crearCuentaLink = By.linkText("Crear cuenta");

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public void clickCrearCuenta(){
        click(crearCuentaLink);
    }

}
