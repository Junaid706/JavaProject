class IPhone extends InventoryItem {
    public IPhone(String brand, String model, double price, String description, int quantity) {
        super(brand, model, price, description, quantity);
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity;
    }
}