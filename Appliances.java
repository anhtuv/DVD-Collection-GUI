public abstract class Appliances extends Product {
    private int wattage;
    private String colour;
    private String brand;

    // Constructor (Fridge/ToasterOven classes have in common)
    public Appliances (double price, int quantity, int wattage, String colour, String brand){
        // super() calls the superclass Products' constructor
        super(price, quantity);
        this.wattage = wattage;
        this.colour = colour;
        this.brand = brand;
    }

    // Get methods
    public int getWattage() { return wattage; }
    public String getColour() { return colour; }
    public String getBrand() { return brand; }
}
