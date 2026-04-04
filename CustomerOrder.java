import java.util.ArrayList;

/**
 * Jewand Graham
 * 04/01/2026
 * SDC330 Course Project Phase 1
 * This class stores customer order summary information for the food truck application.
 */
public class CustomerOrder {
    private int orderId;
    private String orderDate;
    private double totalAmount;
    private ArrayList<OrderDetail> orderDetails;

    public CustomerOrder() {
        setOrderId(0);
        setOrderDate("");
        setTotalAmount(0.0);
        orderDetails = new ArrayList<>();
    }

    public CustomerOrder(int orderId, String orderDate) {
        setOrderId(orderId);
        setOrderDate(orderDate);
        setTotalAmount(0.0);
        orderDetails = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        if (orderId >= 0) {
            this.orderId = orderId;
        } else {
            this.orderId = 0;
        }
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        if (orderDate != null) {
            this.orderDate = orderDate;
        } else {
            this.orderDate = "";
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        } else {
            this.totalAmount = 0.0;
        }
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void addOrderDetail(OrderDetail detail) {
        if (detail != null) {
            orderDetails.add(detail);
            calculateTotal();
        }
    }

    public double calculateTotal() {
        double total = 0.0;

        for (OrderDetail detail : orderDetails) {
            total += detail.getLineTotal();
        }

        setTotalAmount(total);
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId
                + "\nOrder Date: " + orderDate
                + "\nTotal Amount: $" + String.format("%.2f", totalAmount)
                + "\nNumber of Items: " + orderDetails.size();
    }
}