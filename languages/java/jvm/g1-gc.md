

# G1 Garbage Collector (G1 GC)

## Overview

G1 (Garbage First) GC is the default garbage collector in modern Java versions.

It was designed for:

- Large Heap Sizes
- Low Pause Times
- Predictable Performance
- Server Applications
- Cloud Native Systems

Introduced In:

```text
Java 7
```

Default Since:

```text
Java 9
```

## Why G1 GC Was Introduced

Older collectors had limitations.

### Serial GC

- Single Threaded
- Long Pause Times

### Parallel GC

- High Throughput
- Longer Stop-The-World Pauses

### CMS GC

- Fragmentation Issues
- Complex Tuning

G1 GC was designed to balance:

```text
Throughput
      +
Low Pause Time
```

## Memory Layout

Unlike older collectors, G1 divides the heap into regions.

```text
Heap
 ├── Region 1
 ├── Region 2
 ├── Region 3
 ├── Region 4
 └── Region N
```

Regions can act as:

- Eden
- Survivor
- Old
- Humongous

## How G1 GC Works

```text
Object Allocation
         ↓
Eden Regions
         ↓
Young GC
         ↓
Survivor Regions
         ↓
Old Regions
         ↓
Mixed GC
```

Key Idea:

```text
Collect Garbage First
From Regions With
Most Reclaimable Memory
```

## Young GC

Targets:

```text
Eden
Survivor
```

Characteristics:

- Frequent
- Fast
- Short Pause Time

## Mixed GC

Targets:

```text
Young Regions
       +
Selected Old Regions
```

Benefits:

- Better Memory Reclamation
- Reduced Full GC Frequency

## Humongous Objects

Large objects are stored in dedicated regions.

Examples:

```java
Large Arrays
Large Buffers
Large Data Structures
```

Important:

Humongous allocations can impact performance.

## G1 GC Phases

### Initial Mark

```text
Identify Reachable Objects
```

### Concurrent Mark

```text
Find Live Objects
```

### Remark

```text
Finalize Marking
```

### Cleanup

```text
Prepare Regions
For Collection
```

## Important JVM Options

Enable G1:

```bash
-XX:+UseG1GC
```

Target Pause Time:

```bash
-XX:MaxGCPauseMillis=200
```

Heap Size:

```bash
-Xms4g
-Xmx4g
```

## G1 GC vs Parallel GC

| G1 GC | Parallel GC |
| ------ | ----------- |
| Low Pause Focus | Throughput Focus |
| Region Based | Generation Based |
| Better For Large Heaps | Better For Simpler Workloads |
| More Predictable | Less Predictable |

## Real Production Example

Typical Usage:

```text
Spring Boot
       ↓
Microservices
       ↓
4GB+ Heap
       ↓
G1 GC
```

Common Environments:

- Kubernetes
- Cloud Platforms
- API Services
- Distributed Systems

## Production Engineering Perspective

### Advantages

- Predictable Pause Times
- Good Large Heap Support
- Better Resource Utilization
- Default Modern JVM Collector

### Limitations

- More Complex Than Parallel GC
- May Not Be Best For Small Heaps
- Requires Monitoring

## Most Asked Interview Questions

1. What is G1 GC?
2. Why was G1 GC introduced?
3. Why is it called Garbage First?
4. How does region-based collection work?
5. What is Mixed GC?
6. What are Humongous Objects?
7. G1 GC vs Parallel GC?
8. Why is G1 GC the default collector?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- G1 GC is the default collector in modern Java.
- Heap is divided into regions.
- G1 prioritizes regions with maximum reclaimable memory.
- Supports predictable pause times.
- Works well with large heaps.
- Common in Spring Boot and microservice deployments.
- One of the most important JVM interview topics.