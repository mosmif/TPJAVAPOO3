import java.util.List;
public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Some initial data (optional)
        metier.add(new Product(1L, "Laptop Pro", "HP", 1299.99, "High performance laptop", 15));
        metier.add(new Product(2L, "Smartphone X", "Samsung", 899.50, "Latest flagship", 25));

        int choice;
        do {
            System.out.println("\n===== PRODUCT MANAGEMENT =====");
            System.out.println("1. Display all products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n--- All Products ---");
                    List<Product> all = metier.getAll();
                    if (all.isEmpty()) {
                        System.out.println("No products yet.");
                    } else {
                        for (Product p : all) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter product ID: ");
                    long id = scanner.nextLong();
                    Product found = metier.findById(id);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Add New Product ---");
                    System.out.print("ID: ");
                    long newId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    Product newProduct = new Product(newId, name, brand, price, desc, stock);
                    metier.add(newProduct);
                    break;

                case 4:
                    System.out.print("Enter ID of product to delete: ");
                    long deleteId = scanner.nextLong();
                    metier.delete(deleteId);
                    break;

                case 5:
                    System.out.println("Goodbye! Thank you for using the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
