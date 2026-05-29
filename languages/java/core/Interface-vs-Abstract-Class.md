

# Interface vs Abstract Class

## What Are They?

Interface and Abstract Class are two mechanisms used to achieve abstraction in Java.

Both help define contracts and shared behavior, but they are designed for different use cases.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Object-Oriented Design |
| ⭐⭐⭐⭐⭐ | Spring Framework |
| ⭐⭐⭐⭐⭐ | Design Patterns |
| ⭐⭐⭐⭐ | Clean Architecture |
| ⭐⭐⭐⭐ | Interview Questions |

## Why They Exist

Applications often need:

- Common Behavior
- Shared Contracts
- Loose Coupling
- Extensible Design

Java provides:

```text
Interface
     ↓
Contract

Abstract Class
     ↓
Partial Implementation
```

## Interface

An interface defines what a class can do.

Example:

```java
public interface PaymentService {

    void processPayment();
}
```

Implementation:

```java
public class CreditCardPaymentService
        implements PaymentService {

    @Override
    public void processPayment() {
    }
}
```

## Abstract Class

An abstract class defines both:

- Common Behavior
- Abstract Methods

Example:

```java
public abstract class PaymentService {

    public void validate() {
    }

    public abstract void processPayment();
}
```

Implementation:

```java
public class CreditCardPaymentService
        extends PaymentService {

    @Override
    public void processPayment() {
    }
}
```

## Internal View

### Interface

```text
Contract
    ↓
Multiple Implementations
```

### Abstract Class

```text
Shared Logic
      ↓
Specialized Implementations
```

## Comparison

| Interface | Abstract Class |
| ---------- | -------------- |
| Contract | Partial Implementation |
| Supports Multiple Inheritance | Single Inheritance |
| No Instance Variables (Traditionally) | Can Have State |
| Loose Coupling | Shared Behavior |
| More Flexible | More Restrictive |

## Multiple Inheritance Support

Interface:

```java
interface A {}
interface B {}

class Demo implements A, B {
}
```

Abstract Class:

```java
class Demo extends A {
}
```

A class can extend only one abstract class.

## When To Use Interface

Use when:

- Multiple Implementations Exist
- Loose Coupling Is Important
- Defining Contracts
- Dependency Injection Is Required

Examples:

- PaymentService
- NotificationService
- StorageService

## When To Use Abstract Class

Use when:

- Shared Logic Exists
- Common State Exists
- Base Functionality Must Be Reused

Examples:

- BaseController
- AbstractProcessor
- AbstractValidator

## Spring Framework Example

Spring commonly uses interfaces.

```java
public interface PaymentService {
}
```

Implementation:

```java
@Service
public class StripePaymentService
        implements PaymentService {
}
```

Benefits:

- Loose Coupling
- Easy Testing
- Easy Replacement

## Design Pattern Mapping

Common interface-based patterns:

- Strategy Pattern
- Factory Pattern
- Adapter Pattern
- Command Pattern

Common abstract class usage:

- Template Method Pattern
- Framework Base Classes

## Production Engineering Perspective

Modern backend applications generally prefer:

```text
Interface
```

because it promotes:

- Loose Coupling
- Dependency Injection
- Better Testability
- Flexible Implementations

Abstract classes are useful when significant shared behavior exists.

## Quick Decision Guide

| Scenario | Choice |
| -------- | ------ |
| Multiple Implementations | Interface |
| Dependency Injection | Interface |
| Shared Logic | Abstract Class |
| Shared State | Abstract Class |
| Spring Service Design | Interface |
| Framework Base Class | Abstract Class |

## Common Interview Questions

1. Interface vs Abstract Class?
2. Can an interface have methods?
3. Can an abstract class have implemented methods?
4. Why are interfaces preferred in Spring?
5. Can a class implement multiple interfaces?
6. Can a class extend multiple abstract classes?
7. When should an abstract class be used?
8. When should an interface be used?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Interface defines a contract.
- Abstract class provides partial implementation.
- Interface supports multiple inheritance.
- Abstract class supports shared state and behavior.
- Spring heavily favors interfaces.
- Interfaces promote loose coupling.
- Abstract classes are useful for reusable base functionality.