# CopyOnWriteArrayList

## What Is CopyOnWriteArrayList?

CopyOnWriteArrayList is a thread-safe implementation of the List interface.

Whenever a modification occurs:

```text
add()
remove()
update()
```

it creates a new copy of the underlying array.

This allows readers to access data safely without being affected by concurrent modifications.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Concurrent Applications |
| ⭐⭐⭐⭐⭐ | Read-Heavy Systems |
| ⭐⭐⭐⭐ | Event Processing |
| ⭐⭐⭐⭐ | Configuration Storage |
| ⭐⭐⭐⭐ | Listener Registries |

## Why It Exists

Traditional collections such as:

```java
ArrayList
```

are not thread-safe.

Concurrent modifications can cause:

```text
ConcurrentModificationException
```

CopyOnWriteArrayList provides safe iteration and concurrent access.

## Internal Working

Normal ArrayList:

```text
Read
Read
Read
Write
     ↓
ConcurrentModificationException
```

CopyOnWriteArrayList:

```text
Read
Read
Read
Write
     ↓
Create New Copy
     ↓
Replace Old Array
```

Readers continue using the old snapshot while writers update a new copy.

## Basic Example

```java
CopyOnWriteArrayList<String> users =
        new CopyOnWriteArrayList<>();

users.add("John");
users.add("Alice");
```

## Safe Iteration Example

```java
for (String user : users) {
    users.add("Bob");
}
```

No ConcurrentModificationException occurs.

## CopyOnWriteArrayList vs ArrayList

| ArrayList | CopyOnWriteArrayList |
| ---------- | ------------------- |
| Not Thread-Safe | Thread-Safe |
| Fast Writes | Expensive Writes |
| Fast Memory Usage | Higher Memory Usage |
| Fail Fast Iterator | Safe Iteration |

## Performance Characteristics

| Operation | Complexity |
| ---------- | ---------- |
| Read | O(1) |
| Iteration | Very Fast |
| Add | O(n) |
| Remove | O(n) |
| Update | O(n) |

Writes are expensive because a new array is created.

## Real-World Usage

Commonly used in:

- Event Listener Lists
- Subscriber Registries
- Application Configuration
- Read-Mostly Collections
- Monitoring Systems

## When To Use

Use CopyOnWriteArrayList when:

- Reads greatly outnumber writes.
- Thread safety is required.
- Safe iteration is important.
- Collection size is relatively small.

## When Not To Use

Avoid when:

- Frequent writes occur.
- Collection size is very large.
- Memory usage is critical.

## Production Engineering Perspective

CopyOnWriteArrayList is not a replacement for ArrayList.

It is a specialized collection designed for:

- Many Readers
- Few Writers
- Safe Concurrent Iteration

In most applications:

```java
ArrayList
```

remains the default choice.

## Common Interview Questions

1. What is CopyOnWriteArrayList?
2. Why is it thread-safe?
3. How does it work internally?
4. Why are writes expensive?
5. ArrayList vs CopyOnWriteArrayList?
6. Why does it avoid ConcurrentModificationException?
7. When should it be used?
8. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Thread-safe List implementation.
- Creates a new array on every write.
- Readers work on a snapshot.
- Prevents ConcurrentModificationException.
- Best for read-heavy workloads.
- Poor choice for write-heavy workloads.
