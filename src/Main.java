class Order {
    private String productName;
    private int quantity;
    private double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

class OrderCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}

class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }
}

class NotificationSender {
    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Телефон", 1, 500);
        OrderCalculator calculator = new OrderCalculator();
        double totalPrice = calculator.calculateTotalPrice(order);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("PayPal");

        NotificationSender notificationSender = new NotificationSender();
        notificationSender.sendConfirmationEmail("john.doe@example.com");
    }
}
