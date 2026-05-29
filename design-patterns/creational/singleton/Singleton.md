# Singleton Pattern

## What Is Singleton Pattern?

Singleton is a creational design pattern that ensures only one instance of a class exists throughout the application.

The pattern also provides a global access point to that instance.

Singleton is one of the most commonly discussed design patterns in Java and Spring interviews.

## Why Singleton Pattern Matters

Singleton helps:

- Prevent multiple object creation
- Share application-wide resources
- Reduce memory usage
- Centralize configuration management
- Maintain consistent application state

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Spring Singleton Beans |
| ⭐⭐⭐⭐⭐ | Configuration Managers |
| ⭐⭐⭐⭐⭐ | Logging Systems |
| ⭐⭐⭐⭐ | Cache Managers |
| ⭐⭐⭐⭐ | Connection Managers |

## Problem Without Singleton

Without Singleton:

```java
ConfigurationManager config1 =
    new ConfigurationManager();

ConfigurationManager config2 =
    new ConfigurationManager();
```

Multiple instances may exist even when only one is required.

## Solution Using Singleton

```text
Application
      ↓
 Singleton
      ↓
Single Shared Instance
```

The application always uses the same object instance.

## Common Singleton Implementations

### Eager Initialization

```java
private static final Singleton INSTANCE =
    new Singleton();
```

Simple but creates the object even if unused.

### Lazy Initialization

```java
if (instance == null) {
    instance = new Singleton();
}
```

Creates the object only when needed.

### Thread-Safe Singleton

```java
public static synchronized Singleton
getInstance() {
    ...
}
```

Safe but may affect performance.

### Double-Checked Locking

```java
if (instance == null) {
    synchronized (...) {
        if (instance == null) {
            instance = new Singleton();
        }
    }
}
```

Common interview topic.

## Real Backend Examples

### Spring Beans

```text
Default Bean Scope
       ↓
Singleton
```

### Logging Systems

```text
Application
      ↓
Shared Logger
```

### Configuration Managers

```text
Application
      ↓
Shared Configuration
```

### Cache Managers

```text
Application
      ↓
Shared Cache Instance
```

## How Singleton Can Be Broken

### Using Reflection

Reflection can invoke a private constructor.

### Using Serialization and Deserialization

Deserialization may create a new object.

### Using Cloning

Cloning may create a duplicate instance.

## How To Prevent Singleton Breakage

### Reflection Protection

Throw an exception inside the constructor if an instance already exists.

### Serialization Protection

Implement:

```java
private Object readResolve()
```

### Cloning Protection

Override clone() and prevent duplication.

### Best Solution

Use Enum Singleton.

```java
public enum Singleton {
    INSTANCE;
}
```

This protects against reflection, serialization, and cloning issues.

## Singleton vs Factory Method

| Feature | Singleton | Factory Method |
| -------- | --------- | -------------- |
| Purpose | One Instance | Create Objects |
| Object Count | Single | Multiple |
| Lifecycle | Shared | Created on Demand |
| Common Usage | Shared Resources | Provider Selection |

## Advantages

- Controlled instance creation
- Lower memory consumption
- Shared application state
- Easy global access

## Disadvantages

- Global state can make testing difficult
- Hidden dependencies
- Can be overused
- May violate Single Responsibility Principle

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Default Bean Scope | Singleton |
| Application Services | Service Beans |
| Configuration | Configuration Beans |

## Production Engineering Perspective

Singleton is extremely common in enterprise Java systems.

However, modern applications often let frameworks such as Spring manage singleton lifecycles rather than implementing the pattern manually.

Understanding thread safety, lazy initialization, and singleton bean scope is important for interviews and production systems.

## Interview Questions

1. What is Singleton Pattern?
2. Why is Singleton used?
3. What are the different Singleton implementations?
4. What is Double-Checked Locking?
5. How can Singleton be broken?
6. How can Singleton be protected?
7. Why is Enum Singleton preferred?
8. How does Spring use Singleton?
9. What are the advantages and disadvantages?
10. When should Singleton be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Ensures only one instance exists.
- Spring beans are Singleton by default.
- Know lazy vs eager initialization.
- Know Double-Checked Locking.
- Know reflection, serialization, and cloning issues.
- Enum Singleton is the safest implementation.
- Frequently asked in Java and Spring interviews.