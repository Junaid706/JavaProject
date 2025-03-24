import java.util.ArrayList;
import javax.swing.JOptionPane;

class Inventory {
    private ArrayList<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void removeItem(String model) {
        for (InventoryItem item : items) {
            if (item.getModel().equals(model)) {
                items.remove(item);
                JOptionPane.showMessageDialog(null, "Item with model " + model + " removed successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Item with model " + model + " not found.");
    }

    public InventoryItem getItemByModel(String model) {
        for (InventoryItem item : items) {
            if (item.getModel().equals(model)) {
                return item;
            }
        }
        return null;
    }

    public void displayInventory() {
        StringBuilder inventoryList = new StringBuilder("Inventory:\n");
        for (InventoryItem item : items) {
            inventoryList.append("Model: ").append(item.getModel()).append(", Brand: ").append(item.getBrand()).append(", Price: $").append(item.getPrice()).append(", Quantity: ").append(item.getQuantity()).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventoryList.toString());
    }

    public void purchaseItem(String model, int quantity) {
        InventoryItem item = getItemByModel(model);
        if (item != null) {
            if (item.getQuantity() >= quantity) {
                item.setQuantity(item.getQuantity() - quantity);
                double totalPrice = item.getPrice() * quantity;
                JOptionPane.showMessageDialog(null, "Purchase successful!\nTotal Price: $" + totalPrice);
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity of item " + model + " in stock.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Item with model " + model + " not found.");
        }
    }
}
