

# Producer Consumer Pattern

## What Is Producer Consumer Pattern?

Producer Consumer is a concurrency design pattern where:

- Producer creates data.
- Consumer processes data.
- A shared queue acts as a buffer between them.

This pattern helps decouple work generation from work processing.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Messaging Systems |
| ⭐⭐⭐⭐⭐ | Event Processing |
| ⭐⭐⭐⭐⭐ | Background Jobs |
| ⭐⭐⭐⭐⭐ | High Throughput Systems |
| ⭐⭐⭐⭐ | Distributed Systems |

## Why It Exists

Without a buffer:

```text
Producer
    ↓
Consumer
```

Problems:

- Producer may be faster.
- Consumer may be slower.
- Work can be lost.
- Systems become tightly coupled.

Producer Consumer solves this using a queue.

## Internal Flow

```text
Producer
    ↓
BlockingQueue
    ↓
Consumer
```

The queue stores tasks until consumers are ready.

## Basic Example

```java
BlockingQueue<String> queue =
        new LinkedBlockingQueue<>();
```

Producer:

```java
queue.put("Task-1");
```

Consumer:

```java
String task = queue.take();
```

## Why BlockingQueue?

BlockingQueue provides:

- Thread Safety
- Automatic Coordination
- Blocking Operations

Example:

```java
queue.put(task);
queue.take();
```

Behavior:

```text
Queue Full
    ↓
Producer Waits

Queue Empty
    ↓
Consumer Waits
```

## Common BlockingQueue Implementations

### LinkedBlockingQueue

```java
new LinkedBlockingQueue<>()
```

Most commonly used.

### ArrayBlockingQueue

```java
new ArrayBlockingQueue<>(100)
```

Fixed capacity queue.

### PriorityBlockingQueue

```java
new PriorityBlockingQueue<>()
```

Processes tasks based on priority.

## Real-World Usage

Commonly used in:

- Kafka Consumers
- Message Queues
- Notification Systems
- Email Processing
- Background Workers
- Order Processing Systems

## Producer Consumer vs Direct Processing

| Direct Processing | Producer Consumer |
| ----------------- | ----------------- |
| Tight Coupling | Loose Coupling |
| Poor Scalability | Better Scalability |
| No Buffer | Queue Buffer |
| Less Resilient | More Resilient |

## Production Engineering Perspective

Producer Consumer is one of the most common concurrency patterns.

Examples:

```text
API Request
      ↓
Queue
      ↓
Worker Service
```

```text
Order Creation
      ↓
Kafka Topic
      ↓
Order Processor
```

## Backend Engineering Reality

Many backend systems are built around Producer Consumer concepts.

Examples:

- Kafka
- RabbitMQ
- ActiveMQ
- Background Job Systems
- Event Driven Architectures

The queue provides:

- Decoupling
- Reliability
- Scalability

## Common Interview Questions

1. What is Producer Consumer Pattern?
2. Why is BlockingQueue used?
3. How does BlockingQueue work?
4. What happens when the queue is full?
5. What happens when the queue is empty?
6. Producer Consumer vs Direct Processing?
7. Where is this pattern used in production?
8. Why is it important for scalable systems?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Producer creates work.
- Consumer processes work.
- BlockingQueue acts as a buffer.
- Queue provides thread-safe communication.
- Producer Consumer improves scalability.
- Foundation of messaging and event-driven systems.