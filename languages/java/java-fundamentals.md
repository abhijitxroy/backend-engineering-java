# Java Fundamentals

Core Java concepts build the foundation for backend engineering, scalable application development and production systems.

Java fundamentals directly influence application design, maintainability and performance optimization.

## Data Types

Primitive types:

- byte
- short
- int
- long
- float
- double
- char
- boolean

Reference types:

- Class
- Interface
- Array
- String

## Variables

Variable scopes:

- Local Variable
- Instance Variable
- Static Variable

## Operators

Common operators:

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Bitwise Operators
- Ternary Operator

## Control Statements

Decision making:

- if
- if else
- switch

Loops:

- for
- while
- do while
- enhanced for loop

## Object Oriented Programming


Core principles:

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

## Interface vs Abstract Class

Interface:

- Defines contract and capability
- Supports multiple inheritance behavior
- Default and static methods supported
- Better for extensibility and loose coupling

Abstract Class:

- Supports partial implementation
- Constructor support available
- State management capability
- Better for shared common behavior

Backend engineering perspective:

Interface usage:

- Dependency Injection
- Service abstraction
- Plugin architecture
- Testability improvement

Abstract class usage:

- Shared workflow implementation
- Template pattern implementation
- Common backend processing logic

## SOLID Principles

Design principles for maintainable and scalable backend systems.

- Single Responsibility Principle (SRP)
- Open Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

Backend engineering perspective:

- Dependency Injection
- Testability
- Clean Architecture
- Microservice maintainability

## Composition vs Inheritance

Prefer composition over inheritance for flexible and maintainable software design.

Composition advantages:

- Better extensibility
- Lower coupling
- Easier testing
- Reduced fragile hierarchy problems

## Method Overriding vs Method Hiding

Method Overriding:

- Runtime polymorphism
- Instance method resolution

Method Hiding:

- Static method behavior
- Compile time resolution

## Coupling vs Cohesion

Good backend software design prefers:

- High Cohesion
- Low Coupling

High cohesion improves maintainability.

Low coupling improves scalability and change management.

## OOP Design Discussions

Good object oriented design commonly prefers:

- High Cohesion
- Low Coupling
- Composition over Inheritance
- Interface driven design

These principles improve maintainability, scalability and backend engineering quality.

## Functional Interfaces

Java functional interfaces introduced modern functional programming capabilities.

Common functional interfaces:

- Consumer<T>
- Predicate<T>
- Supplier<T>
- Function<T, R>

Backend engineering usage:

- Validation pipelines
- Event processing
- Logging workflows
- Stream processing

## Stream API

Java Stream API simplifies collection processing and aggregation workflows.

Frequently used operations:

- map()
- filter()
- reduce()
- collect()
- sorted()
- distinct()
- limit()
- findFirst()
- forEach()
- anyMatch()
- allMatch()

Benefits:

- Functional programming support
- Lambda integration
- Reduced boilerplate code
- Bulk collection processing
- Better readability

Backend engineering usage:

- Collection transformation
- Report generation
- Aggregation processing
- Analytics pipelines

## map vs flatMap

map:

- One to One transformation

flatMap:

- One to Many transformation
- Nested collection flattening

## Optional

Optional improves null safety and avoids NullPointerException risks.

Common operations:

- empty()
- of()
- ofNullable()
- orElse()
- orElseThrow()

Backend engineering usage:

- Null safety handling
- API response processing
- Repository layer handling
- Service layer validation

## Reduce Operations

Reduce combines stream elements into aggregated results.

Examples:

- Sum calculation
- Maximum value identification
- Analytics aggregation

## Parallel Stream

Parallel streams can improve throughput for CPU intensive processing workloads.

Backend considerations:

- Measure performance impact
- Avoid unnecessary parallelization
- Consider thread overhead

## Collections Basics

Common collections:

- ArrayList
- LinkedList
- HashMap
- HashSet
- TreeMap
- TreeSet
- Queue
- Deque

Backend engineering considerations:

- Ordering requirements
- Read vs write patterns
- Memory considerations
- Concurrency requirements

## Exception Handling

Common keywords:

- try
- catch
- finally
- throw
- throws

Exception types:

- Checked Exception
- Unchecked Exception

## Multithreading Basics

Core concepts:

- Thread Lifecycle
- Runnable Interface
- Synchronization
- Executor Framework
- Callable and Future

## Java Memory Concepts

Memory areas:

- Heap Memory
- Stack Memory
- Metaspace
- Native Memory

## JVM Fundamentals

JVM responsibilities:

- Class Loading
- Memory Management
- Garbage Collection
- JIT Compilation

Common Garbage Collectors:

- Serial GC
- Parallel GC
- G1 GC
- ZGC

## Production Engineering Discussions

Backend engineering discussions commonly include:

- Thread Safety
- Resource Management
- Memory Leak Analysis
- Performance Optimization
- Concurrency Design

## Notes

Core Java fundamentals directly influence backend scalability, application reliability and production engineering quality.