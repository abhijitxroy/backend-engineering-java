#Builder Design Pattern

# Builder Pattern

## What Is Builder Pattern?

Builder is a creational design pattern used to construct complex objects step by step.

Instead of using large constructors with many parameters, Builder provides a readable and flexible way to create objects.

The same construction process can create different object configurations.

## Why Builder Pattern Matters

Builder helps:

- Improve readability
- Avoid telescoping constructors
- Create immutable objects
- Simplify object construction
- Improve maintainability

It is one of the most commonly used creational patterns in enterprise Java applications.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | DTO Creation |
| ⭐⭐⭐⭐⭐ | Request Objects |
| ⭐⭐⭐⭐⭐ | Configuration Objects |
| ⭐⭐⭐⭐⭐ | Domain Models |
| ⭐⭐⭐⭐ | API Clients |

## Problem Without Builder

Without Builder:

```java
Employee employee = new Employee(
    "Abhijit",
    "Engineer",
    "Bangalore",
    "Backend",
    10
);
```

As parameters increase, constructors become difficult to read and maintain.

## Solution Using Builder

```java
Employee employee = Employee.builder()
    .name("Abhijit")
    .designation("Engineer")
    .location("Bangalore")
    .build();
```

The code becomes self-documenting and easier to understand.

## Core Components

### Product

Object being created.

```java
public class Employee {
    private String name;
    private String designation;
}
```

### Builder

Constructs the object step by step.

```java
Employee employee = Employee.builder()
    .name("John")
    .designation("Developer")
    .build();
```

## Real Backend Examples

### API Request Objects

```java
CreateUserRequest request =
    CreateUserRequest.builder()
        .name("John")
        .email("john@test.com")
        .build();
```

### Configuration Objects

```java
DatabaseConfig config =
    DatabaseConfig.builder()
        .host("localhost")
        .port(5432)
        .build();
```

### Domain Models

```java
Order order = Order.builder()
    .customerId("123")
    .amount(1000)
    .build();
```

## Builder vs Factory Method

| Feature | Builder | Factory Method |
| -------- | -------- | -------------- |
| Purpose | Build Complex Objects | Create Objects |
| Object Complexity | High | Low to Medium |
| Construction Steps | Multiple | Usually Single |
| Readability | High | Medium |

## Advantages

- Easy to read
- Flexible object construction
- Reduces constructor complexity
- Supports immutability
- Easier maintenance

## Disadvantages

- Additional code
- Extra builder class
- Overkill for simple objects

## Spring Framework Mapping

| Pattern Usage | Example |
| ------------- | ------- |
| DTO Creation | Request/Response Objects |
| Configuration | Spring Configuration Objects |
| Enterprise Java | Lombok @Builder |

## Production Engineering Perspective

Builder is heavily used in:

- Spring Boot Applications
- REST APIs
- DTO Construction
- Domain Models
- Configuration Management
- Enterprise Java Systems

Most backend engineers use Builder regularly even if they do not explicitly think about the design pattern.

## Interview Questions

1. What is Builder Pattern?
2. What problem does Builder solve?
3. Builder vs Factory Method?
4. When should Builder be used?
5. What are the advantages of Builder?
6. Why is Builder preferred over large constructors?
7. How does Lombok support Builder Pattern?
8. What are common backend use cases?
9. When should Builder be avoided?
10. How does Builder improve readability?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Creates complex objects step by step.
- Improves readability.
- Eliminates large constructors.
- Common in DTOs and request objects.
- Lombok @Builder is the most common Java example.
- Frequently used in enterprise applications.
- One of the most important creational patterns.