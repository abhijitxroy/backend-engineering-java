

# ZGC (Z Garbage Collector)

## Overview

ZGC (Z Garbage Collector) is a low-latency garbage collector designed for applications that require extremely short GC pause times.

Goals:

- Low Latency
- Large Heap Support
- High Scalability
- Predictable Performance
- Cloud Native Deployments

Introduced In:

```text
Java 11 (Experimental)
```

Production Ready:

```text
Modern Java Releases
```

## Why ZGC Was Introduced

Traditional collectors can introduce noticeable pause times.

Problems:

```text
Large Heap
      ↓
Long GC Pause
      ↓
Application Latency
```

ZGC minimizes pause times regardless of heap size.

## Key Features

### Ultra Low Pause Time

Typical Goal:

```text
Less Than 1-10 ms
```

Even with large heaps.

### Large Heap Support

Supports:

```text
Hundreds Of GB
To Multi-TB Heaps
```

### Concurrent Collection

Most GC work happens while the application continues running.

```text
Application Running
         ↓
ZGC Working Concurrently
```

## How ZGC Works

Simplified Flow:

```text
Object Allocation
         ↓
Concurrent Mark
         ↓
Concurrent Relocate
         ↓
Memory Reclaimed
```

Design Goal:

```text
Minimize Stop-The-World Pauses
```

## Colored Pointers

One of ZGC's unique innovations.

Pointers contain metadata used by the collector.

Benefits:

- Fast Object Tracking
- Efficient Relocation
- Reduced Pause Time

Interview Note:

```text
Colored Pointers
```

is one of the most commonly discussed ZGC concepts.

## ZGC vs G1 GC

| ZGC | G1 GC |
| ---- | ----- |
| Ultra Low Latency | Low Latency |
| Concurrent Relocation | Region Based Collection |
| Very Large Heap Support | Large Heap Support |
| More Advanced | Simpler Default Choice |
| Latency Focused | Balanced Throughput And Latency |

## JVM Options

Enable ZGC:

```bash
-XX:+UseZGC
```

Heap Example:

```bash
-Xms8g
-Xmx8g
```

## Real Production Example

```text
Financial Trading System
          ↓
Large Heap
          ↓
Strict Latency Requirement
          ↓
ZGC
```

Other Use Cases:

- Trading Platforms
- Real-Time Analytics
- Large Scale APIs
- Streaming Systems
- Cloud Native Services

## ZGC vs G1 Selection

Use G1 When:

- General Purpose Applications
- Spring Boot Services
- Standard Microservices

Use ZGC When:

- Very Low Latency Required
- Very Large Heaps
- Latency More Important Than Throughput

## Advantages

- Extremely Low Pause Times
- Better User Experience
- Excellent Large Heap Support
- Predictable Latency
- Modern JVM Design

## Limitations

- More Advanced Configuration
- Not Always Necessary
- May Provide Limited Benefit For Small Applications

## Production Engineering Perspective

### Why Engineers Use ZGC

- Low Latency Systems
- Large Heap Deployments
- Performance Sensitive Applications
- Modern Cloud Platforms

## Most Asked Interview Questions

1. What is ZGC?
2. Why was ZGC introduced?
3. How does ZGC reduce pause times?
4. What are Colored Pointers?
5. ZGC vs G1 GC?
6. When should ZGC be used?
7. Is ZGC better than G1 GC?
8. What workloads benefit most from ZGC?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- ZGC is designed for extremely low latency.
- Most GC work happens concurrently.
- Colored Pointers are a key ZGC concept.
- ZGC supports very large heaps.
- G1 remains the default choice for most applications.
- ZGC is valuable for latency-sensitive workloads.
- Frequently discussed in modern JVM interviews.