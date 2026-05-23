package behavioral.strategy;

// Client Code
public class StrategyDesignPattern {
  public static void main(String[] args) {
    OnlineShoppingCart cart = new OnlineShoppingCart();
    cart.setPaymentStrategy(new CashPaymentStrategy());
    cart.checkout(1000);

    cart.setPaymentStrategy(new UpiPaymentStrategy());
    cart.checkout(800);
  }
}

// Strategy Interface
interface PaymentStrategy {
  void pay(double amount);
}

// Concrete Strategies-1
class CashPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Cash.");
  }
}

// Concrete Strategies-2
class CreditCardPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Credit Card.");
  }
}

// Concrete Strategies-3
class UpiPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using UPI.");
  }
}

// Context
class OnlineShoppingCart {
  private PaymentStrategy paymentStrategy;

  // setter method for payment strategy
  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(double amount) {
    paymentStrategy.pay(amount);
  }
}