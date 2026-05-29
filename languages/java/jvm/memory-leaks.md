

# Memory Leaks

## Overview

A Memory Leak occurs when objects are no longer needed by the application but remain reachable, preventing Garbage Collection from reclaiming memory.

Result:

```text
Unused Objects
       ↓
Remain Referenced
       ↓
Heap Growth
       ↓
Frequent GC
       ↓
OutOfMemoryError
```

Memory Leaks are one of the most common production JVM issues.

## Why Memory Leaks Happen

Garbage Collection removes only unreachable objects.

If references still exist:

```text
Object Reachable
       ↓
Not Eligible For GC
```

Even if the application no longer needs the object.

## Symptoms Of Memory Leaks

### Heap Usage Keeps Growing

```text
Heap Never Returns To Normal
After GC
```

### Frequent Full GC

```text
GC Runs More Often
```

### Application Slowdown

```text
More GC Activity
       ↓
Higher Latency
```

### OutOfMemoryError

```text
Java Heap Space
```

## Common Memory Leak Patterns

### Static Collections

```java
private static final List<Object> cache =
        new ArrayList<>();
```

Problem:

```text
Objects Remain Reachable
For Application Lifetime
```

### Unbounded Cache

```java
Map<String, Object> cache =
        new HashMap<>();
```

Problem:

```text
Continuous Growth
```

Solution:

- Cache Size Limits
- Eviction Policies

### ThreadLocal Leak

```java
private static final ThreadLocal<User>
        USER_CONTEXT = new ThreadLocal<>();
```

Problem:

```text
Thread Retains Reference
```

Solution:

```java
USER_CONTEXT.remove();
```

### Listener Leak

Problem:

```text
Event Listener Registered
But Never Removed
```

### Connection Leak

```java
Connection connection =
        dataSource.getConnection();
```

Problem:

```text
Connection Never Closed
```

Solution:

```java
try-with-resources
```

## How To Detect Memory Leaks

### GC Logs

Indicators:

```text
Full GC Increasing
Heap Usage Increasing
```

### Heap Dumps

Capture:

```bash
jcmd <pid> GC.heap_dump heap.hprof
```

Analyze Using:

- Eclipse MAT
- VisualVM

### Memory Monitoring

Monitor:

- Heap Usage
- Full GC Count
- Allocation Rate

## Heap Dump Investigation

Workflow:

```text
Capture Heap Dump
       ↓
Open MAT
       ↓
Histogram Analysis
       ↓
Dominator Tree
       ↓
Find Retained Objects
       ↓
Identify Leak
```

## Dominator Tree Analysis

Example:

```text
Static Cache
      ↓
ArrayList
      ↓
500,000 Objects
```

Questions:

- Why Is Object Retained?
- Is Retention Expected?

## Real Production Example

```text
Spring Boot Service
        ↓
Heap Growth Observed
        ↓
Frequent Full GC
        ↓
Heap Dump Captured
        ↓
Large Cache Found
        ↓
Cache Eviction Added
        ↓
Issue Resolved
```

## Memory Leak vs High Memory Usage

| Memory Leak | High Memory Usage |
| ----------- | ---------------- |
| Unwanted Retention | Expected Usage |
| Heap Keeps Growing | Heap Stabilizes |
| Frequent Full GC | GC Remains Healthy |
| Eventually OOM | Usually Stable |

## Production Engineering Perspective

### Most Common Leak Sources

- Static Collections
- Unbounded Caches
- ThreadLocal Values
- Event Listeners
- Database Connections
- Large Object Graphs

## Most Asked Interview Questions

1. What is a Memory Leak?
2. Why doesn't GC remove leaked objects?
3. How do you identify a Memory Leak?
4. What are common Memory Leak patterns?
5. What is a ThreadLocal Leak?
6. How do Heap Dumps help?
7. What is a Dominator Tree?
8. Memory Leak vs High Memory Usage?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Highest Priority

### Remember

- Memory Leaks occur because objects remain reachable.
- Reachable objects are not garbage collected.
- Heap Dumps are the primary leak investigation tool.
- Eclipse MAT is commonly used for analysis.
- ThreadLocal and cache leaks are very common.
- Frequent Full GC is often an early warning sign.
- One of the most important JVM troubleshooting topics.