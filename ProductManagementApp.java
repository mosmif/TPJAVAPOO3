import java.util.ArrayList;
import java.util.Scanner;
public class ProductManagementApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        // Adding some initial products
        products.add(new Product(1001L, "Laptop", 1299.99));
        products.add(new Product(1002L, "Smartphone", 699.50));
        products.add(new Product(1003L, "Headphones", 89.99));
        products.add(new Product(1004L, "Mouse", 29.99));
        
        int choice;
        
        do {
            System.out.println("\n=== Product Management App ===");
            System.out.println("1. Display all products");
            System.out.println("2. Add a new product");
            System.out.println("3. Modify a product (by index)");
            System.out.println("4. Delete a product (by index)");
            System.out.println("5. Search product by name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1: // Display all products
                    displayProducts(products);
                    break;
                    
                case 2: // Add product
                    addProduct(products, scanner);
                    break;
                    
                case 3: // Modify product
                    modifyProduct(products, scanner);
                    break;
                    
                case 4: // Delete product
                    deleteProduct(products, scanner);
                    break;
                    
                case 5: // Search by name
                    searchProductByName(products, scanner);
                    break;
                    
                case 0:
                    System.out.println("Goodbye! Thank you for using the app.");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
    
    private static void displayProducts(ArrayList<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        
        System.out.println("\n=== Product List ===");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s\n", i, products.get(i));
        }
    }
    
    private static void addProduct(ArrayList<Product> products, Scanner scanner) {
        System.out.print("Enter product ID: ");
        long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        
        products.add(new Product(id, name, price));
        System.out.println("Product added successfully!");
    }
    
    private static void modifyProduct(ArrayList<Product> products, Scanner scanner) {
        displayProducts(products);
        if (products.isEmpty()) return;
        
        System.out.print("\nEnter the index of product to modify: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < products.size()) {
            scanner.nextLine(); // Consume newline
            
            System.out.print("New name (or press Enter to keep current): ");
            String name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                products.get(index).setName(name);
            }
            
            System.out.print("New price (or -1 to keep current): ");
            double price = scanner.nextDouble();
            if (price >= 0) {
                products.get(index).setPrice(price);
            }
            
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }
    
    private static void deleteProduct(ArrayList<Product> products, Scanner scanner) {
        displayProducts(products);
        if (products.isEmpty()) return;
        
        System.out.print("\nEnter the index of product to delete: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < products.size()) {
            Product removed = products.remove(index);
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Invalid index!");
        }
    }
    
    private static void searchProductByName(ArrayList<Product> products, Scanner scanner) {
        System.out.print("\nEnter product name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();
        
        System.out.println("\nSearch results for '" + searchName + "':");
        boolean found = false;
        
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(searchName)) {
                System.out.println(p);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No products found with that name.");
        }
    }
}
