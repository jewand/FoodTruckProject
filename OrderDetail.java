/**
 * Jewand Graham
 * 04/01/2026
 * SDC330 Course Project Phase 1
 * This class stores individual line item details for a customer order.
 */
public class OrderDetail {
    private int orderDetailId;
    private int orderId;
    private int itemId;
    private int quantity;
    private double lineTotal;

    public OrderDetail() {
        setOrderDetailId(0);
        setOrderId(0);
        setItemId(0);
        setQuantity(0);
        setLineTotal(0.0);
    }

    public OrderDetail(int orderDetailId, int orderId, int itemId, int quantity, double lineTotal) {
        setOrderDetailId(orderDetailId);
        setOrderId(orderId);
        setItemId(itemId);
        setQuantity(quantity);
        setLineTotal(lineTotal);
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        if (orderDetailId >= 0) {
            this.orderDetailId = orderDetailId;
        } else {
            this.orderDetailId = 0;
        }
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        if (lineTotal >= 0) {
            this.lineTotal = lineTotal;
        } else {
            this.lineTotal = 0.0;
        }
    }

    @Override
    public String toString() {
        return "Order Detail ID: " + orderDetailId
                + "\nOrder ID: " + orderId
                + "\nItem ID: " + itemId
                + "\nQuantity: " + quantity
                + "\nLine Total: $" + String.format("%.2f", lineTotal);
    }
}
