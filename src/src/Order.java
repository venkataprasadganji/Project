package src;

import java.time.LocalDate;

enum OrderStatus {
    PaymentPending,
    Transit,
    Delivered
}

class Order {
    private String orderId;
    private Vehicle vehicle;
    private String userId;
    private OrderStatus status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    public Order(String orderId, Vehicle vehicle, String userId, OrderStatus status, LocalDate orderDate,
            LocalDate deliveryDate) {
        this.orderId = orderId;
        this.vehicle = vehicle;
        this.userId = userId;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public OrderStatus trackOrder() {
        switch (status) {
            case Delivered:
            System.out.println("Delivered!!");
                break;
            case PaymentPending:
            System.out.println("Payment is pending!!");
                break;
            case Transit:
            System.out.println("Vehicle in Transit and will be delivered soon!!");
                break;
            default:
                System.out.println("Status Unknown!!");
            break;
        }
        return status;
    }

}