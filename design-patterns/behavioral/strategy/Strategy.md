# 🚀 Strategy Design Pattern

The **Strategy Design Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

---

## 📌 Intent

> **"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it."**

---

## ✅ When to Use

- You have multiple ways to perform a task (e.g., payment methods, sorting techniques).
- You want to switch between algorithms dynamically at runtime.
- You want to avoid `if-else` or `switch` statements based on behavior.
- You follow the **Open/Closed Principle** – easily extend without modifying existing code.

---

## 🧱 Structure

```text
+------------------+
|     Context      |
+------------------+
| - strategy: IS   |
+------------------+
| + setStrategy()  |
| + execute()      |
+------------------+
         |
         v
+------------------+        +------------------------+
|   IStrategy      |<-------|   ConcreteStrategyA     |
+------------------+        +------------------------+
| + execute()      |        | + execute()            |
+------------------+        +------------------------+
                            |   ConcreteStrategyB     |
                            | + execute()            |
                            +------------------------+

# Strategy Pattern

## What Is Strategy Pattern?

Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable.

The pattern allows behavior to be selected at runtime without modifying client code.

Instead of using large if-else or switch statements, behavior is delegated to strategy implementations.

## Why Strategy Pattern Matters

Strategy Pattern helps:

- Reduce conditional complexity
- Improve maintainability
- Support runtime behavior changes
- Simplify business rule implementation
- Improve extensibility

It is widely used in enterprise backend systems where multiple execution approaches exist.

## Problem Without Strategy Pattern

```java
if (paymentType.equals("CARD")) {
    // card payment
} else if (paymentType.equals("UPI")) {
    // upi payment
} else if (paymentType.equals("PAYPAL")) {
    // paypal payment
}
```

As new business rules are added, the conditional logic grows and becomes difficult to maintain.

## Solution Using Strategy Pattern

```text
Client
   ↓
Context
   ↓
Strategy Interface
   ↓
Concrete Strategy
```

The context delegates execution to the selected strategy.

## Core Components

### Strategy

Defines the algorithm contract.

```java
public interface PaymentStrategy {
    void pay(double amount);
}
```

### Concrete Strategy

```java
public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}
```

```java
public class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}
```

### Context

```java
public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        strategy.pay(amount);
    }
}
```

### Client

```java
PaymentContext context = new PaymentContext();

context.setStrategy(new CardPaymentStrategy());
context.processPayment(1000);
```

## Real Backend Examples

### Payment Processing

```text
Card Payment Strategy
UPI Payment Strategy
PayPal Payment Strategy
```

### Authentication Providers

```text
LDAP Strategy
OAuth Strategy
SAML Strategy
```

### Notification Systems

```text
Email Strategy
SMS Strategy
Push Strategy
```

### Pricing Engines

```text
Regular Pricing
Discount Pricing
Premium Pricing
```

### Recommendation Systems

```text
Collaborative Filtering
Content Based Filtering
Hybrid Recommendation
```

## Strategy Pattern vs State Pattern

| Feature | Strategy | State |
| -------- | -------- | ----- |
| Purpose | Select Algorithm | Manage State |
| Behavior Change | Client Driven | State Driven |
| State Awareness | No | Yes |
| Workflow Modeling | Limited | Strong |

## Strategy Pattern vs Command Pattern

| Feature | Strategy | Command |
| -------- | -------- | ------- |
| Purpose | Encapsulate Algorithm | Encapsulate Request |
| Focus | Behavior Selection | Action Execution |
| Queue Support | No | Yes |
| Undo Support | No | Yes |

## Advantages

- Open for extension
- Reduced conditional logic
- Better maintainability
- Runtime flexibility
- Easier testing
- Improved separation of concerns

## Disadvantages

- More classes
- Additional abstraction
- Can be excessive for simple logic

## Production Engineering Perspective

Strategy Pattern is useful for:

- Payment platforms
- Authentication systems
- Routing engines
- Recommendation systems
- Pricing engines
- Feature flag implementations
- Notification platforms
- Enterprise business rules

It is one of the most common patterns used in backend engineering.

## Interview Questions

1. What is Strategy Pattern?
2. What problem does Strategy Pattern solve?
3. Strategy Pattern vs State Pattern?
4. Strategy Pattern vs Command Pattern?
5. How does Strategy Pattern reduce conditional logic?
6. What are the core components?
7. When should Strategy Pattern be used?
8. What are common backend use cases?
9. What are the disadvantages?
10. When should Strategy Pattern be avoided?

## Quick Revision

- Strategy Pattern encapsulates algorithms.
- Behavior can change at runtime.
- Eliminates large if-else blocks.
- Context delegates execution.
- Supports Open/Closed Principle.
- Common in payment and authentication systems.
- Improves maintainability.
- Frequently asked in design pattern interviews.