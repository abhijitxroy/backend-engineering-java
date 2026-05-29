

# Thread Dumps

## Overview

A Thread Dump is a snapshot of all JVM threads at a specific point in time.

It helps engineers understand:

- Thread Activity
- Thread States
- Deadlocks
- Application Hangs
- Performance Issues

Thread Dumps are one of the most important JVM troubleshooting tools.

## Why Thread Dumps Matter

Production Symptoms:

```text
Application Hang
High CPU Usage
Slow Response Time
Deadlock
Thread Contention
```

Thread Dumps help identify the root cause.

## What A Thread Dump Contains

```text
Thread Name
Thread State
Stack Trace
Locked Resources
Waiting Resources
```

Questions Answered:

- What is each thread doing?
- Which threads are blocked?
- Is there a deadlock?
- Which code is causing delays?

## Generating Thread Dumps

### Using jstack

```bash
jstack <pid>
```

### Using jcmd

```bash
jcmd <pid> Thread.print
```

### Using VisualVM

- Thread Monitoring
- Thread Inspection

## Important Thread States

### RUNNABLE

```text
Actively Running
Or Ready To Run
```

### BLOCKED

```text
Waiting For Monitor Lock
```

Common Cause:

```java
synchronized(lock) {
}
```

### WAITING

```text
Waiting Indefinitely
```

Examples:

```java
Object.wait();
Thread.join();
```

### TIMED_WAITING

```text
Waiting With Timeout
```

Examples:

```java
Thread.sleep(1000);
future.get(5, TimeUnit.SECONDS);
```

## Deadlock Detection

Example:

```text
Thread A Holds Lock 1
        ↓
Waiting For Lock 2

Thread B Holds Lock 2
        ↓
Waiting For Lock 1
```

Result:

```text
Deadlock
```

Typical Output:

```text
Found one Java-level deadlock
```

## High CPU Investigation

Workflow:

```text
High CPU
    ↓
Capture Thread Dump
    ↓
Identify RUNNABLE Threads
    ↓
Inspect Stack Trace
    ↓
Find Busy Code
```

## Application Hang Investigation

Workflow:

```text
Application Unresponsive
          ↓
Capture Multiple Thread Dumps
          ↓
Compare States
          ↓
Find Blocking Thread
```

## Thread Contention

Symptoms:

```text
Many BLOCKED Threads
```

Result:

```text
Reduced Throughput
Higher Latency
```

## Real Production Example

```text
Spring Boot Service
        ↓
API Requests Hanging
        ↓
Thread Dump Captured
        ↓
Database Threads BLOCKED
        ↓
Connection Pool Exhausted
        ↓
Issue Fixed
```

## Thread Dump Analysis Tips

Look For:

- BLOCKED Threads
- Deadlocks
- Long Running Operations
- Connection Pool Issues
- Excessive Waiting

Best Practice:

```text
Capture Multiple Dumps
10-30 Seconds Apart
```

## Production Engineering Perspective

### Common Use Cases

- Deadlock Analysis
- Performance Troubleshooting
- High CPU Investigation
- Application Hang Analysis
- Production Incident Resolution

## Most Asked Interview Questions

1. What is a Thread Dump?
2. How do you generate a Thread Dump?
3. What information does it contain?
4. What is BLOCKED state?
5. WAITING vs TIMED_WAITING?
6. How do you identify a deadlock?
7. How do you troubleshoot high CPU using Thread Dumps?
8. Why capture multiple Thread Dumps?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Highest Priority

### Remember

- Thread Dumps show JVM thread activity.
- jstack and jcmd are commonly used.
- BLOCKED threads indicate lock contention.
- WAITING and TIMED_WAITING are different states.
- Thread Dumps help detect deadlocks.
- Capture multiple dumps for better analysis.
- Essential JVM troubleshooting and interview topic.