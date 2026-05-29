package backend-engineering.design-patterns.behavioral.command;

public class CommandDesignPattern {

  public static void main(String[] args) {

    OrderService orderService = new OrderService();

    Command createOrderCommand = new CreateOrderCommand(orderService);

    CommandInvoker invoker = new CommandInvoker();
    invoker.execute(createOrderCommand);
  }
}

// Real-world examples:
// Job Scheduling
// Workflow Engines
// CQRS
// Kafka Message Processing

interface Command {
  void execute();
}

class CreateOrderCommand implements Command {

  private final OrderService orderService;

  public CreateOrderCommand(OrderService orderService) {
    this.orderService = orderService;
  }

  @Override
  public void execute() {
    orderService.createOrder();
  }
}

class OrderService {

  public void createOrder() {
    System.out.println("Order Created");
  }
}

class CommandInvoker {

  public void execute(Command command) {

    if (command == null) {
      throw new IllegalArgumentException("Command cannot be null.");
    }

    command.execute();
  }
}
