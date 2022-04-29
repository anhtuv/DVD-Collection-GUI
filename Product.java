public class Product {
    private double price;
    private int stockQuantity;
    private int soldQuantity;


    // Constructor (Fridge/ToasterOven/Laptop/Desktop classes have in common)
    public Product(double price, int quantity) {
        this.price = price;
        this.stockQuantity = quantity;
    }

    // Get methods
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public int getSoldQuantity() { return soldQuantity; }

    // Method (Fridge/ToasterOven/Laptop/Desktop classes have in common)
    public double sellUnits (int amount) {
        double revenue;

        if(stockQuantity >= amount) {
            revenue = amount * price;
            stockQuantity -= amount;
            soldQuantity += amount;
            return revenue;
        }
        else {
            return 0;
        }
    }
}
