package restaurant;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final int TVA;
    private Map<Product, Integer> products;
    private double currentDiscount = 0;

    public Order(int TVA) {
        this.TVA = TVA;
        products = new HashMap<>();
    }

    public Order() {
        this(0);
    }

    public Map<Product, Integer> getProducts() { return products; }

    public void addProduct(Product product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void setCurrentDiscount(double discount) { this.currentDiscount = discount; }

    public double calculateTotalWithoutOffer() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        total += total * TVA / 100;
        return total;
    }

    public void displayOrder(int id) {
        System.out.println("−−− Comanda " + id + " −−−");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("> " + quantity + " x " + product.name + " - " + (product.getPrice() * quantity) + " RON");
        }
        System.out.println("Total (inclusiv TVA): " + calculateTotalWithoutOffer() + " RON");

    }

    public boolean isEmpty() {
        return products.isEmpty();
    }
}
