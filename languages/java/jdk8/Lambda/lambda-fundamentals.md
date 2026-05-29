

# Lambda Fundamentals

## What Is a Lambda Expression?

A Lambda Expression is a concise way to implement a Functional Interface.

Introduced in Java 8, Lambda Expressions reduce boilerplate code and make functional-style programming easier.

Example:

```java
(a, b) -> a + b
```

## Why Backend Engineers Must Know Lambda

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Stream API |
| ⭐⭐⭐⭐⭐ | CompletableFuture |
| ⭐⭐⭐⭐⭐ | Collections Processing |
| ⭐⭐⭐⭐ | Event Handling |
| ⭐⭐⭐⭐ | Functional Programming |

## Why Lambda Was Introduced

Before Java 8:

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running");
    }
};
```

Java 8:

```java
Runnable task = () ->
        System.out.println("Running");
```

Benefits:

- Less Boilerplate
- Better Readability
- Cleaner Code

## Lambda Syntax

General Syntax:

```java
(parameters) -> expression
```

Or:

```java
(parameters) -> {
    // logic
}
```

Example:

```java
(a, b) -> a + b
```

## Lambda and Functional Interface

Lambda Expressions work only with Functional Interfaces.

Example:

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

Lambda:

```java
Calculator calculator =
        (a, b) -> a + b;
```

## Traditional vs Lambda

### Traditional

```java
Comparator<String> comparator =
        new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };
```

### Lambda

```java
Comparator<String> comparator =
        (a, b) -> a.compareTo(b);
```

## Variable Capture

Lambda can access variables from the surrounding scope.

Example:

```java
int bonus = 100;

Calculator calculator =
        (a, b) -> a + b + bonus;
```

## Effectively Final

Variables accessed inside Lambda must be:

```text
Final
or
Effectively Final
```

Valid:

```java
int bonus = 100;
```

Invalid:

```java
int bonus = 100;
bonus++;
```

## Lambda vs Anonymous Class

| Lambda | Anonymous Class |
| -------- | --------------- |
| Less Code | More Boilerplate |
| Better Readability | Verbose |
| Functional Interface Only | Any Interface/Class |
| Common In Modern Java | Legacy Style |

## Lambda vs Method Reference

Lambda:

```java
name -> System.out.println(name)
```

Method Reference:

```java
System.out::println
```

Method Reference is a shorter form of certain Lambda expressions.

## Common Use Cases

### Runnable

```java
Runnable task = () ->
        System.out.println("Running");
```

### Comparator

```java
names.sort((a, b) -> a.compareTo(b));
```

### Stream API

```java
employees.stream()
         .filter(e -> e.getSalary() > 50000)
         .forEach(System.out::println);
```

## Spring Framework Usage

Lambda expressions are commonly used in:

- Stream API
- CompletableFuture
- Event Processing
- Reactive Programming
- Functional Endpoints

Example:

```java
CompletableFuture.supplyAsync(
        () -> getUser()
);
```

## Production Engineering Perspective

Lambda expressions are heavily used in modern Java applications because they:

- Improve Readability
- Reduce Boilerplate
- Work Naturally With Streams
- Support Functional Programming

## Common Interview Questions

1. What is a Lambda Expression?
2. Why was Lambda introduced?
3. Lambda vs Anonymous Class?
4. What is a Functional Interface?
5. What is Effectively Final?
6. Can Lambda access local variables?
7. Lambda vs Method Reference?
8. Where are Lambdas used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Lambda provides a concise way to implement Functional Interfaces.
- Introduced in Java 8.
- Reduces boilerplate code.
- Works only with Functional Interfaces.
- Supports functional-style programming.
- Variables must be effectively final.
- Commonly used with Streams and CompletableFuture.
- One of the most important Java 8 interview topics.