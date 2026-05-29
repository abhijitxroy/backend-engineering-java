

# HashSet vs TreeSet

## What Are They?

Both HashSet and TreeSet are implementations of the Set interface.

They store unique elements and do not allow duplicates.

The major difference is how data is stored and retrieved.

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Collection Selection |
| ⭐⭐⭐⭐⭐ | Data Deduplication |
| ⭐⭐⭐⭐⭐ | Performance Optimization |
| ⭐⭐⭐⭐ | Search Operations |
| ⭐⭐⭐⭐ | Sorted Data Processing |

## Why They Exist

Applications often need:

- Unique Data
- Fast Lookup
- Sorted Data

Different requirements lead to different Set implementations.

## HashSet Internal Working

HashSet is backed by a HashMap.

```text
Element
   ↓
hashCode()
   ↓
Bucket
   ↓
Store Value
```

Characteristics:

- No Duplicate Elements
- Unordered
- Fast Lookup
- Uses Hashing

Example:

```java
Set<String> users = new HashSet<>();
```

## TreeSet Internal Working

TreeSet is backed by a Red Black Tree.

```text
        50
       /  \
     20    70
```

Characteristics:

- No Duplicate Elements
- Sorted Order
- Natural Ordering
- Custom Ordering Supported

Example:

```java
Set<String> users = new TreeSet<>();
```

## Performance Comparison

| Operation | HashSet | TreeSet |
| ---------- | ------- | -------- |
| add() | O(1) | O(log n) |
| contains() | O(1) | O(log n) |
| remove() | O(1) | O(log n) |
| Ordering | No | Yes |

## Ordering Example

### HashSet

```java
Set<Integer> numbers = new HashSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);
```

Possible Output:

```text
50 10 30
```

### TreeSet

```java
Set<Integer> numbers = new TreeSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);
```

Output:

```text
10 30 50
```

## Real-World Usage

### HashSet

Used for:

- Duplicate Detection
- Fast Lookups
- Membership Checks
- Caching Support

### TreeSet

Used for:

- Sorted Results
- Ranking Systems
- Leaderboards
- Ordered Processing

## When To Use HashSet

Use HashSet when:

- Ordering is not required
- Fast lookup is important
- Performance is the priority

## When To Use TreeSet

Use TreeSet when:

- Sorted order is required
- Range operations are needed
- Natural ordering is important

## HashSet vs TreeSet

| HashSet | TreeSet |
| -------- | -------- |
| Backed By HashMap | Backed By Red Black Tree |
| Unordered | Sorted |
| O(1) Operations | O(log n) Operations |
| Better Performance | Maintains Order |
| Uses hashCode() and equals() | Uses Comparable or Comparator |

## Production Engineering Perspective

In backend systems:

- HashSet is used much more frequently.
- TreeSet is used only when sorting requirements exist.
- HashSet is generally the default Set implementation.

## Common Interview Questions

1. HashSet vs TreeSet?
2. How does HashSet work internally?
3. How does TreeSet work internally?
4. Why is HashSet faster?
5. Why does TreeSet maintain order?
6. Can HashSet store duplicates?
7. Does TreeSet use Comparable?
8. Which is more common in production?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Both store unique elements.
- HashSet uses HashMap internally.
- TreeSet uses Red Black Tree internally.
- HashSet provides O(1) operations.
- TreeSet provides sorted data.
- HashSet is more common in backend applications.
- Use HashSet by default unless sorted order is required.