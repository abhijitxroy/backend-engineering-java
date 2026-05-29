# SOLID Principles

SOLID principles are object oriented design principles introduced by Robert C. Martin (Uncle Bob) for building maintainable, scalable and extensible software systems.

These principles are highly relevant for backend engineering, microservices architecture and production systems.

## Why Backend Engineers Must Know SOLID

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Application Architecture |
| ⭐⭐⭐⭐⭐ | Spring Framework |
| ⭐⭐⭐⭐⭐ | Microservices Design |
| ⭐⭐⭐⭐⭐ | Design Patterns |
| ⭐⭐⭐⭐ | Testability |
| ⭐⭐⭐⭐ | Production Maintainability |

## SOLID Overview

| Principle | Goal |
| ---------- | ---- |
| SRP | One Responsibility |
| OCP | Extend Without Modification |
| LSP | Safe Substitution |
| ISP | Small Focused Interfaces |
| DIP | Depend On Abstractions |

## Interview Memory Trick

```text
S → Single Responsibility
O → Open Closed
L → Liskov Substitution
I → Interface Segregation
D → Dependency Inversion
```

A good backend design typically follows:

```text
High Cohesion
        +
Low Coupling
        +
SOLID
        =
Maintainable System
```

## Single Responsibility Principle (SRP)

A class should have only one reason to change.

Bad Example:

UserManager

- User creation
- Email sending
- Database persistence

Good Design:

UserService

- User operations

EmailService

- Notification responsibility

Backend Engineering Perspective:

- Better maintainability
- Easier testing
- Lower coupling

## Open Closed Principle (OCP)

Software entities should be open for extension but closed for modification.

Bad Design:

ShapeCalculator modified whenever a new shape is added.

Good Design:

Use abstraction and polymorphism.

Examples:

- Circle
- Rectangle
- Triangle

Implement common interface:

Shape

Backend Engineering Perspective:

- Plugin architecture
- Extensible services
- Reduced regression risk

## Liskov Substitution Principle (LSP)

Derived classes must be replaceable with base classes without changing expected behavior.

Bad Example:

Vehicle

Car

Bicycle

If parent assumptions break child behavior, inheritance hierarchy becomes unstable.

Backend Engineering Perspective:

- Stable abstraction contracts
- Better extensibility
- Safer polymorphism

## Interface Segregation Principle (ISP)

Clients should not depend on interfaces they do not use.

Bad Design:

MediaPlayer

- playAudio()
- playVideo()
- recordAudio()

Good Design:

Separate interfaces.

Examples:

- AudioPlayer
- VideoPlayer
- AudioRecorder

Backend Engineering Perspective:

- Cleaner service contracts
- Better maintainability
- Reduced implementation complexity

## Dependency Inversion Principle (DIP)

High level modules should not depend on low level modules.

Both should depend on abstractions.

Bad Example:

NotificationService
→ directly creates EmailService

Good Design:

NotificationService
→ depends on NotificationProvider abstraction

Examples:

- EmailProvider
- SMSProvider
- PushNotificationProvider

Backend Engineering Perspective:

- Dependency Injection
- Spring Framework design philosophy
- Better testing through mocking
- Clean Architecture

## Where SOLID Is Used

### Spring Framework

- Dependency Injection
- Bean Design
- Service Layer Design

### Microservices

- Service Boundaries
- Extensible Workflows
- Maintainable APIs

### Design Patterns

- Strategy Pattern
- Factory Pattern
- Observer Pattern
- Dependency Injection

## Spring Framework Mapping

| SOLID Principle | Spring Example |
| --------------- | -------------- |
| SRP | Service Layer Separation |
| OCP | Strategy Pattern Implementations |
| LSP | Interface Implementations |
| ISP | Small Service Contracts |
| DIP | Dependency Injection |

Spring is one of the best real-world examples of SOLID principles in practice.

## Quick Decision Guide

| Problem | SOLID Principle |
| -------- | --------------- |
| Class Has Too Many Responsibilities | SRP |
| New Feature Requires Existing Code Changes | OCP |
| Child Breaks Parent Behavior | LSP |
| Large Interface With Unused Methods | ISP |
| Concrete Dependencies Make Testing Difficult | DIP |

## Most Asked Interview Topics

1. Explain SOLID Principles.
2. Real-world examples of SRP.
3. OCP vs Strategy Pattern.
4. LSP violation examples.
5. ISP vs Fat Interfaces.
6. DIP and Dependency Injection.
7. Which SOLID principle is most used in Spring?
8. SOLID in Microservices.

## Backend Engineering Relevance

SOLID principles improve:

- Scalability
- Maintainability
- Testability
- Clean Architecture adoption
- Production engineering quality

## Quick Revision

### Highest ROI Principles

1. SRP
2. OCP
3. DIP
4. ISP
5. LSP

### Remember

- SRP → One reason to change.
- OCP → Extend, don't modify.
- LSP → Child must safely replace parent.
- ISP → Small focused interfaces.
- DIP → Depend on abstractions.
- Spring heavily uses DIP.
- SRP improves cohesion.
- DIP reduces coupling.
- OCP is commonly implemented using interfaces and design patterns.
- Spring Dependency Injection is a practical DIP example.
- SOLID improves maintainability, scalability, and testability.

## Related Learning

See:

- java-fundamentals.md
- design-patterns/
- jvm/
- examples/