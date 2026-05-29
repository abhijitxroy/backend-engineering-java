

# Memory Analysis

## Overview

Memory Analysis is the process of understanding how JVM memory is being used and identifying problems that affect application performance and stability.

Goals:

- Detect Memory Leaks
- Investigate OutOfMemoryError
- Analyze Heap Usage
- Reduce GC Pressure
- Improve JVM Performance

## Why Memory Analysis Matters

Production Symptoms:

```text
OutOfMemoryError
Frequent Full GC
High Heap Usage
Application Slowdown
Container Restarts
```

Memory analysis helps identify the root cause.

## Memory Analysis Workflow

```text
Memory Problem
      ↓
Collect Metrics
      ↓
Analyze GC Logs
      ↓
Capture Heap Dump
      ↓
Analyze Objects
      ↓
Identify Root Cause
      ↓
Fix Problem
```

## What To Analyze

### Heap Usage

Questions:

```text
How Much Heap Is Used?
How Fast Is Heap Growing?
Does Memory Return After GC?
```

### Garbage Collection

Questions:

```text
Are Full GCs Increasing?
Are Pause Times Growing?
Is GC Running Frequently?
```

### Object Growth

Questions:

```text
Which Objects Keep Growing?
Which Collections Retain Memory?
```

## Common Analysis Tools

### jstat

```bash
jstat -gc <pid>
```

Used For:

- GC Statistics
- Heap Monitoring

### jcmd

```bash
jcmd <pid> GC.heap_info
```

Used For:

- Heap Information
- JVM Diagnostics

### VisualVM

Used For:

- Heap Monitoring
- Thread Monitoring
- GC Activity

### Eclipse MAT

Used For:

- Heap Dump Analysis
- Leak Detection
- Dominator Tree Analysis

## Memory Leak Investigation

Common Indicators:

```text
Heap Continuously Grows
Frequent Full GC
OutOfMemoryError
```

Typical Flow:

```text
Capture Heap Dump
       ↓
Open In MAT
       ↓
Check Dominator Tree
       ↓
Find Retained Objects
       ↓
Fix Leak
```

## Common Memory Problems

### Static Collection Leak

```java
private static List<Object> cache =
        new ArrayList<>();
```

Problem:

```text
Objects Never Released
```

### Unbounded Cache

```java
Map<String, Object> cache;
```

Problem:

```text
Continuous Memory Growth
```

### ThreadLocal Leak

```java
ThreadLocal<User> context;
```

Problem:

```text
Objects Remain Referenced
```

## Heap Dump Analysis

Important Metrics:

### Shallow Heap

Memory used by the object itself.

### Retained Heap

Memory released if the object is removed.

Interview Rule:

```text
Retained Heap
      ↓
Most Important Metric
```

## GC Analysis

Healthy Pattern:

```text
Young GC → Frequent
Full GC  → Rare
```

Warning Pattern:

```text
Full GC Increasing
Heap Never Shrinks
```

## Real Production Example

```text
Spring Boot Service
        ↓
OutOfMemoryError
        ↓
Heap Dump Captured
        ↓
MAT Analysis
        ↓
Large Cache Found
        ↓
Cache Limits Added
        ↓
Issue Resolved
```

## Production Engineering Perspective

### Why Engineers Perform Memory Analysis

- Memory Leak Detection
- Capacity Planning
- JVM Tuning
- Production Troubleshooting
- Performance Optimization

## Most Asked Interview Questions

1. What is Memory Analysis?
2. Why is Memory Analysis important?
3. How do you investigate OutOfMemoryError?
4. Which tools are used for Memory Analysis?
5. What is Retained Heap?
6. How do you identify Memory Leaks?
7. What is the Dominator Tree?
8. How do GC Logs help Memory Analysis?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Memory Analysis identifies JVM memory problems.
- Heap Dumps are critical for leak investigation.
- Eclipse MAT is the most common analysis tool.
- Retained Heap is more important than Shallow Heap.
- GC Logs and Heap Dumps are used together.
- Memory Analysis is a common senior Java interview topic.