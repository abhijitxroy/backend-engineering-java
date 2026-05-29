# Decorator Pattern

## What Is Decorator Pattern?

Decorator is a structural design pattern that allows behavior to be added to an object dynamically without modifying its existing code.

The original object and the decorated object share the same interface, allowing them to be used interchangeably.

## Why It Exists

Applications often need to add optional features without creating a new subclass for every possible combination.

Without Decorator:

```text
Request
RequestWithLogging
RequestWithAuthentication
RequestWithLoggingAndAuthentication
RequestWithLoggingAuthenticationAndMetrics
...
```

This quickly becomes difficult to maintain.

Decorator solves this problem by using composition instead of inheritance.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Logging |
| ⭐⭐⭐⭐⭐ | Metrics Collection |
| ⭐⭐⭐⭐⭐ | Request/Response Wrappers |
| ⭐⭐⭐⭐ | Security Enhancements |
| ⭐⭐⭐⭐ | Compression and Caching |

## Real-World Usage

### HTTP Request Wrappers

```text
Request
    ↓
Logging Decorator
    ↓
Authentication Decorator
    ↓
Metrics Decorator
```

A common backend example where logging, authentication, and metrics are added without modifying the original request implementation.

### Notification Systems

```text
Email Service
    ↓
Retry Decorator
    ↓
Logging Decorator
```

Additional functionality is layered around the original notification service without changing its implementation.

### Caching Layer

```text
Service
    ↓
Cache Decorator
```

Frequently used to add caching behavior around existing services.

## Core Components

### Component

Defines the common interface.

### Concrete Component

Original object that contains core behavior.

### Decorator

Wraps another object implementing the same interface.

### Concrete Decorator

Adds additional behavior.

## When To Use Decorator

Use Decorator when:

- Behavior must be added dynamically
- Multiple feature combinations exist
- Inheritance would create too many subclasses
- Runtime flexibility is required

Common examples:

- Logging
- Metrics
- Authentication Layers
- Request/Response Wrappers
- Compression
- Caching

## When Not To Use Decorator

Avoid Decorator when:

- Behavior never changes
- A simple subclass is sufficient
- Additional wrapping adds unnecessary complexity

## Why Not Inheritance?

Using inheritance for every feature combination can quickly create too many subclasses.

Example:

```text
Request
├── LoggingRequest
├── AuthenticationRequest
├── LoggingAuthenticationRequest
├── LoggingAuthenticationMetricsRequest
└── LoggingAuthenticationMetricsCompressionRequest
```

As features grow, the number of subclasses becomes difficult to maintain.

Decorator solves this problem by using composition instead of inheritance.

## What Is Class Explosion?

Class explosion occurs when every feature combination requires a separate subclass.

Problems:

- Difficult maintenance
- Increased code duplication
- Poor scalability
- Harder testing

Decorator prevents class explosion by composing behavior at runtime.

## Decorator vs Inheritance

| Decorator | Inheritance |
| ---------- | ----------- |
| Runtime behavior changes | Compile-time behavior changes |
| Composition | Inheritance |
| Flexible | Rigid |
| Avoids class explosion | Can create class explosion |

## Decorator vs Proxy

| Decorator | Proxy |
| ---------- | ----- |
| Adds behavior | Controls access |
| Enhances functionality | Protects functionality |
| Feature-focused | Access-focused |

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Request Wrappers | HttpServletRequestWrapper |
| Response Wrappers | HttpServletResponseWrapper |
| Cross-Cutting Concerns | Logging and Metrics Layers |

## Common Interview Questions

1. What is Decorator Pattern?
2. What problem does it solve?
3. Why not use inheritance?
4. What is class explosion?
5. Decorator vs Inheritance?
6. Decorator vs Proxy?
7. What are common backend use cases?
8. How does Decorator use composition?
9. When should Decorator be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Adds behavior without modifying existing code.
- Uses composition instead of inheritance.
- Prevents class explosion.
- Common in logging, metrics, caching, and wrappers.
- Original and decorated objects share the same interface.
- Think: Request → Logging → Authentication → Metrics.
- Think: Logging, Authentication, Metrics, Compression as layered wrappers.