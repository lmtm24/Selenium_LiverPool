package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

//  BaseTest class holds the methods to initialize and terminate the WebDriver object.
public class BaseTest {

    WebDriver driver;
    String URL = "https://www.liverpool.com.mx/";

    @BeforeTest    //Using TestNG, to tell that before that any test is executed this method needs to be called to setup the browser
    public void setupBaseTest(){
        driver = new ChromeDriver();
        driver.get(URL);
        //To tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”, Since all the Test classes will extend the BaseTest class
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest  //Using TestNG, to tell that after every test is executed this method will be called to quit the whole browser session and associated windows and tabs
    public void tearDown (){
        driver.quit();
    }
}

