# Functional Interface

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

------------------------------------------

# Predefined Functional Interface

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

------------------------------------------

# Backend Engineering Perspective

Functional Interfaces improve:

- Code readability
- Stream processing
- Collection transformation
- Functional programming adoption
- Backend maintainability