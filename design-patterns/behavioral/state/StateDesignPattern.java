package backend-engineering.design-patterns.behavioral.state;

public class StateDesignPattern {

  public static void main(String[] args) {

    OrderContext order = new OrderContext(new CreatedState());

    order.process();
    order.process();
    order.process();
  }
}

// Real-world examples:
// Order Lifecycle
// Approval Workflows
// Ticketing Systems
// CI/CD Pipelines

interface OrderState {
  void process(OrderContext context);
}

class CreatedState implements OrderState {

  @Override
  public void process(OrderContext context) {
    System.out.println("Order Approved");
    context.setState(new ApprovedState());
  }
}

class ApprovedState implements OrderState {

  @Override
  public void process(OrderContext context) {
    System.out.println("Order Shipped");
    context.setState(new ShippedState());
  }
}

class ShippedState implements OrderState {

  @Override
  public void process(OrderContext context) {
    System.out.println("Order Delivered");
  }
}

class OrderContext {

  private OrderState state;

  public OrderContext(OrderState state) {
    this.state = state;
  }

  public void setState(OrderState state) {
    this.state = state;
  }

  public void process() {

    if (state == null) {
      throw new IllegalStateException("Order state not configured.");
    }

    state.process(this);
  }
}
