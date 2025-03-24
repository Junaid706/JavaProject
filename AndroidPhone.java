//child class of inventoryitem
class AndroidPhone extends InventoryItem {
    public AndroidPhone(String brand, String model, double price, String description, int quantity) {
        super(brand, model, price, description, quantity);
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity;
    }
}
