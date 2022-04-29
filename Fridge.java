public class Fridge extends Appliances {
    private boolean hasFreezer;

    // Constructor for Fridge
    public Fridge(double price, int quantity, int wattage, String color, String brand, boolean hasFreezer) {
        // super() calls the superclass Appliances' constructor
        super(price, quantity, wattage, color, brand);
        this.hasFreezer = hasFreezer;
    }

    public String toString() {
        // With freezer
        if (hasFreezer == true) {
            return getBrand() + " Fridge with Freezer (" + getColour() + ", " + getWattage() + " watts) (" + getPrice() +
                    " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        // Without freezer
        else {
            return getBrand() + " Fridge (" + getColour() + ", " + getWattage() + " watts) (" + getPrice() +
                    " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
    }
}
