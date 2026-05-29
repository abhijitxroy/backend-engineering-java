

# ThreadLocal

## What Is ThreadLocal?

ThreadLocal provides thread-specific storage.

Each thread gets its own independent copy of a variable.

Changes made by one thread are not visible to other threads.

Package:

```java
java.lang
```

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Request Context |
| ⭐⭐⭐⭐⭐ | Spring Security |
| ⭐⭐⭐⭐⭐ | Logging Correlation IDs |
| ⭐⭐⭐⭐ | Transaction Context |
| ⭐⭐⭐⭐ | Multi-Threaded Applications |

## Why It Exists

Normally:

```java
String userId;
```

is shared between threads.

This can lead to:

```text
Thread Interference
Data Leakage
Incorrect Results
```

ThreadLocal provides thread-isolated storage.

## Internal Flow

```text
Thread-1
    ↓
ThreadLocal
    ↓
User-A

Thread-2
    ↓
ThreadLocal
    ↓
User-B
```

Each thread sees only its own value.

## Basic Example

```java
ThreadLocal<String> currentUser =
        new ThreadLocal<>();

currentUser.set("John");

System.out.println(currentUser.get());
```

## Important Methods

### set()

```java
currentUser.set("John");
```

Stores a value for the current thread.

### get()

```java
currentUser.get();
```

Retrieves the current thread value.

### remove()

```java
currentUser.remove();
```

Removes the value.

### withInitial()

```java
ThreadLocal<Integer> counter =
        ThreadLocal.withInitial(() -> 0);
```

Provides a default value.

## ThreadLocal vs Shared Variable

| Shared Variable | ThreadLocal |
| --------------- | ----------- |
| Shared By Threads | Thread Specific |
| Requires Synchronization | No Synchronization |
| Possible Race Conditions | Isolated Values |
| Shared State | Independent State |

## Real-World Usage

Commonly used in:

- Request Context Storage
- User Context Storage
- Security Context
- Transaction Context
- Logging Correlation IDs

## Spring Framework Usage

Examples:

```text
Spring Security Context
Transaction Management
Request Context
```

Many framework internals rely on ThreadLocal.

## Production Engineering Perspective

ThreadLocal is extremely useful when data belongs to a thread rather than a shared application state.

Typical examples:

- Current User
- Request ID
- Trace ID
- Tenant Information

## Important Warning

Always remove values when finished.

```java
try {
    currentUser.set("John");
} finally {
    currentUser.remove();
}
```

Failing to remove values can cause:

```text
Memory Leaks
Data Leakage Between Requests
```

especially in thread pools.

## Backend Engineering Reality

Common pattern:

```text
Incoming Request
        ↓
Store Request Context
        ↓
Business Logic
        ↓
Remove Context
```

ThreadLocal is frequently used behind the scenes by frameworks.

## Common Interview Questions

1. What is ThreadLocal?
2. Why is ThreadLocal needed?
3. How does ThreadLocal work?
4. ThreadLocal vs Synchronization?
5. Why is remove() important?
6. Can ThreadLocal prevent race conditions?
7. Where is ThreadLocal used in Spring?
8. What problems can improper usage cause?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- ThreadLocal provides thread-specific storage.
- Each thread gets its own value.
- No synchronization is required.
- Commonly used for request and security context.
- Always call remove() when finished.
- Incorrect usage can cause memory leaks in thread pools.