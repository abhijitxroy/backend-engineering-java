

# Method Reference

Method Reference is a Java 8 feature that provides a concise and readable alternative to certain Lambda Expressions.

It allows developers to reference existing methods directly using the:

```java
::
```

operator.

## Why Backend Engineers Must Know Method References

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Stream API |
| ⭐⭐⭐⭐⭐ | Collections Processing |
| ⭐⭐⭐⭐⭐ | Functional Programming |
| ⭐⭐⭐⭐ | CompletableFuture |
| ⭐⭐⭐⭐ | Clean Code |

## Repository Structure

```text
Method Reference/
├── README.md
├── method-reference-fundamentals.md
├── MethodReferenceDemo.java
├── StaticMethodReferenceDemo.java
├── InstanceMethodReferenceDemo.java
└── ConstructorReferenceDemo.java
```

## Learning Flow

```text
Functional Interface
        ↓
Lambda Expression
        ↓
Method Reference
        ↓
Stream API
        ↓
Functional Programming
```

## Types of Method References

### Static Method Reference

```java
Integer::parseInt
```

### Instance Method Reference

```java
System.out::println
```

### Instance Method Of Arbitrary Object

```java
String::toUpperCase
```

### Constructor Reference

```java
User::new
```

## Examples Included

### MethodReferenceDemo

Basic method reference usage.

### StaticMethodReferenceDemo

Demonstrates:

```java
Integer::parseInt
```

### InstanceMethodReferenceDemo

Demonstrates:

```java
System.out::println
```

### ConstructorReferenceDemo

Demonstrates:

```java
User::new
```

## Method Reference vs Lambda

| Method Reference | Lambda |
| ---------------- | ------ |
| Shorter Syntax | More Verbose |
| Better Readability | More Flexible |
| Existing Method Only | Custom Logic Possible |
| Less Boilerplate | More Control |

## Backend Engineering Reality

Method references are heavily used with:

- Stream API
- Collections
- CompletableFuture
- Functional Interfaces
- Event Processing

Common examples:

```java
System.out::println
```

```java
String::toUpperCase
```

```java
Integer::parseInt
```

## Most Asked Interview Questions

1. What is a Method Reference?
2. Method Reference vs Lambda?
3. What are the types of Method References?
4. What is a Constructor Reference?
5. When should Method References be used?
6. Can Method References replace all Lambdas?
7. How are Method References used with Streams?
8. Where are Method References used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Method Reference is a shorthand form of Lambda.
- Uses the :: operator.
- Improves readability.
- Supports static, instance, and constructor references.
- Commonly used with Streams.
- Cannot replace every Lambda expression.
- One of the most important Java 8 language features.