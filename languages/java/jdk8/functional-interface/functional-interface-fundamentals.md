# Functional Interface

Java 8 Functional Interfaces are one of the most commonly used language features in modern backend applications.

They enable:

- Lambda Expressions
- Stream Processing
- Functional Programming
- Collection Transformation
- Cleaner APIs

------------------------------------------

Functional Interface contains only Single Abstract Method (SAM).

Characteristics:

- Only one abstract method allowed
- Can contain multiple default methods
- Can contain multiple static methods
- Supports Lambda Expression implementation

Example:

```java
@FunctionalInterface
interface Calculator {
    int add(int a,int b);
}
```

## Why @FunctionalInterface?

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

Benefits:

- Compile-time validation
- Prevents accidental addition of abstract methods
- Improves readability

If multiple abstract methods are added:

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}
```

Compilation fails.

## Why Backend Engineers Must Know Functional Interfaces

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Stream Processing |
| ⭐⭐⭐⭐⭐ | Collection Transformation |
| ⭐⭐⭐⭐⭐ | Spring Framework APIs |
| ⭐⭐⭐⭐ | Event Processing |
| ⭐⭐⭐⭐ | Asynchronous Programming |

------------------------------------------

# Predefined Functional Interfaces

Java 8 provides built in Functional Interfaces.

Stream:

- Processing collection data
- Filtering data
- Aggregate operations
- Functional style programming

| Functional Interface | Input | Output | Method | Usage |
|----------------------|-------|--------|--------|-------|
| Predicate<T> | Yes | Boolean | test() | filter() |
| Function<T,R> | Yes | Yes | apply() | map() |
| Consumer<T> | Yes | No | accept() | forEach() |
| Supplier<T> | No | Yes | get() | object generation |

## Selection Guide

| Requirement | Functional Interface |
| ----------- | -------------------- |
| Filter Data | Predicate |
| Transform Data | Function |
| Consume Data | Consumer |
| Generate Data | Supplier |

## Interview Memory Trick

| Interface | Think |
| ---------- | ----- |
| Predicate | Filter |
| Function | Transform |
| Consumer | Consume |
| Supplier | Generate |

Pipeline:

```text
Supplier
   ↓
Predicate
   ↓
Function
   ↓
Consumer
```

------------------------------------------

# Predicate<T>

Purpose:

- Conditional filtering
- Validation logic

Example:

```java
list.stream()
.filter(e -> e > 5)
.collect(Collectors.toList());
```

Method:

```java
boolean test(T t)
```

------------------------------------------

# Function<T,R>

Purpose:

- Input transformation
- Object mapping

Example:

```java
Function<Customer,String> func = e -> e.getName();

list.stream()
.map(func)
.collect(Collectors.toList())
.forEach(System.out::println);
```

Method:

```java
R apply(T t)
```

------------------------------------------

# Consumer<T>

Purpose:

- Consume data
- Logging
- Printing output

Example:

```java
list.stream()
.forEach(System.out::println);
```

Method:

```java
void accept(T t)
```

------------------------------------------

# Supplier<T>

Purpose:

- Generate object/value without input

Example:

```java
Supplier<String> supplier = () -> "Java8";

supplier.get();
```

Method:

```java
T get();
```

# Functional Interfaces vs Traditional Code

Traditional:

```java
class EmployeeFilter {

    public boolean test(Employee employee) {
        return employee.getSalary() > 50000;
    }
}
```

Java 8:

```java
employee -> employee.getSalary() > 50000
```

Benefits:

- Less Boilerplate
- Better Readability
- Easier Stream Processing

------------------------------------------

# Common Stream Usage

```java
list.stream()
    .filter(e -> e.getSalary() > 50000)
    .map(Employee::getName)
    .forEach(System.out::println);
```

Pipeline:

```text
Collection
    ↓
Predicate
    ↓
Function
    ↓
Consumer
```

------------------------------------------

# Backend Engineering Perspective

Functional Interfaces are heavily used in:

- Stream API
- Spring Framework
- CompletableFuture
- Event Processing
- Collection Transformations
- Asynchronous Workflows

Understanding Predicate, Function, Consumer, and Supplier is essential for modern Java development.

------------------------------------------

## Spring Framework Usage

Functional interfaces are heavily used in:

- Stream API
- CompletableFuture
- Spring Framework
- Event Listeners
- Reactive Programming

Examples:

```java
CompletableFuture.supplyAsync(() -> getUser());
```

```java
stream.filter(user -> user.isActive());
```

------------------------------------------

# Most Asked Interview Topics

- What is a Functional Interface?
- What is SAM?
- Predicate vs Function
- Consumer vs Supplier
- Why is @FunctionalInterface used?
- How do Lambda Expressions use Functional Interfaces?
- Functional Interfaces in Stream API
- Functional Interfaces in Spring Framework

# Quick Revision

### Highest ROI

1. Predicate
2. Function
3. Consumer
4. Supplier

### Remember

- Functional Interface contains exactly one abstract method.
- @FunctionalInterface provides compile-time validation.
- Predicate = Filter.
- Function = Transform.
- Consumer = Consume.
- Supplier = Generate.
- Functional Interfaces power Lambda Expressions.
- Widely used in Streams, CompletableFuture, and Spring.
- One of the most important Java 8 interview topics.