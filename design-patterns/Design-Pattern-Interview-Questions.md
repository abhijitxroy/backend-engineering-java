# Design Pattern Interview Questions

This document contains high-frequency design pattern interview questions, comparisons, and quick revision notes.

---

# Singleton Pattern

## How can Singleton Pattern be broken in Java?

1. Reflection
2. Serialization and Deserialization
3. Cloning

## How can Singleton Pattern be protected?

| Problem | Solution |
| -------- | -------- |
| Reflection | Constructor Guard or Enum Singleton |
| Serialization | Implement `readResolve()` |
| Cloning | Override `clone()` |
| All Problems | Enum Singleton |

## Why is Enum Singleton preferred?

- Thread-safe
- Serialization-safe
- Reflection-safe
- Simple implementation

## What is Double-Checked Locking?

Used to improve Singleton performance while maintaining thread safety.

---

# Factory Method Pattern

## Factory Method vs Builder

| Factory Method | Builder |
| -------------- | ------- |
| Creates an object | Builds a complex object |
| Single-step creation | Multi-step creation |
| Focuses on creation logic | Focuses on object construction |

## When should Factory Method be used?

- Multiple implementations exist
- Object creation should be centralized
- Client should not know implementation details

---

# Abstract Factory Pattern

## Abstract Factory vs Factory Method

| Factory Method | Abstract Factory |
| -------------- | ---------------- |
| Creates one object | Creates a family of related objects |
| Lower complexity | Higher complexity |
| Single provider | Multiple related providers |

## When should Abstract Factory be used?

- Multi-cloud systems
- Multi-database systems
- Pluggable architectures
- Environment-specific implementations

---

# Builder Pattern

## Builder vs Constructor

| Builder | Constructor |
| -------- | ----------- |
| Readable | Difficult with many parameters |
| Flexible | Fixed parameter order |
| Supports optional fields | Hard to manage optional fields |

## Builder vs Factory Method

| Builder | Factory Method |
| -------- | -------------- |
| Builds complex objects | Creates objects |
| Multiple construction steps | Single creation step |
| Supports optional fields | Focuses on creation logic |

## Why is Builder commonly used?

- DTOs
- Request Objects
- Configuration Objects
- Domain Models

---

# Prototype Pattern

## Prototype vs Builder

| Prototype | Builder |
| --------- | ------- |
| Clones existing object | Creates new object |
| Focus on duplication | Focus on construction |
| Faster for expensive objects | Better for complex creation |

## What is the difference between Shallow Copy and Deep Copy?

| Shallow Copy | Deep Copy |
| ------------ | --------- |
| Copies references | Copies actual objects |
| Shared nested objects | Independent nested objects |
| Faster | Safer |

---

# Flyweight Pattern

## What is the difference between Intrinsic State and Extrinsic State?

| Intrinsic State | Extrinsic State |
| --------------- | --------------- |
| Shared State | Unique State |
| Stored in Flyweight | Provided by Client |
| Memory Optimized | Context Specific |

## Flyweight vs Singleton

| Flyweight | Singleton |
| ---------- | ---------- |
| Many shared objects | One shared object |
| Memory optimization | Instance control |
| Object reuse | Single instance |

## Flyweight vs Prototype

| Flyweight | Prototype |
| ---------- | --------- |
| Shares objects | Clones objects |
| Memory optimization | Object duplication |
| Reuse existing state | Copy existing state |

---

# Strategy Pattern

## Strategy vs State

| Strategy | State |
| -------- | ----- |
| Select algorithm at runtime | Behavior changes based on state |
| Client chooses strategy | State controls transitions |
| Focus on interchangeable algorithms | Focus on lifecycle behavior |

## Strategy vs Template Method

| Strategy | Template Method |
| -------- | --------------- |
| Composition | Inheritance |
| Runtime behavior change | Fixed workflow |
| Flexible | Less flexible |
| Client selects strategy | Parent controls algorithm |

## Common Backend Examples

- Payment Providers
- Authentication Providers
- Pricing Engines
- Routing Logic

---

# Observer Pattern

## Observer vs Chain of Responsibility

| Observer | Chain of Responsibility |
| -------- | ---------------------- |
| Broadcast notifications | Sequential processing |
| One-to-many relationship | Handler chain |
| Event-driven | Request-driven |

## Common Backend Examples

- Kafka Consumers
- Notifications
- Domain Events
- Monitoring Systems

---

# Chain of Responsibility Pattern

## Chain of Responsibility vs Observer

| Chain of Responsibility | Observer |
| ---------------------- | -------- |
| Sequential processing | Broadcast notification |
| Request pipeline | Event propagation |
| Middleware pattern | Event pattern |

## Common Backend Examples

- Spring Security Filter Chain
- API Gateway Filters
- Middleware Pipelines
- Validation Chains

---

# Template Method Pattern

## Template Method vs Strategy

| Template Method | Strategy |
| --------------- | -------- |
| Uses inheritance | Uses composition |
| Workflow is fixed | Algorithm can change |
| Framework-oriented | Runtime flexibility |

## Common Backend Examples

- JdbcTemplate
- RestTemplate
- Spring Batch
- ETL Pipelines

---

# Adapter Pattern

## Adapter vs Facade

| Adapter | Facade |
| -------- | ------ |
| Converts interfaces | Simplifies interfaces |
| Compatibility focused | Usability focused |
| Makes systems work together | Hides subsystem complexity |

## Adapter vs Proxy

| Adapter | Proxy |
| -------- | ----- |
| Changes interface | Keeps same interface |
| Integration focused | Access control focused |
| Compatibility layer | Access layer |

---

# Decorator Pattern

## Decorator vs Proxy

| Decorator | Proxy |
| ---------- | ----- |
| Adds behavior | Controls access |
| Enhances functionality | Protects functionality |
| Feature focused | Access focused |

## Why is Decorator preferred over inheritance?

- Prevents class explosion
- Uses composition over inheritance
- Supports runtime behavior changes
- More flexible than subclassing

---

# Facade Pattern

## Facade vs Adapter

| Facade | Adapter |
| ------- | ------- |
| Simplifies interfaces | Converts interfaces |
| Hides complexity | Solves compatibility issues |
| Provides unified access | Bridges incompatible systems |

## Facade vs Proxy

| Facade | Proxy |
| ------- | ----- |
| Simplifies subsystem access | Controls access |
| New simplified interface | Same interface |
| Coordination focused | Access focused |

---

# Proxy Pattern

## Proxy vs Decorator

| Proxy | Decorator |
| ------- | ---------- |
| Controls access | Adds behavior |
| Same interface | Same interface |
| Security, Caching, Lazy Loading | Logging, Metrics, Wrappers |

## JDK Dynamic Proxy vs CGLIB

| JDK Dynamic Proxy | CGLIB |
| ----------------- | ----- |
| Interface Required | No Interface Required |
| Uses Reflection | Uses Bytecode Generation |
| Works With Interfaces | Works With Classes |
| Spring Default When Interface Exists | Used When No Interface Exists |

## Common Backend Examples

- Spring AOP
- @Transactional
- @Cacheable
- Hibernate Lazy Loading
- Security Proxies

---

# Quick Revision

## Highest Priority Patterns

1. Singleton
2. Factory Method
3. Builder
4. Strategy
5. Proxy
6. Observer
7. Chain of Responsibility
8. Decorator
9. Adapter

## Most Common Spring Examples

| Pattern | Spring Example |
| -------- | -------------- |
| Singleton | Spring Singleton Bean |
| Factory Method | BeanFactory |
| Builder | Lombok @Builder |
| Strategy | AuthenticationProvider |
| Observer | ApplicationEventPublisher |
| Chain of Responsibility | Spring Security Filter Chain |
| Template Method | JdbcTemplate |
| Proxy | Spring AOP / @Transactional |
| Decorator | HttpServletRequestWrapper |
| Adapter | HandlerAdapter |
| State | Spring State Machine |

## Frequently Asked Comparisons

- Singleton vs Factory Method
- Factory Method vs Builder
- Factory Method vs Abstract Factory
- Strategy vs State
- Observer vs Chain of Responsibility
- Template Method vs Strategy
- Prototype vs Builder
- Decorator vs Proxy
- Adapter vs Facade
- Flyweight vs Singleton
- Flyweight vs Prototype
- Facade vs Adapter
- Proxy vs Decorator
- Builder vs Factory Method
- Strategy vs Template Method
- JDK Dynamic Proxy vs CGLIB