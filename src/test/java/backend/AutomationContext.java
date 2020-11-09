package backend;

import model.Product;

public class AutomationContext {

    private static Product product;

    public static void setProduct(Product product){
        AutomationContext.product = product;
    }

    public static Product getProduct(){
        return product;
    }
}
