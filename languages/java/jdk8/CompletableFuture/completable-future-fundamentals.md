

# CompletableFuture Fundamentals

## What Is CompletableFuture?

CompletableFuture is a Java 8 API used for asynchronous and non-blocking programming.

It allows applications to:

- Execute tasks asynchronously
- Chain multiple operations
- Combine multiple results
- Handle exceptions gracefully
- Improve application responsiveness

Package:

```java
java.util.concurrent
```

## Why Backend Engineers Must Know CompletableFuture

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Microservices |
| ⭐⭐⭐⭐⭐ | External API Calls |
| ⭐⭐⭐⭐⭐ | Parallel Processing |
| ⭐⭐⭐⭐⭐ | High Throughput APIs |
| ⭐⭐⭐⭐ | Background Processing |

## Why It Exists

Traditional Future has limitations.

```java
Future<String> future = executor.submit(task);
```

Problems:

- Blocking get()
- Difficult chaining
- Limited composition
- Poor exception handling

CompletableFuture solves these limitations.

## Basic Example

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(
                () -> "Hello World"
        );

System.out.println(future.join());
```

## Execution Flow

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

## Chaining Operations

### thenApply()

Transforms a result.

```java
future.thenApply(String::toUpperCase);
```

### thenAccept()

Consumes a result.

```java
future.thenAccept(System.out::println);
```

### thenRun()

Runs another task.

```java
future.thenRun(
        () -> System.out.println("Completed")
);
```

## Combining Multiple Futures

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

## join() vs get()

| join() | get() |
| ------- | ----- |
| Unchecked Exception | Checked Exception |
| Cleaner API | Traditional API |
| Commonly Used | Legacy Style |

## CompletableFuture vs Future

| Future | CompletableFuture |
| -------- | ---------------- |
| Blocking get() | Rich Async API |
| Limited Chaining | Supports Chaining |
| Difficult Composition | Easy Composition |
| Basic Concurrency API | Modern Async API |

## Typical Backend Flow

```text
Get User
     ↓
Get Orders
     ↓
Combine Results
     ↓
Return API Response
```

## Real-World Usage

Commonly used in:

- External API Calls
- Microservices Communication
- Report Generation
- Data Aggregation
- Background Processing
- Parallel Database Queries

## Production Engineering Perspective

CompletableFuture is heavily used when:

- Multiple services must be called in parallel.
- Response latency must be reduced.
- Work should execute asynchronously.

It commonly works with:

- ExecutorService
- Thread Pools
- Microservices

## Common Interview Questions

1. What is CompletableFuture?
2. CompletableFuture vs Future?
3. runAsync() vs supplyAsync()?
4. thenApply() vs thenAccept()?
5. join() vs get()?
6. How do you combine multiple futures?
7. How do you handle exceptions?
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
- join() is commonly preferred over get().
- Widely used in APIs and microservices.