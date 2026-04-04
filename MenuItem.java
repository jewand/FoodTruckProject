/**
 * Jewand Graham
 * 04/01/2026
 * SDC330 Course Project Phase 1
 * This class stores menu item information for the food truck application.
 */
public class MenuItem {
    private int itemId;
    private String itemName;
    private String category;
    private double price;
    private int quantityAvailable;

    public MenuItem() {
        setItemId(0);
        setItemName("");
        setCategory("");
        setPrice(0.0);
        setQuantityAvailable(0);
    }

    public MenuItem(int itemId, String itemName, String category, double price, int quantityAvailable) {
        setItemId(itemId);
        setItemName(itemName);
        setCategory(category);
        setPrice(price);
        setQuantityAvailable(quantityAvailable);
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        if (itemId >= 0) {
            this.itemId = itemId;
        } else {
            this.itemId = 0;
        }
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName != null) {
            this.itemName = itemName;
        } else {
            this.itemName = "";
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category != null) {
            this.category = category;
        } else {
            this.category = "";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable >= 0) {
            this.quantityAvailable = quantityAvailable;
        } else {
            this.quantityAvailable = 0;
        }
    }

    @Override
    public String toString() {
        return "Menu Item ID: " + itemId
                + "\nItem Name: " + itemName
                + "\nCategory: " + category
                + "\nPrice: $" + String.format("%.2f", price)
                + "\nQuantity Available: " + quantityAvailable;
    }
}