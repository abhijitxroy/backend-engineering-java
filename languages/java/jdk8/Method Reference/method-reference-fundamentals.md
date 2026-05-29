# Method Reference Fundamentals

## What Is a Method Reference?

A Method Reference is a shorthand form of a Lambda Expression.

It improves readability when a Lambda simply calls an existing method.

Example:

### Lambda

```java
names.forEach(name -> System.out.println(name));
```

### Method Reference

```java
names.forEach(System.out::println);
```

## Why Backend Engineers Must Know Method References

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Stream API |
| ⭐⭐⭐⭐⭐ | Collections Processing |
| ⭐⭐⭐⭐⭐ | Functional Programming |
| ⭐⭐⭐⭐ | CompletableFuture |
| ⭐⭐⭐⭐ | Clean Code |

## Why Method References Were Introduced

Method references reduce boilerplate code.

Instead of:

```java
user -> user.getName()
```

Use:

```java
User::getName
```

Benefits:

- Better Readability
- Less Boilerplate
- Cleaner Functional Code

## Method Reference Syntax

General Syntax:

```java
ClassName::methodName
```

Or:

```java
objectReference::methodName
```

## Types of Method References

### Static Method Reference

```java
Integer::parseInt
```

Lambda Equivalent:

```java
value -> Integer.parseInt(value)
```

### Instance Method Reference

```java
System.out::println
```

Lambda Equivalent:

```java
value -> System.out.println(value)
```

### Instance Method Of Arbitrary Object

```java
String::toUpperCase
```

Lambda Equivalent:

```java
value -> value.toUpperCase()
```

### Constructor Reference

```java
User::new
```

Lambda Equivalent:

```java
() -> new User()
```

## Method Reference vs Lambda

| Method Reference | Lambda |
| ---------------- | ------ |
| Shorter Syntax | More Verbose |
| Cleaner Readability | More Flexible |
| Existing Method Only | Any Logic |
| Less Boilerplate | More Control |

## Common Stream Examples

### forEach()

Lambda:

```java
names.forEach(name -> System.out.println(name));
```

Method Reference:

```java
names.forEach(System.out::println);
```

### map()

Lambda:

```java
users.stream()
     .map(user -> user.getName());
```

Method Reference:

```java
users.stream()
     .map(User::getName);
```

## Common Use Cases

### Sorting

```java
names.sort(String::compareToIgnoreCase);
```

### Stream Processing

```java
names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

### Constructor Creation

```java
Supplier<User> supplier = User::new;
```

## Spring Framework Usage

Method references are frequently used with:

- Stream API
- CompletableFuture
- Functional Programming
- Event Processing

Example:

```java
users.stream()
     .map(User::getName)
     .forEach(System.out::println);
```

## Production Engineering Perspective

Method references improve code readability when logic already exists in another method.

Most modern Java applications use method references extensively with:

- Streams
- Functional Interfaces
- CompletableFuture

## Common Interview Questions

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
- Improves readability.
- Uses :: operator.
- Supports static methods, instance methods, and constructors.
- Commonly used with Streams.
- Cannot replace every Lambda.
- One of the most common Java 8 language features.
