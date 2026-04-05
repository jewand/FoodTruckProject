import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Jewand Graham
 * 04/04/2026
 * SDC330 Course Project Phase 2
 * This class performs CRUD operations for MenuItem records.
 */
public class MenuItemDAO {
    private SQLiteDatabase database;

    public MenuItemDAO() {
        database = new SQLiteDatabase();
    }

    public void createMenuItem(MenuItem item) {
        String sql = "INSERT INTO MenuItems(item_id, item_name, category, price, quantity_available) "
                   + "VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, item.getItemId());
            pstmt.setString(2, item.getItemName());
            pstmt.setString(3, item.getCategory());
            pstmt.setDouble(4, item.getPrice());
            pstmt.setInt(5, item.getQuantityAvailable());

            pstmt.executeUpdate();
            System.out.println("Menu item added successfully.");

        } catch (SQLException e) {
            System.out.println("Create error: " + e.getMessage());
        }
    }

    public void readAllMenuItems() {
        String sql = "SELECT * FROM MenuItems";

        try (Connection conn = database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println("--------------------");
                System.out.println("Item ID: " + rs.getInt("item_id"));
                System.out.println("Item Name: " + rs.getString("item_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: $" + String.format("%.2f", rs.getDouble("price")));
                System.out.println("Quantity Available: " + rs.getInt("quantity_available"));
            }

            if (!found) {
                System.out.println("No menu items found.");
            }

        } catch (SQLException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }

    public void updateMenuItem(MenuItem item) {
        String sql = "UPDATE MenuItems SET item_name = ?, category = ?, price = ?, quantity_available = ? "
                   + "WHERE item_id = ?";

        try (Connection conn = database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, item.getItemName());
            pstmt.setString(2, item.getCategory());
            pstmt.setDouble(3, item.getPrice());
            pstmt.setInt(4, item.getQuantityAvailable());
            pstmt.setInt(5, item.getItemId());

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Menu item updated successfully.");
            } else {
                System.out.println("Menu item not found.");
            }

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public void deleteMenuItem(int itemId) {
        String sql = "DELETE FROM MenuItems WHERE item_id = ?";

        try (Connection conn = database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, itemId);
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Menu item deleted successfully.");
            } else {
                System.out.println("Menu item not found.");
            }

        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }
}