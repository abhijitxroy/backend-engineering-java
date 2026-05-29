

# Records

## Overview

Records were introduced to reduce boilerplate code when creating immutable data objects.

Before Records, developers had to manually write:

- Constructors
- Getters
- equals()
- hashCode()
- toString()

Records generate these automatically.

## Why Records Were Introduced

Traditional POJO:

```java
public class Employee {

    private final Long id;
    private final String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
```

Record:

```java
public record Employee(
        Long id,
        String name
) {}
```

## What Records Generate Automatically

```java
public record Employee(
        Long id,
        String name
) {}
```

Compiler generates:

- Constructor
- Accessor Methods
- equals()
- hashCode()
- toString()

## Accessing Values

```java
Employee employee =
        new Employee(1L, "Rahul");

System.out.println(employee.id());
System.out.println(employee.name());
```

## Records Are Immutable

```java
public record Employee(
        Long id,
        String name
) {}
```

Not Allowed:

```java
employee.name = "Amit";
```

Benefits:

- Thread Safety
- Predictable State
- Easier Maintenance

## Custom Constructor

```java
public record Employee(
        Long id,
        String name
) {

    public Employee {
        if (id <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
```

## Record vs POJO

| Record | POJO |
| -------- | -------- |
| Less Boilerplate | More Boilerplate |
| Immutable By Design | Mutable Or Immutable |
| Auto Generated Methods | Manual Methods |
| Better Readability | More Code |

## Record vs Lombok

| Record | Lombok |
| -------- | -------- |
| Java Feature | Third Party Library |
| No Dependency | Additional Dependency |
| Immutable By Default | Depends On Annotations |
| Simpler | More Flexible |

## Common Production Use Cases

### API Responses

```java
public record UserResponse(
        Long id,
        String name
) {}
```

### DTO Objects

```java
public record EmployeeDto(
        Long id,
        String department
) {}
```

### Event Objects

```java
public record OrderCreatedEvent(
        Long orderId,
        String status
) {}
```

## Limitations

Records are not suitable when:

- Mutable Objects Are Required
- Complex Inheritance Is Needed
- State Changes Frequently

## Production Engineering Perspective

### Advantages

- Cleaner Code
- Reduced Boilerplate
- Better Readability
- Easier Maintenance
- Better DTO Modeling

### Interview Focus

Most interviews ask:

- Why Records Were Introduced
- Record vs POJO
- Record vs Lombok
- Are Records Immutable?

## Most Asked Interview Questions

1. What are Records?
2. Why were Records introduced?
3. Record vs POJO?
4. Record vs Lombok?
5. Are Records immutable?
6. What methods are generated automatically?
7. Can Records have constructors?
8. Where are Records used in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Records reduce boilerplate code.
- Records are immutable by default.
- Constructor, equals(), hashCode() and toString() are generated automatically.
- Records are ideal for DTOs and API responses.
- Records are one of the most important Java 17 features.
- Frequently asked in Java interviews.