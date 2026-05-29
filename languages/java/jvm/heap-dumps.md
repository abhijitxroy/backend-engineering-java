

# Heap Dumps

## Overview

A Heap Dump is a snapshot of JVM heap memory at a specific point in time.

It contains:

- Objects In Memory
- Object References
- Class Information
- Memory Usage Details

Heap Dumps are one of the most important tools for memory leak investigation.

## Why Heap Dumps Matter

Production Symptoms:

```text
OutOfMemoryError
High Memory Usage
Frequent Full GC
Application Slowdown
```

Heap Dumps help identify the root cause.

## What A Heap Dump Contains

```text
Heap
 ├── Objects
 ├── References
 ├── Class Metadata
 ├── Collections
 └── Memory Consumption
```

Questions Answered:

- Which objects consume memory?
- Why are objects retained?
- Is there a memory leak?
- Which classes occupy most heap space?

## Generating Heap Dumps

### Automatically On OOM

```bash
-XX:+HeapDumpOnOutOfMemoryError
```

Specify Location:

```bash
-XX:HeapDumpPath=/tmp
```

### Using jcmd

```bash
jcmd <pid> GC.heap_dump heap.hprof
```

### Using jmap

```bash
jmap -dump:live,format=b,file=heap.hprof <pid>
```

## Heap Dump Analysis Tools

### Eclipse MAT

Most commonly used tool.

Features:

- Leak Suspect Report
- Dominator Tree
- Histogram
- Retained Heap Analysis

### VisualVM

Useful for:

- Heap Inspection
- Object Analysis
- Basic Troubleshooting

## Important Concepts

### Shallow Heap

Memory occupied by the object itself.

### Retained Heap

Memory that would be freed if the object were removed.

Interview Rule:

```text
Retained Heap
      ↓
More Important
Than
Shallow Heap
```

## Dominator Tree

Shows objects retaining memory.

```text
Root Object
      ↓
Large Collection
      ↓
Millions Of Objects
```

Useful For:

- Leak Detection
- Memory Analysis

## Histogram Analysis

Example:

```text
Class Name          Instances
ArrayList           500000
HashMap             200000
String              1000000
```

Questions:

- Which classes consume memory?
- Are object counts abnormal?

## Common Memory Leak Patterns

### Static Collections

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
Map<String, Object> cache
```

Problem:

```text
Continuous Growth
```

### Listener Leaks

```text
References Remain Active
```

## Real Production Example

```text
OutOfMemoryError
        ↓
Capture Heap Dump
        ↓
Open In MAT
        ↓
Find Dominator Tree
        ↓
Identify Retained Objects
        ↓
Fix Memory Leak
```

## Production Engineering Perspective

### Why Engineers Use Heap Dumps

- Memory Leak Analysis
- OOM Investigation
- Capacity Planning
- Performance Troubleshooting
- JVM Optimization

## Most Asked Interview Questions

1. What is a Heap Dump?
2. Why are Heap Dumps useful?
3. How do you generate a Heap Dump?
4. What is Retained Heap?
5. What is Shallow Heap?
6. What is a Dominator Tree?
7. How do Heap Dumps help identify memory leaks?
8. Which tools analyze Heap Dumps?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Heap Dumps capture JVM memory state.
- Essential for memory leak investigations.
- Eclipse MAT is the most common analysis tool.
- Retained Heap is more important than Shallow Heap.
- Dominator Tree helps identify memory retention.
- Commonly used after OutOfMemoryError.
- Important JVM troubleshooting and interview topic.