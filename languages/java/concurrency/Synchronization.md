# Synchronization

## What Is Synchronization?

Synchronization is a mechanism used to control access to shared resources in a multi-threaded environment.

It ensures that only one thread executes a critical section at a time.

Synchronization helps maintain:

- Data Consistency
- Thread Safety
- Correctness

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | Shared Resource Protection |
| ⭐⭐⭐⭐⭐ | Banking Systems |
| ⭐⭐⭐⭐⭐ | Inventory Management |
| ⭐⭐⭐⭐ | High Throughput APIs |

## Why It Exists

Consider:

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

If multiple threads execute simultaneously:

```text
Race Condition
```

can occur.

## What Is a Race Condition?

A race condition occurs when multiple threads modify shared data concurrently and the final result depends on execution timing.

Example:

```text
Expected Value = 1000
Actual Value = 923
```

## Without Synchronization

```java
class Counter {

    private int count;

    public void increment() {
        count++;
    }
}
```

Multiple threads can update count incorrectly.

## With Synchronization

```java
class Counter {

    private int count;

    public synchronized void increment() {
        count++;
    }
}
```

Only one thread can execute increment() at a time.

## Internal Flow

```text
Thread-1
    ↓
Acquire Monitor Lock
    ↓
Execute Method
    ↓
Release Lock

Thread-2 Waits
```

## synchronized Method

```java
public synchronized void update() {
}
```

Locks the current object.

## synchronized Block

```java
synchronized (lockObject) {
    // Critical Section
}
```

Locks only a specific block of code.

## Method vs Block Synchronization

| synchronized Method | synchronized Block |
| ------------------- | ------------------ |
| Locks Entire Method | Locks Specific Block |
| Simpler | More Flexible |
| More Lock Contention | Better Performance |

## Object Lock vs Class Lock

### Object Lock

```java
public synchronized void update() {
}
```

Lock belongs to an object instance.

### Class Lock

```java
public static synchronized void update() {
}
```

Lock belongs to the class.

## Synchronization vs AtomicInteger

| synchronized | AtomicInteger |
| ------------ | ------------- |
| Uses Locks | Uses CAS |
| Blocking | Non-Blocking |
| General Purpose | Counter Focused |
| More Overhead | Better For Counters |

## Synchronization vs Lock

| synchronized | ReentrantLock |
| ------------ | ------------- |
| Built Into Java | Lock Framework |
| Automatic Unlock | Manual Unlock |
| Easier To Use | More Flexible |
| No tryLock() | Supports tryLock() |

## Real-World Usage

Commonly used in:

- Banking Systems
- Inventory Management
- Shared Counters
- Reservation Systems
- Resource Management

## Production Engineering Perspective

For simple thread safety:

```java
synchronized
```

is usually sufficient.

For advanced requirements:

```java
ReentrantLock
```

may be preferred.

For counters:

```java
AtomicInteger
```

is often the best choice.

## Backend Engineering Reality

Modern applications typically use a combination of:

- synchronized
- ReentrantLock
- AtomicInteger
- ConcurrentHashMap
- BlockingQueue

The goal is to protect shared state while minimizing contention.

## Common Interview Questions

1. What is Synchronization?
2. Why is Synchronization needed?
3. What is a Race Condition?
4. synchronized Method vs Block?
5. Object Lock vs Class Lock?
6. Synchronization vs Lock?
7. Synchronization vs AtomicInteger?
8. What problems does Synchronization solve?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- Synchronization provides thread safety.
- Prevents race conditions.
- Uses monitor locks.
- Only one thread executes the critical section at a time.
- synchronized method locks the entire method.
- synchronized block provides finer control.
- Foundation of Java concurrency.
