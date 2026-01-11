import java.util.List;
import java.util.ArrayList;
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
