# ExecutorService

## What Is ExecutorService?

ExecutorService is a framework provided by Java for managing and executing threads efficiently.

Instead of creating and managing threads manually, applications submit tasks to ExecutorService, which manages thread creation, scheduling, execution, and lifecycle.

Package:

```java
java.util.concurrent
```

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | Thread Pool Management |
| ⭐⭐⭐⭐⭐ | Microservices |
| ⭐⭐⭐⭐⭐ | High Throughput APIs |
| ⭐⭐⭐⭐ | Background Processing |

## Why It Exists

Creating threads manually is expensive.

Example:

```java
new Thread(task).start();
```

Problems:

- Thread Creation Overhead
- Resource Consumption
- Difficult Lifecycle Management
- Poor Scalability

ExecutorService solves these issues using thread pools.

## Traditional Approach

```java
for (int i = 0; i < 1000; i++) {
    new Thread(task).start();
}
```

Result:

```text
1000 Threads
High Memory Usage
Poor Performance
```

## ExecutorService Approach

```java
ExecutorService executor =
        Executors.newFixedThreadPool(10);
```

Flow:

```text
Tasks
   ↓
ExecutorService
   ↓
Thread Pool
   ↓
Execution
```

## Basic Example

```java
ExecutorService executor =
        Executors.newFixedThreadPool(2);

executor.submit(
        () -> System.out.println("Task Executed")
);

executor.shutdown();
```

## Common Factory Methods

### Fixed Thread Pool

```java
Executors.newFixedThreadPool(10);
```

Use when:

- Number of workers is known.
- Predictable workload exists.

### Cached Thread Pool

```java
Executors.newCachedThreadPool();
```

Use when:

- Tasks are short-lived.
- Workload varies significantly.

### Single Thread Executor

```java
Executors.newSingleThreadExecutor();
```

Use when:

- Sequential execution is required.

### Scheduled Executor

```java
Executors.newScheduledThreadPool(5);
```

Use when:

- Periodic tasks are required.
- Scheduling is needed.

## submit() vs execute()

| execute() | submit() |
| ---------- | -------- |
| No Return Value | Returns Future |
| Runnable Only | Runnable and Callable |
| Simple Execution | Result Retrieval |

### execute()

```java
executor.execute(task);
```

### submit()

```java
Future<String> future =
        executor.submit(callable);
```

## Future Integration

```java
Future<String> future =
        executor.submit(() -> "Success");

System.out.println(future.get());
```

## Lifecycle Management

### shutdown()

```java
executor.shutdown();
```

Stops accepting new tasks.

### shutdownNow()

```java
executor.shutdownNow();
```

Attempts to stop running tasks.

## ExecutorService vs Thread

| Thread | ExecutorService |
| -------- | --------------- |
| Manual Management | Managed Framework |
| Expensive Creation | Thread Reuse |
| Poor Scalability | Better Scalability |
| Low-Level API | High-Level API |

## Real-World Usage

Commonly used in:

- API Processing
- Background Jobs
- Batch Processing
- Notification Systems
- Report Generation
- Microservices

## Production Engineering Perspective

In modern backend applications:

- Direct thread creation is rare.
- ExecutorService is the standard concurrency mechanism.
- Thread pools improve performance and resource utilization.
- Most asynchronous processing relies on ExecutorService.

## Backend Engineering Reality

Typical architecture:

```text
Request
   ↓
ExecutorService
   ↓
Thread Pool
   ↓
Business Logic
   ↓
Response
```

ExecutorService is the foundation for:

- CompletableFuture
- Async Processing
- Background Workers
- Scheduled Jobs

## Common Interview Questions

1. What is ExecutorService?
2. Why use ExecutorService instead of Thread?
3. What is a thread pool?
4. submit() vs execute()?
5. Fixed Thread Pool vs Cached Thread Pool?
6. What is Future?
7. What does shutdown() do?
8. How is ExecutorService used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- ExecutorService manages threads efficiently.
- Uses thread pools.
- Better than manual thread creation.
- submit() returns Future.
- execute() does not return a result.
- Foundation for modern Java concurrency.
- Widely used in backend applications.
