//Main class
import javax.swing.JOptionPane;
public class InventorySystem {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addItem(new AndroidPhone("Samsung", "Galaxy S21", 999.99, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Samsung", "Galaxy S20", 799.99, "Android smartphone", 5));
        inventory.addItem(new AndroidPhone("Xiaomi", "Redmi Note 10", 299.99, "Android smartphone", 8));
        inventory.addItem(new AndroidPhone("Sony", "Xperia 1 III", 1199.99, "Android smartphone", 3));
        inventory.addItem(new IPhone("Apple", "iPhone 12", 1099.99, "iOS smartphone", 7));
        inventory.addItem(new IPhone("Apple", "iPhone 11", 699.99, "iOS smartphone", 4));
        inventory.addItem(new AndroidPhone("Opp", "A50", 493.99, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Vivo", "Y20", 200.99, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Samsung", " Galaxt A05s", 250.99, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("One plus", "Ai Note", 400.00, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Symphony", "tR 67", 178.99, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Google", "Pixel 7 pro", 650.34, "Android smartphone", 10));
        inventory.addItem(new AndroidPhone("Redmi", "Note 9", 64.99, "Android smartphone", 10));


        String[] options = {"View Inventory", "Add Item", "Remove Item", "Filter by Price","Purchase Item", "Exit"};
        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Select an option:", "Inventory System", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    inventory.displayInventory();
                    break;
                case 1:
                    addNewItem(inventory);
                    break;
                case 2:
                    removeItem(inventory);
                    break;
                case 3:
                    purchaseItem(inventory);
                    break;
                case 4:
                    filterByPrice(inventory);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Exiting inventory system.");
                    System.exit(0);
            }
        }
    }

    private static void addNewItem(Inventory inventory) {
        String brand = JOptionPane.showInputDialog(null, "Enter brand:");
        String model = JOptionPane.showInputDialog(null, "Enter model:");
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price:"));
        String description = JOptionPane.showInputDialog(null, "Enter description:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity:"));

        String phoneType = JOptionPane.showInputDialog(null, "Enter phone type (Android/iPhone):");
        if (phoneType.equalsIgnoreCase("Android")) {
            inventory.addItem(new AndroidPhone(brand, model, price, description, quantity));
        } else if (phoneType.equalsIgnoreCase("iPhone")) {
            inventory.addItem(new IPhone(brand, model, price, description, quantity));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid phone type.");
        }
        JOptionPane.showMessageDialog(null, "Item added successfully.");
    }

    private static void removeItem(Inventory inventory) {
        String modelToRemove = JOptionPane.showInputDialog(null, "Enter model to remove:");
        inventory.removeItem(modelToRemove);
    }

    private static void purchaseItem(Inventory inventory) {
        String model = JOptionPane.showInputDialog(null, "Enter model of the item to purchase:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity to purchase:"));
        inventory.purchaseItem(model, quantity);
    }

    private static void filterByPrice(Inventory inventory) {
        double minPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter minimum price:"));
        double maxPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter maximum price:"));

    }
}