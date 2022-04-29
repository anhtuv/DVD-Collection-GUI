public class Laptop extends Computers {
    private double screenSize;

    // Constructor for Laptop
    public Laptop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, double screenSize) {
        // super() calls the superclass Computers' constructor
        super(price, quantity, cpuSpeed, ram, ssd, storage);
        this.screenSize = screenSize;
    }

    public String toString() {
        // With SSD hard-drive
        if (getSsd() == true) {
            return screenSize + " inch Laptop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB SSD drive. (" +
                    getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        // With HDD hard-drive
        else {
            return screenSize + " inch Laptop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB HDD drive. (" +
                    getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
    }
}
