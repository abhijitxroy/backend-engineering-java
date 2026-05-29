# BlockingQueue

## What Is BlockingQueue?

BlockingQueue is a thread-safe Queue implementation designed for producer-consumer scenarios.

It automatically blocks threads when:

- Queue is full during insertion
- Queue is empty during retrieval

This helps coordinate communication between multiple threads safely.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Producer Consumer Systems |
| ⭐⭐⭐⭐⭐ | Asynchronous Processing |
| ⭐⭐⭐⭐⭐ | Background Jobs |
| ⭐⭐⭐⭐⭐ | Messaging Systems |
| ⭐⭐⭐⭐ | Multi-Threaded Applications |

## Why It Exists

Without BlockingQueue:

- Manual synchronization is required
- Race conditions become common
- Producer-consumer logic becomes complex

BlockingQueue provides built-in thread coordination.

## Internal Working

```text
Producer Thread
        ↓
   BlockingQueue
        ↓
Consumer Thread
```

If queue becomes full:

```text
Producer Waits
```

If queue becomes empty:

```text
Consumer Waits
```

## Common Implementations

### ArrayBlockingQueue

Fixed-size queue.

```java
BlockingQueue<String> queue =
        new ArrayBlockingQueue<>(10);
```

### LinkedBlockingQueue

Optionally bounded queue.

```java
BlockingQueue<String> queue =
        new LinkedBlockingQueue<>();
```

### PriorityBlockingQueue

Processes elements based on priority.

```java
BlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>();
```

## Important Methods

| Method | Behavior |
| -------- | -------- |
| put() | Wait if queue is full |
| take() | Wait if queue is empty |
| offer() | Insert without blocking |
| poll() | Retrieve without blocking |
| peek() | View head element |

## Producer Consumer Example

```java
BlockingQueue<String> queue =
        new LinkedBlockingQueue<>();

queue.put("Task-1");
String task = queue.take();
```

## Real-World Usage

Commonly used in:

- Job Processing Systems
- Task Queues
- Messaging Systems
- Event Processing Pipelines
- Background Workers
- Notification Systems

## BlockingQueue vs Queue

| Queue | BlockingQueue |
| ------- | ------------- |
| Not necessarily thread-safe | Thread-safe |
| No blocking support | Supports blocking |
| Manual synchronization required | Built-in synchronization |
| Single-threaded usage common | Multi-threaded usage common |

## Production Engineering Perspective

BlockingQueue is one of the most common building blocks in concurrent backend applications.

Typical use cases:

- Worker Pools
- Task Scheduling
- Message Processing
- Asynchronous Systems
- Producer Consumer Architectures

## Common Interview Questions

1. What is BlockingQueue?
2. Why is BlockingQueue thread-safe?
3. Difference between Queue and BlockingQueue?
4. What is Producer Consumer Problem?
5. put() vs offer()?
6. take() vs poll()?
7. ArrayBlockingQueue vs LinkedBlockingQueue?
8. Where is BlockingQueue used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐ Very High Priority

### Remember

- BlockingQueue is thread-safe.
- Used for producer-consumer systems.
- put() waits if queue is full.
- take() waits if queue is empty.
- Common in worker pools and messaging systems.
- One of the most important Java concurrency collections.
