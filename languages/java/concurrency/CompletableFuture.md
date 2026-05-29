# CompletableFuture

## What Is CompletableFuture?

CompletableFuture is a powerful asynchronous programming API introduced in Java 8.

It allows tasks to execute asynchronously, combine multiple tasks, handle results, and process exceptions without blocking the main thread.

Package:

```java
java.util.concurrent
```

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Async Processing |
| ⭐⭐⭐⭐⭐ | External API Calls |
| ⭐⭐⭐⭐⭐ | Microservices |
| ⭐⭐⭐⭐⭐ | Parallel Execution |
| ⭐⭐⭐⭐ | High-Performance Applications |

## Why It Exists

Traditional Future has limitations.

Example:

```java
Future<String> future = executor.submit(task);
```

Problems:

- Blocking get()
- Difficult chaining
- Difficult exception handling
- Difficult task composition

CompletableFuture solves these limitations.

## Basic Example

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(
                () -> "Hello World"
        );

System.out.println(future.join());
```

## Async Execution Flow

```text
Request
   ↓
CompletableFuture
   ↓
Background Task
   ↓
Result
```

## Creating CompletableFuture

### runAsync()

Used when no result is required.

```java
CompletableFuture.runAsync(
        () -> System.out.println("Processing")
);
```

### supplyAsync()

Used when a result is required.

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(
                () -> "Success"
        );
```

## Processing Results

### thenApply()

Transform result.

```java
future.thenApply(String::toUpperCase);
```

### thenAccept()

Consume result.

```java
future.thenAccept(System.out::println);
```

### thenRun()

Execute another task.

```java
future.thenRun(
        () -> System.out.println("Done")
);
```

## Combining Futures

```java
CompletableFuture<String> user =
        CompletableFuture.supplyAsync(() -> "User");

CompletableFuture<String> order =
        CompletableFuture.supplyAsync(() -> "Order");

user.thenCombine(order,
        (u, o) -> u + " " + o);
```

## Exception Handling

```java
future.exceptionally(
        ex -> "Default Value"
);
```

## CompletableFuture vs Future

| Future | CompletableFuture |
| -------- | ---------------- |
| Blocking get() | Non-Blocking Processing |
| Limited Chaining | Rich Chaining API |
| Difficult Composition | Easy Composition |
| Basic API | Modern Async API |

## Real-World Usage

Commonly used in:

- External API Calls
- Microservices Communication
- Database Calls
- Parallel Processing
- Report Generation
- Background Processing

## Production Engineering Perspective

CompletableFuture is one of the most important concurrency APIs in modern Java.

Typical examples:

- Calling Multiple Services In Parallel
- Aggregating Responses
- Async Notification Processing
- High-Throughput APIs

## Modern Backend Engineering

Many applications use:

```java
CompletableFuture
```

instead of manually creating threads.

It integrates naturally with:

- ExecutorService
- Async APIs
- Microservice Architectures

## Common Interview Questions

1. What is CompletableFuture?
2. CompletableFuture vs Future?
3. runAsync() vs supplyAsync()?
4. thenApply() vs thenAccept()?
5. How do you combine multiple futures?
6. How do you handle exceptions?
7. Why is CompletableFuture important?
8. Where is CompletableFuture used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- CompletableFuture enables asynchronous programming.
- runAsync() does not return a result.
- supplyAsync() returns a result.
- Supports chaining and composition.
- Supports exception handling.
- Commonly used in APIs and microservices.
- One of the most important Java 8 concurrency features.
