package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressiveProfilingPage extends BasePage {

    public ProgressiveProfilingPage(WebDriver driver) {
        super(driver);
    }

    By nombreInput = By.id("input-user__name");
    By apellidoPInput = By.id("input-user__apaterno");
    By sexoRadioButton = By.id("male");
    By crearCuentaButton = By.xpath("//div[@id='formCreateAccount']//button[@class='a-btn a-btn--primary']");

    public void typeName(String text){
        type(nombreInput, text );
    }
    public void typeApellidoP(String text){
        type(apellidoPInput, text );
    }
    public void clickMale(){
        click(sexoRadioButton);
    }
    public void clickCrearCuenta(){
        click(crearCuentaButton);
    }
}
