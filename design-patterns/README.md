# Design Patterns

Software design patterns commonly used in backend engineering and object-oriented software development.

Design patterns help improve maintainability, extensibility, scalability, testability, and software design quality by providing reusable approaches to common engineering problems.

Production backend systems become significantly more complex as applications evolve into large-scale, distributed, and long-lived engineering environments.

Design pattern engineering does not operate independently from:

- backend services
- APIs
- databases
- messaging systems
- testing strategies
- performance engineering
- reliability engineering practices
- operational debugging workflows

## Repository Structure

```text
design-patterns/
├── creational/
│   ├── README.md
│   ├── abstract-factory/
│   ├── builder/
│   ├── factory-method/
│   ├── prototype/
│   └── singleton/
├── structural/
│   ├── README.md
│   ├── adapter/
│   ├── composite/
│   ├── decorator/
│   ├── facade/
│   ├── flyweight/
│   └── proxy/
├── behavioral/
│   ├── README.md
│   ├── chain-of-responsibility/
│   ├── command/
│   ├── observer/
│   ├── state/
│   ├── strategy/
│   └── template-method/
└── Design-Pattern-Interview-Questions.md
```

## Design Pattern Engineering Areas

Design patterns are organized into three major categories:

- Creational patterns
- Structural patterns
- Behavioral patterns

The objective is not pattern memorization.

The objective is understanding when, why, and how patterns improve production software systems.

## Pattern Learning Strategy

Do not memorize patterns.

Focus on:

- What problem does the pattern solve?
- Why does the problem exist?
- Where is the pattern used in production?
- When should the pattern be avoided?
- What Spring or Java examples use it?

Understanding trade-offs is more important than memorizing definitions.

## Creational Patterns

| Pattern | Must Know | Real Usage |
| -------- | --------- | ---------- |
| Builder | ⭐⭐⭐⭐⭐ | DTOs, Configurations, Request Objects |
| Singleton | ⭐⭐⭐⭐⭐ | Spring Beans, Shared Services |
| Factory Method | ⭐⭐⭐⭐⭐ | Framework Object Creation |
| Abstract Factory | ⭐⭐⭐⭐ | Multi-Provider Systems |
| Prototype | ⭐⭐⭐ | Object Cloning |

---

## Structural Patterns

| Pattern | Must Know | Real Usage |
| -------- | --------- | ---------- |
| Proxy | ⭐⭐⭐⭐⭐ | Spring AOP, Transactions, Security |
| Decorator | ⭐⭐⭐⭐⭐ | Logging, Metrics, Wrappers |
| Adapter | ⭐⭐⭐⭐⭐ | External Integrations |
| Facade | ⭐⭐⭐⭐ | Service Layer, API Aggregation |
| Composite | ⭐⭐⭐⭐ | Hierarchical Data |
| Flyweight | ⭐⭐⭐ | Caching, Shared Metadata |

---

## Behavioral Patterns

| Pattern | Must Know | Real Usage |
| -------- | --------- | ---------- |
| Strategy | ⭐⭐⭐⭐⭐ | Pricing, Payments, Routing |
| Observer | ⭐⭐⭐⭐⭐ | Events, Notifications |
| Chain of Responsibility | ⭐⭐⭐⭐⭐ | Spring Security, Filters |
| Command | ⭐⭐⭐⭐ | CQRS, Job Processing |
| State | ⭐⭐⭐⭐ | Order Lifecycle, Workflow Systems |
| Template Method | ⭐⭐⭐⭐ | Framework Design |

---

## Why Design Patterns Matter

Design patterns commonly help improve:

- Maintainability
- Extensibility
- Code organization
- Reusability
- Testability
- Scalability
- Separation of concerns
- Software design quality

In production systems, design patterns help engineers build software that remains maintainable as complexity grows.

---

## Where Patterns Appear In Production

| Area | Common Patterns |
| ------ | ---------------- |
| Spring Framework | Proxy, Adapter, Decorator |
| Security Systems | Proxy, Chain of Responsibility |
| Event-Driven Systems | Observer |
| Workflow Engines | State, Command |
| Service Layer Design | Facade |
| Third-Party Integrations | Adapter |
| High-Scale Systems | Flyweight |

---

## Operational Engineering Perspective

Design patterns become increasingly valuable as backend systems evolve toward larger engineering environments and long-term software ownership models.

Production engineers should focus on:

- understanding trade-offs
- avoiding unnecessary abstractions
- selecting patterns for real problems
- improving maintainability
- simplifying operational troubleshooting
- supporting long-term system evolution

## Quick Revision

### Highest ROI Patterns

1. Builder
2. Factory Method
3. Strategy
4. Proxy
5. Observer
6. Chain of Responsibility
7. Decorator
8. Adapter

### Frequently Asked Interviews

- Singleton vs Factory Method
- Builder vs Factory Method
- Strategy vs State
- Strategy vs Template Method
- Decorator vs Proxy
- Adapter vs Facade
- Flyweight vs Singleton
- JDK Dynamic Proxy vs CGLIB

### Most Common Spring Examples

- Proxy → Spring AOP, @Transactional
- Decorator → HttpServletRequestWrapper
- Adapter → HandlerAdapter
- Strategy → AuthenticationProvider
- Observer → ApplicationEventPublisher
- Chain of Responsibility → Spring Security Filter Chain

## Ecosystem Alignment

This section focuses on backend software design and implementation patterns.

Related engineering concerns are intentionally covered in other repositories:

- large-scale architecture design
- cloud infrastructure engineering
- platform engineering
- deployment engineering
- observability platforms

This repository focuses on practical software engineering patterns used inside backend systems.