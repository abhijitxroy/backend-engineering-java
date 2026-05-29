

# Garbage Collection

## Overview

Garbage Collection (GC) is the JVM process responsible for automatically reclaiming memory occupied by objects that are no longer reachable.

Benefits:

- Automatic Memory Management
- Reduced Memory Leaks
- Better Developer Productivity
- Safer Memory Handling

Without Garbage Collection:

```text
Create Object
      ↓
Use Object
      ↓
Manually Free Memory
```

With Java:

```text
Create Object
      ↓
Use Object
      ↓
JVM Reclaims Memory
```

## Why Garbage Collection Is Needed

Example:

```java
Employee employee =
        new Employee();

employee = null;
```

After the reference is removed:

```text
Object Exists In Heap
         ↓
No Reachable References
         ↓
Eligible For GC
```

## How Garbage Collection Works

GC identifies objects that are no longer reachable.

```text
GC Roots
    ↓
Reachable Objects
    ↓
Live Objects
```

```text
GC Roots
    ↓
Unreachable Objects
    ↓
Garbage
```

## GC Roots

Common GC Roots:

- Local Variables
- Active Threads
- Static Variables
- JNI References

Example:

```java
Employee employee =
        new Employee();
```

The local variable acts as a GC Root reference.

## Generational Heap Model

Modern JVMs organize memory into generations.

```text
Heap
├── Young Generation
│   ├── Eden
│   └── Survivor
└── Old Generation
```

Concept:

```text
Most Objects
      ↓
Die Young
```

This observation drives JVM GC design.

## Young Generation GC

Targets:

```text
Eden
Survivor
```

Characteristics:

- Frequent
- Fast
- Small Pause Times

Flow:

```text
New Object
     ↓
Eden
     ↓
Minor GC
     ↓
Survivor
```

## Old Generation GC

Objects that survive multiple collections are promoted.

```text
Eden
   ↓
Survivor
   ↓
Old Generation
```

Characteristics:

- Less Frequent
- More Expensive
- Longer Pause Times

## Stop-The-World (STW)

During some GC phases:

```text
Application Threads
        ↓
Paused
        ↓
Garbage Collection
        ↓
Resume
```

Interview Note:

Reducing pause time is one of the major goals of modern collectors.

## Types Of Garbage Collectors

### Serial GC

- Single Threaded
- Small Applications

### Parallel GC

- Multiple GC Threads
- Throughput Focused

### G1 GC

- Default Modern Collector
- Region Based
- Low Pause Focus

### ZGC

- Extremely Low Pause Time
- Large Heap Support

## Common GC Problems

### Frequent GC

Symptoms:

- High CPU Usage
- Performance Drops

### Full GC

Symptoms:

- Long Application Pauses
- Throughput Reduction

### Memory Leak

Symptoms:

- Heap Continuously Grows
- OutOfMemoryError

## Monitoring Garbage Collection

Useful Tools:

- jstat
- jcmd
- VisualVM
- JConsole
- Java Flight Recorder (JFR)

Useful JVM Option:

```bash
-Xlog:gc
```

## Real Production Example

```text
Spring Boot Service
         ↓
Receives Requests
         ↓
Creates Objects
         ↓
GC Reclaims Unused Objects
         ↓
Stable Memory Usage
```

## Production Engineering Perspective

### Why It Matters

- JVM Performance
- Application Stability
- Memory Optimization
- Production Troubleshooting
- Capacity Planning

## Most Asked Interview Questions

1. What is Garbage Collection?
2. Why is Garbage Collection needed?
3. What makes an object eligible for GC?
4. What are GC Roots?
5. Young Generation vs Old Generation?
6. What is Stop-The-World?
7. Minor GC vs Major GC?
8. G1 GC vs ZGC?
9. Can System.gc() force garbage collection?
10. How do you monitor GC activity?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Highest Priority

### Remember

- Garbage Collection reclaims unused memory.
- Reachability determines object liveness.
- GC starts from GC Roots.
- Most objects die in the Young Generation.
- Stop-The-World pauses affect latency.
- G1 is the default collector in modern Java.
- GC knowledge is essential for JVM troubleshooting.
- One of the most important Java interview topics.