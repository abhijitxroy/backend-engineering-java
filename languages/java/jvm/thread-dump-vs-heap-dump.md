

# Thread Dump vs Heap Dump

## Overview

Thread Dumps and Heap Dumps are two of the most important JVM troubleshooting tools.

They solve different problems.

```text
Thread Dump
      ↓
Thread Analysis

Heap Dump
      ↓
Memory Analysis
```

## Thread Dump

A Thread Dump captures the state of JVM threads at a specific point in time.

Contains:

- Thread Names
- Thread States
- Stack Traces
- Lock Information
- Deadlock Information

Used For:

- Application Hang Investigation
- Deadlock Analysis
- High CPU Troubleshooting
- Thread Contention Analysis

Generate Using:

```bash
jstack <pid>
```

```bash
jcmd <pid> Thread.print
```

## Heap Dump

A Heap Dump captures the contents of JVM heap memory.

Contains:

- Objects
- References
- Collections
- Class Metadata
- Memory Usage Information

Used For:

- Memory Leak Analysis
- OutOfMemoryError Investigation
- Heap Growth Analysis
- Object Retention Analysis

Generate Using:

```bash
jcmd <pid> GC.heap_dump heap.hprof
```

```bash
jmap -dump:live,format=b,file=heap.hprof <pid>
```

## Comparison

| Thread Dump | Heap Dump |
| ----------- | --------- |
| Thread Analysis | Memory Analysis |
| Captures Thread State | Captures Heap State |
| Used For Deadlocks | Used For Memory Leaks |
| Analyzes Execution | Analyzes Objects |
| Smaller Size | Larger Size |
| Viewed Using Text Tools | Viewed Using MAT/VisualVM |

## When To Use Thread Dump

Symptoms:

```text
Application Hang
High CPU Usage
Deadlock
Slow Requests
Thread Contention
```

Workflow:

```text
Problem
   ↓
Capture Thread Dump
   ↓
Analyze Thread States
   ↓
Find Blocking Code
```

## When To Use Heap Dump

Symptoms:

```text
OutOfMemoryError
Frequent Full GC
Heap Growth
Memory Leak
```

Workflow:

```text
Problem
   ↓
Capture Heap Dump
   ↓
Analyze In MAT
   ↓
Find Retained Objects
```

## Real Production Examples

### Thread Dump Scenario

```text
API Requests Hanging
       ↓
Capture Thread Dump
       ↓
Deadlock Found
       ↓
Fix Synchronization Issue
```

### Heap Dump Scenario

```text
OutOfMemoryError
       ↓
Capture Heap Dump
       ↓
Large Cache Found
       ↓
Add Eviction Policy
```

## Tools

### Thread Dump Analysis

- jstack
- jcmd
- VisualVM
- FastThread

### Heap Dump Analysis

- Eclipse MAT
- VisualVM
- jmap
- jcmd

## Interview Shortcut

```text
Application Hanging?
        ↓
Thread Dump

Memory Problem?
        ↓
Heap Dump
```

## Most Asked Interview Questions

1. What is a Thread Dump?
2. What is a Heap Dump?
3. Thread Dump vs Heap Dump?
4. When would you capture a Thread Dump?
5. When would you capture a Heap Dump?
6. Which tools analyze Thread Dumps?
7. Which tools analyze Heap Dumps?
8. How do you troubleshoot a production outage using dumps?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ High Priority

### Remember

- Thread Dump = Thread Troubleshooting.
- Heap Dump = Memory Troubleshooting.
- Thread Dumps help detect deadlocks and hangs.
- Heap Dumps help detect memory leaks.
- Thread Dumps analyze execution state.
- Heap Dumps analyze memory state.
- Both are critical JVM troubleshooting tools.