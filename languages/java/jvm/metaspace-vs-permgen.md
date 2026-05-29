# Metaspace vs PermGen

## Overview

PermGen and Metaspace are JVM memory areas used to store class metadata.

Java 8 removed PermGen and replaced it with Metaspace.

This change solved several memory management problems that existed in older JVM versions.

## What Was PermGen?

PermGen (Permanent Generation) was part of JVM memory before Java 8.

Stored:

- Class Metadata
- Method Metadata
- Runtime Constants
- Internal JVM Structures

Memory Layout:

```text
JVM Memory
├── Heap
└── PermGen
```

## Problems With PermGen

### Fixed Size Memory

Configured Using:

```bash
-XX:MaxPermSize=256m
```

Problem:

```text
PermGen Full
      ↓
Application Failure
```

### Class Loader Leaks

Applications creating many classes could exhaust PermGen.

Common In:

- Application Servers
- Dynamic Proxies
- Frameworks

### Tuning Complexity

Developers had to manually estimate:

```text
Required PermGen Size
```

## PermGen Error

Typical Error:

```text
java.lang.OutOfMemoryError:
PermGen space
```

## What Is Metaspace?

Java 8 replaced PermGen with Metaspace.

Stored:

- Class Metadata
- Runtime Type Information
- Framework Generated Classes

Memory Layout:

```text
JVM Memory
├── Heap
└── Metaspace
```

## Key Difference

PermGen:

```text
Inside JVM Memory
Fixed Size
```

Metaspace:

```text
Uses Native Memory
Can Grow Dynamically
```

Benefits:

- Better Scalability
- Less Manual Tuning
- Fewer OOM Problems

## Metaspace Configuration

Initial Limit:

```bash
-XX:MetaspaceSize=256m
```

Maximum Limit:

```bash
-XX:MaxMetaspaceSize=512m
```

## Metaspace OutOfMemoryError

Possible Error:

```text
java.lang.OutOfMemoryError:
Metaspace
```

Typical Causes:

- Class Loader Leaks
- Excessive Dynamic Class Generation
- Framework Misconfiguration

## Metaspace vs PermGen

| PermGen | Metaspace |
| -------- | --------- |
| Before Java 8 | Java 8+ |
| Fixed Size | Dynamic Growth |
| JVM Memory | Native Memory |
| MaxPermSize | MaxMetaspaceSize |
| More OOM Issues | Better Scalability |

## Real Production Example

```text
Spring Boot Startup
        ↓
Classes Loaded
        ↓
Metadata Stored
        ↓
Metaspace Usage Increases
```

Frameworks Using Metaspace:

- Spring Framework
- Hibernate
- Tomcat
- Kafka Clients

## Class Loader Leak Example

```text
Application Redeploy
        ↓
Old ClassLoader Retained
        ↓
Classes Cannot Be Released
        ↓
Metaspace Growth
```

Result:

```text
OutOfMemoryError: Metaspace
```

## Monitoring Metaspace

Useful Commands:

```bash
jcmd <pid> VM.native_memory
```

```bash
jcmd <pid> GC.class_stats
```

Monitor:

- Metaspace Usage
- Loaded Classes
- Class Loader Count

## Production Engineering Perspective

### Why It Matters

- Spring Boot Troubleshooting
- Class Loader Analysis
- JVM Memory Optimization
- Application Startup Analysis
- Production Stability

## Most Asked Interview Questions

1. What was PermGen?
2. Why was PermGen removed?
3. What is Metaspace?
4. PermGen vs Metaspace?
5. Why does Metaspace use native memory?
6. What causes OutOfMemoryError: Metaspace?
7. What is a Class Loader Leak?
8. How do you monitor Metaspace?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- PermGen existed before Java 8.
- Java 8 replaced PermGen with Metaspace.
- Metaspace uses native memory.
- Metaspace grows dynamically.
- Class Loader Leaks commonly impact Metaspace.
- OutOfMemoryError: Metaspace is a common troubleshooting topic.
- Frequently asked JVM interview question.