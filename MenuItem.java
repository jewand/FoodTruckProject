/**
 * Jewand Graham
 * 04/04/2026
 * SDC330 Course Project Phase 2
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
        this.itemId = Math.max(itemId, 0);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = (itemName != null) ? itemName : "";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = (category != null) ? category : "";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0);
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = Math.max(quantityAvailable, 0);
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId
                + "\nItem Name: " + itemName
                + "\nCategory: " + category
                + "\nPrice: $" + String.format("%.2f", price)
                + "\nQuantity Available: " + quantityAvailable;
    }
}