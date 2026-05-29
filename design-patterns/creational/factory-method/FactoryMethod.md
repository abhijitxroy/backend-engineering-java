

# Factory Method Pattern

## What Is Factory Method Pattern?

Factory Method is a creational design pattern that provides a method for creating objects without exposing the object creation logic to the client.

Instead of creating objects using the `new` keyword directly, object creation is delegated to a factory.

This helps reduce coupling between clients and concrete implementations.

## Why Factory Method Matters

Factory Method helps:

- Centralize object creation
- Reduce coupling
- Improve maintainability
- Simplify implementation switching
- Support Open/Closed Principle

It is one of the most important and commonly used creational patterns in backend applications.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Payment Providers |
| ⭐⭐⭐⭐⭐ | Notification Providers |
| ⭐⭐⭐⭐⭐ | Storage Providers |
| ⭐⭐⭐⭐⭐ | Database Drivers |
| ⭐⭐⭐⭐ | Authentication Providers |

## Problem Without Factory Method

Without Factory Method:

```java
PaymentService paymentService =
    new CreditCardPaymentService();
```

Changing implementations requires modifying client code.

## Solution Using Factory Method

```text
Client
   ↓
Factory
   ↓
Concrete Object
```

The client asks the factory for an object instead of creating it directly.

## Core Components

### Product

```java
public interface PaymentService {
    void pay();
}
```

### Concrete Product

```java
public class UpiPaymentService
        implements PaymentService {

    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}
```

### Factory

```java
public class PaymentFactory {

    public static PaymentService create() {
        return new UpiPaymentService();
    }
}
```

## Real Backend Examples

### Payment Providers

```text
UPI
Credit Card
PayPal
Stripe
```

### Notification Providers

```text
Email
SMS
Push Notification
```

### Storage Providers

```text
S3
Azure Blob
Google Cloud Storage
```

### Authentication Providers

```text
LDAP
OAuth2
SAML
```

## Factory Method vs Builder

| Feature | Factory Method | Builder |
| -------- | -------------- | ------- |
| Purpose | Create Objects | Build Complex Objects |
| Complexity | Low | Medium/High |
| Creation Steps | Single Step | Multiple Steps |
| Readability | Medium | High |

## Factory Method vs Abstract Factory

| Feature | Factory Method | Abstract Factory |
| -------- | -------------- | ---------------- |
| Objects Created | One Object | Family of Objects |
| Complexity | Lower | Higher |
| Use Case | Single Provider | Multiple Related Providers |

## Advantages

- Loose coupling
- Centralized creation logic
- Easier maintenance
- Easy implementation replacement
- Better extensibility

## Disadvantages

- Additional classes
- Can become complex if overused

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Bean Creation | BeanFactory |
| Object Creation | FactoryBean |
| Dependency Injection | ApplicationContext |

## Production Engineering Perspective

Factory Method is heavily used in:

- Spring Framework
- Payment Systems
- Authentication Systems
- Notification Platforms
- Storage Platforms
- Database Drivers
- Enterprise Applications

If an application supports multiple interchangeable implementations, Factory Method is usually a strong candidate.

## Interview Questions

1. What is Factory Method Pattern?
2. What problem does it solve?
3. Factory Method vs Builder?
4. Factory Method vs Abstract Factory?
5. What are common backend use cases?
6. How does it reduce coupling?
7. How is it used in Spring?
8. What are its advantages and disadvantages?
9. When should it be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Creates objects without exposing creation logic.
- Reduces coupling.
- Centralizes object creation.
- Common in payment, storage, and notification providers.
- BeanFactory is a well-known Spring example.
- One of the most important creational patterns.
- Frequently asked in backend interviews.