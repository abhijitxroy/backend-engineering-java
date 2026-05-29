# Structural Design Patterns

Structural design patterns focus on how classes and objects are composed to form larger, flexible, and maintainable systems.

They help simplify object relationships, reduce coupling, improve extensibility, and organize complex structures.

## Why Structural Patterns Matter

Structural patterns are heavily used in backend applications for:

- API Integration
- Security Layers
- Request Processing
- Caching
- Service Orchestration
- Object Reuse
- Framework Internals

## Where Structural Patterns Are Used

| Area | Common Patterns |
| ------ | ---------------- |
| Spring Framework | Proxy, Adapter, Decorator |
| Security Systems | Proxy, Chain of Responsibility |
| API Integration | Adapter, Facade |
| Service Layer Design | Facade |
| Request Processing | Decorator, Proxy |
| High-Scale Systems | Flyweight |
| Hierarchical Data | Composite |

## Structural Pattern Priority

| Pattern | Must Know | Real Usage |
| -------- | --------- | ---------- |
| Proxy | ⭐⭐⭐⭐⭐ | Spring AOP, Transactions, Security, Hibernate |
| Decorator | ⭐⭐⭐⭐⭐ | Logging, Metrics, Request Wrappers |
| Adapter | ⭐⭐⭐⭐⭐ | Framework Integration, Legacy Systems |
| Facade | ⭐⭐⭐⭐ | Service Layer, API Aggregation |
| Composite | ⭐⭐⭐⭐ | Category Trees, Organization Hierarchies |
| Flyweight | ⭐⭐⭐ | Caching, String Pool, Shared Metadata |

## Pattern Selection Guide

| Problem | Pattern |
| -------- | ------- |
| Control access to an object | Proxy |
| Add behavior dynamically | Decorator |
| Integrate incompatible systems | Adapter |
| Simplify a complex subsystem | Facade |
| Represent tree structures | Composite |
| Reduce memory usage through sharing | Flyweight |

## Patterns Covered

```text
structural
├── adapter
├── composite
├── decorator
├── facade
├── flyweight
├── proxy
└── README.md
```

## Quick Revision

### Highest ROI Patterns

1. Proxy
2. Decorator
3. Adapter
4. Facade

### Frequently Seen In Spring

- Proxy → Spring AOP, @Transactional
- Decorator → HttpServletRequestWrapper
- Adapter → HandlerAdapter
- Facade → Service Layer
- Flyweight → Spring Cache

### Interview Focus

- Proxy vs Decorator
- Adapter vs Facade
- Flyweight vs Singleton
- JDK Dynamic Proxy vs CGLIB
- When to use composition over inheritance