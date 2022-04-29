import java.util.Scanner;

public class ElectronicStore {

    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue;

    Product[] products = new Product[MAX_PRODUCTS];

    // 1. Constructor for ElectronicStore
    public ElectronicStore(String name) {
        this.name = name;
    }

    // 2. Returns store name
    public String getName() { return name; }

    // 3. Method that adds product to array if there's an empty space in array
    public boolean addProduct(Product p) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = p;
                return true;
            }
        }
        return false;
    }

    // 4. Method sells units if possible, then revenue and stock are updated -- User inputs which item and the amount
    public boolean sellProducts() {
        printStock();

        Scanner user = new Scanner(System.in);
        System.out.print("Enter the product's index: ");
        int item = user.nextInt();
        System.out.print("Enter the quantity: ");
        int amount = user.nextInt();

        if (amount > 0) {
            if (item >= 0 && item <= 9) {
                sellProducts(item, amount);
                // sellUnits from Products class updates revenue, stockQuantity, and soldQuantity
                revenue += products[item].sellUnits(1);
                return true;
            }
        }
        return false;
    }

    // 5. Method sells units if possible, then revenue and stock are updated
    public boolean sellProducts(int item, int amount) {
        if (item >= 0 && item <= 9) {
            if (products[item] != null) {
                for(int i = 0; i < amount; i ++) {
                    // sellUnits from Products class updates revenue, stockQuantity, and soldQuantity
                    revenue += products[item].sellUnits(1);
                }
                return true;
            }
        }
        return false;
    }

    // 6. Returns total revenue
    public double getRevenue() {
        return revenue;
    }

    // 7. Prints stock
    public void printStock() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(i + ". " + products[i]);
            }
        }
    }
}
