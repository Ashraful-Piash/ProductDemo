import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();


        service.addProduct(new Product("Asus", "Laptop", "Drawer", 2024));
        service.addProduct(new Product("dell", "Laptop", "Table", 2028));
        service.addProduct(new Product("Vivo", "MObile", "Charging Pot", 2023));
        service.addProduct(new Product("wallet", "leather", "pocket", 2030));
        service.addProduct(new Product("mouse", "logi", "Drawer", 2021));
        service.addProduct(new Product("pen", "kolom", "table", 2030));
        service.addProduct(new Product("book", "boi", "brown table", 2050));
        service.addProduct(new Product("pad", "table pad", "black table", 2019));
        service.addProduct(new Product("hat", "tupi", "black table", 2034));
        service.addProduct(new Product("khata","note khata","white drawer",2023));

        List<Product> products = service.getAllProducts();
        for (Product p : products) {
            System.out.println(p);
        }
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in); // Create a scanner outside the loop

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Search by item");
            System.out.println("2. Search by text");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit the loop when '0' is entered
            } else if (choice == 1) {
                System.out.println("Enter a product name: ");
                String productName = scanner1.nextLine();
                Object result = service.getProduct(productName);
                System.out.println(result);
            } else if (choice == 2) {
                System.out.println("Enter the search text: ");
                String searchText = scanner1.nextLine().toLowerCase(); // Convert search text to lowercase
                List<Product> prods = service.getProductWithText(searchText);
                for (Product product : prods) {
                    System.out.println(product);
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close the scanner when you're done with all input operations
        scanner1.close(); // Close the scanner when you're done with all input operations
    }
}