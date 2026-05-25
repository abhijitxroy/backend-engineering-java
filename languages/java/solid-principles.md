

# SOLID Principles

SOLID principles are object oriented design principles introduced by Robert C. Martin (Uncle Bob) for building maintainable, scalable and extensible software systems.

These principles are highly relevant for backend engineering, microservices architecture and production systems.

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

## Backend Engineering Relevance

SOLID principles improve:

- Scalability
- Maintainability
- Testability
- Clean Architecture adoption
- Production engineering quality

## Related Learning

See:

- java-fundamentals.md
- examples/