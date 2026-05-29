

# Coupling vs Cohesion

## What Are They?

Coupling and Cohesion are fundamental software design concepts used to evaluate the quality of a system design.

A good design aims for:

```text
Low Coupling
High Cohesion
```

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | System Design |
| ⭐⭐⭐⭐⭐ | Microservices |
| ⭐⭐⭐⭐⭐ | Maintainable Code |
| ⭐⭐⭐⭐ | Spring Applications |
| ⭐⭐⭐⭐ | Scalable Systems |

## What Is Coupling?

Coupling measures how strongly one component depends on another component.

### Tight Coupling

```java
class OrderService {

    private PaymentService paymentService =
            new PaymentService();
}
```

Problems:

- Difficult To Change
- Difficult To Test
- Difficult To Extend

### Loose Coupling

```java
class OrderService {

    private final PaymentService paymentService;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

Benefits:

- Easier Testing
- Easier Maintenance
- Better Flexibility

## What Is Cohesion?

Cohesion measures how closely related the responsibilities inside a module are.

### High Cohesion

```java
class PaymentService {

    void processPayment() {
    }

    void validatePayment() {
    }

    void refundPayment() {
    }
}
```

All methods belong to the same responsibility.

### Low Cohesion

```java
class UtilityService {

    void processPayment() {
    }

    void sendEmail() {
    }

    void generateReport() {
    }
}
```

Multiple unrelated responsibilities exist.

## Internal View

### Coupling

```text
Service A
    ↓
Service B
```

Measures dependency between modules.

### Cohesion

```text
Methods
    ↓
Inside Same Class
```

Measures relationship within a module.

## Comparison

| Coupling | Cohesion |
| -------- | -------- |
| Relationship Between Modules | Relationship Within Module |
| External Focus | Internal Focus |
| Lower Is Better | Higher Is Better |
| Dependency Measurement | Responsibility Measurement |

## Good Design Principle

```text
Low Coupling
       +
High Cohesion
       =
Maintainable System
```

## Spring Framework Example

```java
@Service
class OrderService {

    private final PaymentService paymentService;

    private final NotificationService notificationService;
}
```

Benefits:

- Loose Coupling via Dependency Injection
- High Cohesion within each service

## Microservices Example

### High Cohesion

```text
Payment Service
    ↓
Payment Operations Only
```

### Low Cohesion

```text
Payment Service
    ↓
Payments
Emails
Reports
Users
```

The second design becomes difficult to maintain.

## Real-World Usage

### Low Coupling

Used in:

- Spring Dependency Injection
- Microservices
- Design Patterns
- Plugin Architectures

### High Cohesion

Used in:

- Service Design
- Domain Modeling
- Clean Architecture

## Production Engineering Perspective

Modern backend systems aim for:

- Independent Components
- Clear Responsibilities
- Easy Testing
- Easy Deployment

These goals are achieved through:

```text
Low Coupling
High Cohesion
```

## Quick Decision Guide

| Scenario | Recommendation |
| -------- | -------------- |
| Service Depends On Another Service | Loose Coupling |
| Multiple Responsibilities In One Class | Increase Cohesion |
| Spring Bean Design | Low Coupling |
| Microservice Boundaries | High Cohesion |
| Design Pattern Implementation | Low Coupling |

## Common Interview Questions

1. What is Coupling?
2. What is Cohesion?
3. Low Coupling vs High Coupling?
4. High Cohesion vs Low Cohesion?
5. Why is Low Coupling preferred?
6. Why is High Cohesion preferred?
7. How does Spring achieve loose coupling?
8. How are coupling and cohesion related?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Coupling measures dependency between modules.
- Cohesion measures responsibility within a module.
- Low Coupling is preferred.
- High Cohesion is preferred.
- Spring Dependency Injection promotes loose coupling.
- High cohesion creates focused, maintainable services.
- Good software design aims for Low Coupling and High Cohesion.