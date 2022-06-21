package dataproviders;

import org.testng.annotations.DataProvider;

public class ProductsDataProvider {

    @DataProvider(name = "products")
    public Object[][] products(){
        return new Object[][] {
             //
                {"Samsung","UN75AU8000FXZX","LED Smart TV de 75 Pulgadas 4K"}, // First product to be searched
             //  {"Second-Value"}
        };

    }

}
