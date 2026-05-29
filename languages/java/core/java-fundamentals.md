# JVM Overview

## What Is JVM?

JVM (Java Virtual Machine) is the runtime engine that executes Java applications.

It provides:

- Platform Independence
- Memory Management
- Garbage Collection
- JIT Compilation
- Thread Management

Java follows:

```text
Write Once
      ↓
Run Anywhere
```

through the JVM.

## Why Backend Engineers Must Know JVM

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Production Troubleshooting |
| ⭐⭐⭐⭐⭐ | Performance Optimization |
| ⭐⭐⭐⭐⭐ | Memory Analysis |
| ⭐⭐⭐⭐⭐ | Garbage Collection |
| ⭐⭐⭐⭐ | High Throughput Systems |

## Java Execution Flow

```text
Java Source Code (.java)
            ↓
Java Compiler (javac)
            ↓
Bytecode (.class)
            ↓
JVM
            ↓
Machine Code
            ↓
Execution
```

## JVM Architecture

```text
Class Loader
      ↓
Runtime Data Areas
      ↓
Execution Engine
      ↓
Garbage Collector
```

## Major JVM Components

### Class Loader

Responsible for:

- Loading Classes
- Linking Classes
- Initializing Classes

Topics:

- Bootstrap ClassLoader
- Platform ClassLoader
- Application ClassLoader

### Runtime Data Areas

Memory used during execution.

Includes:

- Heap
- Stack
- Metaspace
- Native Memory
- PC Register

### Execution Engine

Responsible for:

- Bytecode Execution
- JIT Compilation
- Optimization

### Garbage Collector

Responsible for:

- Memory Cleanup
- Unused Object Removal
- Heap Management

## Runtime Memory Areas

```text
JVM Memory
├── Heap
├── Stack
├── Metaspace
├── Native Memory
└── PC Register
```

## Heap Memory

Stores:

- Objects
- Arrays

Shared across threads.

Most OutOfMemoryError issues originate from Heap.

## Stack Memory

Stores:

- Method Calls
- Local Variables
- References

Each thread has its own stack.

## Metaspace

Stores:

- Class Metadata
- Method Metadata

Introduced in Java 8.

Replaced:

```text
PermGen
```

## JIT Compiler

JIT (Just-In-Time) Compiler converts frequently executed bytecode into native machine code.

Benefits:

- Faster Execution
- Better CPU Utilization
- Runtime Optimizations

## Garbage Collection

Automatically removes unreachable objects.

Common Collectors:

- Serial GC
- Parallel GC
- G1 GC
- ZGC

## JVM Responsibilities

The JVM manages:

- Memory Allocation
- Object Lifecycle
- Thread Scheduling
- Class Loading
- Garbage Collection
- Runtime Optimization

## Real-World Usage

Backend engineers commonly investigate:

- OutOfMemoryError
- High GC Activity
- Thread Deadlocks
- CPU Spikes
- Memory Leaks

All require JVM knowledge.

## Production Engineering Perspective

Most production incidents involve:

- Heap Issues
- GC Problems
- Thread Problems
- JVM Tuning

Understanding JVM internals significantly improves troubleshooting capability.

## JVM Roadmap In This Repository

Topics covered:

- Heap vs Stack
- Class Loaders
- Garbage Collection
- G1 GC
- ZGC
- JIT Compiler
- Memory Leaks
- Thread Dumps
- Heap Dumps
- Memory Analysis
- JVM Tuning
- GC Logs

## Common Interview Questions

1. What is JVM?
2. How does Java achieve platform independence?
3. What is bytecode?
4. JVM architecture?
5. Heap vs Stack?
6. What is Metaspace?
7. What is JIT Compiler?
8. How does Garbage Collection work?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Extremely Important

### Remember

- JVM executes Java bytecode.
- JVM provides platform independence.
- Heap stores objects.
- Stack stores method execution data.
- Metaspace stores class metadata.
- JIT improves execution performance.
- Garbage Collector manages memory automatically.
- JVM knowledge is essential for production troubleshooting.