/**
 * Jewand Graham
 * 04/01/2026
 * SDC330 Course Project Phase 1
 * This class runs the food truck application and demonstrates the project classes.
 */
public class FoodTruckApp {
    public static void main(String[] args) {
        System.out.println("Jewand Graham - Course Project Phase 1");
        System.out.println("Food Truck Management System");
        System.out.println();

        MenuItem item1 = new MenuItem(1, "Cheeseburger", "Main Item", 8.99, 25);
        MenuItem item2 = new MenuItem(2, "Fries", "Side", 3.49, 40);

        InventoryItem inventory1 = new InventoryItem(1, "Burger Patties", 10, "count", 8);
        InventoryItem inventory2 = new InventoryItem(2, "Potatoes", 50, "count", 20);

        OrderDetail detail1 = new OrderDetail(1, 1001, 1, 2, 17.98);
        OrderDetail detail2 = new OrderDetail(2, 1001, 2, 1, 3.49);

        CustomerOrder order1 = new CustomerOrder(1001, "04/03/2026");
        order1.addOrderDetail(detail1);
        order1.addOrderDetail(detail2);

        System.out.println("MENU ITEMS");
        System.out.println(item1);
        System.out.println();
        System.out.println(item2);
        System.out.println();

        System.out.println("INVENTORY ITEMS");
        System.out.println(inventory1);
        System.out.println();
        System.out.println(inventory2);
        System.out.println();

        System.out.println("ORDER DETAILS");
        System.out.println(detail1);
        System.out.println();
        System.out.println(detail2);
        System.out.println();

        System.out.println("CUSTOMER ORDER");
        System.out.println(order1);
    }
}
