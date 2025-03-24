abstract class InventoryItem implements MobilePhone {
    private String brand;
    private String model;
    private double price;
    private String description;
    private int quantity;

    public InventoryItem(String brand, String model, double price, String description, int quantity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice(int quantity);
}
