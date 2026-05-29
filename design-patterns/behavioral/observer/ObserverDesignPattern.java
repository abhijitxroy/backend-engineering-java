package backend-engineering.design-patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {

  public static void main(String[] args) {

    OrderPublisher publisher = new OrderPublisher();

    publisher.addObserver(new EmailObserver());
    publisher.addObserver(new AnalyticsObserver());

    publisher.createOrder();
  }
}

// Real-world examples:
// Kafka Consumers
// Notification Systems
// Domain Events
// Monitoring Systems

interface Observer {
  void update(String event);
}

class EmailObserver implements Observer {

  @Override
  public void update(String event) {
    System.out.println("Email Notification: " + event);
  }
}

class AnalyticsObserver implements Observer {

  @Override
  public void update(String event) {
    System.out.println("Analytics Updated: " + event);
  }
}

class OrderPublisher {

  private final List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void createOrder() {
    System.out.println("Order Created");
    notifyObservers("Order Created Event");
  }

  private void notifyObservers(String event) {
    for (Observer observer : observers) {
      observer.update(event);
    }
  }
}
