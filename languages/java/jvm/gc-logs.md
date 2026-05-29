

# GC Logs

## Overview

GC Logs provide detailed information about JVM garbage collection activity.

They help engineers understand:

- Memory Usage
- GC Frequency
- Pause Times
- Full GC Events
- JVM Performance Problems

GC Logs are one of the most important JVM troubleshooting tools.

## Why GC Logs Matter

Production Symptoms:

```text
High CPU Usage
Application Pauses
Slow Response Time
OutOfMemoryError
```

GC Logs help identify the root cause.

## Enabling GC Logs

### Modern JVM (Java 9+)

```bash
-Xlog:gc
```

Detailed Logging:

```bash
-Xlog:gc*
```

Write To File:

```bash
-Xlog:gc:file=gc.log
```

## Sample GC Log

```text
[2.345s][info][gc]
GC(12) Pause Young (Normal)
50M->20M(256M) 8ms
```

## Understanding GC Log Entries

Example:

```text
50M->20M(256M) 8ms
```

Meaning:

```text
Before GC = 50 MB
After GC  = 20 MB
Heap Size = 256 MB
Pause Time = 8 ms
```

## Common GC Events

### Young GC

```text
Pause Young
```

Characteristics:

- Frequent
- Fast
- Expected

### Full GC

```text
Pause Full
```

Characteristics:

- Expensive
- Long Pause Times
- Requires Investigation

Interview Rule:

```text
Occasional Young GC = Normal
Frequent Full GC = Problem
```

## Important Metrics

### GC Frequency

Questions:

```text
How Often Is GC Running?
```

### Pause Time

Questions:

```text
How Long Are Applications Paused?
```

### Memory Reclaimed

Questions:

```text
How Much Memory Is Recovered?
```

### Full GC Count

Questions:

```text
Are Full GCs Increasing?
```

## Common Problems Identified Using GC Logs

### Frequent Young GC

Symptoms:

```text
High Allocation Rate
```

Possible Causes:

- Excessive Object Creation
- Small Heap Size

### Frequent Full GC

Symptoms:

```text
Long Application Pauses
```

Possible Causes:

- Memory Leak
- Undersized Heap

### Heap Growth

Symptoms:

```text
Memory Never Returns
```

Possible Causes:

- Retained Objects
- Memory Leak

## Useful JVM Commands

### jstat

```bash
jstat -gc <pid>
```

### jcmd

```bash
jcmd <pid> GC.heap_info
```

### JFR

```text
Java Flight Recorder
```

## Real Production Example

```text
API Service
      ↓
Latency Spike
      ↓
Check GC Logs
      ↓
Frequent Full GC Found
      ↓
Memory Leak Investigation
```

## Production Engineering Perspective

### Why Engineers Analyze GC Logs

- Performance Tuning
- Capacity Planning
- Memory Leak Detection
- Latency Troubleshooting
- JVM Optimization

## Most Asked Interview Questions

1. What are GC Logs?
2. Why are GC Logs important?
3. How do you enable GC Logs?
4. What information is present in GC Logs?
5. How do you identify Full GC?
6. What causes frequent Full GC?
7. How do GC Logs help detect memory leaks?
8. Which tools are commonly used with GC Logs?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ High Priority

### Remember

- GC Logs show JVM memory activity.
- Full GC events deserve investigation.
- Pause time directly affects latency.
- GC Logs are critical for production troubleshooting.
- Often used with jstat, jcmd and JFR.
- Essential JVM interview topic.