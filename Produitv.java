import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private long id;
    private String name;
    private String brand;
    private double price;
    private String description;
    private int stock;

    public Product() {
    }

    public Product(long id, String name, String brand, double price, 
                   String description, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

// Generic interface for business logic
interface IMetier<T> {
    void add(T o);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}

// Implementation for Product
class MetierProduitImpl implements IMetier<Product> {
    private List<Product> products;

    public MetierProduitImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public void add(Product p) {
        if (p != null) {
            // Check if product with same id already exists
            if (findById(p.getId()) != null) {
                System.out.println("Product with ID " + p.getId() + " already exists!");
                return;
            }
            products.add(p);
            System.out.println("Product added successfully!");
        }
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products); // return a copy
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product product = findById(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Product with ID " + id + " deleted successfully!");
        } else {
            System.out.println("Product with ID " + id + " not found!");
        }
    }
}
