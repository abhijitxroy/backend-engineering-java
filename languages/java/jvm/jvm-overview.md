
# JVM Overview

Java Virtual Machine (JVM) is the runtime engine responsible for executing Java applications.

JVM provides platform independence, memory management, garbage collection, and runtime optimizations for scalable backend systems.

## Why Backend Engineers Must Know JVM

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Performance Optimization |
| ⭐⭐⭐⭐⭐ | Memory Management |
| ⭐⭐⭐⭐⭐ | Production Troubleshooting |
| ⭐⭐⭐⭐⭐ | Garbage Collection Tuning |
| ⭐⭐⭐⭐ | High-Scale Systems |
| ⭐⭐⭐⭐ | Resource Optimization |

## JVM Architecture

Major JVM components:

- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
- Java Native Interface (JNI)
- Native Method Libraries

```text
Java Source Code
        ↓
      javac
        ↓
    Bytecode
        ↓
       JVM
        ↓
Class Loader
        ↓
Memory Areas
        ↓
Execution Engine
        ↓
Machine Code
```

## Class Loader Subsystem

Responsible for loading classes into JVM memory.

### Class Loading Phases

- Loading
- Linking
- Initialization

### Common Class Loaders

- Bootstrap ClassLoader
- Platform ClassLoader
- Application ClassLoader

### Interview Focus

- Parent Delegation Model
- Class Loading Lifecycle
- Custom Class Loaders

## JVM Memory Areas

JVM Memory
├── Heap
├── Stack
├── Metaspace
├── Code Cache
└── Native Memory

### Heap Memory

Stores:

- Objects
- Application Data
- Collections

Heap Areas:

- Young Generation
- Old Generation

Real Usage:

- Object Allocation
- GC Analysis
- Memory Leak Investigation

### Stack Memory

Stores:

- Method Frames
- Local Variables
- Method Execution Context

Thread-specific memory.

Real Usage:

- StackOverflowError Analysis
- Method Call Tracing

### Metaspace

Stores class metadata.

Replaced PermGen from Java 8.

Real Usage:

- Class Metadata Storage
- Framework Startup Analysis
- Class Loader Troubleshooting

### Native Memory

Allocated outside JVM Heap.

Examples:

- Native Libraries
- Direct ByteBuffer

### Code Cache

Stores:

- JIT Compiled Native Code

Real Usage:

- Runtime Optimizations
- JIT Performance Analysis

## Execution Engine

Responsible for:

- Bytecode Execution
- JIT Compilation
- Garbage Collection

## JIT Compiler

Just-In-Time (JIT) compiler converts bytecode into optimized machine code.

Benefits:

- Faster Execution
- Runtime Optimization
- Improved Performance

## Garbage Collection

Purpose:

Automatically remove unused objects.

### Common Collectors

- Serial GC
- Parallel GC
- G1GC
- ZGC

Collector Learning Path:

- Serial GC
- Parallel GC
- G1 GC
- ZGC

### Backend Discussions

- Pause Time
- Throughput
- Latency Optimization
- Heap Tuning

## JVM Monitoring

### Production Monitoring Areas

- Heap Usage
- GC Activity
- Thread Count
- CPU Usage
- Memory Leak Detection

### Common Tools

- JConsole
- VisualVM
- Java Mission Control (JMC)
- Java Flight Recorder (JFR)

### Common JVM Commands

```bash
jps
jstat
jcmd
jstack
jmap
```

## Heap Dump vs Thread Dump

| Heap Dump | Thread Dump |
| ---------- | ---------- |
| Memory Analysis | Thread Analysis |
| Detect Memory Leaks | Detect Deadlocks |
| Object Investigation | Thread Investigation |

## Production Engineering Perspective

JVM knowledge is critical for:

- GC Tuning
- Heap Sizing
- Memory Leak Analysis
- Performance Optimization
- Production Troubleshooting
- High-Traffic Applications

Understanding JVM internals helps engineers diagnose latency issues, memory problems, and scalability bottlenecks.

## Most Asked Interview Topics

1. JVM Architecture
2. Heap vs Stack
3. Class Loader Lifecycle
4. Parent Delegation Model
5. JIT Compiler
6. G1GC vs ZGC
7. Heap Dump vs Thread Dump
8. Metaspace vs PermGen
9. Memory Leak Analysis
10. OutOfMemoryError vs StackOverflowError
11. GC Logs Analysis
12. Memory Leak Troubleshooting
13. JVM Monitoring Tools
14. JIT Compiler Internals

## Quick Revision

### Highest ROI Topics

1. Heap vs Stack
2. Garbage Collection
3. Class Loaders
4. JIT Compiler
5. Heap Dumps
6. Thread Dumps
7. Memory Leaks
8. JVM Tuning

### Remember

- Heap stores objects.
- Stack stores method execution data.
- Metaspace stores class metadata.
- JIT converts bytecode to machine code.
- GC removes unused objects.
- Heap Dump → Memory Analysis.
- Thread Dump → Thread Analysis.
- JVM knowledge is essential for production debugging and performance tuning.