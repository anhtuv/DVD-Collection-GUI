public class Desktop extends Computers {
    private String profile;

    // Constructor for Desktop
    public Desktop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, String profile) {
        // super() calls the superclass Computers' constructor
        super(price, quantity, cpuSpeed, ram, ssd, storage);
        this.profile = profile;
    }

    public String toString() {
        // With SSD hard-drive
        if (getSsd() == true) {
            return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB SSD drive. (" +
                    getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        // With HDD hard-drive
        else {
            return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB HDD drive. (" +
                    getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
    }
}
