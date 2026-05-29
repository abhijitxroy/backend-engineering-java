package backend-engineering.design-patterns.structural.facade;

public class FacadeDesignPattern {

  public static void main(String[] args) {

    OrderFacade orderFacade = new OrderFacade();

    orderFacade.placeOrder();
  }
}

// Real-world examples:
// Order Processing
// Checkout Flow
// API Aggregation
// Service Orchestration

class InventoryService {

  public void reserveInventory() {
    System.out.println("Inventory Reserved");
  }
}

class PaymentService {

  public void processPayment() {
    System.out.println("Payment Processed");
  }
}

class ShippingService {

  public void createShipment() {
    System.out.println("Shipment Created");
  }
}

class NotificationService {

  public void sendNotification() {
    System.out.println("Customer Notified");
  }
}

class OrderFacade {

  private final InventoryService inventoryService =
      new InventoryService();

  private final PaymentService paymentService =
      new PaymentService();

  private final ShippingService shippingService =
      new ShippingService();

  private final NotificationService notificationService =
      new NotificationService();

  public void placeOrder() {

    inventoryService.reserveInventory();
    paymentService.processPayment();
    shippingService.createShipment();
    notificationService.sendNotification();
  }
}
