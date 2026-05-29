

# Adapter Pattern

## What Is Adapter Pattern?

Adapter is a structural design pattern that allows incompatible interfaces to work together.

It acts as a bridge between an existing system and a new system without requiring changes to either side.

Adapter is commonly used when integrating third-party libraries, legacy systems, or external services.

## Why It Exists

Applications often need to integrate systems that were designed independently.

Common examples:

- Payment Providers
- Cloud Platforms
- Legacy Systems
- Third-Party SDKs
- External APIs

Without Adapter, applications often require direct dependency on external interfaces.

Adapter creates a compatibility layer that allows systems to work together without modifying existing code.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Third-Party SDK Integration |
| ⭐⭐⭐⭐⭐ | Legacy System Integration |
| ⭐⭐⭐⭐⭐ | Payment Provider Integration |
| ⭐⭐⭐⭐ | Cloud Provider Abstraction |
| ⭐⭐⭐⭐ | API Migration Projects |

## Problem Without Adapter

Application expects:

```text
PaymentService
```

Third-party SDK provides:

```text
StripeClient
```

The interfaces are incompatible.

## Solution Using Adapter

```text
Application
      ↓
PaymentService
      ↓
PaymentAdapter
      ↓
StripeClient
```

The adapter converts one interface into another.

## Core Components

### Target Interface

```java
public interface PaymentService {
    void pay();
}
```

### Adaptee

```java
public class StripeClient {
    public void makePayment() {}
}
```

### Adapter

```java
public class StripeAdapter
        implements PaymentService {
}
```

## Real Backend Examples

### Payment Providers

```text
Application
      ↓
Payment Adapter
      ↓
Stripe / Razorpay / PayPal
```

### Cloud Providers

```text
Storage Service
      ↓
AWS Adapter
Azure Adapter
GCP Adapter
```

### Legacy Systems

```text
Modern API
      ↓
Adapter
      ↓
Legacy SOAP System
```

### Third-Party SDKs

```text
Application
      ↓
Adapter Layer
      ↓
External SDK

## When To Use Adapter

Use Adapter when:

- Integrating third-party services
- Working with legacy systems
- Migrating between providers
- Standardizing multiple external interfaces
- Isolating vendor-specific implementations

Common examples:

- Payment Gateway Integration
- Cloud Provider Abstraction
- External SDK Integration
- Legacy System Modernization

## When Not To Use Adapter

Avoid Adapter when:

- Interfaces are already compatible
- Additional abstraction provides little value
- The integration is temporary and simple
- No long-term maintenance benefit exists
```

## Adapter vs Facade

| Adapter | Facade |
| -------- | ------ |
| Makes incompatible interfaces work together | Simplifies existing interfaces |
| Integration-focused | Simplification-focused |
| Usually wraps one component | Usually wraps multiple components |

## Adapter vs Proxy

| Adapter | Proxy |
| -------- | ----- |
| Changes interface | Preserves interface |
| Integration purpose | Access control purpose |
| Compatibility layer | Access layer |

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| MVC Request Handling | HandlerAdapter |
| Framework Integration | Adapter Classes |
| External System Integration | Custom Adapters |

## Production Engineering Perspective

Adapter is heavily used whenever applications depend on external systems.

Common examples:

- Payment Platforms
- Cloud Platforms
- Enterprise Integrations
- Legacy Modernization Projects
- Third-Party SDK Integrations
- Microservices Migrations

A well-designed adapter layer reduces vendor lock-in and keeps business logic isolated from external dependencies.

## Interview Questions

1. What is Adapter Pattern?
2. What problem does it solve?
3. Adapter vs Facade?
4. Adapter vs Proxy?
5. What are common backend use cases?
6. How does Adapter reduce coupling?
7. How is Adapter used in Spring?
8. What are the advantages and disadvantages?
9. When should Adapter be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Makes incompatible interfaces work together.
- Creates a compatibility layer between systems.
- Common in payment, cloud, and SDK integrations.
- Helps isolate third-party dependencies.
- HandlerAdapter is a common Spring example.
- Frequently used during migrations and modernization projects.
- Think: Application → Adapter → External System.