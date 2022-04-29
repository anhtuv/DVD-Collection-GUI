public class ToasterOven extends Appliances{
    private boolean convection;

    // Constructor for ToasterOven
    public ToasterOven(double price, int quantity, int wattage, String colour, String brand, boolean convection) {
        // super() calls the superclass Appliances' constructor
        super(price, quantity, wattage, colour, brand);
        this.convection = convection;
    }

    public String toString() {
        // With convection heating
        if (convection == true) {
            return getBrand() + " Toaster with convection (" + getColour() + ", " + getWattage() + " watts) (" + getPrice() +
                    " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        // Without convection heating
        else {
            return getBrand() + " Toaster (" + getColour() + ", " + getWattage() + " watts) (" + getPrice() + " dollars each, " +
                    getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
    }
}
