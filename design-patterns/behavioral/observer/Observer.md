

# Observer Pattern

## What Is Observer Pattern?

Observer Pattern is a behavioral design pattern that defines a one-to-many relationship between objects.

When the state of one object changes, all dependent objects are automatically notified.

The pattern enables event-driven communication without creating tight coupling between components.

## Why Observer Pattern Matters

Observer Pattern helps:

- Build event-driven systems
- Reduce coupling between services
- Improve extensibility
- Support asynchronous workflows
- Simplify notification handling

It is widely used in backend systems, messaging platforms, monitoring solutions, and microservices.

## Problem Without Observer Pattern

```text
Order Service
      ↓
Email Service
      ↓
Notification Service
      ↓
Analytics Service
```

The source service becomes tightly coupled to every dependent service.

Adding new functionality often requires modifying existing code.

## Solution Using Observer Pattern

```text
Publisher
    ↓
 Event
    ↓
Observers
```

Observers subscribe to events and react independently.

## Core Components

### Subject

Maintains observers and publishes notifications.

```java
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
```

### Observer

Defines notification behavior.

```java
public interface Observer {
    void update(String event);
}
```

### Concrete Observer

```java
public class EmailObserver implements Observer {

    @Override
    public void update(String event) {
        System.out.println("Email notification: " + event);
    }
}
```

### Concrete Subject

```java
public class OrderPublisher implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update("Order Created"));
    }
}
```

## Real Backend Examples

### Order Processing

```text
Order Created
      ↓
Email Service
Analytics Service
Inventory Service
Audit Service
```

### Kafka Event Processing

```text
Kafka Topic
      ↓
Multiple Consumers
```

Each consumer behaves like an observer.

### Notification Platforms

```text
User Action
      ↓
Email Notification
Push Notification
SMS Notification
```

### Monitoring Systems

```text
CPU Threshold Breached
           ↓
Alert Service
Dashboard
Incident System
```

## Observer Pattern vs Pub/Sub

| Feature | Observer | Pub/Sub |
| -------- | -------- | -------- |
| Communication | Direct | Broker Based |
| Deployment Scope | Same Process | Distributed Systems |
| Coupling | Low | Very Low |
| Scalability | Moderate | High |
| Typical Usage | Application Level | System Level |

## Observer Pattern vs Event-Driven Architecture

| Feature | Observer | Event-Driven Architecture |
| -------- | -------- | ------------------------- |
| Scope | Design Pattern | Architecture Style |
| Communication | Object Level | Service Level |
| Complexity | Lower | Higher |
| Infrastructure | Not Required | Often Required |

## Advantages

- Loose coupling
- Easy extensibility
- Event-driven design
- Better maintainability
- Multiple listeners supported

## Disadvantages

- Difficult debugging in large systems
- Notification ordering challenges
- Potential performance overhead
- Risk of event storms

## Production Engineering Perspective

Observer Pattern is useful for:

- Event-driven architectures
- Domain events
- Notification systems
- Kafka-based processing
- Monitoring platforms
- Workflow engines
- Audit logging
- Reactive applications

The pattern is a foundational concept behind many modern backend architectures.

## Interview Questions

1. What is Observer Pattern?
2. What problem does Observer Pattern solve?
3. Observer vs Pub/Sub?
4. Observer vs Event-Driven Architecture?
5. What are the main components of Observer Pattern?
6. How does Observer Pattern reduce coupling?
7. Where is Observer Pattern used in backend systems?
8. How is Kafka related to Observer Pattern concepts?
9. What are the disadvantages of Observer Pattern?
10. When should Observer Pattern be avoided?

## Quick Revision

- Observer Pattern creates one-to-many relationships.
- Subjects publish events.
- Observers react to events.
- Reduces coupling.
- Supports event-driven workflows.
- Common in notifications and messaging systems.
- Foundation for many modern backend architectures.
- Frequently discussed in system design interviews.