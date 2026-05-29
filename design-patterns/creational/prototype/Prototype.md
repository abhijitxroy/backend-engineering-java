

# Prototype Pattern

## What Is Prototype Pattern?

Prototype is a creational design pattern that creates new objects by cloning existing objects.

Instead of creating an object from scratch, a copy of an existing object is created and then modified if needed.

This can improve performance when object creation is expensive.

## Why Prototype Pattern Matters

Prototype helps:

- Reduce object creation cost
- Improve performance
- Reuse existing object state
- Simplify object duplication
- Avoid repeated initialization logic

It is useful when creating objects is expensive or complex.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐ | Configuration Templates |
| ⭐⭐⭐ | Request Templates |
| ⭐⭐⭐ | Object Duplication |
| ⭐⭐⭐ | Caching Systems |
| ⭐⭐⭐ | Document Generation |

## Problem Without Prototype

Without Prototype:

```java
Employee employee = new Employee();
employee.loadData();
```

Every new object requires full initialization.

This may become expensive when initialization involves database calls, file loading, or complex setup.

## Solution Using Prototype

```text
Existing Object
       ↓
      Clone
       ↓
   New Object
```

The cloned object already contains initialized data.

## Core Components

### Prototype Interface

```java
public interface Prototype {
    Prototype clone();
}
```

### Concrete Prototype

```java
public class Employee implements Prototype {

    @Override
    public Employee clone() {
        return new Employee(this);
    }
}
```

## Real Backend Examples

### Configuration Templates

```text
Base Configuration
       ↓
Environment-Specific Copy
```

### Request Templates

```text
Default Request
       ↓
Customized Request
```

### Caching Systems

```text
Cached Object
       ↓
Clone
       ↓
Return Copy
```

### Document Generation

```text
Invoice Template
       ↓
Generated Invoice
```

## Prototype vs Builder

| Feature | Prototype | Builder |
| -------- | --------- | ------- |
| Purpose | Clone Existing Object | Create New Object |
| Object Creation | Copy | Step-by-Step Build |
| Performance | High | Normal |
| Use Case | Duplication | Construction |

## Prototype vs Factory Method

| Feature | Prototype | Factory Method |
| -------- | --------- | -------------- |
| Creation Style | Clone Existing Object | Create New Object |
| Initialization Cost | Low | Depends on Creation Logic |
| Primary Goal | Duplication | Encapsulation of Creation |

## Advantages

- Faster object creation
- Reuses existing state
- Reduces initialization cost
- Simple duplication mechanism

## Disadvantages

- Clone logic can become complex
- Deep copying may be required
- Less common than Builder or Factory Method

## Spring Framework Mapping

| Pattern Usage | Example |
| ------------- | ------- |
| Bean Scope | Prototype Bean Scope |
| Object Templates | Configuration Templates |
| Request Duplication | Request Objects |

## Production Engineering Perspective

Prototype is less common than Builder, Factory Method, and Singleton.

However, it is useful when:

- Object creation is expensive
- Existing state should be reused
- Template-based systems are used
- High-performance object duplication is required

## Interview Questions

1. What is Prototype Pattern?
2. What problem does it solve?
3. Prototype vs Builder?
4. Prototype vs Factory Method?
5. What are common backend use cases?
6. What is shallow copy?
7. What is deep copy?
8. What are the advantages and disadvantages?
9. When should Prototype be used?
10. Why is it less common than Builder?

## Quick Revision

### Priority

⭐⭐⭐ Medium Priority

### Remember

- Creates objects by cloning.
- Useful when object creation is expensive.
- Reuses existing state.
- Common in templates and caching systems.
- Know shallow copy vs deep copy.
- Less common than Builder and Factory Method.
- Occasionally asked in interviews.