package dataproviders;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.testng.annotations.DataProvider;

import java.util.Random;

public class SignupDataProvider {


    Random randomGenerator = new Random();
    String pwd = String.valueOf(randomGenerator.nextInt(1000));

    @DataProvider(name = "SignupData")
    public Object[][] SignupData(){
        return new Object[][] {
                //
                {"Testing",pwd,"@gmail.com"}, // Data

        };

    }
}
