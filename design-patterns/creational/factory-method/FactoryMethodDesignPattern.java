package backend-engineering.design-patterns.creational.factory-method;

public class FactoryMethodDesignPattern {

  public static void main(String[] args) {

    PaymentService paymentService =
        PaymentFactory.create("UPI");

    paymentService.pay();
  }
}

// Real-world examples:
// Payment Providers
// Notification Providers
// Storage Providers
// Authentication Providers

interface PaymentService {
  void pay();
}

class UpiPaymentService implements PaymentService {

  @Override
  public void pay() {
    System.out.println("UPI Payment Processed");
  }
}

class CreditCardPaymentService implements PaymentService {

  @Override
  public void pay() {
    System.out.println("Credit Card Payment Processed");
  }
}

class PaymentFactory {

  public static PaymentService create(String type) {

    if ("UPI".equalsIgnoreCase(type)) {
      return new UpiPaymentService();
    }

    if ("CARD".equalsIgnoreCase(type)) {
      return new CreditCardPaymentService();
    }

    throw new IllegalArgumentException(
        "Unsupported payment type.");
  }
}
