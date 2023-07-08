import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public  List<Product> getAllProducts(){
        return products;
    }

    public Object getProduct(String productName) {
        String lowercaseProductName = productName.toLowerCase();
        for (Product p : products) {
            if (p.getName().toLowerCase().equals(lowercaseProductName)) {
                return p;
            }
        }
        return "Product not found";
    }

    public List<Product> getProductWithText(String text) {
        String string = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(string) || type.contains(string) || place.contains(string)) {
                prods.add(p);
            }
        }
        if (prods.isEmpty()) {
            System.out.println("No text found.");
        }
        return prods;
    }

}
