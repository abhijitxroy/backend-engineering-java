# Thread vs Runnable

## What Are They?

Thread and Runnable are fundamental building blocks of Java concurrency.

A Thread represents an execution path.

Runnable represents a task to be executed.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | ExecutorService |
| ⭐⭐⭐⭐⭐ | Async Processing |
| ⭐⭐⭐⭐ | Background Jobs |
| ⭐⭐⭐⭐ | High Throughput Systems |

## Why They Exist

Applications often need to:

- Process requests concurrently
- Execute background jobs
- Improve throughput
- Utilize multiple CPU cores

Java provides Thread and Runnable to support concurrent execution.

## Thread

Thread represents an actual execution thread.

Example:

```java
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Task Running");
    }
}
```

Execution:

```java
new MyThread().start();
```

## Runnable

Runnable represents a task.

Example:

```java
class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Task Running");
    }
}
```

Execution:

```java
Thread thread = new Thread(new Task());
thread.start();
```

## Internal Relationship

```text
Runnable
    ↓
Task Definition
    ↓
Thread
    ↓
Execution
```

Runnable defines work.

Thread executes work.

## Basic Comparison

| Thread | Runnable |
| -------- | -------- |
| Represents Execution Thread | Represents Task |
| Uses Inheritance | Uses Interface |
| Tight Coupling | Better Separation |
| Less Flexible | More Flexible |

## Why Runnable Is Preferred

### Thread Approach

```java
class MyThread extends Thread {
}
```

Problem:

```text
Inheritance Already Used
        ↓
Cannot Extend Another Class
```

### Runnable Approach

```java
class Task implements Runnable {
}
```

Benefits:

- Better Design
- Loose Coupling
- Supports Inheritance
- Reusable Tasks

## Thread Lifecycle

```text
New
 ↓
Runnable
 ↓
Running
 ↓
Blocked / Waiting
 ↓
Terminated
```

## Thread vs Runnable vs Callable

| Thread | Runnable | Callable |
| -------- | -------- | -------- |
| Execution Unit | Task | Task With Result |
| No Result | No Result | Returns Result |
| Direct Execution | Used By Thread | Used By ExecutorService |

## Real-World Usage

### Thread

Used for:

- Learning Concurrency
- Low-Level Thread Management

### Runnable

Used for:

- ExecutorService Tasks
- Background Processing
- Worker Threads
- Async Operations

## Production Engineering Perspective

Modern applications rarely create threads directly.

Instead:

```java
ExecutorService
CompletableFuture
```

are preferred.

Runnable remains one of the most commonly used concurrency interfaces.

## Backend Engineering Reality

Typical flow:

```text
Runnable
    ↓
ExecutorService
    ↓
Thread Pool
    ↓
Execution
```

Most production systems create tasks rather than manually managing threads.

## Common Interview Questions

1. Thread vs Runnable?
2. Why is Runnable preferred?
3. Can Runnable return a value?
4. Why does Runnable improve flexibility?
5. What is the Thread lifecycle?
6. Thread vs Callable?
7. How are Runnable and ExecutorService related?
8. Which approach is used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- Thread represents execution.
- Runnable represents work.
- Runnable is generally preferred.
- Runnable supports better design through composition.
- ExecutorService typically executes Runnable tasks.
- Modern applications rarely create raw threads directly.
- Foundation of Java concurrency.
