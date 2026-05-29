

# Facade Pattern

## What Is Facade Pattern?

Facade is a structural design pattern that provides a simplified interface to a complex subsystem.

Instead of interacting with multiple components directly, clients interact with a single facade that coordinates the underlying operations.

## Why It Exists

Applications often require multiple services to work together to complete a business operation.

Without Facade:

```text
Order Service
    ↓
Inventory Service
    ↓
Payment Service
    ↓
Shipping Service
    ↓
Notification Service
```

Clients must understand and coordinate every dependency.

Facade hides this complexity behind a single entry point.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐ | Service Layer Design |
| ⭐⭐⭐⭐ | API Aggregation |
| ⭐⭐⭐⭐ | Order Processing Systems |
| ⭐⭐⭐⭐ | Microservice Orchestration |
| ⭐⭐⭐ | Legacy System Integration |

## Real-World Usage

### E-Commerce Order Processing

```text
OrderFacade
      ↓
Inventory
Payment
Shipping
Notification
```

A single API triggers multiple backend services.

### Travel Booking Systems

```text
BookingFacade
      ↓
Flight
Hotel
Payment
Notification
```

### API Gateway Layer

```text
Client
   ↓
Facade API
   ↓
Multiple Backend Services
```

## Core Components

### Client

Uses the facade instead of calling subsystems directly.

### Facade

Provides a simplified interface.

### Subsystems

Perform the actual business operations.

## When To Use Facade

Use Facade when:

- Multiple services participate in one workflow
- Clients should not know subsystem details
- APIs need simplification
- Complex orchestration logic exists

Common examples:

- Order Processing
- Checkout Flows
- Travel Booking
- API Aggregation
- Service Layer Design

## When Not To Use Facade

Avoid Facade when:

- The workflow is already simple
- It becomes a large god class
- Clients require direct subsystem access

## Facade vs Adapter

| Facade | Adapter |
| ------- | ------- |
| Simplifies interfaces | Converts interfaces |
| Hides complexity | Makes incompatible systems work together |
| Focuses on usability | Focuses on compatibility |

## Facade vs Proxy

| Facade | Proxy |
| ------- | ----- |
| Simplifies subsystem access | Controls access |
| New simplified interface | Same interface |
| Coordination-focused | Access-focused |

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Service Layer | OrderService |
| API Aggregation | Aggregation Services |
| Business Workflows | Orchestration Layer |

## Common Interview Questions

1. What is Facade Pattern?
2. What problem does it solve?
3. Facade vs Adapter?
4. Facade vs Proxy?
5. What are common backend use cases?
6. Why is Facade useful in microservices?
7. How does it simplify client code?
8. What are the disadvantages of Facade?
9. When should Facade be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Provides a simplified interface to complex systems.
- Hides orchestration complexity.
- Common in service layers and API aggregation.
- Useful when multiple services participate in one workflow.
- Think: OrderFacade → Inventory + Payment + Shipping + Notification.