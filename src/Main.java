import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();


        service.addProduct(new Product("Asus","Laptop","Drawer",2024));
        service.addProduct(new Product("dell","Laptop","Table",2028));
        service.addProduct(new Product("Vivo","MObile","Charging Pot",2023));
        service.addProduct(new Product("wallet","leather","pocket",2030));

       List<Product> products = service.getAllProducts();
        for(Product p : products){
            System.out.println(p);
        }
        System.out.println("A particular product: ");

        Product p = service.getProduct("Vivo");
        System.out.println(p);

    }
}
