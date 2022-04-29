public abstract class Computers extends Product {
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    // Constructor (Laptop/Desktop classes have in common)
    public Computers (double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage) {
        // super() calls the superclass Products' constructor
        super(price, quantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.ssd = ssd;
        this.storage = storage;
    }

    // Get methods
    public double getCpuSpeed() { return cpuSpeed; }
    public int getRam() { return ram; }
    public boolean getSsd() { return ssd; }
    public int getStorage() { return storage; }
}
