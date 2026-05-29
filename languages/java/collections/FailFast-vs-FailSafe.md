

# Fail Fast vs Fail Safe Iterator

## What Are They?

Fail Fast and Fail Safe describe how Java collections behave when modified while being iterated.

This is a very common Java collections interview topic.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Collection Processing |
| ⭐⭐⭐⭐⭐ | Multi-Threaded Applications |
| ⭐⭐⭐⭐ | Concurrent Programming |
| ⭐⭐⭐⭐ | Production Debugging |
| ⭐⭐⭐⭐ | Collection Safety |

## Why It Exists

Imagine one thread is iterating over a collection while another thread modifies it.

Without protection:

- Data inconsistency can occur
- Unexpected behavior can occur
- Application bugs become difficult to debug

Java provides different iterator behaviors to handle these situations.

## Fail Fast Iterator

Fail Fast immediately throws an exception if the collection is modified during iteration.

Exception:

```java
ConcurrentModificationException
```

Example Collections:

- ArrayList
- HashMap
- HashSet

Example:

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Alice");

for (String name : names) {
    names.add("Bob");
}
```

Result:

```text
ConcurrentModificationException
```

## Internal Working

Fail Fast uses:

```text
modCount
```

Collection stores a modification count.

Iterator stores the original value.

During iteration:

```text
Current modCount
        ↓
Compare
        ↓
Iterator modCount
```

If values differ:

```text
ConcurrentModificationException
```

## Fail Safe Iterator

Fail Safe works on a copy of the collection instead of the original collection.

Modification does not affect iteration.

Example Collections:

- CopyOnWriteArrayList
- ConcurrentHashMap (weakly consistent iterator)

Example:

```java
CopyOnWriteArrayList<String> names =
        new CopyOnWriteArrayList<>();

names.add("John");
names.add("Alice");

for (String name : names) {
    names.add("Bob");
}
```

No exception occurs.

## Comparison

| Fail Fast | Fail Safe |
| ---------- | ---------- |
| Uses Original Collection | Uses Copy or Safe View |
| Throws ConcurrentModificationException | No Exception |
| Better Performance | More Memory Usage |
| Not Safe For Concurrent Modification | Supports Concurrent Modification |
|
Examples: ArrayList, HashMap | Examples: CopyOnWriteArrayList, ConcurrentHashMap |

## Real-World Usage

### Fail Fast

Used in:

- Standard Collection Processing
- Single-Threaded Applications
- Most Business Logic

### Fail Safe

Used in:

- Concurrent Systems
- Event Processing
- Caching Systems
- High-Concurrency Applications

## Production Engineering Perspective

In production systems:

- Fail Fast collections are more common.
- Fail Safe collections are used when concurrent updates are expected.
- CopyOnWriteArrayList is useful for read-heavy workloads.
- ConcurrentHashMap provides safe concurrent iteration.

## Backend Engineering Reality

Most backend applications use:

```java
ArrayList
HashMap
```

which are Fail Fast.

For concurrent applications:

```java
ConcurrentHashMap
CopyOnWriteArrayList
```

are common choices.

## Common Interview Questions

1. What is Fail Fast Iterator?
2. What is Fail Safe Iterator?
3. What is ConcurrentModificationException?
4. How does modCount work?
5. Why does Fail Fast throw an exception?
6. ArrayList is Fail Fast or Fail Safe?
7. ConcurrentHashMap is Fail Fast or Fail Safe?
8. CopyOnWriteArrayList use cases?

## Quick Revision

### Priority

⭐⭐⭐⭐ Very High Priority

### Remember

- Fail Fast throws ConcurrentModificationException.
- Fail Safe works on a copy or safe view.
- ArrayList and HashMap are Fail Fast.
- CopyOnWriteArrayList is Fail Safe.
- ConcurrentHashMap provides safe concurrent iteration.
- Fail Fast is more common in everyday backend applications.