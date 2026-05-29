

# Callable vs Runnable

## What Are They?

Runnable and Callable are interfaces used to execute tasks in separate threads.

Both represent units of work, but they differ in capabilities.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Multi-Threaded Applications |
| ⭐⭐⭐⭐⭐ | ExecutorService |
| ⭐⭐⭐⭐⭐ | Asynchronous Processing |
| ⭐⭐⭐⭐ | Background Jobs |
| ⭐⭐⭐⭐ | Concurrent APIs |

## Why They Exist

Applications often need to:

- Execute tasks asynchronously
- Run background jobs
- Process requests concurrently

Runnable was introduced first.

Callable was later introduced to support:

- Returning results
- Throwing checked exceptions

## Runnable

Runnable represents a task that does not return a result.

Method:

```java
void run()
```

Example:

```java
Runnable task = () ->
        System.out.println("Processing Task");
```

Execution:

```java
new Thread(task).start();
```

## Callable

Callable represents a task that returns a result.

Method:

```java
V call() throws Exception
```

Example:

```java
Callable<String> task = () ->
        "Task Completed";
```

Callable is commonly executed using:

```java
ExecutorService
```

## Basic Callable Example

```java
ExecutorService executor =
        Executors.newFixedThreadPool(1);

Future<String> future =
        executor.submit(() -> "Success");

System.out.println(future.get());
```

## Comparison

| Runnable | Callable |
| -------- | -------- |
| Introduced in Java 1.0 | Introduced in Java 5 |
| run() | call() |
| No Return Value | Returns Result |
| Cannot Throw Checked Exceptions | Can Throw Checked Exceptions |
| Used with Thread | Used with ExecutorService |

## Return Value Support

### Runnable

```java
Runnable task = () ->
        System.out.println("Processing");
```

No result is returned.

### Callable

```java
Callable<Integer> task = () -> 100;
```

Returns:

```java
100
```

## Exception Handling

### Runnable

```java
public void run() {
}
```

Cannot throw checked exceptions directly.

### Callable

```java
public String call() throws Exception {
    return "Success";
}
```

Supports checked exceptions.

## Future

Callable commonly works with:

```java
Future
```

Future provides:

- Result Retrieval
- Completion Status
- Cancellation Support

Example:

```java
future.get();
```

## Real-World Usage

### Runnable

Used for:

- Logging Tasks
- Notification Tasks
- Fire-And-Forget Operations

### Callable

Used for:

- Database Queries
- External API Calls
- Report Generation
- Data Processing Tasks

## Production Engineering Perspective

In modern backend systems:

- ExecutorService is preferred over direct Thread creation.
- Callable is used frequently because applications often need results.
- Runnable remains useful for background tasks that do not return data.

## Backend Engineering Reality

Most production systems use:

```java
ExecutorService
CompletableFuture
Callable
```

rather than creating raw threads directly.

## Common Interview Questions

1. Callable vs Runnable?
2. Why was Callable introduced?
3. Can Runnable return a value?
4. Can Callable throw checked exceptions?
5. What is Future?
6. Callable and ExecutorService relationship?
7. When should Runnable be used?
8. When should Callable be used?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Runnable does not return a result.
- Callable returns a result.
- Callable can throw checked exceptions.
- Callable is typically used with ExecutorService.
- Future is used to retrieve Callable results.
- Callable is more common in modern backend applications.