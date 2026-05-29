

# Optional

Optional is a Java 8 feature that provides a safer way to handle missing values and avoid NullPointerException.

It represents either:

```text
Value Present
or
Value Absent
```

and encourages explicit handling of null scenarios.

## Why Backend Engineers Must Know Optional

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Null Safety |
| ⭐⭐⭐⭐⭐ | Spring Data JPA |
| ⭐⭐⭐⭐⭐ | API Design |
| ⭐⭐⭐⭐ | Service Layer Development |
| ⭐⭐⭐⭐ | Clean Code |

## Repository Structure

```text
Optional/
├── README.md
└── optional-fundamentals.md
```

## Learning Flow

```text
Null Value
    ↓
Optional
    ↓
map()
    ↓
orElse()
    ↓
Safe Result
```

## Coverage

### Core Concepts

- Optional.of()
- Optional.ofNullable()
- Optional.empty()
- get()
- isPresent()
- ifPresent()

### Default Value Handling

- orElse()
- orElseGet()
- orElseThrow()

### Transformations

- map()
- flatMap()

## Repository Examples

```text
examples/
├── OptionalCreationDemo.java
├── OptionalOrElseDemo.java
└── OptionalRepositoryDemo.java
```

### OptionalCreationDemo

Covers:

- Optional.of()
- Optional.ofNullable()
- Optional.empty()

### OptionalOrElseDemo

Covers:

- orElse()
- orElseGet()
- orElseThrow()

### OptionalRepositoryDemo

Production-style example using:

- Repository Layer
- Service Layer
- Spring Data JPA Pattern

## Optional vs Null

| Optional | Null |
| -------- | ---- |
| Explicit Handling | Implicit Handling |
| Safer | Error Prone |
| Better Readability | More Null Checks |
| Modern Java Style | Legacy Style |

## orElse() vs orElseGet()

| orElse() | orElseGet() |
| -------- | ----------- |
| Always Evaluates | Lazy Evaluation |
| Can Create Unnecessary Objects | Better Performance |
| Good For Simple Defaults | Good For Expensive Defaults |

Interview Rule:

```text
Use orElseGet() when default object creation is expensive.
```

## Common Spring Usage

Repository:

```java
Optional<User> findById(Long id);
```

Service:

```java
return repository
        .findById(id)
        .orElseThrow();
```

## Production Engineering Reality

Optional is commonly used for:

- Repository Return Values
- Missing Data Handling
- Service Layer Logic
- API Responses

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

## Most Asked Interview Questions

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
- map() transforms values.
- flatMap() prevents nested Optional objects.
- Avoid using get() in production code.
- Prefer orElseGet() for expensive object creation.
- Optional is commonly returned from Spring Data JPA repositories.
- Commonly used in Spring Data JPA.
- One of the most important Java 8 features.