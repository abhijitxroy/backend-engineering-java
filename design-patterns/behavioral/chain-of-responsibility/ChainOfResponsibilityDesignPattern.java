package backend-engineering.design-patterns.behavioral.chain-of-responsibility;

public class ChainOfResponsibilityDesignPattern {

  public static void main(String[] args) {

    Handler validationHandler = new ValidationHandler();
    Handler authenticationHandler = new AuthenticationHandler();
    Handler loggingHandler = new LoggingHandler();

    validationHandler.setNext(authenticationHandler);
    authenticationHandler.setNext(loggingHandler);

    validationHandler.handle("Create Order Request");
  }
}

// Real-world examples:
// Spring Security Filter Chain
// API Gateway Filters
// Middleware Pipelines
// Request Validation

interface Handler {

  void setNext(Handler next);

  void handle(String request);
}

abstract class AbstractHandler implements Handler {

  protected Handler next;

  @Override
  public void setNext(Handler next) {
    this.next = next;
  }

  protected void next(String request) {
    if (next != null) {
      next.handle(request);
    }
  }
}

class ValidationHandler extends AbstractHandler {

  @Override
  public void handle(String request) {
    System.out.println("Validation Completed");
    next(request);
  }
}

class AuthenticationHandler extends AbstractHandler {

  @Override
  public void handle(String request) {
    System.out.println("Authentication Completed");
    next(request);
  }
}

class LoggingHandler extends AbstractHandler {

  @Override
  public void handle(String request) {
    System.out.println("Request Logged");
    next(request);
  }
}
