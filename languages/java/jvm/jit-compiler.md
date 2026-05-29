# JIT Compiler

## Overview

JIT (Just-In-Time) Compiler is a JVM component that improves application performance by compiling frequently executed bytecode into native machine code.

Without JIT:

```text
Java Code
    ↓
Bytecode
    ↓
Interpreter
    ↓
Execution
```

With JIT:

```text
Java Code
    ↓
Bytecode
    ↓
Interpreter
    ↓
Hot Code Detection
    ↓
JIT Compilation
    ↓
Native Machine Code
```

## Why JIT Compiler Exists

Interpreting bytecode repeatedly is slower.

Example:

```java
for (int i = 0; i < 1_000_000; i++) {
    calculate();
}
```

The JVM detects frequently executed code and compiles it into optimized machine instructions.

Benefits:

- Faster Execution
- Better CPU Utilization
- Runtime Optimizations
- Improved Throughput

## Interpreter vs JIT Compiler

| Interpreter | JIT Compiler |
| ----------- | ------------ |
| Executes Bytecode Line By Line | Converts Bytecode To Native Code |
| Faster Startup | Better Long-Term Performance |
| No Optimization | Runtime Optimization |
| Slower For Repeated Execution | Faster For Hot Code |

## Hot Code

Frequently executed code is called:

```text
Hot Code
```

Examples:

- Frequently Called Methods
- Loops
- Critical Business Logic
- API Processing Paths

## How JIT Works

```text
Application Starts
        ↓
Interpreter Executes Code
        ↓
Hotspot Detects Hot Methods
        ↓
JIT Compiles Methods
        ↓
Native Code Execution
```

## HotSpot JVM

The standard JVM implementation is called:

```text
HotSpot JVM
```

Reason:

```text
Identifies Hot Spots
And Optimizes Them
```

## Important Optimizations

### Method Inlining

Before:

```java
calculate();
```

The JVM repeatedly calls the method.

After Optimization:

```text
Method Body Inserted Directly
```

Benefits:

- Reduced Call Overhead
- Faster Execution

### Loop Optimization

Frequently executed loops receive additional optimizations.

```java
for (...) {
}
```

Benefits:

- Better CPU Efficiency
- Reduced Execution Time

### Dead Code Elimination

Unused code paths may be removed.

Benefits:

- Reduced Instructions
- Better Performance

## Tiered Compilation

Modern JVMs use multiple optimization levels.

```text
Interpreter
      ↓
Basic Compilation
      ↓
Advanced Optimization
```

Benefits:

- Faster Startup
- Better Peak Performance

## Viewing JIT Activity

Useful JVM Option:

```bash
-XX:+PrintCompilation
```

Useful Tool:

```text
Java Flight Recorder (JFR)
```

## Real Production Example

```text
Spring Boot Service
        ↓
Receives Traffic
        ↓
Hot Methods Identified
        ↓
JIT Optimizations Applied
        ↓
Higher Throughput
```

## JIT And JVM Performance

JIT contributes to:

- Faster APIs
- Better Throughput
- Lower CPU Usage
- Improved Scalability

## Production Engineering Perspective

### Why It Matters

- Performance Tuning
- JVM Internals
- Capacity Planning
- Production Optimization
- High Throughput Systems

## Most Asked Interview Questions

1. What is JIT Compiler?
2. Why does Java use JIT?
3. Interpreter vs JIT?
4. What is Hot Code?
5. What is HotSpot JVM?
6. What is Method Inlining?
7. What is Tiered Compilation?
8. How does JIT improve performance?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- JIT converts bytecode into native machine code.
- Frequently executed code becomes Hot Code.
- HotSpot JVM identifies optimization opportunities.
- Method Inlining is a common optimization.
- Tiered Compilation balances startup and performance.
- JIT is one of the main reasons Java achieves high performance.
- Important JVM and interview topic.
