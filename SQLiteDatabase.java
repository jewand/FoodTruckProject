import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Jewand Graham
 * 04/04/2026
 * SDC330 Course Project Phase 2
 * This class handles the SQLite database connection and table creation.
 */
public class SQLiteDatabase {
    private static final String DB_URL = "jdbc:sqlite:foodtruck.db";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to database successfully.");
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return conn;
    }

    public void createMenuItemTable() {
        String sql = "CREATE TABLE IF NOT EXISTS MenuItems ("
                + "item_id INTEGER PRIMARY KEY, "
                + "item_name TEXT NOT NULL, "
                + "category TEXT NOT NULL, "
                + "price REAL NOT NULL, "
                + "quantity_available INTEGER NOT NULL"
                + ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("MenuItems table ready.");
        } catch (SQLException e) {
            System.out.println("Table creation error: " + e.getMessage());
        }
    }
}
