

# Composition vs Inheritance

## What Are They?

Composition and Inheritance are two fundamental approaches for code reuse and object-oriented design.

### Inheritance

Inheritance creates an "is-a" relationship.

Example:

```java
class Animal {
}

class Dog extends Animal {
}
```

```text
Dog is an Animal
```

### Composition

Composition creates a "has-a" relationship.

Example:

```java
class Engine {
}

class Car {

    private Engine engine;
}
```

```text
Car has an Engine
```

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Object-Oriented Design |
| ⭐⭐⭐⭐⭐ | System Design |
| ⭐⭐⭐⭐⭐ | Design Patterns |
| ⭐⭐⭐⭐ | Spring Applications |
| ⭐⭐⭐⭐ | Maintainable Code |

## Why It Matters

Poor use of inheritance can create:

```text
Tight Coupling
Rigid Design
Deep Class Hierarchies
```

Composition provides:

```text
Flexibility
Reusability
Loose Coupling
```

## Inheritance Example

```java
class Vehicle {

    void start() {
    }
}

class Car extends Vehicle {
}
```

Benefits:

- Simple Reuse
- Easy To Understand

Problems:

- Tight Coupling
- Difficult To Change
- Deep Hierarchies Become Complex

## Composition Example

```java
class Engine {

    void start() {
    }
}

class Car {

    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }
}
```

Benefits:

- Flexible Design
- Better Testability
- Easier Maintenance

## Internal Relationship

### Inheritance

```text
Car
 ↓
extends
 ↓
Vehicle
```

### Composition

```text
Car
 ↓
has-a
 ↓
Engine
```

## Comparison

| Inheritance | Composition |
| ----------- | ----------- |
| Is-A Relationship | Has-A Relationship |
| Tight Coupling | Loose Coupling |
| Compile-Time Relationship | Runtime Flexibility |
| Less Flexible | More Flexible |
| Deep Hierarchies Possible | Easier Maintenance |

## Composition Over Inheritance

A common object-oriented design principle is:

```text
Favor Composition Over Inheritance
```

Reason:

```text
Flexible Design
Better Reusability
Lower Coupling
```

## Design Pattern Mapping

Many design patterns use composition:

- Strategy Pattern
- Decorator Pattern
- Adapter Pattern
- Bridge Pattern

Example:

```text
Service
   ↓
Logger
   ↓
Metrics
```

Composition makes behavior easier to change.

## Spring Framework Usage

Spring heavily favors composition.

Example:

```java
@Service
class OrderService {

    private final PaymentService paymentService;

    private final NotificationService notificationService;
}
```

```text
OrderService has-a PaymentService
OrderService has-a NotificationService
```

## Real-World Usage

### Inheritance

Used for:

- Domain Hierarchies
- Framework Base Classes
- Common Behavior Sharing

### Composition

Used for:

- Services
- Microservices
- Dependency Injection
- Design Patterns

## Production Engineering Perspective

Modern backend systems strongly prefer:

```text
Composition
```

because it produces:

- Loosely Coupled Systems
- Better Testability
- Easier Refactoring
- Better Maintainability

## Common Interview Questions

1. Composition vs Inheritance?
2. What is an Is-A relationship?
3. What is a Has-A relationship?
4. Why is composition preferred?
5. What does 'Favor Composition Over Inheritance' mean?
6. Which design patterns use composition?
7. How does Spring use composition?
8. When should inheritance be used?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Inheritance represents an Is-A relationship.
- Composition represents a Has-A relationship.
- Composition provides loose coupling.
- Inheritance can create rigid hierarchies.
- Modern applications prefer composition.
- Spring heavily uses composition through dependency injection.
- Favor Composition Over Inheritance is a core design principle.