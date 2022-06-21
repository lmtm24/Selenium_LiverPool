package tests;

import dataproviders.SignupDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class SignUp_Test extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    SignupPage signupPage;
    ProgressiveProfilingPage progressiveProfilingPage;
    EnrollmentPage enrollmentPage;

    @BeforeTest
    public void setupSignUp(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        progressiveProfilingPage = new ProgressiveProfilingPage(driver);
        enrollmentPage = new EnrollmentPage(driver);
    }

    @Test(dataProvider = "SignupData", dataProviderClass = SignupDataProvider.class)
    public void testCreateConsumerAccount(String userName, String num, String domain) {
        String nombre = "Juan";
        String apellidoP = "Apellido";
        String expectedText = "Verificación de celular";

        homePage.clickIniciarSesion();
        loginPage.clickCrearCuenta();
        signupPage.typeCorreo(userName + num + domain);
        signupPage.typePass(userName + num);
        signupPage.clickCrearCuentaBtton();
        progressiveProfilingPage.typeName(nombre);
        progressiveProfilingPage.typeApellidoP(apellidoP);
        progressiveProfilingPage.clickMale();
        progressiveProfilingPage.clickCrearCuenta();
        Assert.assertEquals(expectedText,enrollmentPage.verifySignup());

    }



}
