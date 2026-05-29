

package backend-engineering.design-patterns.structural.decorator;

public class DecoratorDesignPattern {

  public static void main(String[] args) {

    NotificationService notificationService =
        new LoggingDecorator(
            new AuthenticationDecorator(
                new EmailNotificationService()));

    notificationService.send();
  }
}

// Real-world examples:
// Logging
// Metrics
// Authentication
// Request/Response Wrappers

interface NotificationService {
  void send();
}

class EmailNotificationService
    implements NotificationService {

  @Override
  public void send() {
    System.out.println("Email Sent");
  }
}

abstract class NotificationDecorator
    implements NotificationService {

  protected final NotificationService notificationService;

  protected NotificationDecorator(
      NotificationService notificationService) {
    this.notificationService = notificationService;
  }
}

class LoggingDecorator
    extends NotificationDecorator {

  public LoggingDecorator(
      NotificationService notificationService) {
    super(notificationService);
  }

  @Override
  public void send() {
    System.out.println("Logging Request");
    notificationService.send();
  }
}

class AuthenticationDecorator
    extends NotificationDecorator {

  public AuthenticationDecorator(
      NotificationService notificationService) {
    super(notificationService);
  }

  @Override
  public void send() {
    System.out.println("Authenticating Request");
    notificationService.send();
  }
}