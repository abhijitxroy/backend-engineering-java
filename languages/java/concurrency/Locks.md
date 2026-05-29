# Locks

## What Are Locks?

Locks are concurrency mechanisms used to control access to shared resources.

They help prevent:

- Race Conditions
- Data Corruption
- Inconsistent State

Java provides lock implementations through:

```java
java.util.concurrent.locks
```

## Why Backend Engineers Must Know Locks

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | Shared Resource Protection |
| ⭐⭐⭐⭐⭐ | High Throughput Systems |
| ⭐⭐⭐⭐ | Banking Systems |
| ⭐⭐⭐⭐ | Distributed Processing |

## Why They Exist

Consider:

```java
balance = balance - 100;
```

Multiple threads updating the same value can cause:

```text
Race Condition
```

Locks ensure only one thread accesses the critical section at a time.

## Traditional Synchronization

```java
synchronized void withdraw() {
}
```

Works well but offers limited control.

## Lock Interface

Java provides:

```java
Lock
```

Implementation:

```java
ReentrantLock
```

Example:

```java
Lock lock = new ReentrantLock();
```

## Basic Example

```java
lock.lock();

try {
    // Critical Section
} finally {
    lock.unlock();
}
```

Always release locks in finally blocks.

## Internal Flow

```text
Thread-1
    ↓
Acquire Lock
    ↓
Execute Critical Section
    ↓
Release Lock

Thread-2 Waits
```

## ReentrantLock

Most commonly used lock implementation.

Features:

- Explicit Locking
- Explicit Unlocking
- Fairness Support
- Try Lock Support
- Interruptible Locking

Example:

```java
Lock lock = new ReentrantLock();
```

## tryLock()

Attempts to acquire a lock without waiting forever.

```java
if (lock.tryLock()) {
    try {
        // Process
    } finally {
        lock.unlock();
    }
}
```

Useful for avoiding deadlocks.

## Fair Lock

```java
Lock lock = new ReentrantLock(true);
```

Behavior:

```text
First Come
      ↓
First Served
```

Provides fairness but may reduce performance.

## Lock vs synchronized

| synchronized | Lock |
| ------------ | ---- |
| Implicit Locking | Explicit Locking |
| Automatic Release | Manual Release |
| Less Flexible | More Flexible |
| No tryLock() | Supports tryLock() |
| No Fairness Option | Fairness Supported |

## Real-World Usage

Commonly used in:

- Banking Systems
- Inventory Management
- Reservation Systems
- Concurrent Counters
- Shared Resource Protection

## Production Engineering Perspective

In most applications:

```java
synchronized
```

is sufficient.

Use:

```java
ReentrantLock
```

when additional control is required.

Examples:

- Timeout Handling
- Fair Locking
- Interruptible Locking
- Advanced Concurrency Control

## Backend Engineering Reality

Most production code uses:

- synchronized
- ReentrantLock
- Atomic Classes
- Concurrent Collections

Direct lock management should be used carefully because incorrect usage can cause:

- Deadlocks
- Thread Starvation
- Resource Leaks

## Common Interview Questions

1. What is a Lock?
2. Why use ReentrantLock?
3. Lock vs synchronized?
4. What is tryLock()?
5. What is a Fair Lock?
6. Why unlock in finally?
7. What problems do locks solve?
8. When should Lock be used over synchronized?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Locks control access to shared resources.
- ReentrantLock is the most common implementation.
- Always unlock in finally.
- tryLock() helps avoid indefinite waiting.
- Lock provides more control than synchronized.
- Incorrect lock usage can cause deadlocks.
