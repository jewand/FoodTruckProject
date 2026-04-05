import java.util.Scanner;

/**
 * Jewand Graham
 * 04/04/2026
 * SDC330 Course Project Phase 2
 * This class runs the Food Truck Management System and allows user input for CRUD operations.
 */
public class FoodTruckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SQLiteDatabase db = new SQLiteDatabase();
        MenuItemDAO dao = new MenuItemDAO();

        db.createMenuItemTable();

        int choice;

        do {
            System.out.println("\nJewand Graham - Course Project Phase 2");
            System.out.println("Food Truck Management System");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View All Menu Items");
            System.out.println("3. Update Menu Item");
            System.out.println("4. Delete Menu Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Item Name: ");
                    String addName = scanner.nextLine();

                    System.out.print("Enter Category: ");
                    String addCategory = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double addPrice = scanner.nextDouble();

                    System.out.print("Enter Quantity Available: ");
                    int addQty = scanner.nextInt();
                    scanner.nextLine();

                    MenuItem newItem = new MenuItem(addId, addName, addCategory, addPrice, addQty);
                    dao.createMenuItem(newItem);
                    break;

                case 2:
                    dao.readAllMenuItems();
                    break;

                case 3:
                    System.out.print("Enter Item ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Item Name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter New Category: ");
                    String updateCategory = scanner.nextLine();

                    System.out.print("Enter New Price: ");
                    double updatePrice = scanner.nextDouble();

                    System.out.print("Enter New Quantity Available: ");
                    int updateQty = scanner.nextInt();
                    scanner.nextLine();

                    MenuItem updatedItem = new MenuItem(updateId, updateName, updateCategory, updatePrice, updateQty);
                    dao.updateMenuItem(updatedItem);
                    break;

                case 4:
                    System.out.print("Enter Item ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    dao.deleteMenuItem(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
