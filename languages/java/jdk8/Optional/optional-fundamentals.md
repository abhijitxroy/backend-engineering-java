# Optional Fundamentals

## What Is Optional?

Optional is a Java 8 container object used to represent the presence or absence of a value.

It helps reduce:

- NullPointerException
- Null Checks
- Boilerplate Code

Package:

```java
java.util.Optional
```

## Why Backend Engineers Must Know Optional

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Null Safety |
| ⭐⭐⭐⭐⭐ | API Design |
| ⭐⭐⭐⭐⭐ | Stream Processing |
| ⭐⭐⭐⭐ | Service Layer Development |
| ⭐⭐⭐⭐ | Clean Code |

## Why Optional Was Introduced

Traditional code:

```java
User user = getUser();

if (user != null) {
    System.out.println(user.getName());
}
```

Java 8:

```java
Optional<User> user = getUser();
```

Benefits:

- Better Readability
- Null Safety
- Explicit Handling Of Missing Values

## Creating Optional

### Optional.of()

Used when value is guaranteed to be non-null.

```java
Optional<String> name =
        Optional.of("Rahul");
```

Passing null throws:

```text
NullPointerException
```

### Optional.ofNullable()

Used when value may be null.

```java
Optional<String> name =
        Optional.ofNullable(null);
```

### Optional.empty()

Creates an empty Optional.

```java
Optional<String> name =
        Optional.empty();
```

## Reading Values

### get()

```java
name.get();
```

### Why get() Is Discouraged

```java
optional.get();
```

Risk:

```text
NoSuchElementException
```

Prefer:

- orElse()
- orElseGet()
- orElseThrow()
- ifPresent()

### isPresent()

```java
if (name.isPresent()) {
}
```

### ifPresent()

```java
name.ifPresent(System.out::println);
```

## Default Values

### orElse()

```java
String value =
        name.orElse("Default");
```

### orElseGet()

```java
String value =
        name.orElseGet(() -> "Default");
```

### orElseThrow()

```java
String value =
        name.orElseThrow(
                RuntimeException::new
        );
```

## orElse() vs orElseGet()

| orElse() | orElseGet() |
| -------- | ----------- |
| Always Evaluates Default Value | Lazy Evaluation |
| May Create Unnecessary Objects | Better Performance |
| Simple Default Values | Expensive Object Creation |

Example:

```java
optional.orElse(getDefaultUser());
```

```java
optional.orElseGet(() -> getDefaultUser());
```

Interview Rule:

```text
Use orElseGet() when default object creation is expensive.
```

## Transforming Values

### map()

```java
Optional<String> name =
        Optional.of("rahul");

name.map(String::toUpperCase);
```

### flatMap()

Used when transformation already returns Optional.

```java
optional.flatMap(User::getAddress);
```

## Optional Flow

```text
Value
  ↓
Optional
  ↓
map()
  ↓
orElse()
```

## Optional vs Null

| Optional | Null |
| -------- | ---- |
| Explicit | Implicit |
| Safer | Error Prone |
| Encourages Handling | Easy To Forget |
| Modern Java Style | Legacy Style |

## Common Use Cases

### Repository Layer

```java
Optional<User> findById(Long id);
```

### Service Layer

```java
return repository
        .findById(id)
        .orElseThrow();
```

### Stream Processing

```java
optional.map(User::getName);
```

## Spring Framework Usage

Optional is commonly used in:

- Spring Data JPA
- Repository Methods
- Service Layer Logic
- API Development

Example:

```java
Optional<User> findById(Long id);
```

## Production Engineering Perspective

Optional should be used for:

- Return Values
- Missing Data Handling
- Repository Methods

Avoid using Optional for:

- Entity Fields
- DTO Fields
- Method Parameters

## Interview Memory Trick

```text
of()            -> Non Null Value
ofNullable()    -> Nullable Value
empty()         -> No Value

orElse()        -> Default Value
orElseGet()     -> Lazy Default Value
orElseThrow()   -> Exception
```

## Common Interview Questions

1. What is Optional?
2. Why was Optional introduced?
3. Optional.of() vs Optional.ofNullable()?
4. orElse() vs orElseGet()?
5. map() vs flatMap()?
6. Why avoid get()?
7. Where is Optional used in Spring?
8. When should Optional not be used?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Optional helps avoid NullPointerException.
- Optional.of() does not accept null.
- Optional.ofNullable() accepts null.
- Optional.empty() creates an empty Optional.
- orElse() provides a default value.
- map() transforms values.
- flatMap() avoids nested Optional objects.
- Commonly used in Spring Data JPA.
- One of the most important Java 8 interview topics.
- Avoid using get() in production code.
- Prefer orElseGet() for expensive object creation.