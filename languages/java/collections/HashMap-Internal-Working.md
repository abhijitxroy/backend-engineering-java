

# HashMap Internal Working

## What Is HashMap?

HashMap is the most commonly used implementation of the Map interface in Java.

It stores data as key-value pairs and provides near O(1) lookup performance.

```java
Map<Integer, String> users = new HashMap<>();
```

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Caching Systems |
| ⭐⭐⭐⭐⭐ | API Processing |
| ⭐⭐⭐⭐⭐ | Metadata Storage |
| ⭐⭐⭐⭐⭐ | Configuration Management |
| ⭐⭐⭐⭐⭐ | Collection Interviews |

## Why It Exists

Searching data inside a List requires scanning elements one by one.

```text
O(n)
```

HashMap uses hashing to provide much faster lookups.

```text
O(1)
```

for most operations.

## Internal Structure

HashMap stores data using buckets.

```text
Bucket 0
Bucket 1
Bucket 2
Bucket 3
Bucket 4
```

Each bucket stores entries.

```text
Key → Value
```

## How put() Works

Example:

```java
map.put("user1", "John");
```

Flow:

```text
Key
 ↓
hashCode()
 ↓
Hash Calculation
 ↓
Bucket Selection
 ↓
Store Entry
```

## How get() Works

Example:

```java
map.get("user1");
```

Flow:

```text
Key
 ↓
hashCode()
 ↓
Find Bucket
 ↓
Find Matching Key
 ↓
Return Value
```

## Collision

Collision occurs when multiple keys map to the same bucket.

```text
Bucket 5
 ├── Key1
 ├── Key2
 └── Key3
```

HashMap must then search within that bucket.

## Java 7 Collision Handling

Java 7 uses:

```text
Linked List
```

```text
Bucket
 ↓
Node → Node → Node
```

Worst case:

```text
O(n)
```

## Java 8 Collision Handling

Java 8 introduced treeification.

When bucket size becomes large:

```text
Linked List
        ↓
     Red Black Tree
```

Lookup becomes:

```text
O(log n)
```

instead of:

```text
O(n)
```

## Load Factor

Default Load Factor:

```text
0.75
```

Meaning:

```text
75% Full
        ↓
Resize Triggered
```

Example:

```java
HashMap<Integer, String> map =
        new HashMap<>(16);
```

Resize threshold:

```text
16 × 0.75 = 12
```

After 12 entries:

```text
Resize
```

## Rehashing

During resize:

```text
Old Capacity = 16
        ↓
New Capacity = 32
```

Entries are redistributed into new buckets.

This process is called rehashing.

## Time Complexity

| Operation | Complexity |
| ---------- | ---------- |
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| Worst Case Search | O(log n) (Java 8) |

## HashMap vs Hashtable

| HashMap | Hashtable |
| -------- | -------- |
| Not Thread-Safe | Thread-Safe |
| Faster | Slower |
| Allows One Null Key | No Null Key |
| Allows Null Values | No Null Values |

## HashMap vs ConcurrentHashMap

| HashMap | ConcurrentHashMap |
| -------- | ---------------- |
| Not Thread-Safe | Thread-Safe |
| Single Thread Usage | Multi-Thread Usage |
| Allows Null | No Null Support |
| Higher Performance In Single Thread | Better Under Concurrency |

## Real-World Usage

HashMap is heavily used in:

- Caching
- API Processing
- Session Storage
- Configuration Storage
- Metadata Management
- Lookup Tables

## Backend Engineering Reality

HashMap is one of the most frequently used collections in Java backend applications.

Typical examples:

- Request Context Storage
- Configuration Data
- In-Memory Lookup Tables
- DTO Transformations
- Aggregation Operations

## Common Interview Questions

1. How does HashMap work internally?
2. What is hashing?
3. What is collision?
4. How does Java 8 handle collisions?
5. What is load factor?
6. What is rehashing?
7. HashMap vs Hashtable?
8. HashMap vs ConcurrentHashMap?
9. Why is HashMap not thread-safe?
10. Why is lookup generally O(1)?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- HashMap stores key-value pairs.
- Uses hashing for fast lookups.
- Data is stored in buckets.
- Collision occurs when multiple keys map to the same bucket.
- Java 8 converts large bucket chains into Red Black Trees.
- Default Load Factor is 0.75.
- Resize triggers rehashing.
- One of the most important Java interview topics.