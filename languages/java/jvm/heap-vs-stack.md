

# Heap vs Stack

## Overview

Heap and Stack are the two most important JVM memory areas.

Understanding them is essential for:

- Memory Management
- Garbage Collection
- Performance Tuning
- JVM Troubleshooting
- Java Interviews

## JVM Memory View

```text
JVM Memory
├── Heap
└── Stack
```

Both serve different purposes.

## Heap Memory

Heap stores:

- Objects
- Instance Variables
- Arrays
- Collections

Example:

```java
Employee employee =
        new Employee();
```

Memory:

```text
Stack
 └── employee reference

Heap
 └── Employee Object
```

Characteristics:

- Shared Across Threads
- Managed By Garbage Collector
- Larger Memory Area

## Stack Memory

Stack stores:

- Method Calls
- Local Variables
- References
- Execution Frames

Example:

```java
public void process() {
    int count = 10;
}
```

Memory:

```text
Stack Frame
 └── count = 10
```

Characteristics:

- Thread Specific
- Automatically Managed
- Faster Access

## Method Call Flow

Example:

```java
main()
   ↓
process()
   ↓
save()
```

Stack:

```text
Top
┌──────────┐
│ save()   │
├──────────┤
│ process()│
├──────────┤
│ main()   │
└──────────┘
Bottom
```

When a method finishes:

```text
Stack Frame Removed
```

## Heap vs Stack

| Heap | Stack |
| ---- | ----- |
| Stores Objects | Stores Method Frames |
| Shared Across Threads | Thread Specific |
| Managed By GC | Auto Cleanup |
| Larger Memory | Smaller Memory |
| Slower Access | Faster Access |

## Object Allocation Example

```java
Employee employee =
        new Employee();
```

```text
Stack
 └── employee
        ↓

Heap
 └── Employee Object
```

Important:

```text
Reference → Stack
Object    → Heap
```

## Garbage Collection And Heap

Objects become eligible for GC when unreachable.

```java
employee = null;
```

```text
Heap Object
      ↓
No References
      ↓
GC Eligible
```

Only Heap memory is garbage collected.

## StackOverflowError

Cause:

```java
public void recursive() {
    recursive();
}
```

Flow:

```text
Method Call
      ↓
Method Call
      ↓
Method Call
      ↓
Stack Full
      ↓
StackOverflowError
```

## OutOfMemoryError

Cause:

```java
List<Object> data =
        new ArrayList<>();
```

```java
while (true) {
    data.add(new Object());
}
```

Flow:

```text
Heap Growth
      ↓
No Free Memory
      ↓
OutOfMemoryError
```

## String Constant Pool

Stored inside Heap.

```java
String a = "Java";
String b = "Java";
```

```text
Both References
       ↓
Same String Object
```

Benefit:

- Memory Optimization

## Real Production Example

```text
REST Request
      ↓
Controller Method
      ↓
Stack Frame Created
      ↓
Business Objects Created
      ↓
Heap Allocation
      ↓
Response Returned
      ↓
Stack Frame Removed
```

## Production Engineering Perspective

### Heap Problems

- Memory Leaks
- OutOfMemoryError
- Frequent Full GC

### Stack Problems

- Deep Recursion
- StackOverflowError

## Most Asked Interview Questions

1. What is Heap Memory?
2. What is Stack Memory?
3. Heap vs Stack?
4. Where are objects stored?
5. Where are local variables stored?
6. Why is Stack faster than Heap?
7. What causes StackOverflowError?
8. What causes OutOfMemoryError?
9. Does Garbage Collection clean Stack Memory?
10. Where is the String Pool stored?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Highest Priority

### Remember

- Objects live in Heap.
- References usually live in Stack.
- Heap is shared across threads.
- Stack is thread specific.
- Heap is garbage collected.
- Stack frames are removed automatically.
- StackOverflowError occurs due to deep recursion.
- OutOfMemoryError occurs when Heap is exhausted.
- One of the most important JVM interview topics.