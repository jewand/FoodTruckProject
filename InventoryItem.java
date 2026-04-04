/**
 * Jewand Graham
 * 04/01/2026
 * SDC330 Course Project Phase 1
 * This class stores inventory item information for the food truck application.
 */
public class InventoryItem {
    private int inventoryId;
    private String ingredientName;
    private int quantityInStock;
    private String unit;
    private int reorderLevel;

    public InventoryItem() {
        setInventoryId(0);
        setIngredientName("");
        setQuantityInStock(0);
        setUnit("");
        setReorderLevel(0);
    }

    public InventoryItem(int inventoryId, String ingredientName, int quantityInStock, String unit, int reorderLevel) {
        setInventoryId(inventoryId);
        setIngredientName(ingredientName);
        setQuantityInStock(quantityInStock);
        setUnit(unit);
        setReorderLevel(reorderLevel);
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        if (inventoryId >= 0) {
            this.inventoryId = inventoryId;
        } else {
            this.inventoryId = 0;
        }
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        if (ingredientName != null) {
            this.ingredientName = ingredientName;
        } else {
            this.ingredientName = "";
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            this.quantityInStock = 0;
        }
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        if (unit != null) {
            this.unit = unit;
        } else {
            this.unit = "";
        }
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel >= 0) {
            this.reorderLevel = reorderLevel;
        } else {
            this.reorderLevel = 0;
        }
    }

    public boolean isLowStock() {
        return quantityInStock <= reorderLevel;
    }

    @Override
    public String toString() {
        return "Inventory ID: " + inventoryId
                + "\nIngredient Name: " + ingredientName
                + "\nQuantity In Stock: " + quantityInStock
                + "\nUnit: " + unit
                + "\nReorder Level: " + reorderLevel
                + "\nLow Stock: " + isLowStock();
    }
}
