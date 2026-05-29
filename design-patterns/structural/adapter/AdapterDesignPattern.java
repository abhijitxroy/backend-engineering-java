package backend-engineering.design-patterns.structural.adapter;

public class AdapterDesignPattern {

  public static void main(String[] args) {

    PaymentService paymentService =
        new StripeAdapter(new StripeClient());

    paymentService.pay();
  }
}

// Real-world examples:
// Third-Party SDK Integration
// Payment Providers
// Cloud Providers
// Legacy System Integration

interface PaymentService {
  void pay();
}

class StripeClient {

  public void makePayment() {
    System.out.println("Stripe Payment Processed");
  }
}

class StripeAdapter implements PaymentService {

  private final StripeClient stripeClient;

  public StripeAdapter(StripeClient stripeClient) {
    this.stripeClient = stripeClient;
  }

  @Override
  public void pay() {
    stripeClient.makePayment();
  }
}
