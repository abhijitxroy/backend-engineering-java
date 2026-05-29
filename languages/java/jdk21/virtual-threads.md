

# Virtual Threads

## Overview

Virtual Threads are lightweight threads introduced to dramatically improve application scalability.

They allow Java applications to handle a very large number of concurrent tasks without creating an operating system thread for each task.

## Why Virtual Threads Were Introduced

Traditional Java applications use Platform Threads.

```java
ExecutorService executor =
        Executors.newFixedThreadPool(100);
```

Problems:

- High Memory Usage
- Limited Scalability
- Thread Pool Management Complexity
- Expensive Thread Creation

## What Is A Virtual Thread

Virtual Threads are managed by the JVM instead of being directly tied to operating system threads.

```java
Thread.startVirtualThread(
        () -> System.out.println("Hello")
);
```

Benefits:

- Lightweight
- Fast Creation
- Massive Concurrency
- Simpler Programming Model

## Platform Thread vs Virtual Thread

| Platform Thread | Virtual Thread |
| --------------- | -------------- |
| OS Managed | JVM Managed |
| Expensive | Lightweight |
| Limited Count | Massive Scale |
| Higher Memory Usage | Lower Memory Usage |
| Requires Thread Pool Tuning | Simpler Scaling |

## Thread Per Request Model

Traditional Approach:

```text
Request
   ↓
Thread Pool
   ↓
Limited Threads
```

Virtual Thread Approach:

```text
Request
   ↓
Virtual Thread
   ↓
Millions Of Concurrent Tasks
```

## Creating Virtual Threads

### Single Virtual Thread

```java
Thread.startVirtualThread(
        () -> processRequest()
);
```

### Executor Service

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    executor.submit(() -> processRequest());
}
```

## Real Backend Example

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    for (int i = 0; i < 10000; i++) {
        executor.submit(() -> callExternalService());
    }
}
```

Use Cases:

- REST APIs
- Database Calls
- External Service Calls
- Microservices
- API Aggregation

## Virtual Threads And Blocking Operations

Virtual Threads work particularly well with:

- Network Calls
- Database Calls
- File Operations
- HTTP Requests

Reason:

```text
When Waiting
       ↓
Virtual Thread Parks
       ↓
Carrier Thread Released
       ↓
Better Resource Utilization
```

## Virtual Threads vs Reactive Programming

| Virtual Threads | Reactive Programming |
| --------------- | ------------------- |
| Easier To Learn | Steeper Learning Curve |
| Imperative Style | Reactive Style |
| Simpler Debugging | Harder Debugging |
| Minimal Refactoring | Larger Code Changes |

## Production Engineering Perspective

### Advantages

- Massive Scalability
- Simpler Concurrency
- Lower Memory Usage
- Better Developer Productivity
- Easier Migration From Existing Code

### Limitations

- Not Faster For CPU Intensive Work
- Requires Testing Before Adoption
- Some Libraries May Need Validation

## Common Use Cases

- Spring Boot Applications
- API Gateway Services
- Microservices
- High Throughput Systems
- Cloud Native Applications

## Most Asked Interview Questions

1. What are Virtual Threads?
2. Why were Virtual Threads introduced?
3. Platform Thread vs Virtual Thread?
4. How do Virtual Threads improve scalability?
5. What is a Carrier Thread?
6. Are Virtual Threads faster?
7. Virtual Threads vs Reactive Programming?
8. Where are Virtual Threads useful in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Highest Priority

### Remember

- Virtual Threads are managed by the JVM.
- Virtual Threads are lightweight.
- Virtual Threads support massive concurrency.
- Ideal for I/O bound workloads.
- Simplify thread-per-request architectures.
- One of the most important JDK 21 features.
- Frequently asked in modern Java interviews.