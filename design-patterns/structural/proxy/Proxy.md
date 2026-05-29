# Proxy Pattern

## What Is Proxy Pattern?

Proxy is a structural design pattern that provides a placeholder or representative object that controls access to another object.

Instead of interacting with the real object directly, clients interact with a proxy.

The proxy can add security, caching, logging, lazy loading, monitoring, or access control before delegating requests to the real object.

## What Does Proxy Mean?

Proxy means "in place of" or "on behalf of".

The client interacts with a proxy object instead of directly interacting with the real object.

Example:

```text
Customer
    ↓
ATM (Proxy)
    ↓
Bank (Real Object)
```

The customer does not interact with the bank directly. The ATM acts as an intermediary and controls access to banking services.

## Why It Exists

Applications often need additional behavior around an object without changing the object's core implementation.

Without Proxy:

```text
Client
   ↓
Proxy
   ↓
Real Service
```

Every client must implement security, caching, logging, or monitoring separately.

Proxy centralizes these concerns.

## Basic Flow

```text
Client
   ↓
Proxy
   ↓
Real Service
```

The proxy can perform:

- Security Checks
- Caching
- Logging
- Monitoring
- Lazy Loading

before forwarding the request to the real service.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Spring AOP |
| ⭐⭐⭐⭐⭐ | Transactions |
| ⭐⭐⭐⭐⭐ | Security |
| ⭐⭐⭐⭐⭐ | Hibernate Lazy Loading |
| ⭐⭐⭐⭐⭐ | Caching |

## Real-World Usage

### Spring AOP

```text
Client
   ↓
Spring Proxy
   ↓
Business Service
```

Cross-cutting concerns are applied through proxies.

### Transaction Management

```text
Client
   ↓
Transactional Proxy
   ↓
Service
```

The proxy manages transaction boundaries.

### Hibernate Lazy Loading

```text
Entity Proxy
      ↓
Database Entity
```

Data is loaded only when required.

### Caching Layer

```text
Client
   ↓
Cache Proxy
   ↓
Service
```

The proxy can return cached data without invoking the real service.

## Core Components

### Subject

Common interface shared by the proxy and real object.

### Real Subject

Contains the actual business logic.

### Proxy

Controls access to the real object.

### Client

Uses the subject interface.

## When To Use Proxy

Use Proxy when:

- Access must be controlled
- Security checks are required
- Expensive objects should be loaded lazily
- Caching is required
- Monitoring or logging is needed

Common examples:

- Spring AOP
- @Transactional
- @Cacheable
- Hibernate Lazy Loading
- Security Filters

## When Not To Use Proxy

Avoid Proxy when:

- Additional access control is unnecessary
- Simplicity is more important than extensibility
- Extra abstraction provides little value

## Types Of Proxy

### Virtual Proxy

Loads expensive objects only when required.

Example:

- Hibernate Lazy Loading

### Protection Proxy

Controls access based on permissions.

Example:

- Authorization Systems

### Cache Proxy

Returns cached results when available.

Example:

- Spring Cache

### Remote Proxy

Represents remote services.

Example:

- RPC Frameworks
- Remote APIs

## Proxy vs Decorator

| Proxy | Decorator |
| ------- | ---------- |
| Controls access | Adds behavior |
| Security, Caching, Lazy Loading | Logging, Metrics, Wrappers |
| Access focused | Feature focused |

## Proxy vs Adapter

| Proxy | Adapter |
| ------- | ------- |
| Controls access | Converts interfaces |
| Same interface | Different interface |
| Access layer | Compatibility layer |

## JDK Dynamic Proxy vs CGLIB Proxy

| JDK Dynamic Proxy | CGLIB |
| ----------------- | ----- |
| Interface Required | No Interface Required |
| Uses Java Reflection | Uses Bytecode Generation |
| Works With Interfaces | Works With Concrete Classes |
| Common Spring Choice | Used When No Interface Exists |

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| AOP | Spring Proxy |
| Transactions | @Transactional |
| Caching | @Cacheable |
| Lazy Loading | Hibernate Proxy |
| Security | Spring Security |

## Common Interview Questions

1. What is Proxy Pattern?
2. What problem does it solve?
3. Proxy vs Decorator?
4. Proxy vs Adapter?
5. What are the different types of proxies?
6. What is Virtual Proxy?
7. What is Protection Proxy?
8. JDK Dynamic Proxy vs CGLIB?
9. How does Spring use proxies?
10. How does Hibernate use proxies?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Controls access to another object.
- Common in Spring AOP and transactions.
- Hibernate lazy loading uses proxies.
- Cache proxies avoid unnecessary service calls.
- JDK Dynamic Proxy requires interfaces.
- CGLIB works with concrete classes.
- Think: Client → Proxy → Real Service.
