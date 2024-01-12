package hashmaps;

public class InventoryItem {
    private String description;
    private int inventoryCount;
    
    public InventoryItem(String description, int inventoryCount) {
        this.description = description;
        this.inventoryCount = inventoryCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    
}
