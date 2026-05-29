

# Sealed Classes

## Overview

Sealed Classes were introduced to provide controlled inheritance.

Before Java 17, any class could extend a parent class unless it was declared as final.

Sealed Classes allow developers to explicitly define which classes are permitted to extend a parent class.

## Why Sealed Classes Were Introduced

Traditional inheritance can become difficult to control.

Example:

```java
public abstract class Shape {
}
```

Any class can extend it:

```java
class Circle extends Shape {}
class Rectangle extends Shape {}
class Triangle extends Shape {}
class RandomShape extends Shape {}
```

Problems:

- Uncontrolled Inheritance
- Difficult Domain Modeling
- Harder Maintenance

## Java 17 Solution

```java
public sealed class Shape
        permits Circle, Rectangle {
}
```

Only:

```java
Circle
Rectangle
```

can extend Shape.

## Permitted Subclasses

```java
public sealed class Shape
        permits Circle, Rectangle {
}
```

```java
public final class Circle extends Shape {
}
```

```java
public final class Rectangle extends Shape {
}
```

## Rules For Subclasses

Every permitted subclass must declare one of:

### final

```java
public final class Circle extends Shape {
}
```

Cannot be extended further.

### sealed

```java
public sealed class Rectangle
        extends Shape
        permits Square {
}
```

Inheritance remains controlled.

### non-sealed

```java
public non-sealed class Rectangle
        extends Shape {
}
```

Removes inheritance restrictions.

## Sealed Class vs Abstract Class

| Sealed Class | Abstract Class |
| ------------ | -------------- |
| Controlled Inheritance | Open Inheritance |
| Explicit Subclass List | No Restrictions |
| Better Domain Modeling | Generic Hierarchy |
| More Restrictive | More Flexible |

## Real Production Example

Payment Processing:

```java
public sealed interface Payment
        permits CardPayment,
                UpiPayment,
                NetBankingPayment {
}
```

```java
public record CardPayment(
        String cardNumber
) implements Payment {
}
```

```java
public record UpiPayment(
        String upiId
) implements Payment {
}
```

Benefits:

- Known Payment Types
- Better Validation
- Safer Business Logic
- Easier Maintenance

## Records And Sealed Classes

Very common Java 17 combination:

```java
public sealed interface Payment
        permits CardPayment, UpiPayment {
}

public record CardPayment(
        String cardNumber
) implements Payment {
}

public record UpiPayment(
        String upiId
) implements Payment {
}
```

## Production Engineering Perspective

### Common Use Cases

- Payment Systems
- Order State Modeling
- Event Processing
- Domain Driven Design
- Workflow Engines

### Advantages

- Strong Domain Modeling
- Better Type Safety
- Controlled Inheritance
- Easier Maintenance

### Limitations

- Less Flexible
- Not Suitable For Plugin Architectures
- Requires Explicit Design

## Most Asked Interview Questions

1. What are Sealed Classes?
2. Why were Sealed Classes introduced?
3. Sealed Class vs Abstract Class?
4. What is the permits keyword?
5. What are final, sealed and non-sealed subclasses?
6. When should Sealed Classes be used?
7. Can Records implement Sealed Interfaces?
8. Where are Sealed Classes useful in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ High Priority

### Remember

- Sealed Classes provide controlled inheritance.
- permits defines allowed subclasses.
- Subclasses must be final, sealed or non-sealed.
- Sealed Classes improve domain modeling.
- Records and Sealed Interfaces are commonly used together.
- Frequently asked in Java 17 interviews.