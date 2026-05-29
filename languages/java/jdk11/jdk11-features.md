

# JDK 11 Features

## Overview

JDK 11 is a Long-Term Support (LTS) release and is widely used in enterprise Java applications.

Release Year:

```text
2018
```

Why It Matters:

- Long-Term Support (LTS)
- Commonly Used In Enterprise Applications
- Widely Adopted In Spring Boot Projects
- Foundation For Modern Java Development

## Important Features

### Local Variable Syntax For Lambda Parameters

Before:

```java
(var x, var y) -> x + y
```

Benefits:

- Improved Readability
- Better Annotation Support

## String API Enhancements

### isBlank()

```java
String name = "   ";

System.out.println(name.isBlank());
```

### lines()

```java
String text = "Java\nSpring\nDocker";

text.lines().forEach(System.out::println);
```

### strip()

```java
String value = "  Java  ";

System.out.println(value.strip());
```

### repeat()

```java
System.out.println("Java".repeat(3));
```

## Files API Enhancements

### readString()

```java
String content = Files.readString(path);
```

### writeString()

```java
Files.writeString(path, content);
```

Benefits:

- Simplified File Operations
- Less Boilerplate Code

## HTTP Client API

Introduced Modern HTTP Client.

```java
HttpClient client = HttpClient.newHttpClient();
```

Example Use Cases:

- REST API Calls
- External Service Integration
- Microservices Communication

## Running Java Without Compilation

```bash
java HelloWorld.java
```

Benefits:

- Faster Learning
- Quick Testing
- Scripting Support

## Collection Of Small Improvements

### Optional.isEmpty()

```java
optional.isEmpty();
```

### Predicate.not()

```java
names.stream()
     .filter(Predicate.not(String::isBlank));
```

## Production Engineering Perspective

### High ROI Features

| Feature | Interview ROI | Production Usage |
| -------- | ------------ | ---------------- |
| HTTP Client API | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| String Enhancements | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| Files API | ⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |
| Optional.isEmpty() | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ |
| Predicate.not() | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ |

## Most Asked Interview Questions

1. Why is JDK 11 important?
2. Why is JDK 11 called an LTS release?
3. What are String API enhancements in JDK 11?
4. What is the new HTTP Client API?
5. Files.readString() vs traditional file reading?
6. What is Optional.isEmpty()?
7. What is Predicate.not()?
8. Can Java programs run without explicit compilation?

## Quick Revision

### Remember

- JDK 11 is a Long-Term Support release.
- String API received major improvements.
- HTTP Client API replaced older approaches.
- Files.readString() and writeString() simplify file handling.
- Optional.isEmpty() improves readability.
- Predicate.not() simplifies filtering.
- JDK 11 remains one of the most commonly used enterprise Java versions.