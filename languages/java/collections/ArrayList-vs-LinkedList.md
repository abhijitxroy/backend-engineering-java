

# ArrayList vs LinkedList

## What Are They?

Both ArrayList and LinkedList are implementations of the List interface.

They maintain insertion order and allow duplicate elements.

The major difference is how data is stored internally.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Collection Selection |
| ⭐⭐⭐⭐⭐ | Performance Optimization |
| ⭐⭐⭐⭐⭐ | API Processing |
| ⭐⭐⭐⭐ | Memory Optimization |
| ⭐⭐⭐⭐ | High-Volume Data Handling |

## Internal Working

### ArrayList

ArrayList uses a dynamic array internally.

```text
[Index]
0 → A
1 → B
2 → C
3 → D
```

Elements are stored in contiguous memory locations.

### LinkedList

LinkedList uses a doubly linked list internally.

```text
A ⇄ B ⇄ C ⇄ D
```

Each node stores:

- Data
- Previous Node Reference
- Next Node Reference

## Performance Comparison

| Operation | ArrayList | LinkedList |
| ---------- | --------- | ---------- |
| Random Access | O(1) | O(n) |
| Search | O(n) | O(n) |
| Insert At End | O(1)* | O(1) |
| Insert In Middle | O(n) | O(1)** |
| Delete In Middle | O(n) | O(1)** |
| Memory Usage | Lower | Higher |

*Amortized

**After node is located

## Real-World Usage

### ArrayList

Commonly used for:

- API Responses
- Database Results
- Data Transformation
- Reporting Systems
- Most Backend Applications

### LinkedList

Commonly used for:

- Queue Implementations
- Deque Implementations
- Frequent Insert/Delete Workloads

## When To Use ArrayList

Use ArrayList when:

- Random access is required
- Read operations are frequent
- Data is mostly appended
- Memory efficiency matters

Example:

```java
List<String> users = new ArrayList<>();
```

## When To Use LinkedList

Use LinkedList when:

- Frequent insertions and deletions occur
- Queue-like behavior is required
- Random access is not important

Example:

```java
List<String> users = new LinkedList<>();
```

## Why ArrayList Is More Common

Most backend applications perform significantly more reads than inserts in the middle of a collection.

ArrayList provides:

- Faster access
- Better CPU cache utilization
- Lower memory overhead

Therefore ArrayList is generally the default List implementation.

## Production Engineering Perspective

In production systems:

- ArrayList is used far more frequently.
- LinkedList is rarely chosen unless insertion/deletion patterns justify it.
- Choosing the wrong collection can impact performance and memory usage.

## Common Interview Questions

1. ArrayList vs LinkedList?
2. Internal working of ArrayList?
3. Internal working of LinkedList?
4. Why is random access faster in ArrayList?
5. Why does LinkedList consume more memory?
6. Which one is used more in production?
7. When should LinkedList be preferred?
8. Why is ArrayList the default choice?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- ArrayList uses a dynamic array.
- LinkedList uses a doubly linked list.
- ArrayList provides O(1) random access.
- LinkedList provides efficient insert/delete after locating a node.
- ArrayList is the most commonly used List implementation.
- Use ArrayList by default unless a specific LinkedList use case exists.