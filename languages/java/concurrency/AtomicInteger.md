

# AtomicInteger

## What Is AtomicInteger?

AtomicInteger is a thread-safe integer implementation provided by the Java Concurrency API.

It allows multiple threads to update a shared integer value without using synchronization.

Package:

```java
java.util.concurrent.atomic
```

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | Counters |
| ⭐⭐⭐⭐⭐ | Metrics Collection |
| ⭐⭐⭐⭐ | Rate Limiting |
| ⭐⭐⭐⭐ | High-Concurrency Systems |

## Why It Exists

Consider a shared counter:

```java
count++;
```

This operation is not atomic.

Internally:

```text
Read
 ↓
Increment
 ↓
Write
```

When multiple threads execute this simultaneously:

```text
Race Condition
```

can occur.

AtomicInteger solves this problem.

## Problem With Normal Integer

```java
private int count = 0;

count++;
```

Multiple threads may update the same value incorrectly.

Example:

```text
Expected: 1000
Actual: 923
```

## Internal Working

AtomicInteger uses:

```text
CAS (Compare And Swap)
```

instead of locking.

Flow:

```text
Read Current Value
        ↓
Compare Expected Value
        ↓
Update If Match
        ↓
Success
```

If another thread modifies the value:

```text
Retry Operation
```

## Basic Example

```java
AtomicInteger counter = new AtomicInteger(0);

counter.incrementAndGet();
```

## Important Methods

### incrementAndGet()

```java
counter.incrementAndGet();
```

Increment and return updated value.

### getAndIncrement()

```java
counter.getAndIncrement();
```

Return current value and then increment.

### decrementAndGet()

```java
counter.decrementAndGet();
```

### addAndGet()

```java
counter.addAndGet(5);
```

### get()

```java
counter.get();
```

## AtomicInteger vs int

| int | AtomicInteger |
| ---- | ------------- |
| Not Thread-Safe | Thread-Safe |
| Race Conditions Possible | Safe Concurrent Updates |
| No Atomic Operations | Atomic Operations |
| No CAS | Uses CAS |

## AtomicInteger vs synchronized

| synchronized | AtomicInteger |
| ------------ | ------------- |
| Uses Locks | Lock-Free |
| Context Switching | Better Performance |
| More Overhead | Lower Overhead |
| Blocking | Non-Blocking |

## Real-World Usage

Commonly used in:

- Request Counters
- Metrics Collection
- Rate Limiting
- API Statistics
- Concurrent Processing Systems
- Monitoring Platforms

## Production Engineering Perspective

AtomicInteger is one of the most commonly used atomic classes in Java.

Typical examples:

- Request Count Tracking
- Active Session Counting
- Metrics Aggregation
- Concurrent Counters

For simple counters:

```java
AtomicInteger
```

is usually preferred over synchronization.

## Common Interview Questions

1. What is AtomicInteger?
2. Why is AtomicInteger thread-safe?
3. What is CAS?
4. AtomicInteger vs synchronized?
5. Why is count++ not thread-safe?
6. What problem does AtomicInteger solve?
7. When should AtomicInteger be used?
8. Where is AtomicInteger used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- AtomicInteger provides thread-safe updates.
- Uses CAS (Compare And Swap).
- Does not require synchronization.
- Commonly used for counters and metrics.
- Better than synchronized for simple counter operations.
- One of the most important Java concurrency classes.