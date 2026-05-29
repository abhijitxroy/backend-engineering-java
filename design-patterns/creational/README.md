# Creational Design Patterns

Creational patterns focus on object creation mechanisms.

Examples:

- Builder
- Singleton
- Factory Method
- Abstract Factory
- Prototype
# Creational Design Patterns

Creational design patterns focus on object creation mechanisms.

They help create objects in a flexible, reusable, and maintainable way while reducing coupling between object creation and business logic.

## Must Know Patterns (Interview + Production)

| Pattern | Must Know | Real Usage | Spring Example |
| -------- | --------- | ---------- | -------------- |
| Singleton | ⭐⭐⭐⭐⭐ | Configuration Managers, Logging Systems, Shared Services | Spring Singleton Bean |
| Factory Method | ⭐⭐⭐⭐⭐ | Payment Providers, Notification Providers, Storage Providers | BeanFactory |
| Builder | ⭐⭐⭐⭐⭐ | DTOs, Request Objects, Configuration Objects | Lombok @Builder |
| Abstract Factory | ⭐⭐⭐⭐ | Multi-Cloud Systems, Multi-Database Systems | ApplicationContext |
| Prototype | ⭐⭐⭐ | Object Cloning, Templates, Caching Systems | Prototype Bean Scope |

## High ROI Learning Order

1. Singleton
2. Factory Method
3. Builder
4. Abstract Factory
5. Prototype

## When You Will See These In Production

| Pattern | Most Common Production Systems |
| -------- | ----------------------------- |
| Singleton | Spring Applications, Configuration Management, Logging |
| Factory Method | Payment Systems, Storage Systems, Authentication Providers |
| Builder | REST APIs, DTO Construction, Enterprise Applications |
| Abstract Factory | Multi-Cloud Platforms, Multi-Database Platforms |
| Prototype | Template Engines, Caching Systems, Object Duplication |

For backend interviews, Singleton, Factory Method, and Builder usually provide the highest return on investment.

## Pattern Selection Guide

### Use Singleton When

- Only one instance should exist
- Shared application state is required
- Configuration management is needed
- Shared resources must be controlled

### Use Factory Method When

- Multiple implementations exist
- Creation logic should be centralized
- Client should not know implementation details
- Provider selection is required

### Use Builder When

- Objects contain many fields
- Readability is important
- Optional parameters exist
- Immutable objects are preferred

### Use Abstract Factory When

- Multiple related objects must be created together
- Provider families exist
- Environment-specific implementations are needed
- Multi-cloud support is required

### Use Prototype When

- Object creation is expensive
- Existing state should be reused
- Object duplication is common
- Template-based systems are used

## Interview Focus Areas

1. Singleton implementations
2. Singleton thread safety
3. Double-Checked Locking
4. Factory Method vs Builder
5. Factory Method vs Abstract Factory
6. Prototype vs Builder
7. Shallow Copy vs Deep Copy
8. Spring Bean Scopes
9. Why Lombok Builder is popular
10. How Singleton can be broken

## Quick Revision

### Highest Priority

1. Singleton
2. Factory Method
3. Builder

If time is limited, master these three first because they appear most frequently in backend engineering and Spring interviews.

### Remember

- Singleton ensures only one instance exists.
- Factory Method centralizes object creation.
- Builder creates complex objects step by step.
- Abstract Factory creates families of related objects.
- Prototype creates objects by cloning.
- Spring Beans are Singleton by default.
- Lombok @Builder is a common Builder implementation.